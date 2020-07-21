package com.company.cardealer.service;

import com.company.cardealer.entity.CarMaker;
import com.company.cardealer.entity.CarModel;
import com.haulmont.cuba.core.EntityManager;
import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.Transaction;
import com.haulmont.cuba.core.TypedQuery;
import com.haulmont.cuba.core.app.PersistenceConfig;
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.core.global.View;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service(CarMakerModelsService.NAME)
public class CarMakerModelsServiceBean implements CarMakerModelsService {

    @Inject
    private Persistence persistence;

    @Inject
    private Metadata metadata;

    @Override
    public Integer getCarMakerModelsQuantity(CarMaker carMaker) {
        Transaction tx = persistence.createTransaction();
        try {
            EntityManager em = persistence.getEntityManager();
            TypedQuery<CarModel> query = em.createQuery(
                    "select c from cardealer_CarModel c where c.carMaker.id = :carMakerId", CarModel.class);
            query.setParameter("carMakerId", carMaker.getId());
            List<CarModel> resultList = query.getResultList();
            tx.commit();
            return resultList.size();
        } finally {
            tx.end();
        }
    }
}