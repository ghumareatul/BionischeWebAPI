package com.bionische.biotech.radiology.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bionische.biotech.model.Info;
import com.bionische.biotech.model.lab.RadiologistPndtDetails;
import com.bionische.biotech.radiology.model.ChildsModel;
import com.bionische.biotech.radiology.model.NewPndtPatientDetails;
import com.bionische.biotech.radiology.model.PNDTPatientDetails;
import com.bionische.biotech.radiology.model.PndtIndications;
import com.bionische.biotech.radiology.model.PndtPatientBasicDetails;
import com.bionische.biotech.radiology.model.PndtPatientHeader;
import com.bionische.biotech.radiology.model.PndtPatients;
import com.bionische.biotech.radiology.model.TestDetails;
import com.bionische.biotech.radiology.repository.NewPndtPatientDetailsRepository;
import com.bionische.biotech.radiology.repository.PndtIndicationsRepository;
import com.bionische.biotech.radiology.repository.PndtPatientBasicDetailsRepository;
import com.bionische.biotech.radiology.repository.PndtPatientChildRepository;
import com.bionische.biotech.radiology.repository.PndtPatientHeaderRepository;
import com.bionische.biotech.radiology.repository.PndtPatientIndicationRepository;
import com.bionische.biotech.radiology.repository.PndtPatientRepository;
import com.bionische.biotech.radiology.repository.PndtPatientsRepository;
import com.bionische.biotech.radiology.repository.RadiologistPndtDetailsRepository;
import com.bionische.biotech.radiology.repository.RadiologyTestDetailsRepository;
import com.bionische.biotech.radiology.service.PndtPatientDetailsService;
import com.bionische.biotech.repository.PatientDetailsRepository;

@RestController
public class PNDTPatientController {
	@Autowired
	PndtPatientChildRepository pndtPatientChildRepository;

	@Autowired
	PndtPatientRepository pndtPatientRepository;

	@Autowired
	PndtPatientIndicationRepository pndtPatientIndicationRepository;

	@Autowired
	PndtPatientDetailsService pndtPatientDetailsService;

	@Autowired
	RadiologyTestDetailsRepository radiologyTestDetailsRepository;

	@Autowired
	PatientDetailsRepository patientDetailsRepository;

	@Autowired
	PndtPatientBasicDetailsRepository pndtPatientBasicDetailsRepository;

	@Autowired
	PndtPatientHeaderRepository pndtPatientHeaderRepository;

	@Autowired
	PndtIndicationsRepository pndtIndicationsRepository;

	@Autowired
	NewPndtPatientDetailsRepository newPndtPatientDetailsRepository;

	@Autowired
	PndtPatientsRepository pndtPatientsRepository;

	@Autowired
	RadiologistPndtDetailsRepository radiologistPndtDetailsRepository;

	/**
	 * 
	 * @param childsModel
	 * @return
	 */
	@RequestMapping(value = { "/savePndtPatientHeader" }, method = RequestMethod.POST)
	public @ResponseBody PndtPatientHeader savePndtPatientHeader(@RequestBody PndtPatientHeader pndtPatientHeader) {

		return pndtPatientHeaderRepository.save(pndtPatientHeader);

	}

	@RequestMapping(value = { "/saveNewPndtUserDetails" }, method = RequestMethod.POST)
	public @ResponseBody NewPndtPatientDetails saveNewPndtUserDetails(
			@RequestBody NewPndtPatientDetails newPndtPatientDetails) {

		return newPndtPatientDetailsRepository.save(newPndtPatientDetails);

	}
	
	@RequestMapping(value = { "/getNewPndtUserDetails" }, method = RequestMethod.POST)
	public @ResponseBody NewPndtPatientDetails saveNewPndtUserDetails(
			@RequestParam("pndtPatientId") int pndtPatientId) {

		return newPndtPatientDetailsRepository.findByPndtPatientId(pndtPatientId);

	}
	
	

	/**
	 * 
	 * @param childsModel
	 * @return
	 */
	@RequestMapping(value = { "/savePndtPatientDetails" }, method = RequestMethod.POST)
	public @ResponseBody Info savePndtPatientDetails(@RequestBody PNDTPatientDetails pndtPatientDetails) {

		return pndtPatientDetailsService.insertPndtPatientDetails(pndtPatientDetails);

	}

