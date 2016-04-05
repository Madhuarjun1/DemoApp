angular.module('DemoApp.directives', []).directive('pageType', function(viewAllUsers) {
	  return {
		    restrict: "E",
		    scope: {},
		    templateUrl:'directiveViews/paginationcontent.html',
		    controller: function($scope) {
		    	$scope.filteredTodos = []
		    	  ,$scope.currentPage = 1
		    	  ,$scope.numPerPage = 1
		    	  ,$scope.maxSize = 2;
		    	
		    	
		    	/*[{"id":1,"firstname":"madhu","lastname":"arjun","country":"india","email":"madhusjava4@","phone":9962110410,"gender":"m"},
		    	 {"id":2,"firstname":"nag","lastname":"nag","country":"india","email":"nagen@","phone":654654,"gender":"m"}]*/
		    	$scope.OnSave=function(){
		    	
		    		
		    		
		    	};
		    	
		    	$scope.todos=[];
		    	  
			    	viewAllUsers.getUsersList().then(function(result){
			    		$scope.todos=result.data;
			    		alert("Directive data:"+JSON.stringify($scope.todos)+"Length: "+$scope.todos.length);	
		    		
			    		$scope.$watch('currentPage + numPerPage', function() {
				    	    var begin = (($scope.currentPage - 1) * $scope.numPerPage)
				    	    , end = begin + $scope.numPerPage;
				    	   
				    	   
				    	    alert("Begin: "+begin+"End: "+end+"todos data: "+JSON.stringify($scope.todos));
				    	    //   $scope.filteredTodos = $scope.todos;
				    	    $scope.filteredTodos = $scope.todos.slice(begin, end);
				    	    alert("Filtered Todos: "+JSON.stringify($scope.filteredTodos));
				    	  });
			    		
			    		});
			    
		    }
		  };
		});