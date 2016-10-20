/*
 * Copyright (c) 2016 Paysafe
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

import com.paysafe.common.impl.BaseDomainObject;

// TODO: Auto-generated Javadoc
/**
 * All internal exceptions extend or implement this type.
 */
public class PaysafeException extends Exception {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

/** The raw response. */
  private final BaseDomainObject rawResponse;
  
  /** The code. */
  private final String code;

  /**
   * Instantiates a new paysafe exception.
   *
   * @param message the message
   */
  public PaysafeException(final String message) {
    this(message, null);
  }

  /**
   * Instantiates a new paysafe exception.
   *
   * @param message the message
   * @param cause the cause
   */
  public PaysafeException(final String message, final Throwable cause) {
    super(message, cause);
    rawResponse = null;
    code = null;
  }

  /**
   * Instantiates a new paysafe exception.
   *
   * @param obj the obj
   * @param cause the cause
   */
  public PaysafeException(final BaseDomainObject obj, final Throwable cause) {
    super(null == obj || null == obj.getError()
            ? "An unknown error has occurred"
            : obj.getError().getMessage(),
            cause);
    rawResponse = obj;
    code = null == obj || null == obj.getError()
            ? null
            : obj.getError().getCode();

  }

  /**
   * Gets the raw response.
   *
   * @return the raw response
   */
  public final BaseDomainObject getRawResponse() {
    return rawResponse;
  }

  /**
   * Gets the code.
   *
   * @return the code
   */
  public final String getCode() {
    return code;
  }
}
