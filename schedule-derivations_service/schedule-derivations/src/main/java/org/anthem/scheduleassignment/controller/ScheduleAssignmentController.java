package org.anthem.scheduleassignment.controller;

import org.anthem.scheduleassignment.model.RequestWrapper;
import org.anthem.scheduleassignment.model.Response;
import org.anthem.scheduleassignment.model.SelectedRecord;
import org.anthem.scheduleassignment.service.ScheduleAssignmentService;
import org.anthem.scheduleassignment.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScheduleAssignmentController {

	private final ScheduleAssignmentService scheduleAssignmentService;

	@Autowired
	public ScheduleAssignmentController(
					ScheduleAssignmentService scheduleAssignmentService) {
		this.scheduleAssignmentService = scheduleAssignmentService;
	}

	@RequestMapping(value = "/scheduleAssignment", method = RequestMethod.POST)
	public Response<SelectedRecord> getFinalAssignmentRecord(
				@RequestBody RequestWrapper wrapper) {
		SelectedRecord selectedRecord = new SelectedRecord();

		scheduleAssignmentService.gethighestPriorityRecord(
									wrapper.getPolicy(),
									wrapper.getAssignmentRecords(),
									selectedRecord);
		
		
		return new Response<SelectedRecord>(HttpStatus.OK.toString(),
							Constants.SUCCESS, selectedRecord);
	}

}
