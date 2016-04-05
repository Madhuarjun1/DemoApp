'use strict';

/*Controllers*/

angular.module('DemoApp.controllers', ["ui.bootstrap"]).
controller('vieworUpdateorDelete', function($scope, $window, $http,$compile) {
	
		var divElement = angular.element(document.querySelector('#pagecontent'));
		divElement.empty();
	    var appendHtml = $compile('<page-Type></page-Type>')($scope);
	    divElement.append(appendHtml);
	
	    
}).controller('addUserController', function($scope) {
	
	 $scope.countries = [
	                 { id: 1, name: 'India' },
	                 { id: 2, name: 'USA' },
	                 { id: 3, name: 'UK' },
	                 { id: 4, name: 'Austrlia' }
	             ];

	  $scope.country = null;
	 /* $scope.gender = 'Male';
      $scope.femaleValue ='Female'; */
	  
	  $scope.saveUser=function(){
		  alert("First Name: "+$scope.firstname +"Lastname :  "+$scope.lastname+"Country:  "+$scope.country+"Email: "+$scope.email+" Phone: "+$scope.phone+ "Gender: "+$scope.gender);  
		  var input=new Object();
		  input.firstname=$scope.firstname;
		  input.lastname=$scope.lastname;
		  input.country=$scope.country;
		  input.email=$scope.email;
		  input.phone=$scope.phone;
		  input.gender=$scope.gender;
		 alert(JSON.stringify(input)); 
		  
	  };
	  $scope.clearForm=function(){
		  
		  $scope.firstname="";
		  $scope.lastname="";
		  $scope.country="";
		  $scope.email="";
		  $scope.phone="";
		  $scope.gender="";
		   
	  };
	  
	  
});
