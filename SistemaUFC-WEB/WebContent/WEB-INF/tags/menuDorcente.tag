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
                <p>Ant�nio Arruda (A)</p>
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
            <li class="header ">Navega��o</li>

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


            <!--Cardapio-->
            <li class=" treeview"><a href="#"> <i
                        class="fa fa-table"></i> <span>Card�pio</span> <span
                        class="pull-right-container"> <span
                            class="fa fa-angle-left pull-right"></span>
                    </span>
                </a>
            <ul class="treeview-menu">
                    <li><a href="Pagina?p=Cardapio"><i class="fa fa-table"></i>Ver Card�pio</a></li>
                    <li><a href="Pagina?p=Cardapio"><i class="fa fa-user-plus"></i>Hist�rico</a></li>
                    
                </ul>
            </li>



        </ul>
    </section>
    <!-- /.sidebar -->
</aside>
