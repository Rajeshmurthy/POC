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

	public RequestWrapper() {

	}

	public RequestWrapper(Policy policy, List<ScheduleAssignmentRecord> assignmentRecords) {
		this.policy = policy;
		this.assignmentRecords = assignmentRecords;
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

}
