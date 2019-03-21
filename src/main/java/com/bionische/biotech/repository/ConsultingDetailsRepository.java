package com.bionische.biotech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bionische.biotech.model.ConsultingDetails;
    

public interface ConsultingDetailsRepository extends JpaRepository<ConsultingDetails, Integer> {
	
	
	
	@Query(value="select m.meet_id,d.doctor_id,h.contact_no,h.email_id,p.email, m.int_2,h.address, m.patient_id,CONCAT(p.f_name,' ',p.l_name) as patient_name, h.hospital_name,CONCAT(d.f_name,' ',d.l_name) as f_name,m.time,m.date,m.patient_problem,m.note, m.discussion,d.qualification,d.signature from hospital_details h, doctor_details d,"
			+ "doctor_patient_meeting m,patient_details p where m.doctor_id=d.doctor_id and m.doctor_id=:doctorId and m.patient_id=:patientId and h.hospital_id=m.int_1 AND m.patient_id=p.patient_id ORDER BY m.date DESC ",nativeQuery=true)
	List<ConsultingDetails> getConsultingDetailsByDoctor(@Param("doctorId")int doctorId, @Param("patientId")int patientId);
	
	@Query(value="select m.meet_id,d.doctor_id,h.contact_no,h.email_id,p.email, m.int_2, h.address,m.patient_id,CONCAT(p.f_name,' ',p.l_name) as patient_name, h.hospital_name,CONCAT(d.f_name,' ',d.l_name) as f_name,m.time,m.date,m.patient_problem,m.note, m.discussion,d.qualification,d.signature from hospital_details h, doctor_details d,prescription_details i,"
			+ "doctor_patient_meeting m,patient_details p where m.doctor_id=d.doctor_id and m.doctor_id=:doctorId and m.patient_id=:patientId and h.hospital_id=m.int_1 AND m.patient_id=p.patient_id AND m.meet_id=i.meeting_id GROUP BY m.meet_id",nativeQuery=true)
	List<ConsultingDetails> getConsultingDetailsByDoctorHavePresc(@Param("doctorId")int doctorId, @Param("patientId")int patientId);
	
	
	@Query(value="select m.patient_id,CONCAT(p.f_name,' ',p.l_name) AS patient_name,h.contact_no,h.email_id,p.email,h.address, m.int_2,m.discussion,m.patient_problem,m.note,m.date,m.time,m.meet_id,CONCAT(d.f_name,' ',d.l_name) as f_name,h.hospital_name, m.doctor_id,d.qualification,d.signature FROM doctor_patient_meeting m,doctor_details d,hospital_details h,patient_details p "
	 
	+" WHERE date BETWEEN :startdate AND :enddate AND m.patient_id=:patientId AND m.doctor_id=d.doctor_id AND h.hospital_id=m.int_1 AND m.patient_id=p.patient_id ORDER BY m.date DESC",nativeQuery=true)
	
	List<ConsultingDetails> getConsultingDetailsByDate(@Param("startdate")String startdate,@Param("enddate")String enddate, @Param("patientId")int patientId);

	@Query(value="select m.patient_id,CONCAT(p.f_name,' ',p.l_name) AS patient_name,h.contact_no,h.email_id,p.email,h.address, m.int_2,m.discussion,m.patient_problem,m.note,m.date,m.time,m.meet_id,CONCAT(d.f_name,' ',d.l_name) as f_name,h.hospital_name, m.doctor_id,d.qualification,d.signature FROM doctor_patient_meeting m,doctor_details d,hospital_details h,patient_details p "
			 
	+" WHERE  m.patient_id=:patientId AND m.doctor_id=d.doctor_id AND h.hospital_id=m.int_1 AND m.patient_id=p.patient_id ORDER BY m.date DESC LIMIT 10",nativeQuery=true)
	
	List<ConsultingDetails> getLast10ConsultingByPatientId( @Param("patientId")int patientId);

	
	@Query(value="select m.patient_id,h.contact_no,h.email_id,p.email,CONCAT(p.f_name,' ',p.l_name) AS patient_name,h.address,m.discussion, m.int_2, m.patient_problem,m.note,m.date,m.time,m.meet_id,CONCAT(d.f_name,' ',d.l_name) AS f_name,h.hospital_name, m.doctor_id,d.qualification,d.signature FROM doctor_patient_meeting m,doctor_details d,hospital_details h,prescription_details i,patient_details p "
			 
	+" WHERE m.date BETWEEN :startdate AND :enddate AND m.patient_id=:patientId AND m.doctor_id=d.doctor_id AND h.hospital_id=m.int_1 AND m.patient_id=p.patient_id AND m.meet_id=i.meeting_id GROUP BY m.meet_id",nativeQuery=true)
	
