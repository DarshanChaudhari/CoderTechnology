package com.jp.complaints.interfaces;
import com.jp.complaints.entities.Complaint;
import com.jp.complaints.exceptions.ComplaintRequestException;
public interface DaoComplaint {
	
	public Complaint getComplaintDetails(int complaintId) throws ComplaintRequestException;
	
	public boolean insertNewRecord(Complaint complaint) throws ComplaintRequestException;

}
