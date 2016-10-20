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
package com.paysafe.common;

import java.util.ArrayList;

import com.paysafe.common.impl.DomainObject;

// TODO: Auto-generated Javadoc
/**
 * The Class Error.
 */
public class Error implements DomainObject {

  /** The code. */
  private String code;
  
  /** The message. */
  private String message;
  
  /** The details. */
  private ArrayList<String> details;
  
  /** The field errors. */
  private ArrayList<FieldError> fieldErrors;
  
  /** The links. */
  private ArrayList<Link> links;

  /**
   * Gets the code.
   *
   * @return the code
   */
  public final String getCode() {
    return code;
  }

  /**
   * Sets the code.
   *
   * @param code the new code
   */
  public final void setCode(final String code) {
    this.code = code;
  }

  /**
   * Gets the message.
   *
   * @return the message
   */
  public final String getMessage() {
    return message;
  }

  /**
   * Sets the message.
   *
   * @param message the new message
   */
  public final void setMessage(final String message) {
    this.message = message;
  }

  /**
   * Gets the details.
   *
   * @return the details
   */
  public final ArrayList<String> getDetails() {
    return details;
  }

  /**
   * Sets the details.
   *
   * @param details the new details
   */
  public final void setDetails(final ArrayList<String> details) {
    this.details = details;
  }

  /**
   * Gets the field errors.
   *
   * @return the field errors
   * @throws PaysafeException the optimal exception
   */
  public final ArrayList<FieldError> getFieldErrors() throws PaysafeException {
    return fieldErrors;
  }

  /**
   * Sets the field errors.
   *
   * @param fieldErrors the new field errors
   */
  public final void setFieldErrors(final ArrayList<FieldError> fieldErrors) {
    this.fieldErrors = fieldErrors;
  }

  /**
   * Gets the links.
   *
   * @return the links
   */
  public final ArrayList<Link> getLinks() {
    return links;
  }

  /**
   * Sets the links.
   *
   * @param links the new links
   */
  public final void setLinks(final ArrayList<Link> links) {
    this.links = links;
  }

}