	@RequestMapping(value = { "/getPndtPatientDetails" }, method = RequestMethod.POST)
	public @ResponseBody PNDTPatientDetails getPndtPatientDetails(@RequestParam("patientName") String patientName) {

		PNDTPatientDetails pndtPatientDetails = pndtPatientRepository
				.findByPndtPatientDetailsByPatientName(patientName);

		// System.out.println("pndtPatientDetails= "+pndtPatientDetails.toString());
		// List<IndicationsModel>
		// indicationList=pndtPatientIndicationRepository.findByPndtId(pndtPatientDetails.getPndtId());

		// List<ChildsModel>
		// childList=pndtPatientChildRepository.findByPndtId(pndtPatientDetails.getPndtId());

		// pndtPatientDetails.setIndicationsModelList(indicationList);

		// pndtPatientDetails.setChildsModelList(childList);

		return pndtPatientDetails;

	}

	@RequestMapping(value = { "/getPndtPatientDetailsByLabId" }, method = RequestMethod.POST)
	public @ResponseBody List<PNDTPatientDetails> getPndtPatientDetailsByLabId(@RequestParam("labId") int labId) {

		List<PNDTPatientDetails> pndtPatientDetails = pndtPatientRepository.findPndtPatientDetailsByLabId(labId);

		return pndtPatientDetails;

	}

	@RequestMapping(value = { "/getPndtPatientDetailsByPndtId" }, method = RequestMethod.POST)
	public @ResponseBody PNDTPatientDetails getPndtPatientDetailsByPndtId(@RequestParam("pndtId") int pndtId) {

		PNDTPatientDetails pndtPatientDetails = pndtPatientRepository.findByPndtId(pndtId);

		return pndtPatientDetails;

	}

	@RequestMapping(value = { "/getAllPndtPatientsByLabId" }, method = RequestMethod.POST)
	public @ResponseBody List<PndtPatients> getAllPndtPatientsByLabId(@RequestParam("labId") int labId) {

		List<PndtPatients> pndtPatients = pndtPatientsRepository.findByLabId(labId);

		return pndtPatients;

	}

	@RequestMapping(value = { "/getPndtPatientHeader" }, method = RequestMethod.POST)
	public @ResponseBody PndtPatientHeader getPndtPatientHeader(@RequestParam("patientId") int patientId) {

		return pndtPatientHeaderRepository.getPatientDetailsById(patientId);

	}

