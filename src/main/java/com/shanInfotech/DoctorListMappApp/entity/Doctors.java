package com.shanInfotech.DoctorListMappApp.entity;

import java.util.Objects;

public class Doctors implements Comparable<Doctors> {
	private String doctorName;
    private String Hospital;
    private double fee;

    public Doctors() {
    	
    }

	public Doctors(String doctorName, String hospital, double fee) {
		this.doctorName = doctorName;
		Hospital = hospital;
		this.fee = fee;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getHospital() {
		return Hospital;
	}

	public void setHospital(String hospital) {
		Hospital = hospital;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Hospital, doctorName, fee);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doctors other = (Doctors) obj;
		return Objects.equals(Hospital, other.Hospital) && Objects.equals(doctorName, other.doctorName)
				&& Double.doubleToLongBits(fee) == Double.doubleToLongBits(other.fee);
	}

	@Override
	public String toString() {
		return "Doctors [doctorName=" + doctorName + ", Hospital=" + Hospital + ", fee=" + fee + "]";
	}

	@Override
	public int compareTo(Doctors o) {
		// TODO Auto-generated method stub
		return Double.compare(this.fee, o.getFee());
	}

	
	

}
