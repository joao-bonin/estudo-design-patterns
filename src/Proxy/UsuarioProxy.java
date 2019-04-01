package Proxy;

public class UsuarioProxy implements ValidacaoUsuario {
	
	private Usuario usuario;

	
	public UsuarioProxy(String nome, String senha, Role role) {
		usuario = new Usuario(nome, senha, role);
	}

	@Override
	public boolean podeAdicionarCliente() {
		if(usuario.getRole().equals(Role.ADMIN)) {
			return true;
		}
		return false;
	}

	public void cadastraCliente(Cliente cliente) {
		
		if(podeAdicionarCliente()) {
			System.out.println("O cliente foi adicionado com sucesso na base de dados!");
		}else {
			throw new RuntimeException("O usuario não possui permissão para cadastrar o cliente");
		}
		
	}
	


}
