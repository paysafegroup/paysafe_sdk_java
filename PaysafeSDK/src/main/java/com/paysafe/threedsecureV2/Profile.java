package com.paysafe.threedsecureV2;

import com.google.gson.annotations.Expose;
import com.paysafe.common.impl.DomainObject;
import com.paysafe.common.impl.GenericBuilder;
import com.paysafe.common.impl.NestedBuilder;

/** The class Profile */
public class Profile implements DomainObject {

	/** The cellphone. */
	@Expose
	private String cellphone;

	/** The email. */
	@Expose
	private String email;

	/** The Phone */
	@Expose
	private String phone;

	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public final String getEmail() {
		return email;
	}

	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 *            
	 */
	public final void setEmail(final String email) {
		this.email = email;
	}

	/**
	 * Gets the phone.
	 *
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * Sets the phone.
	 *
	 * @param phone the new phone
	 *            
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * Gets the cellphone.
	 *
	 * @return the cellphone
	 */
	public String getCellphone() {
		return cellphone;
	}

	/**
	 * Sets the cellphone.
	 *
	 * @param cellphone the new cellphone
	 *            
	 */
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	/**
	 * The sub-builder class for Profile.
	 *
	 * @param <BLDRT> the parent builder
	 *            
	 */
	public static class ProfileBuilder<BLDRT extends GenericBuilder> extends NestedBuilder<Profile, BLDRT> {

		/** The profile. */
		private final Profile profile = new Profile();

		/**
		 * Instantiates a new profile builder.
		 *
		 * @param parent the parent
		 *            
		 */
		public ProfileBuilder(final BLDRT parent) {
			super(parent);
		}

		/**
		 * Build this profile object.
		 *
		 * @return profile
		 */
		@Override
		public final Profile build() {
			return profile;
		}

		/**
		 * Set the email property.
		 *
		 * @param email the email
		 *            
		 * @return ProfileBuilder
		 */
		public final ProfileBuilder<BLDRT> email(final String email) {
			profile.setEmail(email);
			return this;
		}

		/**
		 * Set the phone property.
		 *
		 * @param phone the phone
		 *            
		 * @return ProfileBuilder
		 */
		public final ProfileBuilder<BLDRT> phone(final String phone) {
			profile.setPhone(phone);
			return this;
		}

		/**
		 * Set the cellphone property.
		 *
		 * @param cellphone the cellphone
		 *            
		 * @return ProfileBuilder
		 */
		public final ProfileBuilder<BLDRT> cellphone(final String cellphone) {
			profile.setCellphone(cellphone);
			return this;
		}
	}
}
