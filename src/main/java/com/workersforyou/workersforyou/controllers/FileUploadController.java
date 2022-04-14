package com.workersforyou.workersforyou.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.workersforyou.workersforyou.helper.FileUploadHelper;

@RestController
public class FileUploadController {

	@Autowired
	private FileUploadHelper fileuploadhelper;

	@PostMapping("/upload-File")
	public ResponseEntity<String> uploadFile(@RequestParam("wphoto") MultipartFile file) {

		try {

			// validation
			if (file.isEmpty()) {
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Request must contain file");

			} else if (!file.getContentType().equals("image/jpeg"))
				;

			{

				// file upload code
				boolean f = fileuploadhelper.uploadFile(file);
				if (f) {

					// return ResponseEntity.ok("file is successfully uploaded");

					return ResponseEntity.ok(ServletUriComponentsBuilder.fromCurrentContextPath().path("/images/")
							.path(file.getOriginalFilename()).toUriString());
				}
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("only jpg content are allowed");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("something went wrong");
	}
}
