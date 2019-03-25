package model;

import java.util.ArrayList;

public class TourGuideRegister {
	private ArrayList<TourGuide> tourGuideReg = new ArrayList<TourGuide>();

	public ArrayList<TourGuide> getTourGuideReg() {
		return tourGuideReg;
	}

	public void setTourGuideReg(ArrayList<TourGuide> tourGuideReg) {
		this.tourGuideReg = tourGuideReg;
	}
	public void addTourGuide(TourGuide s) {
		tourGuideReg.add(s);
	}
	public TourGuide readTourGuide(String employeeID) {
		for (TourGuide tmp : tourGuideReg) {
			if (tmp.getEmployeeID().equals(employeeID)) {
				return tmp;
			}
		}
		return null;
	}
}
