package com.revature.contracts;

public class Offer {
	private DownPayment downPayment;
	private TermLoanLength termLoanLength;
	private OfferStatus offerStatus;

	public Offer(DownPayment downPayment, TermLoanLength termLoanLength) {
		super();
		this.downPayment = downPayment;
		this.termLoanLength = termLoanLength;
		this.offerStatus = new OfferStatus("Pending");
	}

	public DownPayment getDownPayment() {
		return downPayment;
	}

	public void setDownPayment(DownPayment downPayment) {
		this.downPayment = downPayment;
	}

	public TermLoanLength getTermLoanLength() {
		return termLoanLength;
	}

	public void setTermLoanLength(TermLoanLength termLoanLength) {
		this.termLoanLength = termLoanLength;
	}

	public OfferStatus getOfferStatus() {
		return offerStatus;
	}

	public void setOfferStatus(OfferStatus offerStatus) {
		this.offerStatus = offerStatus;
	}

	@Override
	public String toString() {
		return "Offer [downPayment=" + downPayment + ", termLoanLength=" + termLoanLength + ", offerStatus="
				+ offerStatus + "]";
	}

}
