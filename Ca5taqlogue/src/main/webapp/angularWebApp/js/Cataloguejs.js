

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


app.controller('newCont', function($scope, productService) {

	$( function() {
	  $( "#slider-range" ).slider({
	    range: true,
	    min: 0,
	    max: 500,
	    values: [ 75, 300 ],
	    slide: function( event, ui ) {
	      $( "#amount" ).val( "$" + ui.values[ 0 ] + " - $" + ui.values[ 1 ] );
	      productService.value1 = ui.values[ 0 ];
	      productService.value2 = ui.values[ 1 ];
	    }
	  });
	  $( "#amount" ).val( "$" + $( "#slider-range" ).slider( "values", 0 ) +
	    " - $" + $( "#slider-range" ).slider( "values", 1 ) );
	} );
	
	$scope.thisfunc = function() {
		alert(productService.value2);
	}
	

});