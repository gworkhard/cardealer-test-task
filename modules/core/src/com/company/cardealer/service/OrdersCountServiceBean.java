package com.company.cardealer.service;

import com.company.cardealer.entity.CarModel;
import com.company.cardealer.entity.Contractor;
import com.company.cardealer.entity.Order;
import com.haulmont.cuba.core.*;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service(OrdersCountService.NAME)
public class OrdersCountServiceBean implements OrdersCountService {


    @Inject
    private Persistence persistence;

    @Override
    public Integer getOrdersCountForContractor(Contractor contractor) {

        try (Transaction tx = persistence.createTransaction()) {
            EntityManager em = persistence.getEntityManager();
            TypedQuery<Order> query = em.createQuery(
                    "select co from cardealer_Order co where co.contractor.id = :contractorId", Order.class);
            query.setParameter("contractorId", contractor.getId());
            List<Order> orders = query.getResultList();
            tx.commit();
            return orders.size();
        }
    }
}