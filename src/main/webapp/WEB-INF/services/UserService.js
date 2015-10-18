/**
 * Created by haria on 17.09.2015.
 */
var user_service = angular.module('user_service', []);
user_service.controller('base-ctrl', function($scope){


    function login(login,password) {
        var creditials;
        creditials.login = login;
        creditials.password = password;

       return  $http.POST('/auth', creditials)
    }
});