package com.shanInfotech.DoctorListMapApp.Dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import javax.print.Doc;

import com.shanInfotech.DoctorListMapApp.enums.Specialisation;
import com.shanInfotech.DoctorListMapApp.exception.MissingFieldException;
import com.shanInfotech.DoctorListMapApp.exception.SpecialisationCheckException;
import com.shanInfotech.DoctorListMapApp.interfaces.IDoctorService;
//import com.shanInfotech.DoctorListMapApp.sortingElements.sortBySpecilisation;
import com.shanInfotech.DoctorListMappApp.entity.Doctors;





public class DoctorDao implements IDoctorService {
	private Map<Specialisation, List<Doctors>> mapdoc=null;
	private List<Doctors> listEng=null;
	private Map<Specialisation, List<Doctors>> treeMap=null;
	Scanner sc=new Scanner(System.in);
	private Map<Specialisation, List<Doctors>> treedoc;

	@Override
	public void addDoctor() throws SpecialisationCheckException,MissingFieldException {
		mapdoc=new HashMap<>();
		System.out.println("enter the number of doctors to be added");
		int count=sc.nextInt();
		sc.nextLine();
		
		for(int i=1;i<=count;i++) {
			System.out.println("\n doctors:");
			System.out.println("Enter the name");
			String name=sc.nextLine().trim();
			if(name.isEmpty()) {
				throw new MissingFieldException("Give the doctor name");
			}
			
			System.out.println("enter fee");
			double fee=sc.nextDouble();
			sc.nextLine();
			
			System.out.println("enter  hospital name:");
			String Hospital = sc.nextLine().trim();
			if(Hospital.isEmpty()) {
				throw new MissingFieldException("hospital name  is necessary");
			}
			System.out.println("enter specialisation(ENT,CARDIO,EYE,NEURO,ORTHO):");
			String specStr =sc.nextLine().trim();
			if(specStr.isEmpty()) {
				throw new MissingFieldException("specialisationCheck is necessary");
			}
			Specialisation specialisation;
			try {
				specialisation=Specialisation.valueOf(specStr.toUpperCase());
			} catch (IllegalArgumentException e) {
			    throw new SpecialisationCheckException("Invalid specialisation: " + specStr);
			}

			Doctors doc=new Doctors(name,  Hospital, fee);

			if (mapdoc.containsKey(specialisation)) {
			    mapdoc.get(specialisation).add(doc);
			} else {
				listEng = new ArrayList<>();
				listEng.add(doc);
			    mapdoc.put(specialisation, listEng);
			}
		
		}
		System.out.println("\n doctors data added");
	}

	@Override
	public void getDoctors() {
		treedoc=new TreeMap<Specialisation, List<Doctors>>();
		treedoc.putAll(mapdoc);
		System.out.println("\n grouped by branch");
		Iterator<Map.Entry<Specialisation, List<Doctors>>> specIterator=treedoc.entrySet().iterator();
		while(specIterator.hasNext()) {
			Map.Entry<Specialisation, List<Doctors>> entry=specIterator.next();
			Specialisation speStr=entry.getKey();
			List<Doctors> doctorList=entry.getValue();
			System.out.println("specialisation:"+speStr+"doctor data:"+doctorList);
		}
		System.out.println();
		
		
	}

	@Override
	public void sortByDoctorName() {
		treedoc=new TreeMap<Specialisation,List<Doctors>>();
		treedoc.putAll(mapdoc);
		System.out.println("/n sort by doctors name:");
		Iterator<Map.Entry<Specialisation,List<Doctors>>> spIterator=treedoc.entrySet().iterator();
		while(spIterator.hasNext()) {
			Map.Entry<Specialisation, List<Doctors>> entry=spIterator.next();
			Specialisation speStr=entry.getKey();
			List<Doctors>docList=entry.getValue();
			System.out.println("specilisation" +speStr);
			
			Iterator<Doctors>itr=docList.iterator();
			while(itr.hasNext()) {
				Doctors doc=itr.next();
				System.out.println(doc);
			
		}
			System.out.println();
		}
		
		
	}

	@Override
	public void sortBySpecialisation() {
		treedoc= new TreeMap<Specialisation, List<Doctors>>();
		treedoc.putAll(mapdoc);
		System.out.println("/n sort by doctors specialisation:");
		Iterator<Map.Entry<Specialisation,List<Doctors>>> spIterator=treedoc.entrySet().iterator();
		while(spIterator.hasNext()) {
			Map.Entry<Specialisation, List<Doctors>> entry=spIterator.next();
			Specialisation speStr=entry.getKey();
			List<Doctors>docList=entry.getValue();
			
			System.out.println("specilisation" +speStr);
			Iterator<Doctors>itr=docList.iterator();
			while(itr.hasNext()) {
				Doctors doc=itr.next();
				System.out.println(doc);
			}
			System.out.println();
		}
		}
		
	@Override
	public void sortByHospital() {
		treedoc=new TreeMap<Specialisation,List<Doctors>>();
		treedoc.putAll(mapdoc);
		System.out.println("/n sort by hospital:");
		Iterator<Map.Entry<Specialisation,List<Doctors>>> spIterator=treedoc.entrySet().iterator();
		while(spIterator.hasNext()) {
			Map.Entry<Specialisation, List<Doctors>> entry=spIterator.next();
			Specialisation speStr=entry.getKey();
			List<Doctors>docList=entry.getValue();
			System.out.println("specilisation" +speStr);
			Iterator<Doctors>itr=docList.iterator();
			while(itr.hasNext()) {
				Doctors doc=itr.next();
				System.out.println(doc);
			}
			System.out.println();
				
		}

	}
	}
