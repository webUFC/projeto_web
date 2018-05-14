<%-- 
    Document   : areaDetrabalho
    Created on : 12/04/2018, 23:03:06
    Author     : Antonio Arruda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="chamaTag" tagdir="/WEB-INF/tags"%>

<html>

<chamaTag:head />
<!-- Chamando as folhas de estilos e scripts -->

<body class="skin-blue fixed sidebar-mini-expand-feature">
	<div class="wrapper">
		<chamaTag:header_Aluno/>
		<!-- Chamando o arquivo header -->

		<chamaTag:menuAluno />

		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">
			<!-- Content Header (Page header) -->
			<section class="content-header">
				<h1>Perfil do Aluno</h1>
				<ol class="breadcrumb">
					<li><a href="#"><i class="fa fa-dashboard"></i> Inicio</a></li>
					<li class="active"><a href="#">Perfil do Aluno</a></li>
				</ol>
			</section>

			<!-- Main content -->
			<section class="content">

				<div class="row">
					<div class="col-md-6">

						<!-- Profile Image -->
						<div class="box box-primary">
							<div class="box-body box-profile">
								<img class="profile-user-img img-responsive img-circle"
									src="dist/img/user2-160x160.jpg"
									alt="User profile picture">

								<h3 class="profile-username text-center">Nome do Aluno</h3>

								<p class="text-muted text-center">Estudante</p>

								<ul class="list-group list-group-unbordered">
									<li class="list-group-item"><b>Aluno</b>
										<a class="pull-right label label-success">ISENTO</a>
									</li>
									
									<li class="list-group-item"><b>Saldo R$</b>
										<a class="pull-right">1,322</a>
									</li>
									<li class="list-group-item"><b>Créditos Ativos</b>
										<a class="pull-right">543</a>
									</li>
									<li class="list-group-item"><b>Créditos Gastos</b>
									 	<a class="pull-right">13,287</a>
									</li>
								</ul>
							</div>
						</div>


						<!-- /.box -->

						<!-- About Me Box -->

						<!-- /.box -->
					</div>

					<div class="col-md-6">
						<div class="box box-primary ">
							<div class="box-header with-border">
								<h3 class="box-title">Informações do Aluno</h3>
							</div>
							<!-- /.box-header -->
							<div class="box-body">
								<strong><i class="fa fa-book margin-r-5"></i> Curso</strong>

								<p class="text-muted">Ciência da Computação</p>

								<hr>

								<strong><i class="fa fa-map-marker margin-r-5"></i>
									Instituição</strong>

								<p class="text-muted">Universidade Federal do Ceará - Campus Russas</p>

								<hr>

								<strong><i class="fa fa-pencil margin-r-5"></i> Disciplinas do Semestre 2018.1</strong>

								<p>
									 <span class="label label-success">Disciplina 1</span>
									 <span class="label label-success">Disciplina 2</span>
									 <span class="label label-success">Disciplina 3</span>
									 <span class="label label-success">Disciplina 4</span>
									 <span class="label label-success">Disciplina 5</span>
									 <span class="label label-success">Disciplina 6</span>
									 <span class="label label-success">Disciplina 7</span>
								</p>

								<hr>

								<strong><i class="fa fa-file-text-o margin-r-5"></i>
									Observações</strong>

								<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
									Etiam fermentum enim neque.</p>
							</div>
							<!-- /.box-body -->
						</div>


					</div>

					<!-- /.tab-pane -->
				</div>
				<!-- /.tab-content -->
		</div>
		<!-- /.nav-tabs-custom -->
	</div>
	<!-- /.col -->
	</div>
	<!-- /.row -->

	</section>
	<!-- /.content -->
	</div>
	<!-- /.content-wrapper -->
		<div class="control-sidebar-bg"></div>
	</div>
	<!-- ./wrapper -->

	<chamaTag:footer />
	<chamaTag:scripts />
</body>
</html>

