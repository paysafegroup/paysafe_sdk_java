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


import java.io.IOException;

import java.util.HashMap;

import com.paysafe.PaysafeApiClient;
import com.paysafe.common.PaysafeException;
import com.paysafe.common.impl.Monitor;
import com.paysafe.common.impl.Request;

// TODO: Auto-generated Javadoc
/**
 * The Class CustomerVaultService.
 */
public class CustomerVaultService {

  /**
   * The client.
   */
  private final PaysafeApiClient client;

  /**
   * The paths to different features in the API.
   */
  private static final String URI = "customervault/v1";
  
  /** The Constant PROFILE_PATH. */
  private static final String PROFILE_PATH = "/profiles/";
  
  /** The Constant ADDRESS_PATH. */
  private static final String ADDRESS_PATH = "/addresses/";
  
  /** The Constant CARD_PATH. */
  private static final String CARD_PATH = "/cards/";
  
  /** The Constant ACHBANKACCOUNTS_PATH. */
  private static final String ACHBANKACCOUNTS_PATH = "/achbankaccounts/";
  
  /** The Constant BACSBANKACCOUNTS_PATH. */
  private static final String BACSBANKACCOUNTS_PATH = "/bacsbankaccounts/";
  
  /** The Constant EFTBANKACCOUNTS_PATH. */
  private static final String EFTBANKACCOUNTS_PATH = "/eftbankaccounts/";
  
  /** The Constant SEPABANKACCOUNTS_PATH. */
  private static final String SEPABANKACCOUNTS_PATH = "/sepabankaccounts/";
  
  /** The Constant MANDATES. */
  private static final String MANDATES ="/mandates/";

  /**
   * Instantiates a new customer vault service.
   *
   * @param client the client
   */
  public CustomerVaultService(final PaysafeApiClient client) {
    this.client = client;
  }

