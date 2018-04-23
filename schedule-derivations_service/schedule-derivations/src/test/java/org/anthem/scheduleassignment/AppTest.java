package org.anthem.scheduleassignment;

import java.util.Date;

import org.anthem.scheduleassignment.model.Policy;
import org.anthem.scheduleassignment.model.ScheduleAssignmentRecord;
import org.anthem.scheduleassignment.model.SelectedRecord;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class AppTest

{
		
	public void fireRule(){
		
	}
	

	public static void main(String arg[]) {

		
		KieServices kieServices = KieServices.Factory.get();
		KieContainer kieContainer = kieServices.getKieClasspathContainer();
		KieSession kieSession = kieContainer.newKieSession("rulesSession");
	
		Date data = new Date();

		Policy policy1 = new Policy("IN", "BIXX14PX", data.toString(), "MO", "GHV", "Y", "SMGA", "123456789S");

		ScheduleAssignmentRecord record1 = new ScheduleAssignmentRecord(1, "IN", "BIXX14PX", data.toString(), "MO", "GHV",
				"Y", "", "123456789S"); // LOOP02

		ScheduleAssignmentRecord record2 = new ScheduleAssignmentRecord(2, "IN", "BIXX14PX", data.toString(), "MO", "GHV",
				"", "", "123456789S"); // LOOP01

//		ScheduleAssignmentRecord record = new ScheduleAssignmentRecord("IN", "BIXX14PX", data.toString(), "MO", "", "",
	//			"", "123456789S"); // LOOP03
		
		SelectedRecord selectedRecord = new SelectedRecord();
		
		kieSession.insert(policy1);		
		kieSession.insert(record2);
		kieSession.insert(record1);
		//kieSession.insert(record);
		kieSession.insert(selectedRecord);
		
		kieSession.fireAllRules();
		
		System.out.println(selectedRecord);
		
		
		
	}
}
