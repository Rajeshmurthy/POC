package org.anthem.scheduleassignment.model;

import java.io.Serializable;

public class ScheduleAssignmentRecord implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int recordID;
	private String mbu;
	private String lob;	
	private String effectiveDate;
	private String state;
	private String contractCode;
	private String exchangeIndicator;
	private String useInd;
	private String parTIN;
	private int weightage;
	private String result = "No Match";
	
	public ScheduleAssignmentRecord(){
		
	}

	public ScheduleAssignmentRecord(int recordID, String mbu, String lob, String effectiveDate, String state, String contractCode,
			String exchangeIndicator, String useInd, String parTIN) {
		this.recordID = recordID;
		this.mbu = mbu;
		this.lob = lob;
		this.effectiveDate = effectiveDate;
		this.state = state;
		this.contractCode = contractCode;
		this.exchangeIndicator = exchangeIndicator;
		this.useInd = useInd;
		this.parTIN = parTIN;
	}

	public int getRecordID() {
		return recordID;
	}

	public void setRecordID(int recordID) {
		this.recordID = recordID;
	}

	public String getMbu() {
		return mbu;
	}

	public void setMbu(String mbu) {
		this.mbu = mbu;
	}

	public String getLob() {
		return lob;
	}

	public void setLob(String lob) {
		this.lob = lob;
	}

	public String getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getContractCode() {
		return contractCode;
	}

	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}

	public String getExchangeIndicator() {
		return exchangeIndicator;
	}

	public void setExchangeIndicator(String exchangeIndicator) {
		this.exchangeIndicator = exchangeIndicator;
	}

	public String getUseInd() {
		return useInd;
	}

	public void setUseInd(String useInd) {
		this.useInd = useInd;
	}

	public String getParTIN() {
		return parTIN;
	}

	public void setParTIN(String parTIN) {
		this.parTIN = parTIN;
	}

	public int getWeightage() {
		return weightage;
	}

	public void setWeightage(int weightage) {
		this.weightage = weightage;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}
