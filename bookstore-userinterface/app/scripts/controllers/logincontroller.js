/**
 * Created by nkanagar on 09-03-2016.
 */
(function(){

    var bookstoreModule = angular.module("bookstore");
    bookstoreModule.controller("loginController", [
        "$log",
        function($log){
            $log.info("Login controller loaded successfully.....");
        }
    ]);

}())