package org.anthem.scheduleassignment.service;

import java.io.IOException;
import java.util.List;

import org.anthem.scheduleassignment.DroolsAutoConfig;
import org.anthem.scheduleassignment.model.Policy;
import org.anthem.scheduleassignment.model.ScheduleAssignmentRecord;
import org.anthem.scheduleassignment.model.SelectedRecord;

import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Service;

@Service
public class ScheduleAssignmentService {

	
	public SelectedRecord gethighestPriorityRecord(Policy policy,
			List<ScheduleAssignmentRecord> records,
			SelectedRecord selectedRecord) throws IOException {
		DroolsAutoConfig droolsAutoConfig = new DroolsAutoConfig();
		KieSession kieSession = droolsAutoConfig.kieSession();
		kieSession.insert(policy);
		for (ScheduleAssignmentRecord scheduleAssignmentRecord : records) {
			kieSession.insert(scheduleAssignmentRecord);
		}
		kieSession.insert(selectedRecord);
		kieSession.fireAllRules();
		kieSession.dispose();
		return selectedRecord;
	}

}
