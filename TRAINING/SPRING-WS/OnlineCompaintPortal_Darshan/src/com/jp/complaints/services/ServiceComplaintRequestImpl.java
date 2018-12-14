package com.jp.complaints.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jp.complaints.entities.Complaint;
import com.jp.complaints.exceptions.ComplaintRequestException;
import com.jp.complaints.interfaces.DaoComplaint;


@Service("complaintService")
@Transactional
public class ServiceComplaintRequestImpl implements ServiceComplaintRequest {
	
	
	private DaoComplaint daoCompl;
	
		

	public ServiceComplaintRequestImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	public ServiceComplaintRequestImpl(@Qualifier("daoComplaintDS") DaoComplaint daoCompl) {	
		this.daoCompl = daoCompl;
		System.out.println("Constructor of ServiceComplaintRequestImpl : Calling the constructor based on @QualifierName- daoComplaintDS");
	}

	@Override
	public Complaint getComplaintDetails(int complaintId) throws ComplaintRequestException {
		return daoCompl.getComplaintDetails(complaintId);
	}

	@Override
	public boolean raiseNewComplaint(Complaint complaint) throws ComplaintRequestException {
		// TODO Auto-generated method stub
		return daoCompl.insertNewRecord(complaint);
	}

	


}