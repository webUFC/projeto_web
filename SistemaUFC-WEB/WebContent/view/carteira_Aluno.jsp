<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="chamaTag" tagdir="/WEB-INF/tags"%>

<html>
<chamaTag:head />

<body class="skin-blue fixed sidebar-mini-expand-feature">
	<chamaTag:header_Aluno />
	<chamaTag:menuAluno />

	<div class="content-wrapper">
		<section class="content-header">
		<h1>
			Carteira <small>Aluno</small>
		</h1>
		<ol class="breadcrumb">
			<li><a href="#"><i class="fa fa-dashboard"></i> Carteira</a></li>
			<li class="active">Valor</li>
		</ol>

		</section>
		<section class="content">
		<div class="row">
			<div class="col-lg-3 col-xs-6">
				<div class="info-box">
					<span class="info-box-icon bg-aqua"><i
						class="fa fa-money"></i>
					</span>

					<div class="info-box-content">
						<span class="info-box-text">Total Gasto</span>
						<span class="info-box-number">50,00</span>
					</div>
					<!-- /.info-box-content -->
				</div>
			</div>
			
			
			
			<div class="col-lg-3 col-xs-6">
				<div class="info-box">
					<span class="info-box-icon bg-green"><i
						class="fa fa-money"></i>
					</span>

					<div class="info-box-content">
						<span class="info-box-text">Saldo Disponível</span>
						<span class="info-box-number">50,00</span>
					</div>
					<!-- /.info-box-content -->
				</div>
			</div>
			<div class="col-lg-3 col-xs-6">
				<div class="info-box">
					<span class="info-box-icon bg-orange"><i
						class="fa fa-credit-card"></i>
					</span>

					<div class="info-box-content">
						<span class="info-box-text">Crédito Disponível</span>
						<span class="info-box-number">10</span>
					</div>
					<!-- /.info-box-content -->
				</div>
			</div>
			<div class="col-lg-3 col-xs-6">
								<div class="info-box">
					<span class="info-box-icon bg-red"><i
						class="fa fa-credit-card"></i>
					</span>

					<div class="info-box-content">
						<span class="info-box-text">Crédito Utilizado</span>
						<span class="info-box-number">1</span>
					</div>
					<!-- /.info-box-content -->
				</div>
			</div>
		</div>
		</section>
	</div>

	<chamaTag:footer />
	<chamaTag:scripts />
</body>
</html>