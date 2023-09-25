package in.kiran.binding;

import java.time.LocalDate;

public class SearchCriteria {

	private String planName;
	
	private String planstatus;
	
	private String gender;
	
	private LocalDate planStartDate;
	
	private LocalDate planEndDate;

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getPlanstatus() {
		return planstatus;
	}

	public void setPlanstatus(String planstatus) {
		this.planstatus = planstatus;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getPlanStartDate() {
		return planStartDate;
	}

	public void setPlanStartDate(LocalDate planStartDate) {
		this.planStartDate = planStartDate;
	}

	public LocalDate getPlanEndDate() {
		return planEndDate;
	}

	public void setPlanEndDate(LocalDate planEndDate) {
		this.planEndDate = planEndDate;
	}

	@Override
	public String toString() {
		return "SearchCriteria [planName=" + planName + ", planstatus=" + planstatus + ", gender=" + gender
				+ ", planStartDate=" + planStartDate + ", planEndDate=" + planEndDate + "]";
	}
	
	
}
