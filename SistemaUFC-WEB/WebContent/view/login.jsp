<%-- 
    Document   : Login.jsp
    Created on : 13/06/2018, 08:35:38
    Author     : MRX
--%>
<%@page import="web.dao.UsuarioDAO"%>
<%@page import="web.model.Usuario"%>
<%@taglib prefix="chamaTag" tagdir="/WEB-INF/tags/" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<chamaTag:head/>
<body class="hold-transition login-page">

<%
	if(request.getParameter("user") != null && request.getParameter("pass") != null){
		Usuario logado = UsuarioDAO.getInstance().pesquisarUser(request.getParameter("user"), request.getParameter("pass"));
		if(logado == null){
			response.sendRedirect("Pagina?p=Login&error=0");
		}else{
			session.setAttribute("logado", logado);
			response.sendRedirect("Pagina?p=Home");
		}
	}
%>

<div class="login-box">
  <div class="login-logo">
    <!--<a href="../../index2.html"><b>Admin</b>LTE</a>-->
  </div>
  <!-- /.login-logo -->
  <div class="login-box-body">
    <p class="login-box-msg">Insira seu Login e sua Senha</p>
	<%if(request.getParameter("error")!= null || request.getAttribute("error")!= null){
		if(request.getParameter("error")!= null && Integer.parseInt(request.getParameter("error")) == 0){%>
			<div class="alert alert-warning">
			  <strong>Dados Incorretos!</strong><br/>Senha e/ou login incorretos!.
			</div>
		<%}else{%>
			<div class="alert alert-warning">
			  <strong>Login necessário!</strong><br/>É necessário efetuar o login!.
			</div>
		<%}%>
	<%}%>
    <form action="#" method="post">
      <div class="form-group has-feedback">
        <input type="text" class="form-control" name="user" placeholder="Login">
        <span class="fa fa-user form-control-feedback"></span>
      </div>
      <div class="form-group has-feedback">
        <input type="password" class="form-control" name="pass" placeholder="Senha">
        <span class="glyphicon glyphicon-lock form-control-feedback"></span>
      </div>
      <div class="row">
        
        <!-- /.col -->
        <div class="col-xs-4">
          <button type="submit" class="btn btn-primary btn-block btn-flat">Entrar</button>
        </div>
        <!-- /.col -->
      </div>
    </form>

    
    <!-- /.social-auth-links -->

  </div>
  <!-- /.login-box-body -->
</div>
<!-- /.login-box -->


<chamaTag:scripts></chamaTag:scripts>
<script>
  $(function () {
    $('input').iCheck({
      checkboxClass: 'icheckbox_square-blue',
      radioClass: 'iradio_square-blue',
      increaseArea: '20%' // optional
    });
  });
</script>


</body></html>
