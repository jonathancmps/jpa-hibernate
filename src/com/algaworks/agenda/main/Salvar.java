package com.algaworks.agenda.main;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.algaworks.agenda.modelo.Agenda;

public class Salvar {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("agendaConexao");
		EntityManager em = emf.createEntityManager();
		/*
		Agenda agenda = new Agenda();
		agenda.setNome("Jonathan");
		agenda.setTelefone("81996664511");
		agenda.setDataRegistro(new Date(2019, 05, 19));
		em.getTransaction().begin();
		em.persist(agenda);
		em.getTransaction().commit();
		*/
		Agenda agenda1 = new Agenda();
		agenda1.setNome("Miriam");
		agenda1.setTelefone("81999999999");
		agenda1.setDataRegistro(new Date(2019, 05, 19));
		em.getTransaction().begin();
		em.persist(agenda1);
		em.getTransaction().commit();
		
		Agenda agenda2 = new Agenda();
		agenda2.setNome("Campos");
		agenda2.setTelefone("81999999999");
		agenda2.setDataRegistro(new Date(2019, 05, 19));
		em.getTransaction().begin();
		em.persist(agenda2);
		em.getTransaction().commit();
		/*
		Agenda agenda3 = new Agenda();
		agenda.setNome("Victor");
		agenda.setTelefone("81999999999");
		agenda.setDataRegistro(new Date(2019, 05, 19));
		em.getTransaction().begin();
		em.persist(agenda);
		em.getTransaction().commit();
		System.out.println("Contato salvo com sucesso!");
		*/
	}

}
