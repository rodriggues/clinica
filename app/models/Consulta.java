package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import play.db.jpa.Model;

@Entity
public class Consulta extends Model {

	@ManyToOne
	public Paciente paciente; 

	@ManyToOne
	public Profissional profissional; 

	public Date dataDia;
	public String hora;
}
