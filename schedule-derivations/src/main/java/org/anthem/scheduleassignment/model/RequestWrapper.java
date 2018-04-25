package org.anthem.scheduleassignment.model;

import java.io.Serializable;
import java.util.List;

public class RequestWrapper implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Policy policy;
	private List<ScheduleAssignmentRecord> assignmentRecords;
	private SelectedRecord selectedRecord;

	public RequestWrapper() {

	}

	public RequestWrapper(Policy policy, List<ScheduleAssignmentRecord> assignmentRecords,
			SelectedRecord selectedRecord) {
		this.policy = policy;
		this.assignmentRecords = assignmentRecords;
		this.selectedRecord = selectedRecord;
	}

	public Policy getPolicy() {
		return policy;
	}

	public void setPolicy(Policy policy) {
		this.policy = policy;
	}

	public List<ScheduleAssignmentRecord> getAssignmentRecords() {
		return assignmentRecords;
	}

	public void setAssignmentRecords(List<ScheduleAssignmentRecord> assignmentRecords) {
		this.assignmentRecords = assignmentRecords;
	}

	public SelectedRecord getSelectedRecord() {
		return selectedRecord;
	}

	public void setSelectedRecord(SelectedRecord selectedRecord) {
		this.selectedRecord = selectedRecord;
	}

}
