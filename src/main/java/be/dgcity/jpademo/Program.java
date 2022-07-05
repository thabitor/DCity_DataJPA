package be.dgcity.jpademo;

import be.dgcity.jpademo.entities.Section;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Program {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("PersistenceDemoMySQL");
        EntityManager manager = emf.createEntityManager();
        Section s = manager.find(Section.class, 1010);




        emf.close();

    }
}
