package com.algaworks.agenda.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.algaworks.agenda.modelo.Agenda;

public class Buscar {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("agendaConexao");
		EntityManager em = emf.createEntityManager();

		Agenda agenda = em.find(Agenda.class, 1L);
		System.out.println(agenda);
	}

}
