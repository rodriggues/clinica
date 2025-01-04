package controllers;

import models.Profissional;
import play.libs.Crypto;
import play.mvc.Controller;

public class Login extends Controller {

    public static void form() {
        render(); 
    }

    public static void logar(String email, String senha) {
        Profissional p = Profissional.find("email = ?1 and senha = ?2", email, Crypto.passwordHash(senha)).first();

        if (p == null) {
            flash.error("E-mail ou senha inválidos!");
            form();  
        } else {
            session.put("profissional.email", p.email);
            Consultas.listarConsultas();
        }
    }

    public static void sair() {
        session.clear();
        form();
    }
    
}
