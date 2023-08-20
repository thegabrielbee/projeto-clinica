package clinica;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="agendamentos")
public class Agendamentos {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Getter
	@Setter
	private int id;
	@Getter
	@Setter
	@ManyToOne
    @JoinColumn(name = "medicoId")
	private UsuarioMedico medicoId;
	@Getter
	@Setter
	@ManyToOne
    @JoinColumn(name = "paciente_id")
	private UsuarioPaciente pacienteId;
	@Getter
	@Setter
	@Column(name="data_hora_agendamento")
	private Date dataHoraAgendamento;
	
}
