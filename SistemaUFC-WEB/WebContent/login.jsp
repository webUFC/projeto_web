<%-- 
    Document   : login-lte.jsp
    Created on : 11/04/2018, 13:10:41
    Author     : MRX
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="chamaTag" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html>
<html>
<head>
<chamaTag:head />
<!-- Chamando as folhas de estilos e scripts -->
<body class="hold-transition login-page">

	<div class="login-box">
		<div class="login-logo">
			<a href=""><b>Sistema </b>RU</a>
		</div>
		<!-- /.login-logo -->
		<div class="login-box-body">


			<form action="" method="post">
				<div class="form-group has-feedback">
					<input type="text" class="form-control" name="login"
						placeholder="Usuario"> <span
						class="glyphicon glyphicon-user form-control-feedback"></span>
				</div>
				<div class="form-group has-feedback">
					<input type="password" class="form-control" name="senha"
						placeholder="Senha"> <span
						class="glyphicon glyphicon-lock form-control-feedback"></span>
				</div>
				<div class="row">
					<div class="col-xs-8">
						
						<div class="checkbox icheck">
							<label> 
								<a href="#">Esqueci minha senha.</a>
							</label>
						</div>
					</div>
					<!-- /.col -->
					<div class="col-xs-4">
						<button type="submit" class="btn btn-primary btn-block btn-flat">Entrar</button>
					</div>
					<!-- /.col -->
				</div>
			</form>

			
		</div>
		<!-- /.login-box-body -->
	</div>
	<!-- /.login-box -->

	<!-- jQuery 3 -->
	<script src="bower_components/jquery/dist/jquery.min.js"></script>
	<!-- Bootstrap 3.3.7 -->
	<script src="bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
	<!-- iCheck -->
	<script src="plugins/iCheck/icheck.min.js"></script>
	<script>
		$(function() {
			$('input').iCheck({
				checkboxClass : 'icheckbox_square-blue',
				radioClass : 'iradio_square-blue',
				increaseArea : '20%' /* optional */
			});
		});
	</script>
</body>
</html>
