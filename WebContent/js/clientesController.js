//Clientes Controller
function clientesController($scope,$http,$routeParams,$location) {
	//lista de clientes
	$scope.rows = null;
	//um cliente
	$scope.row = null;
	//Pagination
	$scope.currentPage = 0;
	$scope.pageSize = 15;

	$scope.numberOfPages =function(){
		return Math.ceil($scope.rows.length/$scope.pageSize);
	}

	$scope.loadAll = function(){
		$scope.showLoader();
		$http.get($scope.server("/customers")).success(function(data){
			$scope.rows = data;
		});
	}

	$scope.loadRow = function(){
		if ($routeParams.id!=null)
		{
			$scope.showLoader();
			$http.get($scope.server("/customer/"+$routeParams.id))
			.success(function(data){
				$scope.row = data;
				$scope.row.isUpdate = true;
			});
		}
		else
		{
			$scope.row = {}
			$scope.row.CustomerID = null;
			$scope.row.isUpdate = false;
		}
	}

	$scope.save = function(){
		$scope.showLoader();
		$http.post($scope.server("/customer/"+$routeParams.id),$scope.row)
		.success(function(data){
			alert("Salvo com sucesso");
			$scope.row.isUpdate = true;
		});
	}
}