package org.drools.schedule;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.anthem.scheduleassignment.model.Policy;
import org.anthem.scheduleassignment.model.RequestWrapper;
import org.anthem.scheduleassignment.model.Response;
import org.anthem.scheduleassignment.model.ScheduleAssignmentRecord;
import org.anthem.scheduleassignment.model.SelectedRecord;

import org.springframework.web.client.RestTemplate;

public class AppHttpClient {

	final static String url = "http://localhost:8080/scheduleAssignment";

	@SuppressWarnings("unchecked")
	public static void main(String arg[]) {
		Date data = new Date();
		SelectedRecord selectedRecord = new SelectedRecord();
		List<ScheduleAssignmentRecord> records = new ArrayList<ScheduleAssignmentRecord>();
		Policy policy1 = new Policy("IN", "BIXX14PX", data.toString(), "MO", "GHV", "Y", "SMGA", "123456789S");

		// ScheduleAssignmentRecord object is a hard-coded value for Demo  
		ScheduleAssignmentRecord record1 = new ScheduleAssignmentRecord(1, "IN", "BIXX14PX", data.toString(), "MO",
				"GHV", "Y", "", "123456789S"); // LOOP01		
		ScheduleAssignmentRecord record2 = new ScheduleAssignmentRecord(2, "IN", "BIXX14PX", data.toString(), "MO",
				"GHV", "", "", "123456789S"); // LOOP02
		ScheduleAssignmentRecord record3 = new ScheduleAssignmentRecord(3, "IN", "BIXX14PX", data.toString(), "MO",
				"", "", "", "123456789S"); // LOOP03		
		ScheduleAssignmentRecord record4 = new ScheduleAssignmentRecord(4, "IN", "BIXX14PX", data.toString(), "MO",
				"GHV", "Y", "SMGA", ""); // LOOP04		
		ScheduleAssignmentRecord record5 = new ScheduleAssignmentRecord(5, "IN", "BIXX14PX", data.toString(), "MO",
				"GHV", "Y", "SMGA", "123456789S"); // No Match		
		ScheduleAssignmentRecord record6 = new ScheduleAssignmentRecord(6, "IN", "BIXX14PX", data.toString(), "MO",
				"GHV", "", "SMGA", ""); // LOOP05			
		ScheduleAssignmentRecord record7 = new ScheduleAssignmentRecord(7, "IN", "BIXX14PX", data.toString(), "MO",
				"GHV", "Y", "", ""); // LOOP06	
		ScheduleAssignmentRecord record8 = new ScheduleAssignmentRecord(8, "IN", "BIXX14PX", data.toString(), "MO",
				"GHV", "", "", ""); // LOOP07	
		ScheduleAssignmentRecord record9 = new ScheduleAssignmentRecord(9, "IN", "BIXX14PX", data.toString(), "MO",
				"", "Y", "SMGA", ""); // LOOP08	

		records.add(record3);
		records.add(record2);
		records.add(record1);		
		records.add(record4);
		records.add(record3);		
		records.add(record6);
		records.add(record7);
		records.add(record1);
		records.add(record5);
		records.add(record9);
		records.add(record8);	
		records.add(record2);	
		records.add(record4);
		
		//Consuming a RESTFul Schedule assignment Service and Retrieving Response POJO instead of JSON 
		RestTemplate restTemplate = new RestTemplate();
		RequestWrapper wrapper = new RequestWrapper(policy1, records, selectedRecord);
		Response<SelectedRecord> response = restTemplate.postForObject(url, wrapper, Response.class);
		System.out.println("=======OutPUT=======" + response.getData());

	}

}
