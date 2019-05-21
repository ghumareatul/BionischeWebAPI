package com.bionische.biotech.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.bionische.biotech.ConstantFileUploadPath;
import com.bionische.biotech.model.Info;
import com.bionische.biotech.model.UploadFileResponse;

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
		info.setError(true);
		System.out.println("File Name: " + file.getOriginalFilename());
		Path path = null;
		byte[] bytes = file.getBytes();
		String fileExtention = getFileExtension(file);

		if (imageType == 1) {

			path = Paths.get(ConstantFileUploadPath.DOCTOR_PATH + "/" + userId + "/profile/" + imageName);
			 
		} else if (imageType == 2) {

			path = Paths.get(ConstantFileUploadPath.PATIENT_PATH + userId + "/profile/" + imageName);
		} else if (imageType == 3) {

			path = Paths.get(ConstantFileUploadPath.PHARMACY_PATH + userId + "/profile/" + imageName);
		}

		else if (imageType == 4) {

			path = Paths.get(ConstantFileUploadPath.LAB_PATH + userId + "/profile/" + imageName);
		}

		else if (imageType == 5) {

			path = Paths.get(ConstantFileUploadPath.PATIENT_PATH + userId + "/reports/" + imageName);
			// path = Paths.get(patientImages+userId+"//reports//"+imageName);
		} else if (imageType == 6) {

			path = Paths.get(ConstantFileUploadPath.PHARMACY_PATH + userId + "/documents/" + imageName);
		} else if (imageType == 7) {

			path = Paths.get(ConstantFileUploadPath.DOCTOR_PATH + userId + "/documents/" + imageName);
		} else if (imageType == 8) {

			path = Paths.get(ConstantFileUploadPath.LAB_PATH + userId + "/documents/" + imageName);
		}
		
		 else if (imageType == 10) {

				path = Paths.get(ConstantFileUploadPath.DOCTOR_PATH + userId + "/signature/" + imageName);
			}
		 else if (imageType == 13) {
		path = Paths.get(ConstantFileUploadPath.PATIENT_PATH + userId + "/video/" + imageName);
		 }
		try {
			if(! Files.exists(path)) {
				Files.createDirectories(path.getParent());
				}
			 
			Files.write(path, bytes);
			info.setError(false);
			info.setMessage("File Upload Successfully");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			info.setError(true);
			info.setMessage("Failed to Upload File ");
		}

		return info;

	}

	@PostMapping("/uploadMultipleFiles")
    public @ResponseBody List<String> uploadMultipleFiles(@RequestParam("files") MultipartFile[] files,
			 @RequestParam("imageType") int imageType,
			@RequestParam("userId") int userId) {
		
		List<String> fileNameList=new ArrayList<String>();
		System.out.println("uploadMultipleFiles :"+files.length);
		 for(MultipartFile file: files) {
				
			String imageName=  new SimpleDateFormat("ddMMyyyyHHmmss").format(new Date())
					+ userId + getFileExtension(file);
			System.out.println("uploadMultipleFiles : imageName");
			fileNameList.add(imageName);
		try {
			uploadFile(file,imageName,imageType, userId);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} 
		
       return fileNameList;
    }
 
     

	
	private String getFileExtension(MultipartFile inFile) {
		String fileExtention = inFile.getOriginalFilename().substring(inFile.getOriginalFilename().lastIndexOf('.'));
		return fileExtention;
	}
	
	 
}
