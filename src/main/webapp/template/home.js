/**
 * Created by haria on 10/25/2015.
 */

angular.module('home',['user.service'])
    .controller('home-ctrl', ['$scope', 'userService',
    function($scope, userService) {

    $scope.name ="Jonne";

    $scope.status = "no";

    $scope.login = function(user, password)
    {
        $scope.status = userService.login(user, password)
        .then(function(response)
        {
            $scope.status = response.statusText;
        });
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