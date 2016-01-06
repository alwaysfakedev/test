/**
 * Created by haria on 10/25/2015.
 */

angular.module('auth',['user.service'])
    .controller('auth-ctrl', ['$scope', "$rootScope", 'userService',
        function($scope, userService, $rootScope) {

            $scope.name ="Jonne";

            $scope.status = "no";

            $scope.login = function(user, password)
            {
                $scope.status = userService.login(user, password)
                    .then(function(response)
                    {
                        $rootScope.isLogged = true;
                    });
            };

            $scope.logout = function()
            {
                $rootScope.isLogged = false;
            };

            $scope.create = function(user, password)
            {
                userService.create_user(user, password)
                    .then(function(response)
                    {
                        $scope.status = response.statusText;
                    });
            };
        }]);