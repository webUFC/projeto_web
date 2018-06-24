package web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import web.dao.conexao.ConnectionFactory;
import web.model.Tipo;
import web.model.Usuario;

public class UsuarioDAO {
	private static UsuarioDAO instance;
	
	public static UsuarioDAO getInstance() {
		if(instance == null) instance = new UsuarioDAO();
		return instance;
	}
	
	/**
	 * <html>
	 * <b>Cadastra um usuário no banco de dados.</b><br/>
	 * <p>O ID do usuário será gerado automaticamente no banco de dados.</p>
	 * <p>O usuário será salvo no BD com o seguinte formato:</p>
	 * <table border="1">
	 * 	<tr>
	 * 		<th>ID</th><th>Nome</th><th>Matrícula</th><th>Tipo</th><th>Senha</th><th>Ativo</th><th>idCarteira</th>
	 * 	</tr>
	 * 	<tr>
	 * 		<td>AUTO</td><td>String</td><td>int</td><td>int</td><td>String</td><td>boolean</td><td>int</td>
	 * 	</tr>
	 * </table>
	 * </html>
	 * @param user : Usuario que será cadastrado
	 */
	public void cadastrarUser(Usuario user) {
		try {
			Connection conn = ConnectionFactory.getInstancia().getConnection();
			PreparedStatement ps = conn.prepareStatement("INSERT INTO usuario (nomeUsuario,matricula,idTipo,hashSenha,ativo,idCarteira) (?,?,?,?,?,?)");
			ps.setString(1, user.getNomeUser());
			ps.setInt(2, user.getMatricula());
			ps.setInt(3, user.getTipo().ordinal());
			ps.setString(4, user.getSenha());
			ps.setBoolean(5, user.getStatus());
			ps.setInt(6, user.getCarteira().getIdCarteira());
			ps.execute();
			ConnectionFactory.closeConnection(conn,ps);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Retorna todos os usuários do sistema em forma de lista.
	 * @return List<Usuario> : Lista de Usuários
	 */
	
	public List<Usuario> listarUser() {
		List<Usuario> usuarios = new ArrayList<Usuario>();
		try {
			Connection conn = ConnectionFactory.getInstancia().getConnection();
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM usuario");
			ResultSet result = ps.executeQuery();
			while(result.next()) {
				Usuario tempUser = new Usuario();
				tempUser.setIdUser(result.getInt(1));
				tempUser.setNomeUser(result.getString(2));
				tempUser.setMatricula(result.getInt(3));
				tempUser.setTipo(Tipo.values()[result.getInt(4)]);
				tempUser.setSenha(result.getString(5));
				tempUser.setStatus(result.getBoolean(6));
				tempUser.setCarteira(CarteiraDAO.getInstance().buscarCarteira(result.getInt(7)));
				usuarios.add(tempUser);
			}
			ConnectionFactory.closeConnection(conn, ps);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return usuarios;
	}
	
	/**
	 * <p>Atualiza os dados de um Usuário no BD</p>
	 * <p><u>O ID do usuário terá que ser idêntico ao do BD</u></p>
	 * </html>
	 */
	
	public void atualizarUser(Usuario user) {
		try {
			Connection conn = ConnectionFactory.getInstancia().getConnection();
			PreparedStatement ps = conn.prepareStatement("UPDATE usuario SET nomeUsuario='?',matricula='?',idTipo='?',hashSenha='?',ativo='?',idCarteira='?' WHERE id='?'");
			ps.setString(1, user.getNomeUser());
			ps.setInt(2, user.getMatricula());
			ps.setInt(3, user.getTipo().ordinal());
			ps.setString(4, user.getSenha());
			ps.setBoolean(5, user.getStatus());
			ps.setInt(6, user.getCarteira().getIdCarteira());
			ps.setInt(7, user.getIdUser());
			ps.execute();
			ConnectionFactory.closeConnection(conn, ps);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Busca um usuário pela matrícula.
	 * @param matricula : Matrícula do usuário
	 * @return Usuario se encontrado!
	 */
	
	public Usuario pesquisarUser(int matricula) {
		try {
			Connection conn = ConnectionFactory.getInstancia().getConnection();
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM usuario");
			ResultSet result = ps.executeQuery();
			Usuario tempUser = null;
			if(result.next()) {
				tempUser = new Usuario();
				tempUser.setIdUser(result.getInt(1));
				tempUser.setNomeUser(result.getString(2));
				tempUser.setMatricula(result.getInt(3));
				tempUser.setTipo(Tipo.values()[result.getInt(4)]);
				tempUser.setSenha(result.getString(5));
				tempUser.setStatus(result.getBoolean(6));
				tempUser.setCarteira(CarteiraDAO.getInstance().buscarCarteira(result.getInt(7)));
			}
			ConnectionFactory.closeConnection(conn, ps);
			return tempUser;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * Busca um usuário pelo nome e senha.
	 * @param nome
	 * @param senha
	 * @return
	 */
	
	public Usuario pesquisarUser(String nome, String senha) {
		try {
			Connection conn = ConnectionFactory.getInstancia().getConnection();
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM usuario WHERE nomeUsuario = ? AND hashSenha = ?");
			ps.setString(1, nome);
			ps.setString(2, senha);
			ResultSet result = ps.executeQuery();
			Usuario tempUser = null;
			if(result.next()) {
				tempUser = new Usuario();
				tempUser.setIdUser(result.getInt(1));
				tempUser.setNomeUser(result.getString(2));
				tempUser.setMatricula(result.getInt(3));
				tempUser.setTipo(Tipo.values()[result.getInt(4)]);
				tempUser.setSenha(result.getString(5));
				tempUser.setStatus(result.getBoolean(6));
				tempUser.setCarteira(CarteiraDAO.getInstance().buscarCarteira(result.getInt(7)));
			}
			ConnectionFactory.closeConnection(conn, ps);
			return tempUser;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * Exclui o Usuário com a matricula informada.
	 * @param matricula
	 */
	
	public void excluirUser(int matricula) {
		try {
			Connection conn = ConnectionFactory.getInstancia().getConnection();
			PreparedStatement ps = conn.prepareStatement("DELETE FROM usuario WHERE matricula = '?'");
			ps.setInt(1,matricula);
			ps.execute();
			ConnectionFactory.closeConnection(conn,ps);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * NÃO IMPLEMENTADO AINDA.
	 */
	
	public void importarUser() {
		
	}
}
