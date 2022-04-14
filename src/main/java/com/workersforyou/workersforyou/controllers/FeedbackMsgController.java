package com.workersforyou.workersforyou.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.workersforyou.workersforyou.Services.FeedbackMsgService;
import com.workersforyou.workersforyou.entities.FeedbackMsg;

@RestController
@CrossOrigin(origins="*")
public class FeedbackMsgController {
	
	@Autowired(required = true)
	private FeedbackMsgService feedbackmsgservice;
	
	@GetMapping("/feedbackmsg")
	public List<FeedbackMsg> getCourses()
	{
		return this.feedbackmsgservice.getfeedback();
		
	}
	
	
	@PostMapping("/feedbackmsg")
	public FeedbackMsg addMsg(@RequestBody FeedbackMsg feedbackmsg) 
	{
		return this.feedbackmsgservice.addMsg(feedbackmsg);
	}
	
	

}
