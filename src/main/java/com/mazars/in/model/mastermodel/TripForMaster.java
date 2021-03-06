package com.mazars.in.model.mastermodel;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_trip_for_master")
public class TripForMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="trip_for_master_id")
	private int tripForMasterId;
	@Column(name="company_id")
	private int companyId;
	@Column(name="trip_for_master_description")
	private String tripForMasterDescription;
	
	@Column(name="created_date")
	private Date createdDate;
	@Column(name="updated_by")
	private String updatedBy;
	@Column(name="updated_date")
	private Date updatedDate;
	@Column(name="is_active")
	private boolean isActive;
	public int getTripForMasterId() {
		return tripForMasterId;
	}
	public void setTripForMasterId(int tripForMasterId) {
		this.tripForMasterId = tripForMasterId;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getTripForMasterDescription() {
		return tripForMasterDescription;
	}
	public void setTripForMasterDescription(String tripForMasterDescription) {
		this.tripForMasterDescription = tripForMasterDescription;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
}
