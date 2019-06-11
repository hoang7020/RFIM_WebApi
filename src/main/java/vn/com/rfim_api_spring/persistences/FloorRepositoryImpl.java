package vn.com.rfim_api_spring.persistences;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import vn.com.rfim_api_spring.persistences.entities.Floor;
import vn.com.rfim_api_spring.persistences.repositories.FloorRepository;

import java.util.List;

@Repository
@Transactional(rollbackFor = Exception.class)
public class FloorRepositoryImpl implements FloorRepository {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Floor> getAll() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Floor> floors = session.createQuery("FROM Floor", Floor.class).getResultList();
        return floors;
    }
}
