package Proxy;

public class Usuario implements ValidacaoUsuario{
	
	private String nome;
	private String senha;
	private Role role;
	
	public Usuario(String nome, String senha, Role role) {
		this.nome = nome;
		this.senha = senha;
		this.setRole(role);
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getSenha() {
		return this.senha;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public boolean podeAdicionarCliente() {
		System.out.println("Adicionando cliente sem verificar se o usuario tem permissão"); 
		return true;
	}



}
