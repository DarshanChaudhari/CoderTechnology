package com.jp.complaints.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import com.jp.complaints.entities.Complaint;
import com.jp.complaints.exceptions.ComplaintRequestException;
import com.jp.complaints.interfaces.DaoComplaint;

@Repository("daoComplaintDS")
public class DaoComplaintImpl implements DaoComplaint {
	
	@PersistenceContext
	private EntityManager entityManager;
	
/*	@Override
	public List<Complaint> getComplaintList() throws ComplaintServiceException {
		String sql = "SELECT c FROM complaintRecord c";
		Query qry = entityManager.createQuery(sql);		
		List<Complaint> complaintList = qry.getResultList();		
		return complaintList;
	}*/

	@Override
	public Complaint getComplaintDetails(int complaintId) throws ComplaintRequestException {
		return entityManager.find(Complaint.class, complaintId);
	}

	@Override
	public boolean insertNewRecord(Complaint complaint) throws ComplaintRequestException {
		entityManager.persist(complaint);
		Complaint newComplaint = entityManager.find(Complaint.class, complaint.getComplaintId());
		System.out.println(newComplaint);
		if(newComplaint != null) {
			return true;
		}else {
			return false;
		}
	}

}