  /**
   * Monitor.
   *
   * @return true, if successful
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final boolean monitor() throws IOException, PaysafeException {

    final Request request = Request.builder()
            .uri("customervault/monitor")
            .method(Request.RequestType.GET)
            .build();

    Monitor status = client.processRequest(request, Monitor.class);
    return ("READY".equals(status.getStatus()));
  }

  /**
   * Create a Profile.
   *
   * @param profile the profile
   * @return Profile
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final Profile create(final Profile profile) throws IOException, PaysafeException {

    final Request request = Request.builder()
            .uri(prepareUri(PROFILE_PATH))
            .method(Request.RequestType.POST)
            .body(profile)
            .build();

    return client.processRequest(request, Profile.class);
  }
  
  /**
   * Create a ACHBankAccounts.
   *
   * @param achBankAccounts the ach bank accounts
   * @return ACHBankAccounts
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  
  public final ACHBankAccounts create(ACHBankAccounts achBankAccounts) throws IOException, PaysafeException {
	  
	  
	  final Request request = Request.builder()
	            .uri(prepareUri(PROFILE_PATH + achBankAccounts.getProfileId() + ACHBANKACCOUNTS_PATH))
	            .method(Request.RequestType.POST)
	            .body(achBankAccounts)
	            .build();
	  ACHBankAccounts returnVal = (ACHBankAccounts)this.client.processRequest(request, ACHBankAccounts.class);
      returnVal.setProfileId(achBankAccounts.getProfileId());
      return returnVal;
  }
  
  /**
   * Create a BACSBankAccounts.
   *
   * @param bacsBankAccounts the bacs bank accounts
   * @return BACSBankAccounts
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  
  public final BACSBankAccounts create(BACSBankAccounts bacsBankAccounts) throws IOException, PaysafeException {
	  
	  
	  final Request request = Request.builder()
	            .uri(prepareUri(PROFILE_PATH + bacsBankAccounts.getProfileId() +BACSBANKACCOUNTS_PATH))
	            .method(Request.RequestType.POST)
	            .body(bacsBankAccounts)
	            .build();
	  BACSBankAccounts returnVal = (BACSBankAccounts)this.client.processRequest(request, BACSBankAccounts.class);
      returnVal.setProfileId(bacsBankAccounts.getProfileId());
      return returnVal;
  }
  
  /**
   * Create a EFTBankAccounts.
   *
   * @param eftBankAccounts the eft bank accounts
   * @return EFTBankAccounts
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  
  public final EFTBankAccounts create(EFTBankAccounts eftBankAccounts) throws IOException, PaysafeException {
	  
	  
	  final Request request = Request.builder()
	            .uri(prepareUri(PROFILE_PATH + eftBankAccounts.getProfileId() + EFTBANKACCOUNTS_PATH))
	            .method(Request.RequestType.POST)
	            .body(eftBankAccounts)
	            .build();
	  EFTBankAccounts returnVal = (EFTBankAccounts)this.client.processRequest(request, EFTBankAccounts.class);
	  returnVal.setProfileId(eftBankAccounts.getProfileId());
	  return returnVal;
  }
  
  /**
   * Create a SEPABankAccounts.
   *
   * @param sepaBankAccounts the sepa bank accounts
   * @return SEPABankAccounts
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  
  public final SEPABankAccounts create(SEPABankAccounts sepaBankAccounts) throws IOException, PaysafeException {
	  
	  
	  final Request request = Request.builder()
	            .uri(prepareUri(PROFILE_PATH + sepaBankAccounts.getProfileId() + SEPABANKACCOUNTS_PATH))
	            .method(Request.RequestType.POST)
	            .body(sepaBankAccounts)
	            .build();
	  SEPABankAccounts returnVal = (SEPABankAccounts)this.client.processRequest(request, SEPABankAccounts.class);
	  returnVal.setProfileId(sepaBankAccounts.getProfileId());
	  return returnVal;
  }

  /**
   * Create an Address.
   *
   * @param address the address
   * @return Address
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final Address create(final Address address) throws IOException, PaysafeException {

    final Request request = Request.builder()
            .uri(prepareUri(PROFILE_PATH + address.getProfileId() + ADDRESS_PATH))
            .method(Request.RequestType.POST)
            .body(address)
            .build();

    final Address returnVal = client.processRequest(request, Address.class);
    returnVal.setProfileId(address.getProfileId());
    return returnVal;
  }

  /**
   * Create a Card.
   *
   * @param card the card
   * @return Card
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final Card create(final Card card) throws IOException, PaysafeException {

    final Request request = Request.builder()
            .uri(prepareUri(PROFILE_PATH + card.getProfileId() + CARD_PATH))
            .method(Request.RequestType.POST)
            .body(card)
            .build();

    final Card returnVal = client.processRequest(request, Card.class);
    returnVal.setProfileId(card.getProfileId());
    return returnVal;
  }
  
  
  /**
   * Create a Mandates.
   *
   * @param mandates the mandates
   * @param accountName to check for SEPA or BACS.
   * @return Mandates
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  
  public final Mandates create(Mandates mandates,String accountName) throws IOException, PaysafeException {
	  
	  if (accountName.equals("SEPA"))
          accountName = "/sepabankaccounts/";
      else
          accountName = "/bacsbankaccounts/";
 
	 final Request request = Request.builder()
	            .uri(prepareUri(PROFILE_PATH + mandates.getProfileId() + accountName + mandates.getBankAccountId() + MANDATES))
	            .method(Request.RequestType.POST)
	            .body(mandates)
	            .build();
	  Mandates returnVal = (Mandates)this.client.processRequest(request, Mandates.class);
      returnVal.setProfileId(mandates.getProfileId());
      return returnVal;
  }
  
  /**
   * Update a Profile.
   *
   * @param profile the profile
   * @return Profile
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final Profile update(final Profile profile) throws IOException, PaysafeException {

    final Request request = Request.builder()
            .uri(prepareUri(PROFILE_PATH + profile.getId()))
            .method(Request.RequestType.PUT)
            .body(profile)
            .build();

    return client.processRequest(request, Profile.class);
  }

  /**
   * Update an Address.
   *
   * @param address the address
   * @return Address
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final Address update(final Address address) throws IOException, PaysafeException {

    final Request request = Request.builder()
            .uri(prepareUri(
                    PROFILE_PATH + address.getProfileId() + ADDRESS_PATH + address.getId()))
            .method(Request.RequestType.PUT)
            .body(address)
            .build();

    final Address returnVal = client.processRequest(request, Address.class);
    returnVal.setProfileId(address.getProfileId());
    return returnVal;
  }

  /**
   * Update a Card.
   *
   * @param card the card
   * @return Card
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final Card update(final Card card) throws IOException, PaysafeException {

    final Request request = Request.builder()
            .uri(prepareUri(PROFILE_PATH + card.getProfileId() + CARD_PATH + card.getId()))
            .method(Request.RequestType.PUT)
            .body(card)
            .build();

    final Card returnVal = client.processRequest(request, Card.class);
    returnVal.setProfileId(card.getProfileId());
    return returnVal;
  }
  
  
  /**
   * Update ACHBankAccounts.
   *
   * @param achBankAccounts the ach bank accounts
   * @return ACHBankAccounts
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final ACHBankAccounts update(final ACHBankAccounts achBankAccounts) throws IOException, PaysafeException {

    final Request request = Request.builder()
            .uri(prepareUri(PROFILE_PATH+achBankAccounts.getProfileId()+ACHBANKACCOUNTS_PATH+achBankAccounts.getId()))
            .method(Request.RequestType.PUT)
            .body(achBankAccounts)
            .build();

    final ACHBankAccounts returnVal = client.processRequest(request, ACHBankAccounts.class);
    returnVal.setProfileId(achBankAccounts.getProfileId());
    return returnVal;
        
  }
  
  /**
   * Update EFTBankAccounts update.
   *
   * @param eftBankAccounts the eft bank accounts
   * @return EFTBankAccounts
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final EFTBankAccounts update(final EFTBankAccounts eftBankAccounts) throws IOException, PaysafeException {

    final Request request = Request.builder()
            .uri(prepareUri(PROFILE_PATH+eftBankAccounts.getProfileId()+EFTBANKACCOUNTS_PATH+eftBankAccounts.getId()))
            .method(Request.RequestType.PUT)
            .body(eftBankAccounts)
            .build();

    final EFTBankAccounts returnVal = client.processRequest(request, EFTBankAccounts.class);
    returnVal.setProfileId(eftBankAccounts.getProfileId());
    return returnVal;
        
  }
  
  /**
   * Update BACSBankAccounts.
   *
   * @param bacsBankAccounts the bacs bank accounts
   * @return BACSBankAccounts
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  
  public final BACSBankAccounts update(final BACSBankAccounts bacsBankAccounts) throws IOException, PaysafeException {

    final Request request = Request.builder()
            .uri(prepareUri(PROFILE_PATH+bacsBankAccounts.getProfileId()+BACSBANKACCOUNTS_PATH+bacsBankAccounts.getId()))
            .method(Request.RequestType.PUT)
            .body(bacsBankAccounts)
            .build();

    final BACSBankAccounts returnVal = client.processRequest(request, BACSBankAccounts.class);
    returnVal.setProfileId(bacsBankAccounts.getProfileId());
    return returnVal;
        
  }
  
  /**
   * Update SEPABankAccounts .
   *
   * @param sepaBankAccounts the sepa bank accounts
   * @return SEPABankAccounts
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final SEPABankAccounts update(final SEPABankAccounts sepaBankAccounts) throws IOException, PaysafeException {

    final Request request = Request.builder()
            .uri(prepareUri(PROFILE_PATH+sepaBankAccounts.getProfileId()+SEPABANKACCOUNTS_PATH+sepaBankAccounts.getId()))
            .method(Request.RequestType.PUT)
            .body(sepaBankAccounts)
            .build();

    final SEPABankAccounts returnVal = client.processRequest(request, SEPABankAccounts.class);
    returnVal.setProfileId(sepaBankAccounts.getProfileId());
    return returnVal;       
  }
  
  /**
   * Update Mandates.
   *
   * @param mandates the mandates
   * @return Mandates
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final Mandates update(final Mandates mandates) throws IOException, PaysafeException {

    final Request request = Request.builder()
            .uri(prepareUri(PROFILE_PATH+mandates.getProfileId()+MANDATES+mandates.getId()))
            .method(Request.RequestType.PUT)
            .body(mandates)
            .build();

    final Mandates returnVal = client.processRequest(request, Mandates.class);
    returnVal.setProfileId(mandates.getProfileId());
    return returnVal;
        
  }


  /**
   * Delete a Profile.
   *
   * @param profile the profile
   * @return boolean
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final boolean delete(Profile profile) 
          throws IOException, PaysafeException {

    final Request request = Request.builder()
            .uri(prepareUri(PROFILE_PATH + profile.getId()))
            .method(Request.RequestType.DELETE)
            .build();

    client.processRequest(request, Profile.class);

    return true;
  }

  /**
   * Delete an Address.
   *
   * @param address the address
   * @return boolean
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final boolean delete(final Address address) throws IOException, PaysafeException {

    final Request request = Request.builder()
            .uri(prepareUri(
                    PROFILE_PATH + address.getProfileId() + ADDRESS_PATH + address.getId()))
            .method(Request.RequestType.DELETE)
            .build();

    client.processRequest(request, Address.class);

    return true;
  }

  /**
   * Delete a Card.
   *
   * @param card the card
   * @return boolean
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final boolean delete(final Card card) throws IOException, PaysafeException {

    final Request request = Request.builder()
            .uri(prepareUri(PROFILE_PATH + card.getProfileId() + CARD_PATH + card.getId()))
            .method(Request.RequestType.DELETE)
            .build();

    client.processRequest(request, Card.class);
    return true;
  }
  
  /**
   * Delete ACHBankAccounts.
   *
   * @param achBankAccounts the ach bank accounts
   * @return ACHBankAccounts
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final boolean delete(final ACHBankAccounts achBankAccounts) throws IOException, PaysafeException {

    final Request request = Request.builder()
            .uri(prepareUri(PROFILE_PATH+achBankAccounts.getProfileId()+ACHBANKACCOUNTS_PATH+achBankAccounts.getId()))
            .method(Request.RequestType.DELETE)
            .build();
    
    client.processRequest(request, ACHBankAccounts.class);
    return true;
    
  }
  
  /**
   * Delete EFTBankAccounts.
   *
   * @param eftbankaccounts the eftbankaccounts
   * @return true
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final boolean delete(final EFTBankAccounts eftbankaccounts) throws IOException, PaysafeException {

    final Request request = Request.builder()
            .uri(prepareUri(PROFILE_PATH+eftbankaccounts.getProfileId()+EFTBANKACCOUNTS_PATH+eftbankaccounts.getId()))
            .method(Request.RequestType.DELETE)
            .build();
    
    client.processRequest(request, EFTBankAccounts.class);
    return true;
    
  }
  
  /**
   * Delete SEPABankAccounts.
   *
   * @param sepaBankAccounts the sepa bank accounts
   * @return true
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final boolean delete(final SEPABankAccounts sepaBankAccounts) throws IOException, PaysafeException {

    final Request request = Request.builder()
            .uri(prepareUri(PROFILE_PATH+sepaBankAccounts.getProfileId()+SEPABANKACCOUNTS_PATH+sepaBankAccounts.getId()))
            .method(Request.RequestType.DELETE)
            .build();
    
    client.processRequest(request, SEPABankAccounts.class);
    return true;
    
  }

  /**
   * Delete BACSBankAccounts.
   *
   * @param bacsBankAccounts the bacs bank accounts
   * @return true
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final boolean delete(final BACSBankAccounts bacsBankAccounts) throws IOException, PaysafeException {

    final Request request = Request.builder()
            .uri(prepareUri(PROFILE_PATH+bacsBankAccounts.getProfileId()+BACSBANKACCOUNTS_PATH+bacsBankAccounts.getId()))
            .method(Request.RequestType.DELETE)
            .build();
    
    client.processRequest(request, BACSBankAccounts.class);
    return true;
    
  }
  
  /**
   * Delete a Mandates.
   *
   * @param mandates the mandates
   * @return true
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  
  public final boolean delete(Mandates mandates) throws IOException, PaysafeException {
	
	  final Request request = Request.builder()
	            .uri(prepareUri(PROFILE_PATH + mandates.getProfileId() +MANDATES+mandates.getId()))
	            .method(Request.RequestType.DELETE)
	            .body(mandates)
	            .build();
	  client.processRequest(request, Mandates.class);
	  return true;
      
  }

  /**
   * Get a Profile.
   *
   * @param profile the profile
   * @param includeAddresses indicate whether to include addresses in response
   * @param includeCards indicate whether to include cards in response
   * @return Profile
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final Profile
          lookup(final Profile profile, final boolean includeAddresses, final boolean includeCards)
          throws IOException, PaysafeException {

    final HashMap<String, String> queryStr = new HashMap<String, String>();
    final StringBuilder toInclude = new StringBuilder();
    if (includeAddresses) {
      toInclude.append("addresses");
    }
    if (includeCards) {
      if (toInclude.length() > 0) {
        toInclude.append(",");
      }
      toInclude.append("cards");
    }
    if (toInclude.length() > 0) {
      queryStr.put("fields", toInclude.toString());
    }

    final Request request = Request.builder()
            .uri(prepareUri(PROFILE_PATH + profile.getId()))
            .method(Request.RequestType.GET)
            .queryStr(queryStr)
            .build();
    
    Profile returnval=client.processRequest(request, Profile.class);
    return returnval;
  }
  
  /**
   * Get a Profile using subcomponent.
   *
   * @param profile the profile
   * @param includeAddresses indicate whether to include addresses in response
   * @param includeCards indicate whether to include cards in response
   * @param includeACHbankAccounts indicate whether to include achbankaccounts in response
   * @param includeBACSbankAccounts indicate whether to include bacsbankaccounts in response
   * @param includeEFTbankAccounts indicate whether to include eftbankaccounts in response
   * @param includeSEPAbankAccounts indicate whether to include sepabankaccounts in response
   * @return Profile
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  
  
  public final Profile
  lookup(final Profile profile, final boolean includeAddresses, final boolean includeCards, final boolean includeACHbankAccounts,final boolean includeBACSbankAccounts,final boolean includeEFTbankAccounts,final boolean includeSEPAbankAccounts)
  throws IOException, PaysafeException {

	final HashMap<String, String> queryStr = new HashMap<String, String>();
	final StringBuilder toInclude = new StringBuilder();
	if (includeAddresses) {
	toInclude.append("addresses");
	}
	if (includeCards) {
	if (toInclude.length() > 0) {
	toInclude.append(",");
	}
	
	toInclude.append("cards");
	}
	if (includeACHbankAccounts) {
	if (toInclude.length() > 0) {
	  toInclude.append(",");
	}
	toInclude.append("achbankaccounts");
	}
	if (includeBACSbankAccounts) {
	if (toInclude.length() > 0) {
	  toInclude.append(",");
	}
	toInclude.append("bacsbankaccounts");
	}
	if (includeSEPAbankAccounts) {
	if (toInclude.length() > 0) {
	  toInclude.append(",");
	}
	toInclude.append("sepabankaccounts");
	}
	if (includeEFTbankAccounts) {
	if (toInclude.length() > 0) {
	  toInclude.append(",");
	}
	toInclude.append("eftbankaccounts");
	}
	if (toInclude.length() > 0) {
	queryStr.put("fields", toInclude.toString());
	}

	final Request request = Request.builder()
	    .uri(prepareUri(PROFILE_PATH + profile.getId()))
	    .method(Request.RequestType.GET)
	    .queryStr(queryStr)
	    .build();
	
	return client.processRequest(request, Profile.class);
	}


  /**
   * Get a Profile.
   *
   * @param profile the profile
   * @param includeAddresses indicate whether to include addresses in response
   * @return Profile
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final Profile lookup(final Profile profile, final boolean includeAddresses)
          throws IOException, PaysafeException {
    return lookup(profile, includeAddresses, false);
  }

  /**
   * Get a Profile.
   *
   * @param profile the profile
   * @return Profile
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final Profile lookup(final Profile profile) throws IOException, PaysafeException {
    return lookup(profile, false, false);
  }

  /**
   * Get an Address.
   *
   * @param address the address
   * @return the Address
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final Address lookup(final Address address) throws IOException, PaysafeException {

    final Request request = Request.builder()
            .uri(prepareUri(
                    PROFILE_PATH + address.getProfileId() + ADDRESS_PATH + address.getId()))
            .method(Request.RequestType.GET)
            .build();

    final Address returnVal = client.processRequest(request, Address.class);
    returnVal.setProfileId(address.getProfileId());
    return returnVal;
  }

  /**
   * Get a Card.
   *
   * @param card the card
   * @return the Card
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final Card lookup(final Card card) throws IOException, PaysafeException {

    final Request request = Request.builder()
            .uri(prepareUri(PROFILE_PATH + card.getProfileId() + CARD_PATH + card.getId()))
            .method(Request.RequestType.GET)
            .build();

    final Card returnVal = client.processRequest(request, Card.class);
    returnVal.setProfileId(card.getProfileId());
    return returnVal;
  }
  
  /**
   * Get a ACHBankAccounts.
   *
   * @param achBankAccounts the ach bank accounts
   * @return ACHBankAccounts
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final ACHBankAccounts lookup(final ACHBankAccounts achBankAccounts) throws IOException, PaysafeException {

    final Request request = Request.builder()
            .uri(prepareUri(PROFILE_PATH+achBankAccounts.getProfileId()+ACHBANKACCOUNTS_PATH+achBankAccounts.getId()))
            .method(Request.RequestType.GET)
            .build();

    final ACHBankAccounts returnVal = client.processRequest(request, ACHBankAccounts.class);
    return returnVal;
  }
  
  /**
   * Get a EFTBankAccounts.
   *
   * @param eftBankAccounts the eft bank accounts
   * @return EFTBankAccounts
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final EFTBankAccounts lookup(final EFTBankAccounts eftBankAccounts) throws IOException, PaysafeException {

    final Request request = Request.builder()
            .uri(prepareUri(PROFILE_PATH+eftBankAccounts.getProfileId()+EFTBANKACCOUNTS_PATH+eftBankAccounts.getId()))
            .method(Request.RequestType.GET)
            .build();

    final EFTBankAccounts returnVal = client.processRequest(request, EFTBankAccounts.class);
    return returnVal;
  }
  
  /**
   * Get a BACSBankAccounts.
   *
   * @param bacsBankAccounts the bacs bank accounts
   * @return BACSBankAccounts
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final BACSBankAccounts lookup(final BACSBankAccounts bacsBankAccounts) throws IOException, PaysafeException {

    final Request request = Request.builder()
            .uri(prepareUri(PROFILE_PATH+bacsBankAccounts.getProfileId()+BACSBANKACCOUNTS_PATH+bacsBankAccounts.getId()))
            .method(Request.RequestType.GET)
            .build();

    final BACSBankAccounts returnVal = client.processRequest(request, BACSBankAccounts.class);
    return returnVal;
  }
  
  /**
   * Get a SEPABankAccounts.
   *
   * @param sepaBankAccounts the sepa bank accounts
   * @return SEPABankAccounts
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  public final SEPABankAccounts lookup(final SEPABankAccounts sepaBankAccounts) throws IOException, PaysafeException {

    final Request request = Request.builder()
            .uri(prepareUri(PROFILE_PATH+sepaBankAccounts.getProfileId()+SEPABANKACCOUNTS_PATH+sepaBankAccounts.getId()))
            .method(Request.RequestType.GET)
            .build();

    final SEPABankAccounts returnVal = client.processRequest(request, SEPABankAccounts.class);
    return returnVal;
  }
  
  /**
   * Get a Mandates.
   *
   * @param mandates the mandates
   * @return Mandates
   * @throws IOException Signals that an I/O exception has occurred.
   * @throws PaysafeException the paysafe exception
   */
  
  public final Mandates lookup(Mandates mandates) throws IOException, PaysafeException {
	
	  final Request request = Request.builder()
	            .uri(prepareUri(PROFILE_PATH + mandates.getProfileId() +MANDATES+mandates.getId()))
	            .method(Request.RequestType.GET)
	            .body(mandates)
	            .build();
	  Mandates returnVal = (Mandates)this.client.processRequest(request, Mandates.class);
      return returnVal;
  }
    
  
  /**
   * Prepare uri.
   *
   * @param path the path
   * @return the String
   * @throws PaysafeException the paysafe exception
   */
  private String prepareUri(final String path) throws PaysafeException {
    return URI + path;
  }
  
}
