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
	
}).factory('saveUserService',function($http){
	//alert("i am saveUserService service");
	var saveUserService={};
	
	saveUserService.saveUserData=function(User){
		
		var theurl='../DemoApp/saveUser';
		
		
		 var data = JSON.stringify(User);
     
         var config = {
             headers : {
            	 
                 'Content-Type': 'application/json; charset=utf-8;'
             }
         };
		
		
       return  $http.post(theurl, data, config)
         .success(function (data, status, headers, config) {
             //alert("success");
         })
         .error(function (data, status, header, config) {
            
         });
		
	};
	
	return saveUserService;
	
	
	
}).factory('viewAllUsers',function($http){
	//alert("i am viewAllUsers service");
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
             //alert(JSON.stringify(data));
         })
         .error(function (data, status, header, config) {
            
         });
		
	};
	
	return viewAllUsers;
	
	
	
}).factory('deleteUserService',function($http){
	//alert("i am viewAllUsers service");
	var deleteUserService={};
	
	deleteUserService.removeUser=function(User){
		
		var theurl='../DemoApp/removeUser';
		 var data = JSON.stringify(User);
		var config = {
             headers : {
            	 
                 'Content-Type': 'application/json; charset=utf-8;'
             }
         };
		
		
       return  $http.post(theurl, data, config)
         .success(function (data, status, headers, config) {
        	 alert("success in service");
         })
         .error(function (data, status, header, config) {
            
         });
		
	};
	
	return deleteUserService;
	
	
	
});

