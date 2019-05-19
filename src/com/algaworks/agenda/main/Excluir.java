package com.algaworks.agenda.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.algaworks.agenda.modelo.Agenda;

public class Excluir {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("agendaConexao");
		EntityManager em = emf.createEntityManager();		
		
		em.getTransaction().begin();
		Agenda agenda = em.find(Agenda.class, 3L);
		em.remove(agenda);
		em.getTransaction().commit();
		
		System.out.println("Contato excluido");

	}

}
