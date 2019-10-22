package com.paysafe.cardpayments;

import com.google.gson.annotations.Expose;
import com.paysafe.common.impl.DomainObject;
import com.paysafe.common.impl.GenericBuilder;
import com.paysafe.common.impl.NestedBuilder;

public class StoredCredential implements DomainObject{
	 /** The type. */
	@Expose
	private Type type;
	
	/** The occurrence. */
	@Expose
	private Occurrence occurrence;

	/**
	   * Gets the type.
	   *
	   * @return the type
	   */
	public Type getType() {
		return type;
	}

	/**
	   * Sets the type.
	   *
	   * @param type the new type
	   */
	public void setType(Type type) {
		this.type = type;
	}

	/**
	   * Gets the occurrence.
	   *
	   * @return the occurrence
	   */
	public Occurrence getOccurrence() {
		return occurrence;
	}

	/**
	   * Sets the occurrence.
	   *
	   * @param occurrence the new occurrence
	   */
	public void setOccurrence(Occurrence occurrence) {
		this.occurrence = occurrence;
	}

	/**
	   * The builder class for StoredCredential.
	   */
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
		
		/**
	     * Set the type property.
	     *
	     * @param type the type
	     * @return StoredCredentialBuilder
	     */
		public final StoredCredentialBuilder<BLDRT>type(final Type type){
		storedCredential.setType(type);
		return this;
		}
		
		/**
	     * Set the occurrence property.
	     *
	     * @param occurrence the occurrence
	     * @return StoredCredentialBuilder
	     */
		public final StoredCredentialBuilder<BLDRT>occurrence(final Occurrence occurrence){
			storedCredential.setOccurrence(occurrence);
			return this;
			
		}
	}
}
