angular.module('home',['user.service'])
.controller('home-ctrl', ['$scope',  'userService',

        function($scope, userService) {

            if(!$rootScope.isLogged)
            {
                redirectTo = '/auth';
            }

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