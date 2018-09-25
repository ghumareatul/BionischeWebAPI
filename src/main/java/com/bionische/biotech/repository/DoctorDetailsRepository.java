package com.bionische.biotech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.bionische.biotech.model.DoctorDetails;
import com.bionische.biotech.model.DoctorDetailsInformation;
import com.bionische.biotech.model.PatientDetails;

 

public interface DoctorDetailsRepository extends JpaRepository<DoctorDetails, Long>{

	DoctorDetails save(DoctorDetails doctorDetails);
	
	DoctorDetails findByDoctorId(int doctorId);

	@Query(value=" SELECT * from doctor_details where uname=:userName AND del_status=0",nativeQuery=true)
	DoctorDetails getLoginUserName(  @Param("userName") String userName);
	
	@Query(value=" SELECT * from doctor_details where spec_id=:specId AND city_id=:cityId AND del_status=0",nativeQuery=true)
	List<DoctorDetails> getBySpecIdAndCityIdAndDelStatus(@Param("specId")int specId, @Param("cityId")int cityId);
	
	@Query(value="SELECT * FROM doctor_details WHERE doctor_id IN (SELECT doctor_id FROM doctor_patient_meeting WHERE patient_id=:patientId)",nativeQuery=true)
	List<DoctorDetails> getDoctorDetailsByPatientId(@Param("patientId")int patientId);
	
	@Query(value="SELECT * FROM doctor_details WHERE doctor_id IN (SELECT doctor_id FROM doctor_appointment WHERE patient_id=:patientId)",nativeQuery=true)
	List<DoctorDetails> getDoctorsByPatientAppointment(@Param("patientId")int patientId);
	
	@Query(value=" SELECT * from doctor_details where doctor_id=:doctorId AND password=:password AND del_status=0",nativeQuery=true)
	DoctorDetails passwordDocValidation(@Param("doctorId")int patientId,@Param("password")String password);
	
	@Transactional
	@Modifying
	@Query("UPDATE DoctorDetails a SET a.password =:newPassword  WHERE a.doctorId=:doctorId")
	int updateNewPassword(@Param("doctorId")int doctorId,@Param("newPassword")String newPassword);
	
	@Transactional
	@Modifying
	@Query("UPDATE DoctorDetails a SET a.hospitalId =:hospitalId  WHERE a.doctorId=:doctorId")
	int updateHospitalId(@Param("doctorId")int doctorId,@Param("hospitalId")int hospitalId);
	
	@Transactional
	@Modifying
	@Query("UPDATE DoctorDetails a SET a.profilePhoto =:profilePhotoName  WHERE a.doctorId=:doctorId")
	int updateDoctorPic(@Param("doctorId")int doctorId,@Param("profilePhotoName")String profilePhotoName);
	
	@Transactional
	@Modifying
	@Query("UPDATE DoctorDetails a SET a.password =:newPassword  WHERE a.userName=:userName")
	int updateNewPasswordByuserName(@Param("userName")String userName,@Param("newPassword")String newPassword);
	
	
	
	
}
