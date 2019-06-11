package vn.com.rfim_api_spring.persistences;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import vn.com.rfim_api_spring.persistences.entities.Shelf;
import vn.com.rfim_api_spring.persistences.repositories.ShelfRepository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional(rollbackOn = Exception.class)
public class ShelfRepositoryImpl implements ShelfRepository {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Shelf> getAll() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Shelf> shelves = session.createQuery("FROM Shelf", Shelf.class).getResultList();
        return shelves;
    }
}
