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

import com.paysafe.common.impl.BaseDomainObject;

// TODO: Auto-generated Javadoc
/**
 * An id for a domain classes.
 *
 * @param <T> type
 */
public class Id<T extends BaseDomainObject> {

  /** The id. */
  private final String id;
  
  /** The type. */
  private final Class<T> type;

  public String getId() {
	return id;
  }
  
  /**
   * Instantiates a new id.
   *
   * @param id the id
   * @param type the type
   */
  private Id(String id, Class<T> type) {
    this.id = id;
    this.type = type;
  }

  /**
   * Get the generic type associated with this object.
   * 
   * @return Class< T >
   */
  public Class<T> getType() {
    return type;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return id;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((type == null) ? 0 : type.hashCode());
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

  /**
   * Overridden to allow to similar objects to be compared (same id and type).
   *
   * @param obj the obj
   * @return Boolean
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Id<?> other = (Id<?>) obj;
    if (type == null) {
      if (other.type != null) {
        return false;
      }
    } else if (!type.equals(other.type)) {
      return false;
    }
    if (id == null) {
      if (other.id != null) {
        return false;
      }
    } else if (!id.equals(other.id)) {
      return false;
    }
    return true;
  }

  /**
   * Instantiate a new id object.
   *
   * @param <U> the generic type
   * @param id the id
   * @param classType the class type
   * @return Id< U >
   */
  public static final <U extends BaseDomainObject> Id<U> create(String id, Class<U> classType) {
    return new Id<U>(id, classType);
  }
}
