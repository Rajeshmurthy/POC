package org.drools.scheduleassignment.model;

import java.util.Date;

public class Policy {

	public enum Match {
		K, Y, S
	}

	private Match match;
	private String mbu;
	private String lob;
	private Date effectiveDate;
	private String state;
	private String contractCode;
	private String exchangeIndicator;
	private String useInd;
	private String parTIN;

	public Policy(String mbu, String lob, 
			Date effectiveDate, String state, String contractCode, 
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

	public Match getMatch() {
		return match;
	}

	public void setMatch(Match match) {
		this.match = match;
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

	public Date getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public void setLob(String lob) {
		this.lob = lob;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lob == null) ? 0 : lob.hashCode());
		// result = prime * result + ((match == null) ? 0 : match.hashCode());
		result = prime * result + ((mbu == null) ? 0 : mbu.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Policy other = (Policy) obj;
		if (lob == null) {
			if (other.lob != null)
				return false;
		} else if (!lob.equals(other.lob))
			return false;
		if (match != other.match)
			return false;
		if (mbu == null) {
			if (other.mbu != null)
				return false;
		} else if (!mbu.equals(other.mbu))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		return true;
	}

}
