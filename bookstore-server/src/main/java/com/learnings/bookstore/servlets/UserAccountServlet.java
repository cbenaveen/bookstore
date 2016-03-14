package com.learnings.bookstore.servlets;

import java.io.IOException;
import java.io.InputStream;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.learnings.bookstore.model.User;

public class UserAccountServlet extends HttpServlet {
	private static final Logger LOGGER = LoggerFactory
			.getLogger(UserAccountServlet.class);

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		/**
		 * TODO:
		 * Use the user acount Dao to get all the user.
		 */
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		InputStream body = req.getInputStream();

		StringBuffer bodyBuffer = new StringBuffer("");

		while (body.available() > 0) {
			byte[] bytes = new byte[1024];
			int reads = body.read(bytes);

			bodyBuffer.append(new String(bytes, 0, reads));
		}

		String userAccountJson = bodyBuffer.toString();
		LOGGER.info("Received User account body for creating user account is {}",
				userAccountJson);

		ObjectMapper mapper = new ObjectMapper();
		User userAccount = mapper.readValue(userAccountJson, User.class);
		
		/**
		 * TODO:
		 * Use the user acount Dao to store the user.
		 */
	}
}
