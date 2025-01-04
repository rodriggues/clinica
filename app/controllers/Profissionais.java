package controllers;

import java.util.List;

import models.Profissional;
import play.mvc.Controller;

public class Profissionais extends Controller {
	public static void form() {
		render();
	}

	public static void salvar(Profissional p) {
		p.save();
		flash.success("Cadastrado com sucesso!");
		listarProfissionais();
	}

	public static void listarProfissionais() {
		List<Profissional> listas = Profissional.findAll();
		render(listas);
	}

	public static void editar(long id) {
		Profissional p = Profissional.findById(id);
		renderTemplate("Profissionais/form.html", p);
	}

	public static void remover(long id) {
		Profissional p = Profissional.findById(id);
		p.delete();
		flash.success("Removido com sucesso!");
		listarProfissionais();
	}
	public static void detalhar(Long id) {
		Profissional pessoa = Profissional.findById(id);
		render(pessoa);
	}
	
	public static void verFoto(Long id) {
		Profissional p = Profissional.findById(id);
		notFoundIfNull(p);
		response.setContentTypeIfNotSet(p.foto.type());
		renderBinary(p.foto.get());
	}
	public static void verFotoLogado() {
	    String email = session.get("profissional.email");
	    if (email == null) {
	        notFound("Profissional não está logado.");
	    }

	    Profissional p = Profissional.find("email", email).first();
	    if (p == null || p.foto == null) {
	        notFound("Foto do profissional não encontrada.");
	    }

	    response.setContentTypeIfNotSet(p.foto.type());
	    renderBinary(p.foto.get());
	}


}
