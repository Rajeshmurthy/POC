package org.drools.schedule;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.anthem.scheduleassignment.model.Policy;
import org.anthem.scheduleassignment.model.ScheduleAssignmentRecord;
import org.anthem.scheduleassignment.model.SelectedRecord;
import org.anthem.scheduleassignment.service.ScheduleAssignmentService;



/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ScheduleAssignmentService service = new ScheduleAssignmentService();

		Date data = new Date();
		SelectedRecord selectedRecord = new SelectedRecord();
		List<ScheduleAssignmentRecord> records = new ArrayList<ScheduleAssignmentRecord>();

		Policy policy1 = new Policy("IN", "BIXX14PX", data.toString(), "MO", "GHV", "Y", "SMGA", "123456789S");

		ScheduleAssignmentRecord record1 = new ScheduleAssignmentRecord(1, "IN", "BIXX14PX", data.toString(), "MO",
				"GHV", "Y", "", "123456789S"); // LOOP02
		records.add(record1);

		service.gethighestPriorityRecord(policy1, records, selectedRecord);

		System.out.println("======" + selectedRecord);
	}
}
