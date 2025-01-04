package controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import models.Paciente;
import models.Profissional;
import models.UF;
import play.mvc.Controller;

public class Pacientes extends Controller {

	public static void form() {
		List<UF> ufs = Arrays.asList(UF.values());
		List<Profissional> profissional = Profissional.findAll();
		render(profissional, ufs);
	}

	public static void salvar(Paciente usu) {
		usu.save();
		flash.success("Cadastrado com sucesso!");
		listar();
	}

	public static void listar() {
		List<Paciente> lista = Paciente.findAll();
		render(lista);
	}

	public static void editar(long id) {
		Paciente usu = Paciente.findById(id);
		List<Profissional> profissional = Profissional.findAll();
		renderTemplate("Pacientes/form.html", usu, profissional);
	}

	public static void remover(long id) {
		Paciente usu = Paciente.findById(id);
		usu.delete();
		flash.success("Removido com sucesso!");
		listar();
	}
}
