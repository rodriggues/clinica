package controllers;

import play.mvc.Before;
import play.mvc.Controller;

public class Seguranca extends Controller {

	@Before
	static void verificar() {
		if (session.contains("profissional.email") == false) {
			Login.form();
		}

	}

}
