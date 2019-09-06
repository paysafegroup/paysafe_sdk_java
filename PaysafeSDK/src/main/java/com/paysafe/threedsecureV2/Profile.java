package com.paysafe.threedsecureV2;

import java.util.ArrayList;
import com.google.gson.annotations.Expose;
import com.paysafe.common.DateOfBirth;
import com.paysafe.common.Gender;
import com.paysafe.common.Locale;
import com.paysafe.common.impl.DomainObject;
import com.paysafe.common.impl.GenericBuilder;
import com.paysafe.common.impl.NestedBuilder;

/**The class Profile*/
public class Profile implements DomainObject {

	  /** The first name. */
	  @Expose
	  private String firstName;
	  
	  /** The last name. */
	  @Expose
	  private String lastName;
	  
	  /** The email. */
	  @Expose
	  private String email;
	  
	  /** The title. */
	    @Expose
	    private String title;

	    /** The identityDocuments. */
	    @Expose
	    private ArrayList<IdentityDocuments> identityDocuments;
	    /** The kycStatus. */
	    @Expose
	    private KycStatus kycStatus;
	    /** The dateOfBirth. */
	    @Expose
	    private DateOfBirth dateOfBirth;
	    /** The gender. */
	    @Expose
	    private Gender gender;
	    /** The phone. */
	    @Expose
	    private String phone;
	    /** The cellphone. */
	    @Expose
	    private String cellphone;
	    /** The locale. */
	    @Expose
	    private Locale locale;

	  
	/**
	   * Gets the first name.
	   *
	   * @return the first name
	   */
	  public final String getFirstName() {
	    return firstName;
	  }

	  /**
	   * Sets the first name.
	   *
	   * @param firstName the new first name
	   */
	  public final void setFirstName(final String firstName) {
	    this.firstName = firstName;
	  }

	  /**
	   * Gets the last name.
	   *
	   * @return the last name
	   */
	  public final String getLastName() {
	    return lastName;
	  }

