/*Services*/

angular.module('DemoApp.services',[]).
factory('restService',function($http){
	alert("i am rest Service");
	var restService={};
	restService.getDetails=function(){
		var theurl='api/owners/';
		return $http({
			method: 'GET', 
		 		url: theurl
		 	});
		
	};
	
	return restService;
	
}).factory('loginservice',function($http){
	alert("i am updateservice service");
	var loginservice={};
	
	loginservice.getDetails=function(){
		
		var theurl='../DemoApp/update';
		
		
		 var data = $.param({
             name: 'madhu'
         });
     
         var config = {
             headers : {
            	 
                 'Content-Type': 'application/json; charset=utf-8;'
             }
         };
		
		
       return  $http.post(theurl, data, config)
         .success(function (data, status, headers, config) {
             alert(data.name);
         })
         .error(function (data, status, header, config) {
            
         });
		
	};
	
	return loginservice;
	
	
	
}).factory('viewAllUsers',function($http){
	alert("i am viewAllUsers service");
	var viewAllUsers={};
	
	viewAllUsers.getUsersList=function(){
		
		var theurl='../DemoApp/viewUsers';
		var config = {
             headers : {
            	 
                 'Content-Type': 'application/json; charset=utf-8;'
             }
         };
		
		
       return  $http.get(theurl,  config)
         .success(function (data, status, headers, config) {
             alert(JSON.stringify(data));
         })
         .error(function (data, status, header, config) {
            
         });
		
	};
	
	return viewAllUsers;
	
	
	
});

