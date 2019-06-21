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
 * The Class Authentication.
 */
public class Authentication implements DomainObject {

  /** The eci. */
  @Expose
  private Integer eci;
  
  /** The cavv. */
  @Expose
  private String cavv;
  
  /** The xid. */
  @Expose
  private String xid;
  
  /** The three d enrollment. */
  @Expose
  private String threeDEnrollment;
  
  /** The three d result. */
  @Expose
  private ThreeDResult threeDResult;
  
  /** The signature status. */
  @Expose
  private String signatureStatus;
 
  @Expose
  private String threeDSecureVersion;
  
  @Expose
  private String directoryServerTransactionId;

  /**
   * Gets the eci.
   *
   * @return the eci
   */
  public final Integer getEci() {
    return eci;
  }

  /**
   * Sets the eci.
   *
   * @param eci the new eci
   */
  public final void setEci(final Integer eci) {
    this.eci = eci;
  }

  /**
   * Gets the cavv.
   *
   * @return the cavv
   */
  public final String getCavv() {
    return cavv;
  }

  /**
   * Sets the cavv.
   *
   * @param cavv the new cavv
   */
  public final void setCavv(final String cavv) {
    this.cavv = cavv;
  }

  /**
   * Gets the xid.
   *
   * @return the xid
   */
  public final String getXid() {
    return xid;
  }

  /**
   * Sets the xid.
   *
   * @param xid the new xid
   */
  public final void setXid(final String xid) {
    this.xid = xid;
  }

  /**
   * Gets the three d enrollment.
   *
   * @return the three d enrollment
   */
  public final String getThreeDEnrollment() {
    return threeDEnrollment;
  }

  /**
   * Sets the three d enrollment.
   *
   * @param threeDEnrollment the new three d enrollment
   */
  public final void setThreeDEnrollment(final String threeDEnrollment) {
    this.threeDEnrollment = threeDEnrollment;
  }

  /**
   * Gets the three d result.
   *
   * @return the three d result
   */
 public final ThreeDResult getThreeDResult() {
    return threeDResult;
  }

   /*
   * Sets the three d result.
   *
   * @param threeDResult the new three d result
   */
  public final void setThreeDResult(final ThreeDResult threeDResult) {
    this.threeDResult = threeDResult;
  }
  
  
  /**
   * Gets the signature status.
   *
   * @return the signature status
   */
  public final String getSignatureStatus() {
    return signatureStatus;
  }
  
/**
   * Sets the signature status.
   *
   * @param signatureStatus the new signature status
   */
  public final void setSignatureStatus(final String signatureStatus) {
    this.signatureStatus = signatureStatus;
  }
  
  public String getThreeDSecureVersion() {
		return threeDSecureVersion;
	}

	public void setThreeDSecureVersion(String threeDSecureVersion) {
		this.threeDSecureVersion = threeDSecureVersion;
	}

	public String getDirectoryServerTransactionId() {
		return directoryServerTransactionId;
	}

	public void setDirectoryServerTransactionId(String directoryServerTransactionId) {
		this.directoryServerTransactionId = directoryServerTransactionId;
	}

  /**
   * The sub-builder class for Authentication.
   *
   * @param <BLDRT> the parent builder
   */
  public static class AuthenticationBuilder<BLDRT extends GenericBuilder>
          extends NestedBuilder<Authentication, BLDRT> {

    /** The authentication. */
    private final Authentication authentication = new Authentication();

    /**
     * Instantiates a new authentication builder.
     *
     * @param parent the parent
     */
    public AuthenticationBuilder(final BLDRT parent) {
      super(parent);
    }

    /**
     * Build this authentication object.
     *
     * @return Authentication
     */
    @Override
    public final Authentication build() {
      return authentication;
    }

    /**
     * Set the eci property.
     *
     * @param eci the eci
     * @return AuthenticationBuilder< BLDRT >
     */
    public final AuthenticationBuilder<BLDRT> eci(final Integer eci) {
      authentication.setEci(eci);
      return this;
    }

    /**
     * Set the cavv property.
     *
     * @param cavv the cavv
     * @return AuthenticationBuilder< BLDRT >
     */
    public final AuthenticationBuilder<BLDRT> cavv(final String cavv) {
      authentication.setCavv(cavv);
      return this;
    }

    /**
     * Set the xid property.
     *
     * @param xid the xid
     * @return AuthenticationBuilder< BLDRT >
     */
    public final AuthenticationBuilder<BLDRT> xid(
            final String xid) {
      authentication.setXid(xid);
      return this;
    }

    /**
     * Set the threeDEnrollment property.
     *
     * @param threeDEnrollment the three d enrollment
     * @return AuthenticationBuilder< BLDRT >
     */
    public final AuthenticationBuilder<BLDRT> threeDEnrollment(final String threeDEnrollment) {
      authentication.setThreeDEnrollment(threeDEnrollment);
      return this;
    }

    /**
     * Set the threeDResult property.
     *
     * @param threeDResult the three d result
     * @return AuthenticationBuilder< BLDRT >
     */
    public final AuthenticationBuilder<BLDRT> threeDResult(final ThreeDResult threeDResult) {
      authentication.setThreeDResult(threeDResult);
      return this;
    }

    /**
     * Set the signatureStatus property.
     *
     * @param signatureStatus the signature status
     * @return AuthenticationBuilder< BLDRT >
     */
    public final AuthenticationBuilder<BLDRT> signatureStatus(final String signatureStatus) {
      authentication.setSignatureStatus(signatureStatus);
      return this;
    }
    
    public final AuthenticationBuilder<BLDRT> threeDSecureVersion(final String threeDSecureVersion){
    	authentication.setThreeDSecureVersion(threeDSecureVersion);
    	return this;
    }
    public final AuthenticationBuilder<BLDRT>directoryServerTransactionId(final String directoryServerTransactionId){
     authentication.setDirectoryServerTransactionId(directoryServerTransactionId);
     return this;
    }
    
  }
}
