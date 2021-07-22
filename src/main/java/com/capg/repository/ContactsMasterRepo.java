package com.capg.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.capg.entities.ContactsMasterEntity;

@Repository
public interface ContactsMasterRepo extends CrudRepository<ContactsMasterEntity, Serializable> {

}
