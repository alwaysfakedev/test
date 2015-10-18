/**
 * Created by haria on 14.08.2015.
*/
var owmApp = angular.module('base', ['ngRoute']);
owmApp.config(['$routeProvider'], function ($routeProvider) {
    $routeProvider.when('/',
        {
            templateUrl: "template/home.html",
            controller: "home.js"
        }.otherwise({redirectTo: '/'}))
});
owmApp.controller('base-ctrl', function ($scope) {


});