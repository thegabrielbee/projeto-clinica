package clinica;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="usuario_adm")
public class UsuarioAdm implements UsuarioBase {

	public UsuarioAdm() {
        
    }
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Getter
	@Setter
	private int id;
	@Getter
	@Setter
	@Column(name="nome")
	private String nome;
	@Getter
	@Setter
	@Column(name="email")
	private String email;
	@Getter
	@Setter
	@Column(name="funcao")
	private String funcao;

	public UsuarioAdm(
			String nome,
			String funcao, 
			String email
	){
		
		this.nome = nome;
		this.funcao = funcao;
		this.email = email;
		
	}
	
	public String getNome(){
		return this.nome;
	}
	public void agendarConsulta(){};
	public void alterarConsulta(){};
	public void cancelarConsulta(){};
	
	public void criarUsuario(){};
	public void editarUsuario(){};
	public void exlcuirUsuario(){};
	
	@Override
    public String toString() {
        return "Administrador(Nome=" + this.nome + 
        		", Função=" + this.funcao + 
        		", Email=" + this.email + 
        		")";
    }
	
}
