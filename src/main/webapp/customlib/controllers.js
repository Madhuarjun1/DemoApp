'use strict';

/*Controllers*/

angular.module('DemoApp.controllers', ["ui.bootstrap"]).
controller('vieworUpdateorDelete', function($scope, $window, $http,$compile) {
	
		var divElement = angular.element(document.querySelector('#pagecontent'));
		divElement.empty();
	    var appendHtml = $compile('<page-Type></page-Type>')($scope);
	    divElement.append(appendHtml);
	
	
});
