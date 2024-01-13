package com.pp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pp.bo.VacceineDetails;
import com.pp.dao.IVacceineRepo;


@Service
public class VacceineManagementImpl implements IVacceineManagement{

	@Autowired
	private IVacceineRepo repo;
	
	
	@Override
	public String registerVacceineDetails(VacceineDetails vacceine) {
		
		System.out.println("implementing class of repo is an :"+repo.getClass().getName());
		VacceineDetails v = repo.save(vacceine);
	
		return "Vaccceine details registered with id :"+v.getId();
		
	}


	@Override
	public Iterable<VacceineDetails> registerMultipleVacceineDetails(Iterable<VacceineDetails> vacceineList) {
		return repo.saveAll(vacceineList);
		
	}


	@Override
	public Long getVacceinesCount() {
		// TODO Auto-generated method stub
		return repo.count();
	}


	@Override
	public Boolean checkAvailability(Long id) {
		return repo.existsById(id);
	
	}


	@Override
	public Iterable<VacceineDetails> getAllVacceinesInformation() {
		
		return repo.findAll();
	}


	@Override
	public Iterable<VacceineDetails> getAllVacceineInfoByIds(Iterable<Long> idList) {
		
		return repo.findAllById(idList);
	}


	@Override
	public Optional<VacceineDetails> getVacceineById(Long id) {
		
		return repo.findById(id);
	}


	@Override
	public String removeVacceineByid(Long id) {
		Optional<VacceineDetails> optional= repo.findById(id);
		if(optional.isPresent()) {
			repo.deleteById(id);
			return "data deleted at id :"+id;
		}
		return "there no id of "+id+" is found to delete";
	}


	@Override
	public String removeVacceineByIds(List<Long> ids) {
  Iterable<VacceineDetails> list = repo.findAllById(ids);	
  int count=ids.size();
  if(count==((List)list).size()) {
		repo.deleteAllById(ids);
    return "data succesfully deleted";
        }
	
	return "no such ids found to delete";
	}

	@Override
	public String removeVacceineByObject(VacceineDetails vacceineDetails) {
		Optional<VacceineDetails> optional = repo.findById(vacceineDetails.getId());
	   if(optional.isPresent()) {
		   repo.delete(vacceineDetails);;
		return "given vacceine object deleted";
	  }
	   return "there is no such object to delete";
	}
}
