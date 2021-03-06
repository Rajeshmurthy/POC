package org.anthem.scheduleassignment.model;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class SelectedRecord implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int weightage;
	private int recordID;
	private String loopID;
	private String mbu;
	private String lob;
	private String effectiveDate;
	private String state;
	private String contractCode;
	private String exchangeIndicator;
	private String useInd;
	private String parTIN;
	private List<ScheduleAssignmentRecord> inAssignmentRecords;

	public SelectedRecord() {

	}

	public int getWeightage() {
		return weightage;
	}

	public void setWeightage(int weightage) {
		this.weightage = weightage;
	}

	public int getRecordID() {
		return recordID;
	}

	public void setRecordID(int recordID) {
		this.recordID = recordID;
	}

	public String getLoopID() {
		return loopID;
	}

	public void setLoopID(String loopID) {
		this.loopID = loopID;
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

	public List<ScheduleAssignmentRecord> getInAssignmentRecords() {
		return inAssignmentRecords;
	}

	public void setInAssignmentRecords(List<ScheduleAssignmentRecord> inAssignmentRecords) {
		this.inAssignmentRecords = inAssignmentRecords;
	}

	
	
	
	@Override
	public String toString() {
		return "\n Output Highest Priority Loop = [weightage=" + weightage + ",\n recordID=" + recordID + ",\n loopID=" + loopID + ",\n mbu="
				+ mbu + ",\n lob=" + lob + ",\n effectiveDate=" + effectiveDate + ",\n state=" + state + ",\n contractCode="
				+ contractCode + ",\n exchangeIndicator=" + exchangeIndicator + ",\n useInd=" + useInd + ",\n parTIN="
				+ parTIN + "]\n "+ "\n Assignment Records = [ inAssignmentRecords=" + inAssignmentRecords + "]\n";
	}

}
