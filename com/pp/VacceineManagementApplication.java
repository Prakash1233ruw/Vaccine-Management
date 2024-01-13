package com.pp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.pp.bo.VacceineDetails;
import com.pp.service.VacceineManagementImpl;



@SpringBootApplication
public class VacceineManagementApplication {

	public static void main(String[] args) {
	 ConfigurableApplicationContext context = SpringApplication.run(VacceineManagementApplication.class, args);
	VacceineManagementImpl service = context.getBean(VacceineManagementImpl.class);
	
	
//	VacceineDetails vacceineDetails=new VacceineDetails("Covaxin","BharatBio",45543);
//	String message=service.registerVacceineDetails(vacceineDetails);
//	System.out.println(message);
	
	
//	List<VacceineDetails> vacceineList=new ArrayList<>();
//	vacceineList.add(new VacceineDetails("CovidShield","Astrazenica",45286));
//	vacceineList.add(new VacceineDetails("Phizer","Moderna",46826));
//	vacceineList.add(new VacceineDetails("Sputnik","RussianBAsed",59986));
//	
//	service.registerMultipleVacceineDetails(vacceineList);
//	System.out.println("check Your Database");


//	Long count = service.getVacceinesCount();
//	System.out.println("number of vacceines in DB Table : "+count) ;
//	
//	System.out.println("**********************************************************");
//	
//	Long id=2L;
//	Boolean status = service.checkAvailability(id);
//	if(status)
//		System.out.println("Vacceine available with id :"+id);
//	else 
//	    System.out.println("Vacceine is not available with id :"+id);
//	
//	
	
//     Iterable<VacceineDetails> vacceineInfo = service.getAllVacceinesInformation();
//	List<VacceineDetails> vacceineInfo = (List<VacceineDetails>) service.getAllVacceinesInformation();

//	service.getAllVacceinesInformation().forEach(vacceines->System.out.println(vacceines));
	
//	List<Long> vacceineList =new ArrayList<>();
//	vacceineList.add(1L);
//	vacceineList.add(2L);
//	service.getAllVacceineInfoByIds(vacceineList).forEach(vacceines->System.out.println(vacceines));
//	
	
//	Long id=2L;
//	Optional<VacceineDetails> optional=service.getVacceineById(id);
//	if(optional.isPresent())
//		System.out.println(optional.get());
//	optional.orElseThrow(()->new IllegalArgumentException("record not found"));
//	
	
//	System.out.println(service.getVacceineById(id).orElse(new VacceineDetails()));
//	context.close();
	
	//System.out.println(service.removeVacceineByid(id));
	
//	List<Long> list=new ArrayList<>();
//	
//	list.add(3l);
//	list.add(4l);
//	System.out.println(service.removeVacceineByIds(list));
	VacceineDetails vacceineDetails=new  VacceineDetails();
	vacceineDetails.setId(1l);
	vacceineDetails.setVacceineName("hellin");
	vacceineDetails.setVacceineCompany("indiaBio");
	vacceineDetails.setPrice(45543);
	String m=service.removeVacceineByObject(vacceineDetails);
	System.out.println(m);
	
	
	context.close();
	}

}
