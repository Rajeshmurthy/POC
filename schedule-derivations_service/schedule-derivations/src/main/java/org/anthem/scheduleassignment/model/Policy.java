package org.anthem.scheduleassignment.model;

import java.io.Serializable;

public class Policy implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mbu;
	private String lob;
	private String effectiveDate;
	private String state;
	private String contractCode;
	private String exchangeIndicator;
	private String useInd;
	private String parTIN;
	
	public Policy(){
		
	}

	public Policy(String mbu, String lob, String effectiveDate, String state, String contractCode,
			String exchangeIndicator, String useInd, String parTIN) {
		this.mbu = mbu;
		this.lob = lob;
		this.effectiveDate = effectiveDate;
		this.state = state;
		this.contractCode = contractCode;
		this.exchangeIndicator = exchangeIndicator;
		this.useInd = useInd;
		this.parTIN = parTIN;
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

}
