package com.workersforyou.workersforyou.Services;

import java.util.List;

import com.workersforyou.workersforyou.entities.FeedbackMsg;

public interface FeedbackMsgService {


	public FeedbackMsg addMsg(FeedbackMsg feedbackmsg);

	public List<FeedbackMsg> getfeedback();


}
