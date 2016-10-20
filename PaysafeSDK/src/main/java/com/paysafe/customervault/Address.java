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
import com.paysafe.common.AddressDetails;
import com.paysafe.common.Error;
import com.paysafe.common.Id;
import com.paysafe.common.impl.AddressContainer;
import com.paysafe.common.impl.BaseBuilder;
import com.paysafe.common.impl.BaseDomainObject;

// TODO: Auto-generated Javadoc
/**
 * The Class Address.
 * used by create bank account
 * @author manisha.rani
 * @since   25-02-2016. 
 */
 
public class Address extends AddressContainer implements BaseDomainObject {

  /** The id. */
  private Id<Address> id;
  
  /** The nick name. */
  @Expose
  private String nickName;
  
  /** The status. */
  @Expose
  private Status status;
  
  /** The recipient name. */
  @Expose
  private String recipientName;
  
  /** The default shipping address indicator. */
  private Boolean defaultShippingAddressIndicator;
  
  /** The error. */
  private Error error;
  
  /** The profile id. */
  @Expose
  private Id<Profile> profileId;

  /**
   * Gets the id.
   *
   * @return the id
   */
  public final Id<Address> getId() {
    return id;
  }

  /**
   * Sets the id.
   *
   * @param id the new id
   */
  public final void setId(final Id<Address> id) {
    this.id = id;
  }

  /**
   * Gets the nick name.
   *
   * @return the nick name
   */
  public final String getNickName() {
    return nickName;
  }

  /**
   * Sets the nick name.
   *
   * @param nickName the new nick name
   */
  public final void setNickName(final String nickName) {
    this.nickName = nickName;
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
   * Gets the recipient name.
   *
   * @return the recipient name
   */
  public final String getRecipientName() {
    return recipientName;
  }

  /**
   * Sets the recipient name.
   *
   * @param recipientName the new recipient name
   */
  public final void setRecipientName(final String recipientName) {
    this.recipientName = recipientName;
  }

  /**
   * Gets the default shipping address indicator.
   *
   * @return the default shipping address indicator
   */
  public final Boolean getDefaultShippingAddressIndicator() {
    return defaultShippingAddressIndicator;
  }

  /**
   * Sets the default shipping address indicator.
   *
   * @param defaultShippingAddressIndicator the new default shipping address indicator
   */
  public final void setDefaultShippingAddressIndicator(
          final Boolean defaultShippingAddressIndicator) {
    this.defaultShippingAddressIndicator = defaultShippingAddressIndicator;
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
   * Gets the profile id.
   *
   * @return the profile id
   */
  public final Id<Profile> getProfileId() {
    return profileId;
  }

  /**
   * Sets the profile id.
   *
   * @param profileId the new profile id
   */
  public final void setProfileId(final Id<Profile> profileId) {
    this.profileId = profileId;
  }

  /**
   * Get an address builder.
   *
   * @return AddressBuilder
   */
  public static final AddressBuilder builder() {
    return new AddressBuilder();
  }

  /**
   * The builder class for Address.
   */
  public static class AddressBuilder extends BaseBuilder<Address> {

    /** The address. */
    private final Address address = new Address();
    
    /** The address details. */
    private final AddressDetails addressDetails = new AddressDetails();

    /**
     * Build this Address object.
     *
     * @return address
     */
    @Override
    public final Address build() {
      address.setAddressDetails(addressDetails);
      return address;
    }

    /**
     * Set the id property.
     *
     * @param id the id
     * @return AddressBuilder
     */
    public final AddressBuilder id(final Id<Address> id) {
      address.setId(id);
      return this;
    }

    /**
     * Set the nickName property.
     *
     * @param nickName the nick name
     * @return AddressBuilder
     */
    public final AddressBuilder nickName(final String nickName) {
      address.setNickName(nickName);
      return this;
    }

    /**
     * Set the status property.
     *
     * @param status the status
     * @return AddressBuilder
     */
    public final AddressBuilder status(final Status status) {
      address.setStatus(status);
      return this;
    }

    /**
     * Set the street property.
     *
     * @param street the street
     * @return AddressBuilder
     */
    public final AddressBuilder street(final String street) {
      addressDetails.setStreet(street);
      return this;
    }

    /**
     * Set the street2 property.
     *
     * @param street2 the street2
     * @return AddressBuilder
     */
    public final AddressBuilder street2(final String street2) {
      addressDetails.setStreet2(street2);
      return this;
    }

    /**
     * Set the city property.
     *
     * @param city the city
     * @return AddressBuilder
     */
    public final AddressBuilder city(final String city) {
      addressDetails.setCity(city);
      return this;
    }

    /**
     * Set the country property.
     *
     * @param country the country
     * @return AddressBuilder
     */
    public final AddressBuilder country(final String country) {
      addressDetails.setCountry(country);
      return this;
    }

    /**
     * Set the state property.
     *
     * @param state the state
     * @return AddressBuilder
     */
    public final AddressBuilder state(final String state) {
      addressDetails.setState(state);
      return this;
    }

    /**
     * Set the zip property.
     *
     * @param zip the zip
     * @return AddressBuilder
     */
    public final AddressBuilder zip(final String zip) {
      addressDetails.setZip(zip);
      return this;
    }

    /**
     * Set the recipientName property.
     *
     * @param recipientName the recipient name
     * @return AddressBuilder
     */
    public final AddressBuilder recipientName(final String recipientName) {
      address.setRecipientName(recipientName);
      return this;
    }

    /**
     * Set the phone property.
     *
     * @param phone the phone
     * @return AddressBuilder
     */
    public final AddressBuilder phone(final String phone) {
      addressDetails.setPhone(phone);
      return this;
    }

    /**
     * Set the profileId property.
     *
     * @param profileId the profile id
     * @return AddressBuilder
     */
    public final AddressBuilder profileId(final Id<Profile> profileId) {
      address.setProfileId(profileId);
      return this;
    }
  }
}
