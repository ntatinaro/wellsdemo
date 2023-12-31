package com.wellsfargo.losmitigation;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class MortgageLoan implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Loan Number")
	private int loanNumber;
	@org.kie.api.definition.type.Label("Borrower Name")
	private java.lang.String borrowerName;
	@org.kie.api.definition.type.Label("Obligors")
	private java.lang.String obligors;
	@org.kie.api.definition.type.Label("Property Address")
	private java.lang.String propertyAddress;
	@org.kie.api.definition.type.Label("Appraised Value")
	private double appraisedValue;
	@org.kie.api.definition.type.Label("Interest Rate")
	private double interestRate;
	@org.kie.api.definition.type.Label("Mortgage Term")
	private int mortgageTerm;
	@org.kie.api.definition.type.Label("No Of Payments")
	private int noOfPayments;
	@org.kie.api.definition.type.Label("Unpaid Principal Balance")
	private double unpaidPrincipalBalance;
	@org.kie.api.definition.type.Label("Monthly Payment Amount")
	private double monthlyPaymentAmount;
	@org.kie.api.definition.type.Label("Principal Amount")
	private double principalAmount;
	@org.kie.api.definition.type.Label("Interest Amount")
	private double interestAmount;
	@org.kie.api.definition.type.Label("Taxes Amount")
	private double taxesAmount;
	@org.kie.api.definition.type.Label("Insurance Amount")
	private double insuranceAmount;
	@org.kie.api.definition.type.Label("No Of Late Payments")
	private int noOflatePayments;
	@org.kie.api.definition.type.Label("No Of Delinquent Payments")
	private int noOfDelinquentPayments;
	@org.kie.api.definition.type.Label("Monthly Salary")
	private double monthlySalary;
	@org.kie.api.definition.type.Label("Other Monthly Income")
	private double otherMonthlyIncome;
	@org.kie.api.definition.type.Label("Other Monthly Debts")
	private double otherMonthlyDebts;
	@org.kie.api.definition.type.Label("Property Address1")
	private java.lang.String propertyAddress1;
	@org.kie.api.definition.type.Label("Property City")
	private java.lang.String propertyCity;
	@org.kie.api.definition.type.Label("Property State")
	private java.lang.String propertyState;
	@org.kie.api.definition.type.Label("Property Zip")
	private java.lang.String propertyZip;

	@org.kie.api.definition.type.Label("Approved")
	private java.lang.Boolean isApproved;

	public MortgageLoan() {
	}

	public int getLoanNumber() {
		return this.loanNumber;
	}

	public void setLoanNumber(int loanNumber) {
		this.loanNumber = loanNumber;
	}

	public java.lang.String getBorrowerName() {
		return this.borrowerName;
	}

	public void setBorrowerName(java.lang.String borrowerName) {
		this.borrowerName = borrowerName;
	}

	public java.lang.String getObligors() {
		return this.obligors;
	}

	public void setObligors(java.lang.String obligors) {
		this.obligors = obligors;
	}

	public java.lang.String getPropertyAddress() {
		return this.propertyAddress;
	}

	public void setPropertyAddress(java.lang.String propertyAddress) {
		this.propertyAddress = propertyAddress;
	}

	public double getAppraisedValue() {
		return this.appraisedValue;
	}

	public void setAppraisedValue(double appraisedValue) {
		this.appraisedValue = appraisedValue;
	}

	public double getInterestRate() {
		return this.interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public int getMortgageTerm() {
		return this.mortgageTerm;
	}

	public void setMortgageTerm(int mortgageTerm) {
		this.mortgageTerm = mortgageTerm;
	}

	public int getNoOfPayments() {
		return this.noOfPayments;
	}

	public void setNoOfPayments(int noOfPayments) {
		this.noOfPayments = noOfPayments;
	}

	public double getUnpaidPrincipalBalance() {
		return this.unpaidPrincipalBalance;
	}

	public void setUnpaidPrincipalBalance(double unpaidPrincipalBalance) {
		this.unpaidPrincipalBalance = unpaidPrincipalBalance;
	}

	public double getMonthlyPaymentAmount() {
		return this.monthlyPaymentAmount;
	}

	public void setMonthlyPaymentAmount(double monthlyPaymentAmount) {
		this.monthlyPaymentAmount = monthlyPaymentAmount;
	}

	public double getPrincipalAmount() {
		return this.principalAmount;
	}

	public void setPrincipalAmount(double principalAmount) {
		this.principalAmount = principalAmount;
	}

	public double getInterestAmount() {
		return this.interestAmount;
	}

	public void setInterestAmount(double interestAmount) {
		this.interestAmount = interestAmount;
	}

	public double getTaxesAmount() {
		return this.taxesAmount;
	}

	public void setTaxesAmount(double taxesAmount) {
		this.taxesAmount = taxesAmount;
	}

	public double getInsuranceAmount() {
		return this.insuranceAmount;
	}

	public void setInsuranceAmount(double insuranceAmount) {
		this.insuranceAmount = insuranceAmount;
	}

	public int getNoOflatePayments() {
		return this.noOflatePayments;
	}

	public void setNoOflatePayments(int noOflatePayments) {
		this.noOflatePayments = noOflatePayments;
	}

	public int getNoOfDelinquentPayments() {
		return this.noOfDelinquentPayments;
	}

	public void setNoOfDelinquentPayments(int noOfDelinquentPayments) {
		this.noOfDelinquentPayments = noOfDelinquentPayments;
	}

	public double getMonthlySalary() {
		return this.monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public double getOtherMonthlyIncome() {
		return this.otherMonthlyIncome;
	}

	public void setOtherMonthlyIncome(double otherMonthlyIncome) {
		this.otherMonthlyIncome = otherMonthlyIncome;
	}

	public double getOtherMonthlyDebts() {
		return this.otherMonthlyDebts;
	}

	public void setOtherMonthlyDebts(double otherMonthlyDebts) {
		this.otherMonthlyDebts = otherMonthlyDebts;
	}

	public java.lang.String getPropertyAddress1() {
		return this.propertyAddress1;
	}

	public void setPropertyAddress1(java.lang.String propertyAddress1) {
		this.propertyAddress1 = propertyAddress1;
	}

	public java.lang.String getPropertyCity() {
		return this.propertyCity;
	}

	public void setPropertyCity(java.lang.String propertyCity) {
		this.propertyCity = propertyCity;
	}

	public java.lang.String getPropertyState() {
		return this.propertyState;
	}

	public void setPropertyState(java.lang.String propertyState) {
		this.propertyState = propertyState;
	}

	public java.lang.String getPropertyZip() {
		return this.propertyZip;
	}

	public void setPropertyZip(java.lang.String propertyZip) {
		this.propertyZip = propertyZip;
	}

	public java.lang.Boolean getIsApproved() {
		return this.isApproved;
	}

	public void setIsApproved(java.lang.Boolean isApproved) {
		this.isApproved = isApproved;
	}

	public MortgageLoan(int loanNumber, java.lang.String borrowerName,
			java.lang.String obligors, java.lang.String propertyAddress,
			double appraisedValue, double interestRate, int mortgageTerm,
			int noOfPayments, double unpaidPrincipalBalance,
			double monthlyPaymentAmount, double principalAmount,
			double interestAmount, double taxesAmount, double insuranceAmount,
			int noOflatePayments, int noOfDelinquentPayments,
			double monthlySalary, double otherMonthlyIncome,
			double otherMonthlyDebts, java.lang.String propertyAddress1,
			java.lang.String propertyCity, java.lang.String propertyState,
			java.lang.String propertyZip, java.lang.Boolean isApproved) {
		this.loanNumber = loanNumber;
		this.borrowerName = borrowerName;
		this.obligors = obligors;
		this.propertyAddress = propertyAddress;
		this.appraisedValue = appraisedValue;
		this.interestRate = interestRate;
		this.mortgageTerm = mortgageTerm;
		this.noOfPayments = noOfPayments;
		this.unpaidPrincipalBalance = unpaidPrincipalBalance;
		this.monthlyPaymentAmount = monthlyPaymentAmount;
		this.principalAmount = principalAmount;
		this.interestAmount = interestAmount;
		this.taxesAmount = taxesAmount;
		this.insuranceAmount = insuranceAmount;
		this.noOflatePayments = noOflatePayments;
		this.noOfDelinquentPayments = noOfDelinquentPayments;
		this.monthlySalary = monthlySalary;
		this.otherMonthlyIncome = otherMonthlyIncome;
		this.otherMonthlyDebts = otherMonthlyDebts;
		this.propertyAddress1 = propertyAddress1;
		this.propertyCity = propertyCity;
		this.propertyState = propertyState;
		this.propertyZip = propertyZip;
		this.isApproved = isApproved;
	}

}