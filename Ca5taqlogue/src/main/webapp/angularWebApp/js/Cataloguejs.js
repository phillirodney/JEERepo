

var app = angular.module('myApp', []);


app.service('productService', function(){
	stuff =  "";
	value1 = 0;
	value2 = 0;
});


app.controller('myCtrl', function($scope, $http, productService) {
	$http.get("http://localhost:8080/nbgardens-catalogue-0.0.1-SNAPSHOT/api/products/").then(function(response){
		productService.stuff = $scope;
		productService.stuff.content = response.data;


	});
});


app.controller('myCtrl2', function($scope, $http, productService) {
	$scope.myfunc = function(){
		  $http.get("http://localhost:8080/nbgardens-catalogue-0.0.1-SNAPSHOT/api/search/" + $scope.searchWord).then(function(response){
			  productService.stuff.content = response.data;
		  })
		  
	}
  
});


app.controller('newCont', function($scope, $http, productService) {
	
	var a = 0;
	var b = 0;

	$( function() {
	  $( "#slider-range" ).slider({
	    range: true,
	    min: 0,
	    max: 500,
	    values: [ 75, 300 ],
	    slide: function( event, ui ) {
	      $( "#amount" ).val( "$" + ui.values[ 0 ] + " - $" + ui.values[ 1 ] );
	      a = ui.values[ 0 ];
	      b = ui.values[ 1 ];
	    }
	  });
	  $( "#amount" ).val( "$" + $( "#slider-range" ).slider( "values", 0 ) +
	    " - $" + $( "#slider-range" ).slider( "values", 1 ) );
	} );
	
	 function funt(a, b) {
		
		var config = {
				
			    params: {
			        minPrice: a,
			        maxPrice: b
			    }
		}
		
		return config;    
	}
	
	$scope.thisfunc = function() {
		$http.get("http://localhost:8080/nbgardens-catalogue-0.0.1-SNAPSHOT/api/search/Price", funt(a, b)).then(function(response){
			productService.stuff.content = response.data;
		});
	}
	

});


app.controller('materialController', function($scope, $http, productService) {
	
	var materials = [];
	
	$scope.materialfunc = function() {
		if($scope.leather) {
			materials.push("leather");
		}
		if($scope.pot) {
			materials.push("pot");
		}
		if($scope.china) {
			materials.push("china");
		}
		
		$http.get("http://localhost:8080/nbgardens-catalogue-0.0.1-SNAPSHOT/api/search/material/" + JSON.stringify(materials)).then(function(response){
			productService.stuff.content = response.data;
		})
	}
	
});