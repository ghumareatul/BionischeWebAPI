package com.bionische.biotech.controller;

import java.math.BigInteger;
import java.security.MessageDigest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bionische.biotech.model.HospitalDetails;
import com.bionische.biotech.model.Info;
import com.bionische.biotech.model.LabDetails;
import com.bionische.biotech.model.MedicalDetails;
import com.bionische.biotech.model.MedicalLogin;
import com.bionische.biotech.model.PatientDetails;
import com.bionische.biotech.model.PatientLogin;
import com.bionische.biotech.repository.DoctorDetailsRepository;
import com.bionische.biotech.repository.MedicalDetailsRepository;
import com.bionische.biotech.service.SendEMailService;
@RestController
public class MedicalApiController {
	@Autowired
	MedicalDetailsRepository medicalDetailsRepository;
	
	@Autowired
	SendEMailService sendEMailService;
	
	@RequestMapping(value = { "/insertMedicalDetails" }, method = RequestMethod.POST)
	public @ResponseBody MedicalDetails insertMedicalDetails(@RequestBody MedicalDetails medicalDetails)
	{
		System.out.println("Comming Listmeeeeedddiiiicccaaalll "+medicalDetails.toString());
		MedicalDetails medicalDetailsRes=new MedicalDetails();
		 
		try {
			if(medicalDetails.getMedicalId()==0) {
			MessageDigest messageDigest = MessageDigest.getInstance("MD5");  
			messageDigest.update(medicalDetails.getPassword().getBytes(),0, medicalDetails.getPassword().length());  
			String hashedPass = new BigInteger(1,messageDigest.digest()).toString(16);  
			if (hashedPass.length() < 32) {
			   hashedPass = "0" + hashedPass; 
			}
			medicalDetails.setPassword(hashedPass);
			}
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		
		try {
			medicalDetailsRes=medicalDetailsRepository.save(medicalDetails); 
			medicalDetailsRes.setPassword("");
		System.out.println(medicalDetailsRes.toString());
		 
		}
		
		catch (Exception e) {
			System.out.println(e.getMessage());
			 
		}
	return medicalDetailsRes;
	}
	
	@RequestMapping(value = { "/medicalDetailsById" }, method = RequestMethod.POST)
	public @ResponseBody MedicalDetails medicalDetailsById(@RequestParam("medicalId") int medicalId)
	{
		System.out.println("Comming List "+medicalId);
		MedicalDetails MedicalDetailsRes=new MedicalDetails();
		 
		try {
			MedicalDetailsRes=medicalDetailsRepository.findByMedicalId(medicalId); 
		System.out.println(MedicalDetailsRes.toString());
		 
		}
		
		catch (Exception e) {
			System.out.println(e.getMessage());
			 
		}
	return MedicalDetailsRes;
	}
	
	
	
	@RequestMapping(value = { "/medicalLoginProcess" }, method = RequestMethod.POST)
	public @ResponseBody MedicalLogin medicalLoginProcess(@RequestParam("userName") String userName,@RequestParam("password") String password) {
		
		
		MedicalDetails medicalDetails=new MedicalDetails();
		
		MedicalLogin medicalLogin=new MedicalLogin();
		Info info=new Info();
		 
		try {
			MessageDigest messageDigest = MessageDigest.getInstance("MD5");  
			messageDigest.update(password.getBytes(),0, password.length());  
			String hashedPass = new BigInteger(1,messageDigest.digest()).toString(16);  
			if (hashedPass.length() < 32) {
			   hashedPass = "0" + hashedPass; 
			}
			 
			medicalDetails=medicalDetailsRepository.findByUserNameAndPassword(userName,hashedPass);
			
		
		
		
		
		if(medicalDetails!=null)
		{
			 
			//patientDetails=patientDetailsRepository.findByUserNameAndPassword(userName, password);
			System.out.println("List "+medicalDetails.toString());
			if(medicalDetails.getPassword().equals(hashedPass))
			{
				medicalDetails.setPassword("");
				medicalLogin.setMedicalDetails(medicalDetails);
				info.setError(false);
				
				info.setMessage("Login Successfull");
				medicalLogin.setInfo(info);
			}
			else{
				info.setError(true);
				info.setMessage("Please enter valid credential");
				medicalLogin.setInfo(info);
			}
		}
		else {
			info.setError(true);
			info.setMessage("Patient Not Register");
			medicalLogin.setInfo(info);
		}
 
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
		
		System.out.println("res "+medicalLogin.toString());
		return medicalLogin;
	}

	@RequestMapping(value = { "/passwordMedicalValidation" }, method = RequestMethod.POST)
	public @ResponseBody Info passwordMedicalValidation(@RequestParam("medicalId") int medicalId,@RequestParam("password") String password)
	
	{
		Info info=new Info();
		MedicalDetails medicalDetailssRes=new MedicalDetails();
	 try {
		 medicalDetailssRes=	medicalDetailsRepository.passwordMedValidation(medicalId,password);
		
		 if(medicalDetailssRes!=null)
			{
				
				info.setError(false);
				info.setMessage("Success");
			}
			else {
				info.setError(true);
				info.setMessage("failed");
			}	 
		 
	 }
	 catch (Exception e) {
		 System.out.println(e.getMessage());
	}
	 return info;
	 
	}
	
	
	//change medical password
	@RequestMapping(value = { "/changeMedicalPassword" }, method = RequestMethod.POST)
	public @ResponseBody Info changeMedicalPassword(@RequestParam("medicalId") int medicalId,@RequestParam("newPassword") String newPassword)
	
	{
		int res;
		
		Info info=new Info();
		try {
			MessageDigest messageDigest = MessageDigest.getInstance("MD5");  
			messageDigest.update(newPassword.getBytes(),0, newPassword.length());  
			String hashedPass = new BigInteger(1,messageDigest.digest()).toString(16);  
			if (hashedPass.length() < 32) {
			   hashedPass = "0" + hashedPass; 
			}
			res = medicalDetailsRepository.updateNewPassword(medicalId,hashedPass);
			 
		
			
			if(res>0)
			{
				info.setMessage("success");
				info.setError(false);
			}
			else {
				info.setMessage("failed");
				info.setError(true);
			}
			 
		}
		catch (Exception e) {
		e.printStackTrace();
		}
        return info;
	 
	}
	
	//change lab password
		@RequestMapping(value = { "/updatePharmacyProfilePic" }, method = RequestMethod.POST)
		public @ResponseBody Info updatePharmacyProfilePic(@RequestParam("medicalId") int medicalId,@RequestParam("profilePhoto") String profilePhoto)
		
		{
			int res;
			
			Info info=new Info();
			try {
				res = medicalDetailsRepository.updateProfilePic(medicalId,profilePhoto);
				if(res>0)
				{
					info.setMessage("success");
					info.setError(false);
				}
				else {
					info.setMessage("failed");
					info.setError(true);
				}
				 
			}
			catch (Exception e) {
			e.printStackTrace();
			}
	        return info;
		 
		}
		
		//send verification code to pharmacy mail
				@RequestMapping(value = { "/mailVerificationCodeToPharmacy" }, method = RequestMethod.POST)
				public @ResponseBody Info mailVerificationCodeToPharmacy(@RequestParam("email") String mail,@RequestParam("verificationCode") String verificationCode)
				
				{
					String res;
					String body="your verification code is "+verificationCode;
					String subject="verification code";
					
					Info info=new Info();
					try {
						res = sendEMailService.sendMail(subject, body, mail);
						if(res.equals("Mail Sent Success!"))
						{
							info.setMessage("success");
							info.setError(false);
						}
						else {
							info.setMessage("failed");
							info.setError(true);
						}
						 
					}
					catch (Exception e) {
					e.printStackTrace();
					}
			        return info;
				 
				}
}
