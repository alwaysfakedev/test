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
        if(user == "1" && password=="1")
        {
            userService.login(user, password);
            $scope.status = "ok";
        }
    }

}]);