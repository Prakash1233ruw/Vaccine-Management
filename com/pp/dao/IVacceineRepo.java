package com.pp.dao;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pp.bo.VacceineDetails;
@Repository//not mandatery
public interface IVacceineRepo extends CrudRepository<VacceineDetails, Long> {

}
