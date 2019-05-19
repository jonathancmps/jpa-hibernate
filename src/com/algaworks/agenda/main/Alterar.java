package com.algaworks.agenda.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.algaworks.agenda.modelo.Agenda;

public class Alterar {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("agendaConexao");
		EntityManager em = emf.createEntityManager();		
		
		em.getTransaction().begin();
		Agenda agenda = em.find(Agenda.class, 1L);
		agenda.setNome("Jonathan Campos");
		em.getTransaction().commit();
		System.out.println("Contato alterado");

	}

}
