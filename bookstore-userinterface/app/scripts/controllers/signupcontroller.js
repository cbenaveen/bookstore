/**
 * Created by nkanagar on 09-03-2016.
 */
(function(){

    var bookstoreModule = angular.module("bookstore");
    bookstoreModule.controller("signupController", [
        "$scope", "$log", "$location", "userAccountService",
        function($scope, $log, $location, userAccountService){
            $scope.formErrorMessage = "";

            $scope.userAccount = {
                emailId : "",
                fullName : "",
                password : ""
            };

            $scope.createUserAccount = function(){
                if($scope.userAccount.emailId.length <= 0){
                    $scope.formErrorMessage = "Invalid Email Address";
                    return;
                } else {
                    $scope.formErrorMessage = "";
                }

                if($scope.userAccount.fullName.length <= 0){
                    $scope.formErrorMessage = "Invalid Name";
                    return;
                } else {
                    $scope.formErrorMessage = "";
                }

                if($scope.userAccount.password.length <= 0){
                    $scope.formErrorMessage = "Invalid Password";
                    return;
                } else {
                    $scope.formErrorMessage = "";
                }

                var accountCreatePromise = userAccountService.createUserAccount($scope.userAccount);
                accountCreatePromise.success(function(data, status, headers, config) {
                    $location.path("/users");
                }).error(function(data, status, headers, config) {
                });
            }
        }
    ]);
}())