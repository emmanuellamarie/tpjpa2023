package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;

public class JpaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		EntityManager manager = EntityManagerHelper.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();


		try {

			UtilisateurStandard utilisateur = new UtilisateurStandard("nguetta","emma");
			UtilisateurSupport utilisateurSupport = new UtilisateurSupport("bamba","arnaurd");

			Sujet sujet = new Sujet("test");

			Ticket ticket = new Ticket("ticket_test",sujet,utilisateur);
			manager.persist(utilisateur);
			manager.persist(utilisateurSupport);
			manager.persist(sujet);
			manager.persist(ticket);


		} catch (Exception e) {
			e.printStackTrace();
		}
		tx.commit();


		manager.close();
		EntityManagerHelper.closeEntityManagerFactory();
		//		factory.close();
	}


}
