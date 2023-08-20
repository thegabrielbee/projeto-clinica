package clinica;

public interface UsuarioBase {

	public String nome = "";
	
	public void agendarConsulta();
	public void alterarConsulta();
	public void cancelarConsulta();

	public void criarUsuario();
	public void editarUsuario();
	public void exlcuirUsuario();

    public String toString();
}
