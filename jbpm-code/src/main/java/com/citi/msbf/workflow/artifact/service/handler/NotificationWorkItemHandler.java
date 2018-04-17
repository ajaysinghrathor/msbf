package com.citi.msbf.workflow.artifact.service.handler;

import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;

public class NotificationWorkItemHandler implements WorkItemHandler{

	@Override
	public void executeWorkItem(WorkItem workItem, WorkItemManager manager) {
	    String from = (String) workItem.getParameter("From");
	    String to = (String) workItem.getParameter("To");
	    String message = (String) workItem.getParameter("Message");
	    String priority = (String) workItem.getParameter("Priority");

	    manager.completeWorkItem(workItem.getId(), null);
	}
	
	@Override
	public void abortWorkItem(WorkItem workItem, WorkItemManager manager) {
		// TODO Auto-generated method stub
		
	}
}
