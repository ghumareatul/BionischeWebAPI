package com.bionische.biotech.ewallet.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bionische.biotech.Common.DateConverter;
import com.bionische.biotech.ewallet.model.BankTransferRequest;
import com.bionische.biotech.ewallet.model.GetWalletTransactionDetails;
import com.bionische.biotech.ewallet.model.TransactionWalletDetails;
import com.bionische.biotech.ewallet.model.WalletDetails;
import com.bionische.biotech.ewallet.repository.GetWalletTransactionDetailsRepository;
import com.bionische.biotech.ewallet.repository.UserWalletDetailsRepository;
import com.bionische.biotech.ewallet.repository.UserWalletTransactionRepository;
import com.bionische.biotech.model.LabDetails;
import com.bionische.biotech.model.MedicalDetails;
import com.bionische.biotech.repository.BankTransferRequestRepository;
import com.bionische.biotech.repository.LabDetailsRepository;
import com.bionische.biotech.repository.MedicalDetailsRepository;
import com.bionische.biotech.repository.TransactionWalletDetailsRepository;
import com.bionische.biotech.repository.WalletDetailsRepository;

@RestController
public class UserWalletApiController {

	@Autowired
	private UserWalletTransactionRepository userWalletTransactionRepository;
	
	@Autowired
	private UserWalletDetailsRepository userWalletDetailsRepository;

	@Autowired
	private WalletDetailsRepository walletDetailsRepository;  
	
	@Autowired
	private TransactionWalletDetailsRepository transactionWalletDetailsRepository;
	
	@Autowired
	LabDetailsRepository labDetailsRepository;
	
	@Autowired
	MedicalDetailsRepository medicalDetailsRepository;

	@Autowired
	private GetWalletTransactionDetailsRepository getWalletTransactionDetailsRepository;
	
	@Autowired
	private BankTransferRequestRepository bankTransferRequestRepository;
	/*
	 * @author Ganesh
	 * get user All wallet  details 
	*/
	/*@RequestMapping(value = { "/getUserWalletDetails" }, method = RequestMethod.POST)
	public @ResponseBody UserWalletDetails getUserWalletDetails(@RequestParam("userId") int userId, @RequestParam("userType") int userType)
	{
		UserWalletDetails userWalletDetails=new UserWalletDetails();
		try {
		 
			userWalletDetails=	userWalletDetailsRepository.findByUserIdAndUserType(userId, userType);
			
		}catch (Exception e) {
			System.out.println(e.getMessage());// TODO: handle exception
			e.printStackTrace();
		} 
		
		return userWalletDetails;
	}
	
	
	 * @author Ganesh
	 * get user Latest 10 wallet transaction records 
	
	@RequestMapping(value = { "/getUserLatestTransactionDetails" }, method = RequestMethod.POST)
	public @ResponseBody List<GetWalletTransactionDetails> getUserLatestTransactionDetails(@RequestParam("userId") int userId, @RequestParam("userType") int userType)
	{
		List<GetWalletTransactionDetails> getWalletTransactionDetailsList=new ArrayList<GetWalletTransactionDetails>();
		try {
		 
			getWalletTransactionDetailsList=	getWalletTransactionDetailsRepository.getWalletLatestTransactionDetails(userId, userType);
			System.out.println("getWalletTransactionDetailsList  "+getWalletTransactionDetailsList.toString());
		}catch (Exception e) {
			System.out.println(e.getMessage());// TODO: handle exception
			e.printStackTrace();
		}
		
		return getWalletTransactionDetailsList;
	}
	
	
	 * @author Ganesh
	 * get user All wallet transaction records 
	
	@RequestMapping(value = { "/getUserAllTransactionDetails" }, method = RequestMethod.POST)
	public @ResponseBody List<GetWalletTransactionDetails> getUserAllTransactionDetails(@RequestParam("userId") int userId, @RequestParam("userType") int userType)
	{
		List<GetWalletTransactionDetails> getWalletTransactionDetailsList=new ArrayList<GetWalletTransactionDetails>();
		try {
		 
			getWalletTransactionDetailsList=	getWalletTransactionDetailsRepository.getWalletTransactionDetails(userId, userType);
			
		}catch (Exception e) {
			System.out.println(e.getMessage());// TODO: handle exception
			e.printStackTrace();
		} 
		
		return getWalletTransactionDetailsList;
	}
	 */
	@RequestMapping(value = { "/insertMoneyInWallet" }, method = RequestMethod.POST)
	public @ResponseBody WalletDetails insertMoneyInWallet(@RequestBody WalletDetails walletDetails)
	{
		try {
			
			System.out.println("Wallet ="+walletDetails.toString());
			 WalletDetails userWalletDetails=new WalletDetails();

			userWalletDetails=	walletDetailsRepository.save(walletDetails);
			return userWalletDetails;

		}catch (Exception e) {
			System.out.println(e.getMessage());// TODO: handle exception
			e.printStackTrace();
			
			return new WalletDetails();

		} 
		
	}
	
