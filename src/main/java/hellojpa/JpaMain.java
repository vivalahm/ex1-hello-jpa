package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello"); // persistence-unit name="hello"

        EntityManager em = emf.createEntityManager(); // Connection

        EntityTransaction tx = em.getTransaction();
        tx.begin(); //  transaction start

        Member member = new Member();
        member.setId(1L);
        member.setName("HelloA");

        em.persist(member); // like insert

        tx.commit(); // transaction end

        em.close();

        emf.close();
    }
}
