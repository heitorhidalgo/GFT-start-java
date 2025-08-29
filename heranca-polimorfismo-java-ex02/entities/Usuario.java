package entities;

public class Usuario {

	private String nome;
	private String email;
	private String senha;
	private boolean isAdministrador;
	
	public Usuario(String nome, String email, String senha, boolean isAdministrador) {
		super();
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.isAdministrador = isAdministrador;
	}
	
	public void realizarLogin() {
		System.out.println("Usuario '" + this.nome + "' logado com sucesso.");
	}
	
	public void realizarLogoff() {
		System.out.println("Usuario '" + this.nome + "' fez logoff.");
	}
	
	public void alterarSenha(String novaSenha) {
		this.senha = novaSenha;
		System.out.println("Senha de '" + this.nome + "' alterada com sucesso.");
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public boolean isAdministrador() {
		return isAdministrador;
	}
}