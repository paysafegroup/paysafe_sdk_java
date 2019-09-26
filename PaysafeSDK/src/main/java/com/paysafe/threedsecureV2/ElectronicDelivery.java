package com.paysafe.threedsecureV2;

import com.google.gson.annotations.Expose;
import com.paysafe.common.impl.DomainObject;
import com.paysafe.common.impl.GenericBuilder;
import com.paysafe.common.impl.NestedBuilder;

/**
 * The Class ElectronicDelivery.
 */
public class ElectronicDelivery implements DomainObject {

	/** the email address */
	@Expose
	private String email;
	/** Marks if there is an electronic delivery for the product */
	@Expose
	private Boolean isElectronicDelivery;

	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 *            
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets the isElectronicDelivery.
	 *
	 * @return the isElectronicDelivery
	 */
	public Boolean getIsElectronicDelivery() {
		return isElectronicDelivery;
	}

	/**
	 * Sets the isElectronicDelivery.
	 *
	 * @param isElectronicDelivery the new is Electronic Delivery
	 *            
	 */
	public void setIsElectronicDelivery(Boolean isElectronicDelivery) {
		this.isElectronicDelivery = isElectronicDelivery;
	}

	/**
	 * The builder class for ElectronicDelivery.
	 */
	public static class ElectronicDeliveryBuilder<BLDRT extends GenericBuilder>
			extends NestedBuilder<ElectronicDelivery, BLDRT> {

		private final ElectronicDelivery electronicDelivery = new ElectronicDelivery();

		public ElectronicDeliveryBuilder(final BLDRT parent) {
			super(parent);
		}

		@Override
		public ElectronicDelivery build() {
			return electronicDelivery;
		}
		/**
		 * Set the email property.
		 *
		 * @param email the email
		 *            
		 * @return ElectronicDeliveryBuilder
		 */
		public final ElectronicDeliveryBuilder<BLDRT> email(final String email){
			electronicDelivery.setEmail(email);
			return this;
		}

		/**
		 * Set the isElectronicDelivery property.
		 *
		 * @param isElectronicDelivery the isElectronicDelivery
		 *            
		 * @return ElectronicDeliveryBuilder
		 */
		public final ElectronicDeliveryBuilder<BLDRT> isElectronicDelivery(final Boolean isElectronicDelivery) {
			electronicDelivery.setIsElectronicDelivery(isElectronicDelivery);
			return this;
		}
	}
}