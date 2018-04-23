package org.anthem.scheduleassignment.service;

import java.util.List;

import org.anthem.scheduleassignment.model.Policy;
import org.anthem.scheduleassignment.model.ScheduleAssignmentRecord;
import org.anthem.scheduleassignment.model.SelectedRecord;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Service;

@Service
public class ScheduleAssignmentService {

	/*@Autowired
	private final KieContainer kieContainer;

	
	public ScheduleAssignmentService(KieContainer kieContainer) {
		this.kieContainer = kieContainer;
	}*/

	public SelectedRecord gethighestPriorityRecord(Policy policy,
			List<ScheduleAssignmentRecord> records,
			SelectedRecord selectedRecord) {
		KieServices kieServices = KieServices.Factory.get();
		KieContainer kieContainer = kieServices.getKieClasspathContainer();
		KieSession kieSession = kieContainer.newKieSession("rulesSession");
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
