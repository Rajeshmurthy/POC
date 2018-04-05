package org.drools.scheduleassignment;

import java.util.Date;

import org.drools.scheduleassignment.model.Policy;
import org.drools.scheduleassignment.model.ScheduleAssignmentRecord;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 *
 *
 */
public class DroolsTest {
	public static void main(String[] args) {
		KieServices kieServices = KieServices.Factory.get();
		KieContainer kieContainer = kieServices.getKieClasspathContainer();
		KieSession kieSession = kieContainer.newKieSession("ksession-rules-sheet");
		
		Date data = new Date();

		Policy policy1 = new Policy("IN", "BIXX14PX", data, "MO", "1GHV", "Y", "SMGA", "123456789S");	
		

		
		ScheduleAssignmentRecord record2 = new ScheduleAssignmentRecord("IN", "BIXX14PX", data,
				"MO", "1GHV", "Y", "SMGA", "123456789S", policy1); // No Match	
		
		ScheduleAssignmentRecord record1 = new ScheduleAssignmentRecord("IN", "BIXX14PX", data,
				"MO", "1GHV", "", "", "123456789S", policy1); // LOOP02
		
		ScheduleAssignmentRecord record = new ScheduleAssignmentRecord("IN", "BIXX14PX", data,
				"MO", "1GHV", "Y", "", "123456789S", policy1); // LOOP01	
		
		ScheduleAssignmentRecord record3 = new ScheduleAssignmentRecord("IN", "BIXX14PX", data,
				"MO", "1GHV", "Y", "SMGA", "", policy1); // LOOP04
		
		kieSession.insert(record3);
		kieSession.insert(record2);
		kieSession.insert(record1);
		kieSession.insert(record);
		kieSession.fireAllRules();

		System.out.println("====record==" + record.getResult());
		System.out.println("====record1==" + record1.getResult());
		System.out.println("====record2==" + record2.getResult());
		System.out.println("====record3==" + record3.getResult());
		
	}
}
