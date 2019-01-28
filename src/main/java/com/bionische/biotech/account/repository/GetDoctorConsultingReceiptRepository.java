package com.bionische.biotech.account.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bionische.biotech.account.model.GetDoctorConsultingReceipt;

public interface GetDoctorConsultingReceiptRepository extends JpaRepository<GetDoctorConsultingReceipt, Integer>{

	
	@Query(value="SELECT r.receipt_no, r.doctor_id, r.created_date, r.tot_amount, r.txn_id, r.date, r.from_date, r.to_date, r.paid_amt,"
			+ " r.commission_amt, c.gst_no as company_gst_no, db.gst_no, c.contact_no1, c.contact_no2 ,c.email, c.website, c.address, c.company_name"
			+ ", CONCAT(d.f_name,' ',d.l_name )as doctor_name from doctor_details d, m_bionische_company_info c, t_doctor_consulting_receipt r, doctor_bank_info db WHERE "
			+ " r.from_date BETWEEN :fromDate AND :toDate AND r.doctor_id=:doctorId AND r.doctor_id=d.doctor_id AND r.doctor_id=db.doctor_id",nativeQuery=true)
	List<GetDoctorConsultingReceipt> getDoctorConsultingReceipt(@Param("fromDate")String fromDate, @Param("toDate")String toDate, @Param("doctorId")int doctorId);
	
	@Query(value="SELECT r.receipt_no, r.doctor_id, r.created_date, r.tot_amount, r.txn_id, r.date, r.from_date, r.to_date, r.paid_amt,"
			+ " r.commission_amt, c.gst_no as company_gst_no, db.gst_no, c.contact_no1, c.contact_no2 ,c.email, c.website, c.address, c.company_name"
			+ ", CONCAT(d.f_name,' ',d.l_name )as doctor_name from doctor_details d, m_bionische_company_info c, t_doctor_consulting_receipt r, doctor_bank_info db WHERE "
			+ " r.receipt_no=:receiptNo AND r.doctor_id=d.doctor_id AND r.doctor_id=db.doctor_id",nativeQuery=true)
	 GetDoctorConsultingReceipt  getDoctorConsultingReceiptByReceiptNo( @Param("receiptNo")int receiptNo);
}
  