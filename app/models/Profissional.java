package models;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import play.db.jpa.Blob;
import play.db.jpa.Model;
import play.libs.Crypto;

@Entity
public class Profissional extends Model {

	public String nome;
	public String profissao;
	public String email;
	public String senha;
	
	public Blob foto;

	@ManyToMany(mappedBy = "profissional")
	public List<Paciente> paciente;

	public void setSenha(String s) {
		senha = Crypto.passwordHash(s);
	}
}
