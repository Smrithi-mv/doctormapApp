package com.shanInfotech.DoctorListMapApp.interfaces;

import com.shanInfotech.DoctorListMapApp.exception.MissingFieldException;
import com.shanInfotech.DoctorListMapApp.exception.SpecialisationCheckException;

public interface IDoctorService {
	public void addDoctor() throws SpecialisationCheckException, MissingFieldException;
    public void getDoctors();
    public void sortByDoctorName();
    public void sortBySpecialisation();
    public void sortByHospital();

}
