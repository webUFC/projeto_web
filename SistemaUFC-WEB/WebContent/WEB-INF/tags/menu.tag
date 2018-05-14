<%@taglib prefix="chamaTag" tagdir="/WEB-INF/tags"%>


<aside class="main-sidebar">
	<!-- sidebar: style can be found in sidebar.less -->
	<section class="sidebar">
		<!-- Sidebar user panel -->
		<div class="user-panel">
			<div class="pull-left image">
				<img src="dist/img/user2-160x160.jpg" class="img-circle"
					alt="User Image">
			</div>
			<div class="pull-left info">
				<p>Antônio Arruda</p>
				<a href="#"><i class="fa fa-circle text-success"></i>
					Status/Online</a>
			</div>
		</div>
		<!--search form-->
		<form action="#" method="get" class="sidebar-form">
			<div class="input-group">
				<input type="text" name="q" class="form-control"
					placeholder="Search..."> <span class="input-group-btn">
					<button type="submit" name="search" id="search-btn"
						class="btn btn-flat">
						<i class="fa fa-search"></i>
					</button>
				</span>
			</div>
		</form>
		<!-- .search form -->
		<!-- sidebar menu: : style can be found in sidebar.less -->
		<ul class="sidebar-menu" data-widget="tree">
			<li class="header ">Navegação</li>
			<!--Monitoramento-->
			<li class=" treeview"><a href="#"> <i
					class="fa fa-television"></i> <span>Área de Trabalho</span> <span
					class="pull-right-container"> <span
						class="fa fa-angle-left pull-right"></span>
				</span>
			</a>
				<ul class="treeview-menu">
					<li><a href="index.jsp"><i class="fa fa-tachometer"></i>Monitoramento</a></li>
				</ul></li>



			<!--Fim Monitoramento-->
			<!--Caixa-->
			<li class=" treeview"><a href="#"> <i class="fa fa-dollar"></i>
					<span>Caixa</span> <span class="pull-right-container"> <span
						class="fa fa-angle-left pull-right"></span>
				</span>
			</a>
				<ul class="treeview-menu">
					<li><a href="abrircaixa.jsp"><i class="fa fa-box-open"></i>Abrir
							Caixa</a></li>
					<li><a href="cadCreditos.jsp"><i class="fa fa-arrow-right"></i>Inserir
							Créditos</a></li>
					<li><a href="relatorioCreditos.jsp"><i
							class="fa fa-file-text"></i>Relatório</a></li>
				</ul></li>
			<!--Fim Caixa-->

			<!--Aluno--
			<li class=" treeview"><a href="#"> <i
					class="fa fa-address-card"></i> <span>Aluno</span> <span
					class="pull-right-container"> <span
						class="fa fa-angle-left pull-right"></span>
				</span>
			</a>
				<ul class="treeview-menu">
					<li><a href="novoaluno.jsp"><i class="fa fa-user-plus"></i>Novo
							Aluno</a></li>
					<li><a href="importaluno.jsp"><i class="fa fa-user-plus"></i>Importar
							Aluno</a></li>
					<li><a href="buscaraluno.jsp"><i class="fa fa-search"></i>Buscar
							Aluno</a></li>
					<li><a href="buscaraluno.jsp"><i class="fa fa-search"></i>Deletar
							Aluno</a></li>
					<li><a href="listaraluno.jsp"><i class="fa fa-table"></i>Todos</a></li>
					<li><a href="relatorioalunos.jsp"><i
							class="fa fa-file-text"></i>Relatório</a></li>
				</ul></li>
			<!--Fim Aluno-->
			
			<!--Usuario-->
			<li class=" treeview"><a href="#"> <i
					class="fa fa-address-card"></i> <span>Usuario</span> <span
					class="pull-right-container"> <span
						class="fa fa-angle-left pull-right"></span>
				</span>
			</a>
				<ul class="treeview-menu">
					<!-- <li><a href="#"><i class="fa fa-user-plus"></i>
					Novo Usuario</a></li>-->
					<li>
						<chamaTag:botaoModal/>	
					</li>
					
					<li><a href="importar_Usuario.jsp"><i
							class="fa fa-user-plus"></i>Importar Usuarios</a></li>
					<li><a href="buscar_Usuario.jsp"><i class="fa fa-search"></i>Buscar
							Usuario</a></li>
					<li><a href="deletar_Usuario.jsp"><i class="fa fa-search"></i>Deletar
							Usuario</a></li>
					<li><a href="listar_Usuario.jsp"><i class="fa fa-table"></i>Todos</a></li>
					<!-- <li><a href="relatorioalunos.jsp"><i
							class="fa fa-file-text"></i>Relatório</a></li>-->
				</ul></li>
			<!--Fim Usuario-->
			<!--Cardapio-->
			<li class=" treeview"><a href="#"> <i
					class="fa fa-address-card"></i> <span>Cardápio</span> <span
					class="pull-right-container"> <span
						class="fa fa-angle-left pull-right"></span>
				</span>
			</a>
				<ul class="treeview-menu">
					<li><a href="novoaluno.jsp"><i class="fa fa-user-plus"></i>Ver
							Cardápio</a></li>
					<li><a href="importaluno.jsp"><i class="fa  fa-cutlery"></i>Montar
							Cardapio</a></li>
					<li><a href="buscaraluno.jsp"><i class="fa fa-cubes"></i>Cadastrar
							Produtos</a></li>
					<li><a href="listaraluno.jsp"><i class="fa fa-search"></i>Buscar
							Cardápio</a></li>
					<li><a href="relatorioalunos.jsp"><i
							class="fa fa-file-text"></i>Relatório</a></li>
				</ul></li>

			<!--Formularios-->
			<li class=" treeview"><a href="#"> <i
					class="fa fa-address-card"></i> <span>Formularios</span> <span
					class="pull-right-container"> <span
						class="fa fa-angle-left pull-right"></span>
				</span>
			</a>
				<ul class="treeview-menu">
					<li><a href="form_aluno.jsp"><i class="fa fa-user"></i>Aluno</a></li>
					<li><a href="form_funcionario.jsp"><i class="fa fa-user"></i>Funcionario</a></li>
					<li><a href="form_docente.jsp"><i class="fa fa-user"></i>Docente</a></li>

				</ul></li>
			<!--Fim Formularios-->

			<!--Carteira-->
			<li class=" treeview"><a href="#"> <i
					class="fa fa-address-card"></i> <span>Carteira</span> <span
					class="pull-right-container"> <span
						class="fa fa-angle-left pull-right"></span>
				</span>
			</a>
				<ul class="treeview-menu">
					<li><a href="#"><i class="fa fa-user"></i>Valor</a></li>

				</ul></li>
			<!--Fim Carteira-->
			
		</ul>
	</section>
	<!-- /.sidebar -->
</aside>
