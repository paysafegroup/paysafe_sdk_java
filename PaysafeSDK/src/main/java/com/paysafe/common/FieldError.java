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

import com.paysafe.common.impl.DomainObject;

// TODO: Auto-generated Javadoc
/**
 * The Class FieldError.
 */
public class FieldError implements DomainObject {

  /** The field. */
  private String field;
  
  /** The error. */
  private String error;

  /**
   * Gets the field.
   *
   * @return the field
   */
  public String getField() {
    return field;
  }

  /**
   * Sets the field.
   *
   * @param field the new field
   */
  public void setField(final String field) {
    this.field = field;
  }

  /**
   * Gets the error.
   *
   * @return the error
   */
  public String getError() {
    return error;
  }

  /**
   * Sets the error.
   *
   * @param error the new error
   */
  public void setError(final String error) {
    this.error = error;
  }
}
