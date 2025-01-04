package controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import models.Paciente;
import models.Profissional;
import models.Consulta;
import play.mvc.Controller;


public class Consultas extends Controller {

  
    public static void salvarConsulta(Long pacienteId, Long profissionalId, String dataConsultaStr) {
       
        if (pacienteId == null || profissionalId == null || dataConsultaStr == null) {
            flash.error("Dados insuficientes para salvar a consulta!");
            listarConsultas(); 
            return;
        }

        
        Paciente paciente = Paciente.findById(pacienteId);
        Profissional profissional = Profissional.findById(profissionalId);

        if (paciente != null && profissional != null) {
            try {
                
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date dataConsulta = dateFormat.parse(dataConsultaStr);

               
                Consulta consulta = new Consulta();
                consulta.paciente = paciente;
                consulta.profissional = profissional;
                consulta.dataDia = dataConsulta;
            
                consulta.save();
                

                flash.success("Consulta marcada com sucesso!");
            } catch (ParseException e) {
                flash.error("Erro ao formatar a data da consulta.");
            }
        } else {
            flash.error("Paciente ou Profissional não encontrados!");
        }
        Profissionais.detalhar(profissionalId);       
    }

    public static void removerConsulta(Long consultaId) {
        if (consultaId != null) {
            Consulta consulta = Consulta.findById(consultaId);
            if (consulta != null) {
                consulta.delete();
                flash.success("Consulta removida com sucesso!");
            } else {
                flash.error("Consulta não encontrada!");
            }
        } else {
            flash.error("ID da consulta não fornecido!");
        }

        listarConsultas(); 
    }



  
    public static void listarConsultas() {
        List<Consulta> consultas = Consulta.findAll(); 
        render(consultas); 
    }

  
    public static void form(Long pacienteId) {
     
        Paciente paciente = Paciente.findById(pacienteId);
        List<Paciente> pacientes = Paciente.findAll(); 
        List<Profissional> profissionais = Profissional.findAll(); 
        render(pacientes, profissionais); 
    }
 }