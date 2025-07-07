package com.shanInfotech.DoctorListMapApp.sortingElements;

import java.util.Comparator;

//import com.shanInfotech.DoctorListMapApp.enums.Specialisation;
import com.shanInfotech.DoctorListMappApp.entity.Doctors;



public class sortByHospital implements Comparator<Doctors> {

	@Override
	public int compare(Doctors o1, Doctors o2) {
		// TODO Auto-generated method stub
		return o1.getHospital().compareTo(o2.getHospital());
	}




}
