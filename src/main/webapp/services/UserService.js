/**
 * Created by haria on 17.09.2015.
 */
angular.module('user.service', [])
    .service('userService', ['$http' , function ($http)
{
    this.login = function(login,password) {
        var creditials = {};
        creditials.login = login;
        creditials.password = password;

       return $http.post('/rest/auth/autenticate', creditials);
    }
}]);