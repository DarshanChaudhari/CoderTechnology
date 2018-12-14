package com.jp.complaints.services;

import com.jp.complaints.entities.Complaint;
import com.jp.complaints.exceptions.ComplaintRequestException;

public interface ServiceComplaintRequest {
	
	public Complaint getComplaintDetails(int complaintId) throws ComplaintRequestException;
		
	boolean raiseNewComplaint(Complaint complaint) throws ComplaintRequestException;

}
