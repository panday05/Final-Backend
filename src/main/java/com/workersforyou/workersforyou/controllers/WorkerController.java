package com.workersforyou.workersforyou.controllers;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.workersforyou.workersforyou.Services.WorkerService;
import com.workersforyou.workersforyou.entities.Worker;
import com.workersforyou.workersforyou.helper.FileUploadHelper;

@RestController
@CrossOrigin(origins = "*")
public class WorkerController {

	@Autowired(required = true)
	private WorkerService workerservice;

	

	@GetMapping("/worker")
	public List<Worker> getWorker() {
		return this.workerservice.getWorker();

	}
	
	@GetMapping("/worker/{workerId}")
	public Worker getWorker(@PathVariable String workerId) {
		return this.workerservice.getWorker(Integer.parseInt(workerId));
	}

	@PostMapping("/worker")
	public Worker addworker(@RequestBody Worker worker) {
//	public Worker addworker(@RequestBody Worker worker , @RequestParam("wphoto") MultipartFile file) 
//	{
//		try {
//		
//			if(file.isEmpty())
//			{
//				//return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("request must contain file");
//			}else {
//				worker.setWphoto(file.getOriginalFilename());
//				File saveFile=new ClassPathResource("static/images/").getFile();
//				Path path =Paths.get(saveFile.getAbsolutePath()+File.separator+file.getOriginalFilename());
//				Files.copy(file.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
//				System.out.println("image is uploaded");
//			}
//			
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
		return this.workerservice.addWorker(worker);
	}

	@DeleteMapping("/worker/{workerId}")
	//@CrossOrigin(origins = "*")
	public ResponseEntity<HttpStatus> delete(@PathVariable int workerId) {
		try {
			this.workerservice.delete(workerId);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	
	@PutMapping("/worker")
	public Worker updateWorker(@RequestBody Worker worker) {
		return this.workerservice.updateworker(worker);
	}
}
