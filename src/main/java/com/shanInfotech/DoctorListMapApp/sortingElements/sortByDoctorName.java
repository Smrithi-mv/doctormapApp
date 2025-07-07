package com.shanInfotech.DoctorListMapApp.sortingElements;

import java.util.Comparator;

//import com.shanInfotech.DoctorListMapApp.enums.Specialisation;
import com.shanInfotech.DoctorListMappApp.entity.Doctors;

public class sortByDoctorName implements Comparator<Doctors>{

	@Override
	public int compare(Doctors o1, Doctors o2) {
		// TODO Auto-generated method stub
		return o1.getDoctorName().compareTo(o2.getDoctorName());
	}


}
