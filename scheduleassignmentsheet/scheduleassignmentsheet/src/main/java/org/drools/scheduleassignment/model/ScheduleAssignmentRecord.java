package org.drools.scheduleassignment.model;

import java.util.Date;

public class ScheduleAssignmentRecord {

	public enum Loop {
		LOOP01, LOOP02
	}

	private Loop loop;
	private String mbu;
	private String lob;
	private Date effectiveDate;
	private String state;
	private String contractCode;
	private String exchangeIndicator;
	private String useInd;
	private String parTIN;
	private String result;
	private Policy policy;

	public ScheduleAssignmentRecord(String mbu, String lob, 
			Date effectiveDate, String state, String contractCode, 
			String exchangeIndicator, String useInd, String parTIN, Policy policy) {
		this.mbu = mbu;
		this.lob = lob;
		this.effectiveDate = effectiveDate;
		this.state = state;
		this.contractCode = contractCode;
		this.exchangeIndicator = exchangeIndicator;
		this.useInd = useInd;
		this.parTIN = parTIN;
		this.policy = policy;
	}

	public Loop getLoop() {
		return loop;
	}

	public void setLoop(Loop loop) {
		this.loop = loop;
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

	public Date getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
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

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Policy getPolicy() {
		return policy;
	}

	public void setPolicy(Policy policy) {
		this.policy = policy;
	}

}
