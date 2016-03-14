/**
 * Created by nkanagar on 05-03-2016.
 */

(function () {
    var bookstoreModule = angular.module("bookstore", ["ngRoute"]);

    bookstoreModule.config([
        "$routeProvider", "$locationProvider",
        function ($routeProvider, $locationProvider) {

            //login page
            $routeProvider.when("/", {
                templateUrl: "views/login.html",
                controller: "loginController"
            }).when("/register", {
                templateUrl: "views/signup.html",
                controller: "signupController"
            }).when("/users", {
                templateUrl: "views/userslist.html",
                controller: "usersController"
            });
        }
    ]);
}());