	@RequestMapping(value = { "/insertWalletTransaction" }, method = RequestMethod.POST)
	public @ResponseBody TransactionWalletDetails insertWalletTransaction(@RequestBody TransactionWalletDetails transactionWalletDetails)
	{
		TransactionWalletDetails userWalletTransaction=new TransactionWalletDetails();
		try {
			
			userWalletTransaction=transactionWalletDetailsRepository.save(transactionWalletDetails);
			
		}catch (Exception e) {
			System.out.println(e.getMessage());// TODO: handle exception
			e.printStackTrace();
		} 
		
		return userWalletTransaction;
	}
	
	@RequestMapping(value = { "/findByUserId" }, method = RequestMethod.POST)
	public @ResponseBody TransactionWalletDetails findByUserId(@RequestParam("userId") int userId)
	{
		TransactionWalletDetails transactionWalletDetails=new TransactionWalletDetails(); 
		try {
		 
		transactionWalletDetails=transactionWalletDetailsRepository.findByToUserIdAndTransactionType(userId, 0);
			
		}catch (Exception e) {
			System.out.println(e.getMessage());// TODO: handle exception
			e.printStackTrace();
		} 
		
		return transactionWalletDetails;
	}
	
	@RequestMapping(value = { "/isLabReferalCorrect"}, method = RequestMethod.POST)
	public @ResponseBody LabDetails isLabReferalCorrect(@RequestParam("referal") String referal) {
	
		LabDetails labDetails=new LabDetails();
		
	try {
	
	
		labDetails=labDetailsRepository.findByString3(referal);
			
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	return labDetails;
	}
	@RequestMapping(value = { "/isMedicalReferalCorrect"}, method = RequestMethod.POST)
	public @ResponseBody MedicalDetails isMedicalReferalCorrect(@RequestParam("referal") String referal) {
	
		MedicalDetails medicalDetails=new MedicalDetails();
		
	try {
	
	
		medicalDetails=medicalDetailsRepository.findByString3(referal);
			
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	return medicalDetails;
	}
	
@RequestMapping(value = { "/getWalletTransactionDetails"}, method = RequestMethod.POST)
	public @ResponseBody List<GetWalletTransactionDetails> getWalletTransactionDetails(@RequestParam("userId") int userId,@RequestParam("userType") int userType) {
	
		List<GetWalletTransactionDetails> getWalletTransactionDetailsList=new ArrayList<GetWalletTransactionDetails>();
		
	try {
	System.out.println(userId+" And "+userType);
	
		getWalletTransactionDetailsList=getWalletTransactionDetailsRepository.getWalletTransactionDetails(userId,userType);
		
	
		
		System.out.println("wallet details ="+getWalletTransactionDetailsList.toString());
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	return getWalletTransactionDetailsList;
	}


@RequestMapping(value = { "/getAllWalletTransactionDetails"}, method = RequestMethod.POST)
public @ResponseBody List<GetWalletTransactionDetails> getAllWalletTransactionDetails(@RequestParam("userId") int userId,@RequestParam("userType") int userType) {

	List<GetWalletTransactionDetails> getWalletTransactionDetailsList=new ArrayList<GetWalletTransactionDetails>();
	
try {
System.out.println(userId+" And "+userType);

	getWalletTransactionDetailsList=getWalletTransactionDetailsRepository.getAllWalletTransactionDetails(userId,userType);
		System.out.println("wallet details ="+getWalletTransactionDetailsList.toString());
}
catch (Exception e) {
	e.printStackTrace();
}
return getWalletTransactionDetailsList;
}




@RequestMapping(value = { "/insertWalletMoneyBankTransferRequest" }, method = RequestMethod.POST)
public @ResponseBody BankTransferRequest insertWalletMoneyBankTransferRequest(@RequestBody BankTransferRequest bankTransferRequest)
{
	BankTransferRequest bankTransferRequestRes=new BankTransferRequest();
	try {
		
		bankTransferRequestRes=bankTransferRequestRepository.save(bankTransferRequest);
		
		if(bankTransferRequestRes!=null) {
			
			
			
			WalletDetails walletDetails=walletDetailsRepository.findByWalletId(bankTransferRequestRes.getWalletId());
			
			int walletId=bankTransferRequestRes.getWalletId();
			float updatedWalletAmount=walletDetails.getWalletAmount()-bankTransferRequestRes.getRequestAmount();
			int result=walletDetailsRepository.updateWalletAmount(walletId,updatedWalletAmount);
			
			TransactionWalletDetails transactionWalletDetails=new TransactionWalletDetails();
			transactionWalletDetails.setAmount(bankTransferRequestRes.getRequestAmount());
			transactionWalletDetails.setFromUserId(walletDetails.getUserId());
			transactionWalletDetails.setToUserId(0);
			transactionWalletDetails.setToUserType(0);
			transactionWalletDetails.setTransactionType(4);
			transactionWalletDetails.setUserType(walletDetails.getUserType());
			transactionWalletDetails.setWalletId(walletDetails.getWalletId());
			transactionWalletDetails=transactionWalletDetailsRepository.save(transactionWalletDetails);
			
		}
		
	}catch (Exception e) {
		System.out.println(e.getMessage());// TODO: handle exception
		e.printStackTrace();
	} 
	
	return bankTransferRequestRes;
}
	
	
}