	List<ConsultingDetails> getConsultingDetailsByDateHavePresc(@Param("startdate")String startdate,@Param("enddate")String enddate, @Param("patientId")int patientId);


	@Query(value="SELECT m.meet_id,m.doctor_id,m.patient_id,h.contact_no,h.email_id,p.email,h.address,CONCAT(p.f_name,' ',p.l_name) as patient_name,h.hospital_name, m.int_2,  CONCAT(d.f_name, " + 
			"        ' ', " + 
			"        d.l_name) AS f_name,m.time,m.date,m.patient_problem,m.note, m.discussion,d.qualification,d.signature FROM patient_details p,hospital_details h, doctor_details d,doctor_patient_meeting m WHERE  m.doctor_id=:doctorId AND m.date BETWEEN :startdate AND :enddate AND m.patient_id=p.patient_id AND m.patient_id=p.patient_id AND h.hospital_id=m.int_1 GROUP BY m.meet_id ORDER BY m.meet_id DESC",nativeQuery=true)
	
    List<ConsultingDetails> getConsultingDetailsByDateANDdoctorId(@Param("startdate")String startdate,@Param("enddate") String enddate, @Param("doctorId")int doctorId);

	
	@Query(value="SELECT m.meet_id,m.doctor_id,m.patient_id,h.contact_no,h.email_id,p.email,h.address,CONCAT(p.f_name,' ',p.l_name) AS patient_name,h.hospital_name, m.int_2,  CONCAT(d.f_name, " + 
			"        ' ', " + 
			"        d.l_name) AS f_name,  " + 
			"m.time,m.date,m.patient_problem,m.note, m.discussion,d.qualification,d.signature FROM patient_details p,hospital_details h, doctor_details d, " + 
			"doctor_patient_meeting m WHERE  m.doctor_id=:doctorId AND m.doctor_id=d.doctor_id AND m.patient_id=p.patient_id AND m.patient_id=p.patient_id AND h.hospital_id=m.int_1 GROUP BY m.meet_id ORDER BY m.meet_id DESC LIMIT 20",nativeQuery=true)
	
    List<ConsultingDetails> getConsultingDetailsByDoctorId(@Param("doctorId")int doctorId);
	
	
	@Query(value="SELECT m.meet_id, m.doctor_id,h.contact_no,h.email_id,p.email, m.patient_id,CONCAT(p.f_name,' ',p.l_name) AS patient_name, h.hospital_name, CONCAT(d.f_name, " + 
			"        ' ', " + 
			"        d.l_name) AS f_name, m.int_2, m.time,h.address, m.date, m.patient_problem,m.note, m.discussion,d.qualification,d.signature FROM patient_details p,hospital_details h, doctor_details d,doctor_patient_meeting m WHERE  m.patient_id=:patientId AND m.doctor_id=:doctorId AND h.hospital_id=m.int_1 GROUP BY m.meet_id",nativeQuery=true)
	List<ConsultingDetails> getConsultingHistoryDetailsByDoctorAndPatientId(@Param("patientId")int patientId,@Param("doctorId")int doctorId);
	
	
	@Query(value="SELECT m.meet_id,d.doctor_id,h.contact_no,h.email_id,p.email,m.patient_id,h.address,CONCAT(p.f_name,' ',p.l_name) AS patient_name,h.hospital_name,CONCAT(d.f_name,' ',d.l_name) AS f_name,m.time, m.int_2,m.date,m.patient_problem,m.note, m.discussion,d.qualification,d.signature FROM hospital_details h,patient_details p,doctor_details d, " + 
			"doctor_patient_meeting m WHERE m.int_1=0 AND m.date<:date AND m.doctor_id=d.doctor_id AND h.hospital_id=d.hospital_id AND m.patient_id=p.patient_id AND m.patient_id IN (SELECT p.patient_id FROM patient_details p WHERE p.family_id=:familyId)",nativeQuery=true)
	List<ConsultingDetails> getConsultingDetailsByRatingStatus(@Param("familyId")int familyId,@Param("date")String date);

	@Query(value="SELECT m.meet_id, m.doctor_id,h.contact_no,h.email_id,p.email, m.patient_id,h.address, CONCAT(p.f_name,' ',p.l_name) AS patient_name, h.hospital_name,CONCAT(d.f_name,' ',d.l_name) AS f_name, m.time, m.date, m.patient_problem,m.note, m.discussion, m.int_2,d.qualification,d.signature FROM patient_details p,hospital_details h, doctor_details d,doctor_patient_meeting m WHERE  m.meet_id=:meetId AND h.hospital_id=m.int_1 AND m.doctor_id=d.doctor_id AND m.patient_id=p.patient_id ",nativeQuery=true)
	ConsultingDetails getPatientDoctorConsultedDetails(@Param("meetId")int meetId);
}
  