package com.workersforyou.workersforyou.helper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper {

//	private String wphoto="C:\\Users\\lenovo\\Documents\\CDAC-PROJECT\\workersforyou\\workersforyou\\src\\main\\resources\\static\\images";

	private String wphoto = new ClassPathResource("static/images/").getFile().getAbsolutePath();

	public FileUploadHelper() throws IOException {

	}

	public boolean uploadFile(MultipartFile multipart) {
		boolean f = false;

		try {
			Files.copy(multipart.getInputStream(), Paths.get(wphoto + File.separator + multipart.getOriginalFilename()),
					StandardCopyOption.REPLACE_EXISTING);

			f = true;

		} catch (IOException e) {
			e.printStackTrace();
		}

		return f;
	}
}
