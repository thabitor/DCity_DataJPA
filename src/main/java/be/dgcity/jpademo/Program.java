package be.dgcity.jpademo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Program {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("PersistenceDemoMySQL");
        EntityManager manager = emf.createEntityManager();

        

        emf.close();

    }
}
