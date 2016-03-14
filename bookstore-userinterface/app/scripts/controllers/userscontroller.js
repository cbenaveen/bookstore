/**
 * Created by nkanagar on 09-03-2016.
 */
(function(){

    var bookstoreModule = angular.module("bookstore");
    bookstoreModule.controller("usersController", [
        "$scope", "$log", "userAccountService",
        function($scope, $log, userAccountService){
            $scope.users = [];
            userAccountService.getAllUsers().success(function(data, status, headers, config){
                $scope.users = data;
            }).error(function(data, status, headers, config){
                $scope.users = [];
            });
        }
    ]);

}())