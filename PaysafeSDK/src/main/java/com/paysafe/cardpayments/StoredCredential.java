package com.paysafe.cardpayments;

import com.google.gson.annotations.Expose;
import com.paysafe.common.impl.DomainObject;
import com.paysafe.common.impl.GenericBuilder;
import com.paysafe.common.impl.NestedBuilder;

public class StoredCredential implements DomainObject{

	@Expose
	private Type type;
	
	@Expose
	private Occurrence occurrence;

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Occurrence getOccurrence() {
		return occurrence;
	}

	public void setOccurrence(Occurrence occurrence) {
		this.occurrence = occurrence;
	}

	public static class StoredCredentialBuilder<BLDRT extends GenericBuilder>extends
	NestedBuilder<StoredCredential,BLDRT>{

		public StoredCredentialBuilder(final BLDRT parent) {
			super(parent);
			// TODO Auto-generated constructor stub
		}
		private final StoredCredential storedCredential=new StoredCredential();

		@Override
		public StoredCredential build() {
			// TODO Auto-generated method stub
			return storedCredential ;
		}
		public final StoredCredentialBuilder<BLDRT>type(final Type type){
		storedCredential.setType(type);
		return this;
		}
		public final StoredCredentialBuilder<BLDRT>occurrence(final Occurrence occurrence){
			storedCredential.setOccurrence(occurrence);
			return this;
			
		}
		
	}
}
