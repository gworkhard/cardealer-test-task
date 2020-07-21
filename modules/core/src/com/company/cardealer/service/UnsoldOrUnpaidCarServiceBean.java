package com.company.cardealer.service;

import com.company.cardealer.entity.Car;
import com.company.cardealer.entity.Order;
import com.haulmont.cuba.core.EntityManager;
import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.Transaction;
import com.haulmont.cuba.core.TypedQuery;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service(UnsoldOrUnpaidCarService.NAME)
public class UnsoldOrUnpaidCarServiceBean implements UnsoldOrUnpaidCarService {

    @Inject
    private Persistence persistence;

    @Override
    public List<Car> getUnsoldOrUnpaidCars() {
        try (Transaction tx = persistence.createTransaction()) {
            EntityManager em = persistence.getEntityManager();
            TypedQuery<Car> query = em.createQuery(
                    "select c from cardealer_Car c where c.id not in (select o.car.id from cardealer_Order o where o.isPaid = true) ", Car.class);
//            query.setParameter();
            List<Car> cars = query.getResultList();
            tx.commit();
            return cars;
        }
    }
}