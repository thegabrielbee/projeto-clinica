package clinica;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="usuario_paciente")
public class UsuarioPaciente implements UsuarioBase {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Getter
	@Setter
	private int id;
	@Getter
	@Setter
	private String nome;
	@Getter
	@Setter
	private Date dataNascimento;
	@Getter
	@Setter
	private String cpf;
	@Getter
	@Setter
	private String endereco;
	@Getter
	@Setter
	private String telefone;
	@Getter
	@Setter
	private String email;
	
	public UsuarioPaciente(
			String nome,
			Date dataNascimento,
			String cpf,
			String endereco,
			String telefone,
			String email
	){
		
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
		
	}

	public void agendarConsulta(){
		
		// VALIDAR AGENDA DO MÉDICO
		
	};
	public void alterarConsulta(){};
	public void cancelarConsulta(){};
	
	public void criarUsuario(){};
	public void editarUsuario(){};
	public void exlcuirUsuario(){};
	
	@Override
    public String toString() {
        return "Paciente(Nome=" + this.nome + 
        		", Data de Nascimento=" + this.dataNascimento + 
        		", CPF=" + this.cpf + 
        		", Endereço=" + this.endereco + 
        		", telefone=" + this.telefone +
        		", email=" + this.email +
        		")";
    }
	
}
