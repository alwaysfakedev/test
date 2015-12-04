angular.module('owmApp',
    ['ngRoute','home'])
    .
config(['$locationProvider','$routeProvider', '$httpProvider',
    function($locationProvider, $routeProvider, $httpProvider) {
        $routeProvider.
            when('/app', {
                templateUrl: 'template/home.html'
            }).
            when('/app/auth',
            {
                templateUrl:"template/auth.html",
                controller: "auth.js"
            }).
            otherwise({
                redirectTo: '/app'
            });
        $locationProvider.html5Mode(true);
        $httpProvider.defaults.useXDomain = true;
        delete $httpProvider.defaults.headers.common['X-Requested-With'];
    }]);