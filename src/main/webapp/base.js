/**
 * Created by haria on 14.08.2015.
*/
angular.module('owmApp', ['ngRoute']).
    config(['$routeProvider',
        function($routeProvider) {
            $routeProvider.
                when('/', {
                    templateUrl: 'template/home.html'
                }).
                when('/auth',
                {
                    templateUrl:"template/auth.html",
                    controller: "auth.js"
                }).
                otherwise({
                    redirectTo: '/'
                });
        }]);