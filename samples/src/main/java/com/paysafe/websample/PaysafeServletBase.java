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

package com.paysafe.websample;

import javax.servlet.http.*;

import java.io.IOException;
import java.util.Properties;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class PaysafeServletBase extends HttpServlet {

  private static final long serialVersionUID = 1L;
  protected final String accountNumber;
  protected final String apiKey;
  protected final String apiPassword;
  protected final String currencyCode;
  protected final int currencyMultiplier;
 
  protected PaysafeServletBase() {
    super();
    Logger logger = Logger.getLogger(PaysafeServletBase.class.getName());

    String apiKey = "", apiPassword = "", accountNumber = "", currencyCode = "", currencyMultiplier = "";

    try {
      Properties props = new Properties();
      ClassLoader loader = Thread.currentThread().getContextClassLoader();
      InputStream resourceStream = loader.getResourceAsStream("config.properties");
      props.load(resourceStream);

      apiKey = props.getProperty("apiKey");
      apiPassword = props.getProperty("apiPassword");
      accountNumber = props.getProperty("accountNumber");
      currencyCode = props.getProperty("currencyCode");
      currencyMultiplier = props.getProperty("currencyBaseUnitsMultiplier");
      
      logger.log(Level.INFO, "apiKey [{0}]", apiKey);
      logger.log(Level.INFO, "apiPassword [{0}]", apiPassword);
      logger.log(Level.INFO, "accountNumber [{0}]", accountNumber);
      logger.log(Level.INFO, "currencyCode [{0}]", currencyCode);
      logger.log(Level.INFO, "currencyBaseUnitsMultiplier [{0}]", currencyMultiplier);
      
     } catch (IOException ex) {

      logger.log(Level.WARNING, "Unable to load config properties", ex);
    }

    this.apiKey = apiKey;
    this.apiPassword = apiPassword;
    this.accountNumber = accountNumber;
    this.currencyCode = currencyCode;
    this.currencyMultiplier = Integer.parseInt(currencyMultiplier);
    }
}
