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
package com.paysafe.cardpayments;

import com.google.gson.annotations.Expose;
import com.paysafe.common.impl.DomainObject;
import com.paysafe.common.impl.GenericBuilder;
import com.paysafe.common.impl.NestedBuilder;

// TODO: Auto-generated Javadoc

/**
 * The Class MerchantDescriptor.
 */
public class MerchantDescriptor implements DomainObject {

  /** The dynamic descriptor. */
  @Expose
  private String dynamicDescriptor;

  /** The phone. */
  @Expose
  private String phone;

  /** Country of the retailer. */
  @Expose
  private String country;

  /** City of the retailer. */
  @Expose
  private String city;

  /**
   * Gets the dynamic descriptor.
   *
   * @return the dynamic descriptor
   */
  public final String getDynamicDescriptor() {
    return dynamicDescriptor;
  }

  /**
   * Sets the dynamic descriptor.
   *
   * @param dynamicDescriptor the new dynamic descriptor
   */
  public final void setDynamicDescriptor(final String dynamicDescriptor) {
    this.dynamicDescriptor = dynamicDescriptor;
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
   * Gets retailer's county.
   *
   * @return retailer's county
   */
  public String getCountry() {
    return country;
  }

  /**
   * Sets the county.
   *
   * @param country the retailer's county
   */
  public void setCountry(String country) {
    this.country = country;
  }

  /**
   * Gets retailer's city.
   *
   * @return retailer's city
   */
  public String getCity() {
    return city;
  }

  /**
   * Sets the city.
   *
   * @param city the retailer's city
   */
  public void setCity(String city) {
    this.city = city;
  }

  /**
   * The sub-builder class for MerchantDescriptor.
   *
   * @param <BLDRT> the parent builder
   */
  public static class MerchantDescriptorBuilder<
    BLDRT extends GenericBuilder> extends
    NestedBuilder<MerchantDescriptor, BLDRT> {

    /** The merchant descriptor. */
    private final MerchantDescriptor merchantDescriptor = new MerchantDescriptor();

    /**
     * Instantiates a new merchant descriptor builder.
     *
     * @param parent the parent
     */
    public MerchantDescriptorBuilder(final BLDRT parent) {
      super(parent);
    }

    /**
     * Build this MerchantDescriptor object.
     *
     * @return MerchantDescriptor
     */
    @Override
    public final MerchantDescriptor build() {
      return merchantDescriptor;
    }

    /**
     * Set the dynamicDescriptor property.
     *
     * @param dynamicDescriptor the dynamic descriptor
     * @return MerchantDescriptorBuilder<BLDRT>
     */
    public final MerchantDescriptorBuilder<BLDRT> dynamicDescriptor(
      final String dynamicDescriptor) {
      merchantDescriptor.setDynamicDescriptor(dynamicDescriptor);
      return this;
    }

    /**
     * Set the phone property.
     *
     * @param phone the phone
     * @return MerchantDescriptorBuilder<BLDRT>
     */
    public final MerchantDescriptorBuilder<BLDRT> phone(final String phone) {
      merchantDescriptor.setPhone(phone);
      return this;
    }

    /**
     * Set the city property.
     *
     * @param city the city descriptor
     * @return MerchantDescriptorBuilder<BLDRT>
     */
    public final MerchantDescriptorBuilder<BLDRT> city(final String city) {
      merchantDescriptor.setCity(city);
      return this;
    }

    /**
     * Set the country property.
     *
     * @param country the country
     * @return MerchantDescriptorBuilder<BLDRT>
     */
    public final MerchantDescriptorBuilder<BLDRT> county(final String country) {
      merchantDescriptor.setCountry(country);
      return this;
    }

  }

}
