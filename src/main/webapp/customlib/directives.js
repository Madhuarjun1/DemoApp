angular.module('DemoApp.directives', []).directive('pageType', function($state,viewAllUsers,deleteUserService) {
	  return {
		    restrict: "E",
		    scope: {},
		    templateUrl:'directiveViews/paginationcontent.html',
		    controller: function($scope) {
		    	$scope.filteredTodos = []
		    	  ,$scope.currentPage = 1
		    	  ,$scope.numPerPage = 5
		    	  ,$scope.maxSize = 5;
		    	
		    	 
		    	
		    	$scope.OnSave=function(todo){
		    	
		    		//alert("I am update button"+todo.id);
		    		$state.go('home',{data:todo});
		    		
		    	};
		    	$scope.onDelete=function(todo){
		    	  var User=new Object();
		    	  User.id=todo.id;
		  		  User.firstname=todo.firstname;
		  		  User.lastname=todo.lastname;
		  		  User.country=todo.country;
		  		  User.email=todo.email;
		  		  User.phone=todo.phone;
		  		  User.gender=todo.gender;
		    		deleteUserService.removeUser(User).then(function(result){
		    			$scope.todos=result.data;
			    		//alert("Directive data:"+JSON.stringify($scope.todos)+"Length: "+$scope.todos.length);	
		    		
			    		$scope.$watch('currentPage + numPerPage', function() {
				    	    var begin = (($scope.currentPage - 1) * $scope.numPerPage)
				    	    , end = begin + $scope.numPerPage;
				    	     $scope.filteredTodos = $scope.todos.slice(begin, end);
				    	   // alert("Begin: "+begin+"End: "+end+"todos data: "+JSON.stringify($scope.filteredTodos));
				    	  });
		    		});
		    	};
		    	
		    	$scope.todos=[];
		    	  
			    	viewAllUsers.getUsersList().then(function(result){
			    		$scope.todos=result.data;
			    		//alert("Directive data:"+JSON.stringify($scope.todos)+"Length: "+$scope.todos.length);	
		    		
			    		$scope.$watch('currentPage + numPerPage', function() {
				    	    var begin = (($scope.currentPage - 1) * $scope.numPerPage)
				    	    , end = begin + $scope.numPerPage;
				    	     $scope.filteredTodos = $scope.todos.slice(begin, end);
				    	   // alert("Begin: "+begin+"End: "+end+"todos data: "+JSON.stringify($scope.filteredTodos));
				    	  });
			    		
			    		});
			    
		    }
		  };
		});