	  /**
	   * Sets the last name.
	   *
	   * @param lastName the new last name
	   */
	  public final void setLastName(final String lastName) {
	    this.lastName = lastName;
	  }

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
	   */
	  public final void setEmail(final String email) {
	    this.email = email;
	  }
	  /**
	   * Gets the title.
	   *
	   * @return the title
	   */
	  public String getTitle() {
			return title;
		}
	  /**
	   * Sets the title.
	   *
	   * @param title the new title
	   */
		public void setTitle(String title) {
			this.title = title;
		}
		/**
		   * Gets the dateOfBirth.
		   *
		   * @return the dateOfBirth
		   */
		public DateOfBirth getDateOfBirth() {
			return dateOfBirth;
		}
		 /**
		   * Sets the dateOfBirth.
		   *
		   * @param dateOfBirth the new dateOfBirth
		   */
		public void setDateOfBirth(DateOfBirth dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
		/**
		   * Gets the gender.
		   *
		   * @return the gender
		   */
		public Gender getGender() {
			return gender;
		}
		 /**
		   * Sets the gender.
		   *
		   * @param gender the new gender
		   */
		public void setGender(Gender gender) {
			this.gender = gender;
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
		   */
		public void setCellphone(String cellphone) {
			this.cellphone = cellphone;
		}
		/**
		   * Gets the locale.
		   *
		   * @return the locale
		   */
		public Locale getLocale() {
			return locale;
		}
		 /**
		   * Sets the locale.
		   *
		   * @param locale the new locale
		   */
		public void setLocale(Locale locale) {
			this.locale = locale;
		}

		/**
		   * Gets the identityDocuments.
		   *
		   * @return the identityDocuments
		   */
		public ArrayList<IdentityDocuments> getIdentityDocuments() {
			return identityDocuments;
		}
		 /**
		   * Sets the identityDocuments.
		   *
		   * @param identityDocuments the new identityDocuments
		   */
		public void setIdentityDocuments(ArrayList<IdentityDocuments> identityDocuments) {
			this.identityDocuments = identityDocuments;
		}
		/**
		   * Gets the kycStatus.
		   *
		   * @return the kycStatus
		   */
		public KycStatus getKycStatus() {
			return kycStatus;
		}
		 /**
		   * Sets the kycStatus.
		   *
		   * @param kycStatus the new kycStatus
		   */
		public void setKycStatus(KycStatus kycStatus) {
			this.kycStatus = kycStatus;
		}

	  /**
	   * The sub-builder class for Profile.
	   *
	   * @param <BLDRT> the parent builder
	   */
	  public static class ProfileBuilder<BLDRT extends GenericBuilder> extends
	          NestedBuilder<Profile, BLDRT> {

	    /** The profile. */
	    private final Profile profile = new Profile();

	    /**
	     * Instantiates a new profile builder.
	     *
	     * @param parent the parent
	     */
	    public ProfileBuilder(final BLDRT parent) {
	      super(parent);
	    }
	    
	    /**
	     * Instantiates a new profile builder.
	     *
	     * @param parent the parent
	     * @param p the p
	     */
	    public ProfileBuilder(final BLDRT parent, com.paysafe.customervault.Profile p) {
	      super(parent);
	      profile.setEmail(p.getEmail());
	      profile.setFirstName(p.getFirstName());
	      profile.setLastName(p.getLastName());
	    }

	    /**
	     * Build this CardExpiry object.
	     *
	     * @return CardExpiry
	     */
	    @Override
	    public final Profile build() {
	      return profile;
	    }

	    /**
	     * Set the firstName property.
	     *
	     * @param firstName the first name
	     * @return ProfileBuilder
	     */
	    public final ProfileBuilder<BLDRT> firstName(final String firstName) {
	      profile.setFirstName(firstName);
	      return this;
	    }

	    /**
	     * Set the lastName property.
	     *
	     * @param lastName the last name
	     * @return ProfileBuilder
	     */
	    public final ProfileBuilder<BLDRT> lastName(final String lastName) {
	      profile.setLastName(lastName);
	      return this;
	    }

	    /**
	     * Set the email property.
	     *
	     * @param email the email
	     * @return ProfileBuilder
	     */
	    public final ProfileBuilder<BLDRT> email(final String email) {
	      profile.setEmail(email);
	      return this;
	    }
	    /**
	     * Set the title property.
	     *
	     * @param title the title
	     * @return ProfileBuilder
	     */
	    public final ProfileBuilder<BLDRT> title(final String title){
	    	profile.setTitle(title);
	    	return this;
	    }
	    /**
	     * Set the identityDocuments property.
	     *
	     * @param identityDocuments the identityDocuments
	     * @return ProfileBuilder
	     */
	    public final ProfileBuilder<BLDRT> identityDocuments(final ArrayList<IdentityDocuments> identityDocuments){
	    	profile.setIdentityDocuments(identityDocuments);
	    	return this;
	    }
	    /**
	     * Set the kycStatus property.
	     *
	     * @param kycStatus the kycStatus
	     * @return ProfileBuilder
	     */
	    public final ProfileBuilder<BLDRT> kycStatus(final KycStatus kycStatus){
	    	profile.setKycStatus(kycStatus);
	    	return this;
	    	
	    }
	    /**
	     * Set the dateOfBirth property.
	     *
	     * @param dateOfBirth the dateOfBirth
	     * @return ProfileBuilder
	     */
	    public final ProfileBuilder<BLDRT> dateOfBirth(final DateOfBirth dateOfBirth){
	    	profile.setDateOfBirth(dateOfBirth);
	    	return this;
	    }
	    /**
	     * Set the gender property.
	     *
	     * @param gender the gender
	     * @return ProfileBuilder
	     */
	    public final ProfileBuilder<BLDRT> gender(final Gender gender){
	    	profile.setGender(gender);
	    	return this;
	    }
	    /**
	     * Set the phone property.
	     *
	     * @param phone the phone
	     * @return ProfileBuilder
	     */
	    public final ProfileBuilder<BLDRT> phone(final String phone){
	    	profile.setPhone(phone);
	    	return this;
	    }
	    /**
	     * Set the cellphone property.
	     *
	     * @param cellphone the cellphone
	     * @return ProfileBuilder
	     */
	    public final ProfileBuilder<BLDRT> cellphone(final String cellphone){
	    	profile.setCellphone(cellphone);
	    	return this;
	    }
	    /**
	     * Set the locale property.
	     *
	     * @param locale the locale
	     * @return ProfileBuilder
	     */
	    public final ProfileBuilder<BLDRT>locale(final Locale locale){
	    	profile.setLocale(locale);
	    	return this;
	    }
	    
	  }
	}
