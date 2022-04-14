package com.workersforyou.workersforyou.Services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workersforyou.workersforyou.DAO.FeedbackMsgDao;
import com.workersforyou.workersforyou.entities.FeedbackMsg;

@Service
public class FeedbackMsgImpl implements FeedbackMsgService {

	@Autowired
	private FeedbackMsgDao feedbackmegdao;
	
	@Override
	public FeedbackMsg addMsg(FeedbackMsg feedbackmsg) {
		feedbackmegdao.save(feedbackmsg);
		return feedbackmsg;
	}

	@Override
	public List<FeedbackMsg> getfeedback() {
		return feedbackmegdao.findAll();
	}

}
