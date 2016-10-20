/*
 * Copyright (c) 2014 Optimal Payments
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.paysafe.customervault;

import com.google.gson.annotations.Expose;
import java.util.ArrayList;

import com.paysafe.common.DateOfBirth;
import com.paysafe.common.Error;
import com.paysafe.common.Gender;
import com.paysafe.common.Id;
import com.paysafe.common.Locale;
import com.paysafe.common.impl.BaseBuilder;
import com.paysafe.common.impl.BaseDomainObject;

// TODO: Auto-generated Javadoc
/**
 * The Class Profile.
 * @author manisha.rani  
 * @since
 * 25-02-2016. 
 */

public class Profile implements BaseDomainObject {

  /** The id. */
  private Id<Profile> id;
  
  /** The status. */
  private Status status;
  
  /** The merchant customer id. */
  @Expose
  private String merchantCustomerId;
  
  /** The locale. */
  @Expose
  private Locale locale;
  
  /** The first name. */
  @Expose
  private String firstName;
  
  /** The middle name. */
  @Expose
  private String middleName;
  
  /** The last name. */
  @Expose
  private String lastName;
  
  /** The date of birth. */
  @Expose
  private DateOfBirth dateOfBirth;
  
  /** The ip. */
  @Expose
  private String ip;
  
  /** The gender. */
  @Expose
  private Gender gender;
  
  /** The nationality. */
  @Expose
  private String nationality;
  
  /** The email. */
  @Expose
  private String email;
  
  /** The phone. */
  @Expose
  private String phone;
  
  /** The cell phone. */
  @Expose
  private String cellPhone;
  
  /** The payment token. */
  private String paymentToken;
  
  /** The addresses. */
  private ArrayList<Address> addresses;
  
  /** The cards. */
  private ArrayList<Card> cards;
  
  /** The card. */
  @Expose
  private Card card;
  
  /** The ach bank accounts. */
  private ArrayList<ACHBankAccounts> achBankAccounts;
  
  /** The eft bank accounts. */
  private ArrayList<EFTBankAccounts> eftBankAccounts;
  
  /** The bacs bank accounts. */
  private ArrayList <BACSBankAccounts> bacsBankAccounts;
  
  /** The sepa bank accounts. */
  private ArrayList <SEPABankAccounts> sepaBankAccounts;
  
  /** The error. */
  private Error error;

  /**
   * Gets the id.
   *
   * @return the id
   */
  public final Id<Profile> getId() {
    return id;
  }

  /**
   * Sets the id.
   *
   * @param id the new id
   */
  public final void setId(final Id<Profile> id) {
    this.id = id;
  }

  /**
   * Gets the status.
   *
   * @return the status
   */
  public final Status getStatus() {
    return status;
  }

  /**
   * Sets the status.
   *
   * @param status the new status
   */
  public final void setStatus(final Status status) {
    this.status = status;
  }

  /**
   * Gets the merchant customer id.
   *
   * @return the merchant customer id
   */
  public final String getMerchantCustomerId() {
    return merchantCustomerId;
  }

  /**
   * Sets the merchant customer id.
   *
   * @param merchantCustomerId the new merchant customer id
   */
  public final void setMerchantCustomerId(final String merchantCustomerId) {
    this.merchantCustomerId = merchantCustomerId;
  }

  /**
   * Gets the locale.
   *
   * @return the locale
   */
  public final Locale getLocale() {
    return locale;
  }

  /**
   * Sets the locale.
   *
   * @param locale the new locale
   */
  public final void setLocale(final Locale locale) {
    this.locale = locale;
  }

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
   * Gets the middle name.
   *
   * @return the middle name
   */
  public final String getMiddleName() {
    return middleName;
  }

