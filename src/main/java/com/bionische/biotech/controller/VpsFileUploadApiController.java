package com.bionische.biotech.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.bionische.biotech.ConstantFileUploadPath;
import com.bionische.biotech.model.Info;

@RestController
public class VpsFileUploadApiController {

	/*
	 * String UPLOAD_DIR = "C://uploads//";
	 * 
	 * @RequestMapping(value = "/upload", method = RequestMethod.POST)
	 * public @ResponseBody String handleFileUpload(@RequestParam(value = "files")
	 * MultipartFile file, @RequestParam("imageName") String
	 * imageName,@RequestParam("imageType") int imageType, @RequestParam("userId")
	 * int userId) throws IOException {
	 * 
	 * String fileExtension = getFileExtension(file); String filename =
	 * getRandomString();
	 * 
	 * File targetFile = getTargetFile(fileExtension, filename);
	 * 
	 * byte[] bytes = file.getBytes(); file.transferTo(targetFile); String
	 * UploadedDirectory = targetFile.getAbsolutePath();
	 * 
	 * return filename; }
	 * 
	 * private String getRandomString() { return new Random().nextInt(999999) + "_"
	 * + System.currentTimeMillis(); }
	 * 
	 * private File getTargetFile(String fileExtn, String fileName) { File
	 * targetFile = new File(UPLOAD_DIR + fileName + fileExtn); return targetFile; }
	 * 
	 * private String getFileExtension(MultipartFile inFile) { String fileExtention
	 * = inFile.getOriginalFilename().substring(inFile.getOriginalFilename().
	 * lastIndexOf('.')); return fileExtention; }
	 */
	@RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
	public @ResponseBody Info uploadFile(@RequestParam(value = "files") MultipartFile file,
			@RequestParam("imageName") String imageName, @RequestParam("imageType") int imageType,
			@RequestParam("userId") int userId) throws IOException {

		Info info = new Info();

		System.out.println("File Name: " + file.getOriginalFilename());
		Path path = null;
		byte[] bytes = file.getBytes();

		System.out.println("1111111");

		String fileExtention = getFileExtension(file);
		
		
		
			if(imageType==1) {
			  
			
				path = Paths.get(ConstantFileUploadPath.DOCTOR_PATH + "/" + userId + "/profile/" + imageName);
			
			}
			else if(imageType==2)
			{
				System.out.println("222");
				
				path = Paths.get(ConstantFileUploadPath.PATIENT_PATH+userId+"/profile/"+imageName);
			}
			else if(imageType==3)
			{
				  
				System.out.println("333");
				path = Paths.get(ConstantFileUploadPath.PHARMACY_PATH+userId+"/profile/"+imageName);
			}
			
			else if(imageType==4)
			{
				System.out.println("4444");
				
				path = Paths.get(ConstantFileUploadPath.LAB_PATH+userId+"/profile/"+imageName);
			}
			
			else if(imageType==5)
			{
				System.out.println("666");
				path = Paths.get(ConstantFileUploadPath.PATIENT_PATH+userId+"/reports/"+imageName);
				//path = Paths.get(patientImages+userId+"//reports//"+imageName);
			}
				
			
			else if(imageType==7)
			{
				System.out.println("777");
				path = Paths.get(ConstantFileUploadPath.DOCTOR_PATH+userId+"/documents/"+imageName);
			}else if(imageType==8) {
				System.out.println("888");
				path = Paths.get(ConstantFileUploadPath.LAB_PATH+userId+"/documents/"+imageName);
			}else if(imageType==6) {
				System.out.println("666");
				path = Paths.get(ConstantFileUploadPath.PHARMACY_PATH+userId+"/documents/"+imageName);
			}
		
		
		Files.write(path, bytes);

		return info;

	}

	private String getFileExtension(MultipartFile inFile) {
		String fileExtention = inFile.getOriginalFilename().substring(inFile.getOriginalFilename().lastIndexOf('.'));
		return fileExtention;
	}
}
