package Connect;


	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.Persistence;

import entities.Banco;

	public class Connect {
		
		private EntityManagerFactory emf;
		private EntityManager em;
		
		
		public void connectAndAdd(Banco banco) {
			emf = Persistence.createEntityManagerFactory("Banco");
			emf.createEntityManager();
			em.getTransaction().begin();;
			em.persist(banco);
			em.getTransaction().commit();
			em.close();
			emf.close();
		}

}