	/**
	 * 
	 * @param childsModel
	 * @return
	 */
	@RequestMapping(value = { "/saveTestDetails" }, method = RequestMethod.POST)
	public @ResponseBody TestDetails saveTestDetails(@RequestBody TestDetails testDetails) {

		TestDetails testDetailsResult = new TestDetails();
		try {
			testDetailsResult = radiologyTestDetailsRepository.save(testDetails);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return testDetailsResult;

	}

	@RequestMapping(value = { "/getAllTestsByDoctorId" }, method = RequestMethod.POST)
	public @ResponseBody List<TestDetails> getAllTestsByDoctorId(@RequestParam("doctorId") int doctorId) {
		List<TestDetails> testDetailsList = new ArrayList<TestDetails>();

		try {
			testDetailsList = radiologyTestDetailsRepository.findByDoctorIdAndDelStatus(doctorId, 0);
		} catch (Exception e) {
			System.out.println(e.getMessage());// TODO: handle exception
		}

		return testDetailsList;
	}

	@RequestMapping(value = { "/getAllPndtPatientsByDoctorId" }, method = RequestMethod.POST)
	public @ResponseBody List<PndtPatientBasicDetails> getAllPndtPatientsByDoctorId(
			@RequestParam("doctorId") int doctorId) {
		List<PndtPatientBasicDetails> pndtPatientBasicDetailsList = new ArrayList<PndtPatientBasicDetails>();

		try {
			pndtPatientBasicDetailsList = pndtPatientBasicDetailsRepository.findByDoctorId(doctorId);
			System.out.println("sds" + pndtPatientBasicDetailsList);
		} catch (Exception e) {

			System.out.println(e.getMessage());// TODO: handle exception
		}

		return pndtPatientBasicDetailsList;
	}

	@RequestMapping(value = { "/getPndtPatientsByPndtId" }, method = RequestMethod.POST)
	public @ResponseBody PNDTPatientDetails getPndtPatientsByPatientId(@RequestParam("pndtId") int pndtId) {
		System.out.println("Pndt Id" + pndtId);
		PNDTPatientDetails pndtPatientDetails = new PNDTPatientDetails();
		try {
			pndtPatientDetails = pndtPatientRepository.findByPndtId(pndtId);
			System.out.println("sds" + pndtPatientDetails);
		} catch (Exception e) {
			System.out.println(e.getMessage());// TODO: handle exception
		}

		return pndtPatientDetails;
	}

	/*
	 * @RequestMapping(value = { "/getPndtPatientsIndicationsByPndtId" }, method =
	 * RequestMethod.POST) public @ResponseBody List<IndicationsModel>
	 * getPndtPatientsIndicationsByPatientId(
	 * 
	 * @RequestParam("pndtId") int pndtId) {
	 * 
	 * List<IndicationsModel> indicationModelList=new ArrayList<IndicationsModel>();
	 * try { // indicationModelList =
	 * pndtPatientDetailsService.getIndicationByPndtId(pndtId);
	 * System.out.println("sds"+indicationModelList); } catch (Exception e) {
	 * System.out.println(e.getMessage());// TODO: handle exception }
	 * 
	 * return indicationModelList; }
	 */

	@RequestMapping(value = { "/getPndtPatientsChildsByPndtId" }, method = RequestMethod.POST)
	public @ResponseBody List<ChildsModel> getPndtPatientsChildsByPndtId(@RequestParam("pndtId") int pndtId) {

		List<ChildsModel> childsModelList = new ArrayList<ChildsModel>();
		try {
			childsModelList = pndtPatientDetailsService.getChildsByPndtId(pndtId);
			System.out.println("sds" + childsModelList);
		} catch (Exception e) {
			System.out.println(e.getMessage());// TODO: handle exception
		}

		return childsModelList;
	}

	@RequestMapping(value = { "/deleteTest" }, method = RequestMethod.POST)
	public @ResponseBody Info deleteTest(@RequestParam("testId") int testId) {
		int delStatus = 0;
		Info info = new Info();

		try {
			delStatus = radiologyTestDetailsRepository.deleteTest(testId);
			System.out.println("sds" + info);
		} catch (Exception e) {
			System.out.println(e.getMessage());// TODO: handle exception
		}

		return info;
	}

	@RequestMapping(value = { "/editTestDetails" }, method = RequestMethod.POST)
	public @ResponseBody TestDetails editTestDetails(@RequestParam("testId") int testId) {

		TestDetails testDetails = new TestDetails();

		try {
			testDetails = radiologyTestDetailsRepository.findByTestIdAndDelStatus(testId, 0);
			System.out.println("sds" + testDetails);
		} catch (Exception e) {
			System.out.println(e.getMessage());// TODO: handle exception
		}

		return testDetails;
	}

	@RequestMapping(value = { "/getAllIndications" }, method = RequestMethod.GET)
	public @ResponseBody List<PndtIndications> getAllIndications() {

		List<PndtIndications> pndtIndications = new ArrayList<>();

		try {
			pndtIndications = pndtIndicationsRepository.findAll();

		} catch (Exception e) {
			System.out.println(e.getMessage());// TODO: handle exception
		}

		return pndtIndications;
	}

	@RequestMapping(value = { "/getLabPndtUsernameAndPasswordByLabId" }, method = RequestMethod.POST)
	public @ResponseBody RadiologistPndtDetails getLabPndtUsernameAndPasswordByLabId(@RequestParam("labId") int labId) {

		return radiologistPndtDetailsRepository.findByLabId(labId);
	}

	@RequestMapping(value = { "/updateUploadStatusUsingPndtId" }, method = RequestMethod.POST)
	public @ResponseBody Info updateUploadStatusUsingPndtId(@RequestParam("pndtId") int pndtId) {

		Info info = new Info();
		try {

			int result = pndtPatientRepository.updatePatientUploadStatusByPndtId(pndtId);

			if (result == 1) {

				info.setMessage("update successfully");
				info.setError(false);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());// TODO: handle exception
		}

		return info;
	}

}