  /**
   * Sets the middle name.
   *
   * @param middleName the new middle name
   */
  public final void setMiddleName(final String middleName) {
    this.middleName = middleName;
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
   * Gets the date of birth.
   *
   * @return the date of birth
   */
  public final DateOfBirth getDateOfBirth() {
    return dateOfBirth;
  }

  /**
   * Sets the date of birth.
   *
   * @param dateOfBirth the new date of birth
   */
  public final void setDateOfBirth(final DateOfBirth dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  /**
   * Gets the ip.
   *
   * @return the ip
   */
  public final String getIp() {
    return ip;
  }

  /**
   * Sets the ip.
   *
   * @param ip the new ip
   */
  public final void setIp(final String ip) {
    this.ip = ip;
  }

  /**
   * Gets the gender.
   *
   * @return the gender
   */
  public final Gender getGender() {
    return gender;
  }

  /**
   * Sets the gender.
   *
   * @param gender the new gender
   */
  public final void setGender(final Gender gender) {
    this.gender = gender;
  }

  /**
   * Gets the nationality.
   *
   * @return the nationality
   */
  public final String getNationality() {
    return nationality;
  }

  /**
   * Sets the nationality.
   *
   * @param nationality the new nationality
   */
  public final void setNationality(final String nationality) {
    this.nationality = nationality;
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
   * Gets the phone.
   *
   * @return the phone
   */
  public final String getPhone() {
    return phone;
  }

  /**
   * Sets the phone.
   *
   * @param phone the new phone
   */
  public final void setPhone(final String phone) {
    this.phone = phone;
  }

  /**
   * Gets the cell phone.
   *
   * @return the cell phone
   */
  public final String getCellPhone() {
    return cellPhone;
  }

  /**
   * Sets the cell phone.
   *
   * @param cellPhone the new cell phone
   */
  public final void setCellPhone(final String cellPhone) {
    this.cellPhone = cellPhone;
  }

  /**
   * Gets the payment token.
   *
   * @return the payment token
   */
  public final String getPaymentToken() {
    return paymentToken;
  }

  /**
   * Sets the payment token.
   *
   * @param paymentToken the new payment token
   */
  public final void setPaymentToken(final String paymentToken) {
    this.paymentToken = paymentToken;
  }

  /**
   * Gets the addresses.
   *
   * @return the addresses
   */
  public final ArrayList<Address> getAddresses() {
    return addresses;
  }

  /**
   * Sets the addresses.
   *
   * @param addresses the new addresses
   */
  public final void setAddresses(final ArrayList<Address> addresses) {
    this.addresses = addresses;
  }

  /**
   * Gets the cards.
   *
   * @return the cards
   */
  public final ArrayList<Card> getCards() {
    return cards;
  }

  /**
   * Sets the cards.
   *
   * @param cards the new cards
   */
  public final void setCards(final ArrayList<Card> cards) {
    this.cards = cards;
  }

  /**
   * Gets the card.
   *
   * @return the card
   */
  public final Card getCard() {
    return card;
  }

  /**
   * Sets the card.
   *
   * @param card the new card
   */
  public final void setCard(final Card card) {
    this.card = card;
  }
  
  /* (non-Javadoc)
   * @see com.optimalpayments.common.impl.BaseDomainObject#getError()
   */
  @Override
  public final Error getError() {
    return error;
  }

  /**
   * Sets the error.
   *
   * @param error the new error
   */
  public final void setError(final Error error) {
    this.error = error;
  }
  
  /**
   * Gets the ach bank account.
   *
   * @return the ach bank account
   */
  public ArrayList<ACHBankAccounts> getAchBankAccount() {
		return achBankAccounts;
  }

	/**
	 * Sets the ach bank account.
	 *
	 * @param achBankAccounts the new ach bank account
	 */
	public void setAchBankAccount(ArrayList<ACHBankAccounts> achBankAccounts) {
		this.achBankAccounts = achBankAccounts;
  }
  
  /**
   * Gets the eft bank accounts.
   *
   * @return the eft bank accounts
   */
  public ArrayList<EFTBankAccounts> getEftBankAccounts() {
		return eftBankAccounts;
  }

  /**
   * Sets the eft bank accounts.
   *
   * @param eftBankAccounts the new eft bank accounts
   */
  public void setEftBankAccounts(ArrayList<EFTBankAccounts> eftBankAccounts) {
		this.eftBankAccounts = eftBankAccounts;
  }

  /**
   * Gets the bacs bank accounts.
   *
   * @return the bacs bank accounts
   */
  public ArrayList<BACSBankAccounts> getBacsBankAccounts() {
		return bacsBankAccounts;
  }

  /**
   * Sets the bacs bank accounts.
   *
   * @param bacsBankAccounts the new bacs bank accounts
   */
  public void setBacsBankAccounts(ArrayList<BACSBankAccounts> bacsBankAccounts) {
		this.bacsBankAccounts = bacsBankAccounts;
  }

  /**
   * Gets the sepa bank accounts.
   *
   * @return the sepa bank accounts
   */
  public ArrayList<SEPABankAccounts> getSepaBankAccounts() {
		return sepaBankAccounts;
  }

  /**
   * Sets the sepa bank accounts.
   *
   * @param sepaBankAccounts the new sepa bank accounts
   */
  public void setSepaBankAccounts(ArrayList<SEPABankAccounts> sepaBankAccounts) {
		this.sepaBankAccounts = sepaBankAccounts;
  }


  /**
   * Get a profile builder.
   *
   * @return ProfileBuilder
   */
  public static final ProfileBuilder builder() {
    return new ProfileBuilder();
  }

  /**
   * The builder class for Profile.
   */
  public static class ProfileBuilder extends BaseBuilder<Profile> {

    /** The profile. */
    private final Profile profile = new Profile();
    
    /** The date of birth builder. */
    private DateOfBirth.DateOfBirthBuilder<ProfileBuilder> dateOfBirthBuilder;
    
    /** The card builder single use. */
    private Card.CardBuilderSingleUse<ProfileBuilder> cardBuilderSingleUse;
    /**
     * Build this Profile object.
     *
     * @return Profile
     */
    @Override
    public final Profile build() {
      if (null != dateOfBirthBuilder) {
        profile.setDateOfBirth(dateOfBirthBuilder.build());
      }
      if (null != cardBuilderSingleUse) {
        profile.setCard((cardBuilderSingleUse.build()));
      }
      
      return profile;
    }

    /**
     * Set the id property.
     *
     * @param id the id
     * @return ProfileBuilder
     */
    public final ProfileBuilder id(final Id<Profile> id) {
      profile.setId(id);
      return this;
    }

    /**
     * Set the merchantCustomerId property.
     *
     * @param merchantCustomerId the merchant customer id
     * @return ProfileBuilder
     */
    public final ProfileBuilder merchantCustomerId(final String merchantCustomerId) {
      profile.setMerchantCustomerId(merchantCustomerId);
      return this;
    }

    /**
     * Set the locale property.
     *
     * @param locale the locale
     * @return ProfileBuilder
     */
    public final ProfileBuilder locale(final Locale locale) {
      profile.setLocale(locale);
      return this;
    }

    /**
     * Set the firstName property.
     *
     * @param firstName the first name
     * @return ProfileBuilder
     */
    public final ProfileBuilder firstName(final String firstName) {
      profile.setFirstName(firstName);
      return this;
    }

    /**
     * Set the middleName property.
     *
     * @param middleName the middle name
     * @return ProfileBuilder
     */
    public final ProfileBuilder middleName(final String middleName) {
      profile.setMiddleName(middleName);
      return this;
    }

    /**
     * Set the lastName property.
     *
     * @param lastName the last name
     * @return ProfileBuilder
     */
    public final ProfileBuilder lastName(final String lastName) {
      profile.setLastName(lastName);
      return this;
    }

    /**
     * Build a dateOfBirth within this card.
     *
     * @return DateOfBirth.DateOfBirthBuilder< ProfileBuilder >
     */
    public final DateOfBirth.DateOfBirthBuilder<ProfileBuilder> dateOfBirth() {
      if (null == dateOfBirthBuilder) {
        dateOfBirthBuilder = new DateOfBirth.DateOfBirthBuilder<ProfileBuilder>(this);
      }
      return dateOfBirthBuilder;
    }

    /**
     * Build a card within this profile.
     *
     * @return com.optimalpayments.cardpayments.Card.CardBuilder<ProfileBuilder>
     */
    public final Card.CardBuilderSingleUse<ProfileBuilder> card() {
      if (null == cardBuilderSingleUse) {
        cardBuilderSingleUse = new Card.CardBuilderSingleUse<ProfileBuilder>(this);
      }
      return cardBuilderSingleUse;
    }
    
    /**
     * Set the ip property.
     *
     * @param ip the ip
     * @return ProfileBuilder
     */
    public final ProfileBuilder ip(final String ip) {
      profile.setIp(ip);
      return this;
    }

    /**
     * Set the gender property.
     *
     * @param gender the gender
     * @return ProfileBuilder
     */
    public final ProfileBuilder gender(final Gender gender) {
      profile.setGender(gender);
      return this;
    }

    /**
     * Set the nationality property.
     *
     * @param nationality the nationality
     * @return ProfileBuilder
     */
    public final ProfileBuilder nationality(final String nationality) {
      profile.setNationality(nationality);
      return this;
    }

    /**
     * Set the email property.
     *
     * @param email the email
     * @return ProfileBuilder
     */
    public final ProfileBuilder email(final String email) {
      profile.setEmail(email);
      return this;
    }

    /**
     * Set the phone property.
     *
     * @param phone the phone
     * @return ProfileBuilder
     */
    public final ProfileBuilder phone(final String phone) {
      profile.setPhone(phone);
      return this;
    }

    /**
     * Set the cellPhone property.
     *
     * @param cellPhone the cell phone
     * @return ProfileBuilder
     */
    public final ProfileBuilder cellPhone(final String cellPhone) {
      profile.setCellPhone(cellPhone);
      return this;
    }
    
    /**
     * Set the achBankAccounts property.
     *
     * @param achBankAccount the ach bank account
     * @return ProfileBuilder
     */
    public final ProfileBuilder achBankAccount(final ArrayList<ACHBankAccounts> achBankAccount) {
        profile.setAchBankAccount(achBankAccount);
        return this;
      }
    
    
    /**
     * Set the eftBankAccounts property.
     *
     * @param eftBankAccounts the eft bank accounts
     * @return ProfileBuilder
     */
    public final ProfileBuilder eftBankAccounts(final ArrayList<EFTBankAccounts> eftBankAccounts) {
        profile.setEftBankAccounts(eftBankAccounts);
        return this;
      }
    
    /**
     * Set the bacsBankAccounts property.
     *
     * @param bacsBankAccounts the bacs bank accounts
     * @return ProfileBuilder
     */
    public final ProfileBuilder bacsBankAccounts(final ArrayList<BACSBankAccounts> bacsBankAccounts) {
        profile.setBacsBankAccounts(bacsBankAccounts);
        return this;
      }
    
    /**
     * Set the sepaBankAccounts property.
     *
     * @param sepaBankAccounts the sepa bank accounts
     * @return ProfileBuilder
     */
    public final ProfileBuilder sepaBankAccounts(final ArrayList<SEPABankAccounts> sepaBankAccounts) {
        profile.setSepaBankAccounts(sepaBankAccounts);
        return this;
      }
    
  }
}
