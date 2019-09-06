package com.paysafe.threedsecureV2;

import com.google.gson.annotations.Expose;
import com.paysafe.common.impl.DomainObject;
import com.paysafe.common.impl.GenericBuilder;
import com.paysafe.common.impl.NestedBuilder;

public class IssueDate implements DomainObject {
	
	
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
	
	public static class IssueDateBuilder<BLDRT extends GenericBuilder>extends 
	NestedBuilder<IssueDate, BLDRT>{
		
		public IssueDateBuilder(final BLDRT parent) {
			super(parent);
			// TODO Auto-generated constructor stub
		}

		private final IssueDate issueDate=new IssueDate();

		@Override
		public IssueDate build() {
			// TODO Auto-generated method stub
			return issueDate;
		}
		
		public final IssueDateBuilder<BLDRT> year(final Integer year){
			issueDate.setYear(year);
			return this;
		}
		public final IssueDateBuilder<BLDRT> day(final Integer day){
			issueDate.setDay(day);
			return this;
		}
		public final IssueDateBuilder<BLDRT>month(final Integer month){
			issueDate.setMonth(month);
			return this;
		}
	}

}
