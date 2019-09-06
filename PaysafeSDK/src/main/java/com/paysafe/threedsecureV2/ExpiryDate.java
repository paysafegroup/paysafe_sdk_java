package com.paysafe.threedsecureV2;

import com.google.gson.annotations.Expose;
import com.paysafe.common.impl.DomainObject;
import com.paysafe.common.impl.GenericBuilder;
import com.paysafe.common.impl.NestedBuilder;

public class ExpiryDate implements DomainObject {

	@Expose
	private Integer year;
	@Expose
	private Integer month;
	@Expose
	private Integer day;
	
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Integer getMonth() {
		return month;
	}
	public void setMonth(Integer month) {
		this.month = month;
	}
	public Integer getDay() {
		return day;
	}
	public void setDay(Integer day) {
		this.day = day;
	}
	
	public static class ExpiryDateBuilder<BLDRT extends GenericBuilder>extends 
	NestedBuilder<ExpiryDate, BLDRT>{
		
		public ExpiryDateBuilder(final BLDRT parent) {
			super(parent);
			// TODO Auto-generated constructor stub
		}

		private final ExpiryDate expiryDate=new ExpiryDate();

		@Override
		public ExpiryDate build() {
			// TODO Auto-generated method stub
			return expiryDate;
		}
		
		public final ExpiryDateBuilder<BLDRT> year(final Integer year){
			expiryDate.setYear(year);
			return this;
		}
		public final ExpiryDateBuilder<BLDRT> day(final Integer day){
			expiryDate.setDay(day);
			return this;
		}
		public final ExpiryDateBuilder<BLDRT>month(final Integer month){
			expiryDate.setMonth(month);
			return this;
		}
	}
}
