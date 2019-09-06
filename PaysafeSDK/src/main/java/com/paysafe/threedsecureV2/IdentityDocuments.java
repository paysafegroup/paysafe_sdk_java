package com.paysafe.threedsecureV2;

import com.google.gson.annotations.Expose;
import com.paysafe.common.Error;
import com.paysafe.common.impl.DomainObject;
import com.paysafe.common.impl.GenericBuilder;
import com.paysafe.common.impl.NestedBuilder;

public class IdentityDocuments implements DomainObject {
	
	@Expose
	private Type type;	
	
	@Expose
	private String documentNumber;
	
	@Expose
	private String issuingCountry;
	@Expose
	private String issuingCountrySubdvision;	
	@Expose
	private IssueDate issueDate;
	@Expose
	private ExpiryDate expiryDate;	

	

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	public String getIssuingCountry() {
		return issuingCountry;
	}

	public void setIssuingCountry(String issuingCountry) {
		this.issuingCountry = issuingCountry;
	}

	public String getIssuingCountrySubdvision() {
		return issuingCountrySubdvision;
	}

	public void setIssuingCountrySubdvision(String issuingCountrySubdvision) {
		this.issuingCountrySubdvision = issuingCountrySubdvision;
	}

	public IssueDate getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(IssueDate issueDate) {
		this.issueDate = issueDate;
	}

	public ExpiryDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(ExpiryDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Error getError() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static class IdentityDocumentsBuilder<BLDRT extends GenericBuilder>extends 
	NestedBuilder<IdentityDocuments, BLDRT>{
		public IdentityDocumentsBuilder(final BLDRT parent) {
			super(parent);
			// TODO Auto-generated constructor stub
		}

		private final IdentityDocuments identityDocuments=new IdentityDocuments();
		
		private  IssueDate.IssueDateBuilder<IdentityDocumentsBuilder> issueDateBuilder;
		private  ExpiryDate.ExpiryDateBuilder<IdentityDocumentsBuilder> expiryDateBuilder;

		@Override
		public IdentityDocuments build() {
			if(null!=issueDateBuilder){
		identityDocuments.setIssueDate(issueDateBuilder.build());
			}
			if(null!=expiryDateBuilder){
				identityDocuments.setExpiryDate(expiryDateBuilder.build());
			}
			return identityDocuments;
		}
		public final IdentityDocumentsBuilder<BLDRT>type(final Type type){
			identityDocuments.setType(type);
			return this;
		}
		public final IdentityDocumentsBuilder<BLDRT>documentNumber(final String documentNumber){
			identityDocuments.setDocumentNumber(documentNumber);
			return this;
		}
		public final IdentityDocumentsBuilder<BLDRT>issuingCountry(final String issuingCountry){
			identityDocuments.setIssuingCountry(issuingCountry);
			return this;
		}
		public final IdentityDocumentsBuilder<BLDRT>issuingCountrySubdvision(final String issuingCountrySubdvision){
			identityDocuments.setIssuingCountrySubdvision(issuingCountrySubdvision);
			return this;
		}
		public final IdentityDocumentsBuilder<BLDRT>issueDate(final IssueDate issueDate){
			identityDocuments.setIssueDate(issueDate);
			return this;
		}
		
	public final IdentityDocumentsBuilder<BLDRT>expiryDate(final ExpiryDate expiryDate){
		identityDocuments.setExpiryDate(expiryDate);
		return this;
	}
	
	
	public final IssueDate.IssueDateBuilder<IdentityDocumentsBuilder>issueDate(){
		if(null==issueDateBuilder){
			issueDateBuilder=new IssueDate.IssueDateBuilder<IdentityDocumentsBuilder>(this);
		}
		return issueDateBuilder;
	}
	public final ExpiryDate.ExpiryDateBuilder<IdentityDocumentsBuilder>expiryDate(){
		if(null==expiryDateBuilder){
			expiryDateBuilder=new ExpiryDate.ExpiryDateBuilder<IdentityDocumentsBuilder>(this);
		}
		return expiryDateBuilder;
	}
	}
}
