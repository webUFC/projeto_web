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
				<p>Antônio Arruda (A)</p>
				<a href="#"><i class="fa fa-circle text-success"></i>
					Status/Online</a>
			</div>
		</div>
		<!-- sidebar menu: : style can be found in sidebar.less -->
		<ul class="sidebar-menu" data-widget="tree">
			<li class="header ">Navegação</li>
			
			<!--Carteira-->
			<li class=" treeview"><a href="#"> <i
					class="fa  fa-credit-card"></i> <span>Carteira</span> <span
					class="pull-right-container"> <span
						class="fa fa-angle-left pull-right"></span>
				</span>
			</a>
				<ul class="treeview-menu">
					<li><a href="carteira_Aluno.jsp"><i class="fa fa-money"></i>Valor</a></li>

				</ul></li>
			<!--Fim Carteira-->
			
			<li class="treeview" ><a href="#"> <i
					class="fa fa-cutlery"></i> <span>Cardápio</span> <span
					class="pull-right-container"> <span
						class="fa fa-angle-left pull-right"></span>
				</span>
			</a>
				<ul class="treeview-menu">
					<li><a href="cardapio_Aluno.jsp"><i class="fa fa-newspaper-o"></i>Ver
							Cardápio</a></li>
				</ul>
			</li>
		</ul>
	</section>
	<!-- /.sidebar -->
</aside>
