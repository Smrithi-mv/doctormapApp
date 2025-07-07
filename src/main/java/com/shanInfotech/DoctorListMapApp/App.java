package com.shanInfotech.DoctorListMapApp;

import com.shanInfotech.DoctorListMapApp.Dao.DoctorDao;
import com.shanInfotech.DoctorListMapApp.exception.MissingFieldException;
import com.shanInfotech.DoctorListMapApp.exception.SpecialisationCheckException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws SpecialisationCheckException, MissingFieldException {
       // System.out.println("Hello World!");
    	DoctorDao dd=new DoctorDao();
    	dd.addDoctor();
    	dd.getDoctors();
    	//dd.sortByDoctorName();
    	//dd.sortByHospital();
    	//dd.sortBySpecialisation();
    	
    	
    }
}
