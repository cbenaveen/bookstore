/**
 * Created by nkanagar on 10-03-2016.
 */


(function(){
    var bookstoreModule = angular.module("bookstore");
    bookstoreModule.factory("userAccountService", ["$http", function($http){

        var userEndpoint = "api/v1/users";

        var userAccount = {};
        userAccount.createUserAccount = function(userAccountJson){
            return $http.post(userEndpoint, userAccountJson);
        }

        userAccount.getAllUsers = function(){
            return $http.get(userEndpoint);
        }

        userAccount.getUser = function(emailId){
            return $http.get(userEndpoint + "/" + emailId);
        }

        return userAccount;
    }]);
}())