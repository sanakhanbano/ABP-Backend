package  com.mazars.in.model.mastermodel;

import java.util.Date;

public class HrAdmin {

	private int instanceId;
	private int companyId;
	private int organizationId;
	private int orgGroupId;
	private int locationId;
	private int hRAdminUserId;
	private int hRAdminID;
	private Date createdDate;
	private String updatedBy;
	private Date updatedDate;
	private boolean isActive;
	public int getInstanceId() {
		return instanceId;
	}
	public void setInstanceId(int instanceId) {
		this.instanceId = instanceId;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public int getOrganizationId() {
		return organizationId;
	}
	public void setOrganizationId(int organizationId) {
		this.organizationId = organizationId;
	}
	public int getOrgGroupId() {
		return orgGroupId;
	}
	public void setOrgGroupId(int orgGroupId) {
		this.orgGroupId = orgGroupId;
	}
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	public int gethRAdminUserId() {
		return hRAdminUserId;
	}
	public void sethRAdminUserId(int hRAdminUserId) {
		this.hRAdminUserId = hRAdminUserId;
	}
	public int gethRAdminID() {
		return hRAdminID;
	}
	public void sethRAdminID(int hRAdminID) {
		this.hRAdminID = hRAdminID;
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
