package clinica;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="usuario_medico")
public class UsuarioMedico implements UsuarioBase {

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
	@Column(name="crm")
	private String crm;
	@Getter
	@Setter
	@Column(name="especialidade")
	private String especialidade;
	@OneToMany(mappedBy = "medicoId", orphanRemoval=true)
	@Cascade(CascadeType.ALL)
    private List<Agendamentos> medicoId;

	public UsuarioMedico(
			String nome,
			String crm, 
			String especialidade
	){
		
		this.nome = nome;
		this.crm = crm;
		this.especialidade = especialidade;
		
	}
	
	public void agendarConsulta(){};
	public void alterarConsulta(){};
	public void cancelarConsulta(){};
	
	public void criarUsuario(){};
	public void editarUsuario(){};
	public void exlcuirUsuario(){};
		
	@Override
    public String toString() {
        return "Medico(Nome=" + this.nome + 
        		", CRM=" + this.crm + 
        		", Especialidade=" + this.especialidade + 
        		")";
    }
		
}
