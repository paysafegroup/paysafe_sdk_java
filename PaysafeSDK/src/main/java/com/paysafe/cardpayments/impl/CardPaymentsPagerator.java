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
package com.paysafe.cardpayments.impl;

import java.util.ArrayList;

import com.paysafe.common.Link;
import com.paysafe.common.Pagerator;
import com.paysafe.common.impl.BaseDomainObject;

// TODO: Auto-generated Javadoc
/**
 * CardPaymentsPagerator class will allow iteration of all results for a paged query.
 *
 * @param <T> the generic type
 */
public abstract class CardPaymentsPagerator<T extends BaseDomainObject> extends Pagerator<T> {

  /** The links. */
  private ArrayList<Link> links = new ArrayList<Link>();
  
  /** The next url. */
  private String nextUrl;

  /* (non-Javadoc)
   * @see com.optimalpayments.common.Pagerator#getNextPageUrl()
   */
  @Override
  protected final String getNextPageUrl() {
    if (null != links) {
      for (Link link : links) {
        if (null != link.getRel() && link.getRel().equals("next")) {
          nextUrl = link.getHref();
        }
      }
      //after we've found the next url, we can set the links to null so we don't go looking again.
      links = null;
    }
    return nextUrl;
  }

  /* (non-Javadoc)
   * @see com.optimalpayments.common.Pagerator#setNextPageUrl(java.lang.String)
   */
  @Override
  protected final void setNextPageUrl(final String nextUrl) {
    this.nextUrl = nextUrl;
  }
}
