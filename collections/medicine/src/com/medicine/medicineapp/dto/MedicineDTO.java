package com.medicine.medicineapp.dto;

import java.io.Serializable;

public class MedicineDTO implements Serializable{
	
	private int medicineId;
	private String medicineName;
	private double price;
	private String mfgDate;
	private String expDate;
	
	public MedicineDTO() {
		super();
	}

	public int getMedicineId() {
		return medicineId;
	}

	public void setMedicineId(int medicineId) {
		this.medicineId = medicineId;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getMfgDate() {
		return mfgDate;
	}

	public void setMfgDate(String mfgDate) {
		this.mfgDate = mfgDate;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	@Override
	public String toString() {
		return "MedicineDTO [medicineId=" + medicineId + ", medicineName=" + medicineName + ", price=" + price
				+ ", mfgDate=" + mfgDate + ", expDate=" + expDate + "]";
	}
	
	

}
