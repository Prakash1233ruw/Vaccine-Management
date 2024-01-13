package com.pp.service;



import java.util.List;
import java.util.Optional;

import com.pp.bo.VacceineDetails;

public interface IVacceineManagement 
{
public String registerVacceineDetails(VacceineDetails vacceine);
public Iterable<VacceineDetails> registerMultipleVacceineDetails(Iterable<VacceineDetails> vacceineList);
public Long getVacceinesCount();
public Boolean checkAvailability(Long id);
public Iterable<VacceineDetails>  getAllVacceinesInformation();
public Iterable<VacceineDetails>  getAllVacceineInfoByIds(Iterable<Long> idList);
public Optional<VacceineDetails> getVacceineById(Long id);
public String removeVacceineByid(Long id);
public String removeVacceineByIds(List<Long> ids);
public String removeVacceineByObject(VacceineDetails vacceineDetails);
}
