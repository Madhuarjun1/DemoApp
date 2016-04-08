'use strict';

/*Controllers*/

angular.module('DemoApp.controllers', ["ui.bootstrap"]).
controller('vieworUpdateorDelete', function($scope, $window, $http,$compile) {
	
		var divElement = angular.element(document.querySelector('#pagecontent'));
		divElement.empty();
	    var appendHtml = $compile('<page-Type></page-Type>')($scope);
	    divElement.append(appendHtml);
	
	    
}).controller('addUserController', function($scope,$stateParams,saveUserService) {
	
	 $scope.countries = [
	                 { id: 1, name: 'India' },
	                 { id: 2, name: 'USA' },
	                 { id: 3, name: 'UK' },
	                 { id: 4, name: 'Austrlia' }
	             ];

	  $scope.country = null;
	 /* $scope.gender = 'Male';
      $scope.femaleValue ='Female'; */
	//  alert(JSON.stringify($stateParams.data));
	  
	  if($stateParams.data!=null && $stateParams.data != undefined) {
		  $scope.firstname = $stateParams.data.firstname;
		  $scope.lastname = $stateParams.data.lastname;
		  $scope.country=$stateParams.data.country;
		  $scope.email=$stateParams.data.email;
		  $scope.phone=$stateParams.data.phone;
		  $scope.gender=$stateParams.data.gender;
	  }
	  $scope.saveUser=function(){
		 // alert("First Name: "+$scope.firstname +"Lastname :  "+$scope.lastname+"Country:  "+$scope.country+"Email: "+$scope.email+" Phone: "+$scope.phone+ "Gender: "+$scope.gender);  
		  var User=new Object();
		  User.firstname=$scope.firstname;
		  User.lastname=$scope.lastname;
		  User.country=$scope.country;
		  User.email=$scope.email;
		  User.phone=$scope.phone;
		  User.gender=$scope.gender;
		 alert(JSON.stringify(User)); 
		 
		 saveUserService.saveUserData(User).then(function(response){
			$scope.clearForm();
		 });
		  
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
