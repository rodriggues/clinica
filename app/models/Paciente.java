package models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import play.db.jpa.Model;

@Entity
public class Paciente extends Model {

	public String nome;
	public String email;
	public String genero;
	public String cpf;
	public String telefone;
	public Date dataNasc;
	public String endereco;
	
	@ManyToOne
	public Cidade cidade;

	@ManyToMany
	@JoinTable(name = "paciente_profissional")
	public List<Profissional> profissional;
}
