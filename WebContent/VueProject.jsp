<!-- importation du model de la couche web -->
<%@page import="web.ProjectionModel"%>
<%
	//recupération du model stocker dans l'objet request
	ProjectionModel model = (ProjectionModel)request.getAttribute("projectionModel");
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8"/>
	<title>Projection de la population</title>
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
	<link rel="stylesheet" type="text/css" href="css/style.css"/>
</head>
<body>
	<p class="spacer"></p>
	<div class="container">
		<div class="col-md-6 col-xm-12 col-sm-12 col-md-offset-3">
			<div class="panel panel-primary">
				<div class="panel-heading"><h3>Projection d'une population</h3></div>
				<div class="panel-body">
					<form action="projectionPopulation.do" method="post">
						<div class="form-group">
							<label class="control-label">Population de référence:</label>
							<input type="text" name="popRef" class="form-control" value="<%=model.getPopRef() %>"/>
						</div>
						<div class="form-group">
							<label class="control-label">Taux de croissance:</label>
							<input type="text" name="taux" class="form-control" value="<%=model.getTaux() %>"/>
						</div>
						<div class="form-group">
							<label class="control-label">Année de référence:</label>
							<input type="text" name="anRef" class="form-control" value="<%=model.getAnRef() %>"/>
						</div>
						<div class="form-group">
							<label class="control-label">Année ciblée:</label>
							<input type="text" name="anCib" class="form-control" value="<%=model.getAnCib() %>"/>
						</div>
						<button class="btn btn-danger" type="submit">Evaluer</button>
					</form>
				</div>
				<div class="panel-footer">
					<label><h4>Pojection de la population:</h4></label>
					<label><h3><%=model.getPopProj() %></h3></label>
				</div>
			</div>
		</div>
	</div>
</body>
</html>