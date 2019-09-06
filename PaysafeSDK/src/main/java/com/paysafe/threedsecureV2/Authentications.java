package com.paysafe.threedsecureV2;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.paysafe.cardpayments.ThreeDResult;
import com.paysafe.common.Error;
import com.paysafe.common.Id;
import com.paysafe.common.Link;
import com.paysafe.common.impl.BaseBuilder;
import com.paysafe.common.impl.BaseDomainObject;

/**
 * The Class Authentications.
 */
public class Authentications implements BaseDomainObject {

    /** The id. */
	@Expose
	private Id<Authentications> id;
	
	/** The deviceFingerprintingId. */
	@Expose
	private String deviceFingerprintingId;
	
	/** The merchant reference number. */
	@Expose
	private String merchantRefNum;
	
	/**The amount. */
	@Expose
	private Integer amount;
	
	/** The currency. */
	@Expose
	private String currency;
	
	/** The card. */
	@Expose
	private Card card;
	
	/** The merchant Url. */
	@Expose
	private String merchantUrl;
	
	/** The txnTime. */
	@Expose
	private String txnTime;
	
	/** The error. */
	@Expose
	private Error error;
	
	/** The status. */
	@Expose
	private Status status;
	
	/** The acsURL. */
	@Expose
	private String acsURL;
	
	/** The payload. */
	@Expose
	private String payload;
	
	/** The three d enrollment. */
	@Expose
	private ThreeDEnrollment threeDEnrollment;
	
	/** The three d result. */
	@Expose
	private ThreeDResult threeDResult;
	
	/** The three d Secure Version. */
	@Expose
	private String threeDSecureVersion;
	
	/** The directoryServerTransactionId. */
	@Expose
	private String directoryServerTransactionId;
	
	/** The eci. */
	@Expose
	private Integer eci;
	
	/** The cavv. */
	@Expose
	private String cavv;
	
	/** The xid. */
	@Expose
	private String xid;
	
	/** The sdk Challenge Payload. */
	@Expose
	private String sdkChallengePayload;
	
	/** the type of transaction being authenticated. */
	@Expose
	private TransactionIntent transactionIntent;
	
	/** the maximum number of authorizations permitted for installment . */
	@Expose
	private Integer maxAuthorizationsForInstalmentPayment;
	
	/** The authentication Purpose. */
	@Expose
	private AuthenticationPurpose authenticationPurpose;
	
	/** The device Channel. */
	@Expose
	private DeviceChannel deviceChannel;
	
	/** The message Category. */
	@Expose
	private MessageCategory messageCategory;
	
	/** The initial Purchase Time. */
	@Expose
	private String initialPurchaseTime;
	
	/** The requestor challenge preference. */
	@Expose
	private RequestorChallengePreference requestorChallengePreference;
	
	/** The electronic delivery. */
	@Expose
	private ElectronicDelivery electronicDelivery;
	
	/** The order Item Details. */
	@Expose
	private OrderItemDetails orderItemDetails;
	
	/** The purchased Gift Card Details. */
	@Expose
	private PurchasedGiftCardDetails purchasedGiftCardDetails;
	
	/** The billing Cycle. */
	@Expose
	private BillingCycle billingCycle;
	
	/** The browser Details. */
	@Expose
	private BrowserDetails browserDetails;
	
	/** The user Account Details. */
	@Expose
	private UserAccountDetails userAccountDetails;
	
	/** The billing Details. */
	@Expose
	private BillingDetails billingDetails;
	
	/** The shipping Details. */
	@Expose
	private ShippingDetails shippingDetails;
	
	/** The profile. */
	@Expose
	private Profile profile;
	
	/** The profile. */
	@Expose
	private SignatureStatus signatureStatus;
	
	/** The links. */
	private ArrayList<Link> links;
	
	
/**
  * Gets the id.
  *
  * @return the id
  */
public Id<Authentications> getId() {
	return id;
}
/**
 * Sets the id.
 *
 * @param id the new id
 */
public void setId(Id<Authentications> id) {
	this.id = id;
}
/**
 * Gets the deviceFingerprintingId.
 *
 * @return the deviceFingerprintingId
 */
public String getDeviceFingerprintingId() {
	return deviceFingerprintingId;
}
/**
 * Sets the deviceFingerprintingId.
 *
 * @param deviceFingerprintingId the new deviceFingerprintingId
 */
public void setDeviceFingerprintingId(String deviceFingerprintingId) {
	this.deviceFingerprintingId = deviceFingerprintingId;
}
/**
 * Gets the merchantRefNum.
 *
 * @return the merchantRefNum
 */
public String getMerchantRefNum() {
	return merchantRefNum;
}
/**
 * Sets the merchantRefNum.
 *
 * @param merchantRefNum the new merchantRefNum
 */
public void setMerchantRefNum(String merchantRefNum) {
	this.merchantRefNum = merchantRefNum;
}
/**
 * Gets the amount.
 *
 * @return the amount
 */
public Integer getAmount() {
	return amount;
}
/**
 * Sets the amount.
 *
 * @param amount the new amount
 */
public void setAmount(Integer amount) {
	this.amount = amount;
}
/**
 * Gets the currency.
 *
 * @return the currency
 */
public String getCurrency() {
	return currency;
}
/**
 * Sets the currency.
 *
 * @param currency the new currency
 */
public void setCurrency(String currency) {
	this.currency = currency;
}
/**
 * Gets the card.
 *
 * @return the card
 */
public Card getCard() {
	return card;
}
/**
 * Sets the card.
 *
 * @param card the new card
 */
public void setCard(Card card) {
	this.card = card;
}
/**
 * Gets the merchantUrl.
 *
 * @return the merchantUrl
 */
public String getMerchantUrl() {
	return merchantUrl;
}
/**
 * Sets the merchantUrl.
 *
 * @param merchantUrl the new merchantUrl
 */
public void setMerchantUrl(String merchantUrl) {
	this.merchantUrl = merchantUrl;
}
/**
 * Gets the txnTime.
 *
 * @return the txnTime
 */
public String getTxnTime() {
	return txnTime;
}
/**
 * Sets the txnTime.
 *
 * @param txnTime the new txnTime
 */
public void setTxnTime(String txnTime) {
	this.txnTime = txnTime;
}
/* (non-Javadoc)
 * @see com.optimalpayments.common.impl.BaseDomainObject#getError()
 */
public Error getError() {
	// TODO Auto-generated method stub
	return null;
}
/**
 * Sets the error.
 *
 * @param error the new error
 */
public void setError(Error error) {
	this.error = error;
}
/**
 * Gets the status.
 *
 * @return the status
 */
public Status getStatus() {
	return status;
}
/**
 * Sets the status.
 *
 * @param status the new status
 */
public void setStatus(Status status) {
	this.status = status;
}
/**
 * Gets the acsURL.
 *
 * @return the acsURL
 */
public String getAcsURL() {
	return acsURL;
}
/**
 * Sets the acsURL.
 *
 * @param acsURL the new acsURL
 */
public void setAcsURL(String acsURL) {
	this.acsURL = acsURL;
}
/**
 * Gets the payload.
 *
 * @return the payload
 */
public String getPayload() {
	return payload;
}
/**
 * Sets the payload.
 *
 * @param payload the new payload
 */
public void setPayload(String payload) {
	this.payload = payload;
}
/**
 * Gets the threeDEnrollment.
 *
 * @return the threeDEnrollment
 */
public ThreeDEnrollment getThreeDEnrollment() {
	return threeDEnrollment;
}
/**
 * Sets the threeDEnrollment.
 *
 * @param threeDEnrollment the new threeDEnrollment
 */
public void setThreeDEnrollment(ThreeDEnrollment threeDEnrollment) {
	this.threeDEnrollment = threeDEnrollment;
}
/**
 * Gets the threeDResult.
 *
 * @return the threeDResult
 */
public ThreeDResult getThreeDResult() {
	return threeDResult;
}
/**
 * Sets the threeDResult.
 *
 * @param threeDResult the new threeDResult
 */
public void setThreeDResult(ThreeDResult threeDResult) {
	this.threeDResult = threeDResult;
}
/**
 * Gets the threeDSecureVersion.
 *
 * @return the threeDSecureVersion
 */
public String getThreeDSecureVersion() {
	return threeDSecureVersion;
}
/**
 * Sets the threeDSecureVersion.
 *
 * @param threeDSecureVersion the new threeDSecureVersion
 */
public void setThreeDSecureVersion(String threeDSecureVersion) {
	this.threeDSecureVersion = threeDSecureVersion;
}
/**
 * Gets the directoryServerTransactionId.
 *
 * @return the directoryServerTransactionId
 */
public String getDirectoryServerTransactionId() {
	return directoryServerTransactionId;
}
/**
 * Sets the directoryServerTransactionId.
 *
 * @param directoryServerTransactionId the new directoryServerTransactionId
 */
public void setDirectoryServerTransactionId(String directoryServerTransactionId) {
	this.directoryServerTransactionId = directoryServerTransactionId;
}
/**
 * Gets the eci.
 *
 * @return the eci
 */
public Integer getEci() {
	return eci;
}
/**
 * Sets the eci.
 *
 * @param eci the new eci
 */
public void setEci(Integer eci) {
	this.eci = eci;
}
/**
 * Gets the cavv.
 *
 * @return the cavv
 */
public String getCavv() {
	return cavv;
}
/**
 * Sets the cavv.
 *
 * @param cavv the new cavv
 */
public void setCavv(String cavv) {
	this.cavv = cavv;
}
/**
 * Gets the xid.
 *
 * @return the xid
 */
public String getXid() {
	return xid;
}
/**
 * Sets the xid.
 *
 * @param xid the new xid
 */
public void setXid(String xid) {
	this.xid = xid;
}
/**
 * Gets the sdkChallengePayload.
 *
 * @return the sdkChallengePayload
 */
public String getSdkChallengePayload() {
	return sdkChallengePayload;
}
/**
 * Sets the sdkChallengePayload.
 *
 * @param sdkChallengePayload the new sdkChallengePayload
 */
public void setSdkChallengePayload(String sdkChallengePayload) {
	this.sdkChallengePayload = sdkChallengePayload;
}
/**
 * Gets the transactionIntent.
 *
 * @return the transactionIntent
 */
public TransactionIntent getTransactionIntent() {
	return transactionIntent;
}
/**
 * Sets the transactionIntent.
 *
 * @param transactionIntent the new transactionIntent
 */
public void setTransactionIntent(TransactionIntent transactionIntent) {
	this.transactionIntent = transactionIntent;
}
/**
 * Gets the maxAuthorizationsForInstalmentPayment.
 *
 * @return the maxAuthorizationsForInstalmentPayment
 */
public Integer getMaxAuthorizationsForInstalmentPayment() {
	return maxAuthorizationsForInstalmentPayment;
}
/**
 * Sets the maxAuthorizationsForInstalmentPayment.
 *
 * @param maxAuthorizationsForInstalmentPayment the new maxAuthorizationsForInstalmentPayment
 */
public void setMaxAuthorizationsForInstalmentPayment(Integer maxAuthorizationsForInstalmentPayment) {
	this.maxAuthorizationsForInstalmentPayment = maxAuthorizationsForInstalmentPayment;
}
/**
 * Gets the authenticationPurpose.
 *
 * @return the authenticationPurpose
 */
public AuthenticationPurpose getAuthenticationPurpose() {
	return authenticationPurpose;
}
/**
 * Sets the authenticationPurpose.
 *
 * @param authenticationPurpose the new authenticationPurpose
 */
public void setAuthenticationPurpose(AuthenticationPurpose authenticationPurpose) {
	this.authenticationPurpose = authenticationPurpose;
}
/**
 * Gets the deviceChannel.
 *
 * @return the deviceChannel
 */
public DeviceChannel getDeviceChannel() {
	return deviceChannel;
}
/**
 * Sets the deviceChannel.
 *
 * @param deviceChannel the new deviceChannel
 */
public void setDeviceChannel(DeviceChannel deviceChannel) {
	this.deviceChannel = deviceChannel;
}
/**
 * Gets the messageCategory.
 *
 * @return the messageCategory
 */
public MessageCategory getMessageCategory() {
	return messageCategory;
}
/**
 * Sets the messageCategory.
 *
 * @param messageCategory the new messageCategory
 */
public void setMessageCategory(MessageCategory messageCategory) {
	this.messageCategory = messageCategory;
}
/**
 * Gets the initialPurchaseTime.
 *
 * @return the initialPurchaseTime
 */
public String getInitialPurchaseTime() {
	return initialPurchaseTime;
}
/**
 * Sets the initialPurchaseTime.
 *
 * @param initialPurchaseTime the new initialPurchaseTime
 */
public void setInitialPurchaseTime(String initialPurchaseTime) {
	this.initialPurchaseTime = initialPurchaseTime;
}
/**
 * Gets the requestorChallengePreference.
 *
 * @return the requestorChallengePreference
 */
public RequestorChallengePreference getRequestorChallengePreference() {
	return requestorChallengePreference;
}
/**
 * Sets the requestorChallengePreference.
 *
 * @param requestorChallengePreference the new requestorChallengePreference
 */
public void setRequestorChallengePreference(RequestorChallengePreference requestorChallengePreference) {
	this.requestorChallengePreference = requestorChallengePreference;
}
/**
 * Gets the electronicDelivery.
 *
 * @return the electronicDelivery
 */
public ElectronicDelivery getElectronicDelivery() {
	return electronicDelivery;
}
/**
 * Sets the electronicDelivery.
 *
 * @param electronicDelivery the new electronicDelivery
 */
public void setElectronicDelivery(ElectronicDelivery electronicDelivery) {
	this.electronicDelivery = electronicDelivery;
}
/**
 * Gets the orderItemDetails.
 *
 * @return the orderItemDetails
 */
public OrderItemDetails getOrderItemDetails() {
	return orderItemDetails;
}
/**
 * Sets the orderItemDetails.
 *
 * @param orderItemDetails the new orderItemDetails
 */
public void setOrderItemDetails(OrderItemDetails orderItemDetails) {
	this.orderItemDetails = orderItemDetails;
}
/**
 * Gets the purchasedGiftCardDetails.
 *
 * @return the purchasedGiftCardDetails
 */
public PurchasedGiftCardDetails getPurchasedGiftCardDetails() {
	return purchasedGiftCardDetails;
}
/**
 * Sets the purchasedGiftCardDetails.
 *
 * @param purchasedGiftCardDetails the new purchasedGiftCardDetails
 */
public void setPurchasedGiftCardDetails(PurchasedGiftCardDetails purchasedGiftCardDetails) {
	this.purchasedGiftCardDetails = purchasedGiftCardDetails;
}
/**
 * Gets the billingCycle.
 *
 * @return the billingCycle
 */
public BillingCycle getBillingCycle() {
	return billingCycle;
}
/**
 * Sets the billingCycle.
 *
 * @param billingCycle the new billingCycle
 */
public void setBillingCycle(BillingCycle billingCycle) {
	this.billingCycle = billingCycle;
}
/**
 * Gets the browserDetails.
 *
 * @return the browserDetails
 */
public BrowserDetails getBrowserDetails() {
	return browserDetails;
}
/**
 * Sets the browserDetails.
 *
 * @param browserDetails the new browserDetails
 */
public void setBrowserDetails(BrowserDetails browserDetails) {
	this.browserDetails = browserDetails;
}
/**
 * Gets the userAccountDetails.
 *
 * @return the userAccountDetails
 */
public UserAccountDetails getUserAccountDetails() {
	return userAccountDetails;
}
/**
 * Sets the userAccountDetails.
 *
 * @param userAccountDetails the new userAccountDetails
 */
public void setUserAccountDetails(UserAccountDetails userAccountDetails) {
	this.userAccountDetails = userAccountDetails;
}
/**
 * Gets the billingDetails.
 *
 * @return the billingDetails
 */
public BillingDetails getBillingDetails() {
	return billingDetails;
}
/**
 * Sets the billingDetails.
 *
 * @param billingDetails the new billingDetails
 */
public void setBillingDetails(BillingDetails billingDetails) {
	this.billingDetails = billingDetails;
}
/**
 * Gets the shippingDetails.
 *
 * @return the shippingDetails
 */
public ShippingDetails getShippingDetails() {
	return shippingDetails;
}
/**
 * Sets the shippingDetails.
 *
 * @param shippingDetails the new shippingDetails
 */
public void setShippingDetails(ShippingDetails shippingDetails) {
	this.shippingDetails = shippingDetails;
}

/**
 * Gets the profile.
 *
 * @return the profile
 */
public Profile getProfile() {
	return profile;
}
/**
 * Sets the profile.
 *
 * @param profile the new profile
 */
public void setProfile(Profile profile) {
	this.profile = profile;
}
/**
 * Gets the links.
 *
 * @return the links
 */	
public ArrayList<Link> getLinks() {
		return links;
}

/**
 * Sets the links.
 *
 * @param links the new links
 */
public void setLinks(ArrayList<Link> links) {
		this.links = links;
 }

/**
 * Get an Authentications builder.
 *
 * @return AuthenticationsBuilder
 */
public static final AuthenticationsBuilder builder(){
	return new AuthenticationsBuilder();
}

/**
 * The builder class for Authentications.
 */
public static class AuthenticationsBuilder extends BaseBuilder<Authentications>{
	/** The Authentications. */
	private final Authentications authentications=new Authentications();
	
	/** The card builder. */
	private Card.CardBuilder<AuthenticationsBuilder>cardBuilder;
	
	/** The electronic delivery builder. */
	private ElectronicDelivery.ElectronicDeliveryBuilder<AuthenticationsBuilder>electronicDeliveryBuilder;
	
	/** The order item details builder. */
	private OrderItemDetails.OrderItemDetailsBuilder<AuthenticationsBuilder>orderItemDetailsBuilder;
	
	/** The purchased gift card details builder. */
	private PurchasedGiftCardDetails.PurchasedGiftCardDetailsBuilder<AuthenticationsBuilder>purchasedGiftCardDetailsBuilder;
	
	/** The billing cycle builder. */
	private BillingCycle.BillingCycleBuilder<AuthenticationsBuilder>billingCycleBuilder;
	
	/** The browser details builder. */
	private BrowserDetails.BrowserDetailsBuilder<AuthenticationsBuilder>browserDetailsBuilder;
	
	/** The User Account Details builder. */
	private UserAccountDetails.UserAccountDetailsBuilder<AuthenticationsBuilder>userAccountDetailsBuilder;
	
	/** The Billing Details builder. */
	private BillingDetails.BillingDetailsBuilder<AuthenticationsBuilder>billingDetailsBuilder;
	
	/** The Shipping Details builder. */
	private ShippingDetails.ShippingDetailsBuilder<AuthenticationsBuilder>shippingDetailsBuilder;
	
	/** The Profile builder. */
	private Profile.ProfileBuilder<AuthenticationsBuilder>profileBuilder;
	
	
	/**
     * Build this Authentications object.
     *
     * @return Authentications
     */
	@Override
	public Authentications build() {
		if(null!=cardBuilder){
			authentications.setCard(cardBuilder.build());
		}
		if(null!=electronicDeliveryBuilder){
			authentications.setElectronicDelivery(electronicDeliveryBuilder.build());
		}
		if(null!=orderItemDetailsBuilder){
			authentications.setOrderItemDetails(orderItemDetailsBuilder.build());
		}
		if(null!=purchasedGiftCardDetailsBuilder){
			authentications.setPurchasedGiftCardDetails(purchasedGiftCardDetailsBuilder.build());
		}
		if(null!=billingCycleBuilder){
			authentications.setBillingCycle(billingCycleBuilder.build());
		}
		if(null!=browserDetailsBuilder){
			authentications.setBrowserDetails(browserDetailsBuilder.build());
		}
		if(null!=userAccountDetailsBuilder){
			authentications.setUserAccountDetails(userAccountDetailsBuilder.build());
		}
		if(null!=billingDetailsBuilder){
			authentications.setBillingDetails(billingDetailsBuilder.build());
		}
		if(null!=shippingDetailsBuilder){
			authentications.setShippingDetails(shippingDetailsBuilder.build());
		}
		if(null!=profileBuilder){
			authentications.setProfile(profileBuilder.build());
		}
		return authentications;
	}
	
	/**
     * Build a card within this authentications.
     *
     * @return Card.CardBuilder< AuthenticationsBuilder >
     */
	public final Card.CardBuilder<AuthenticationsBuilder> card(){
		if(null==cardBuilder)
			cardBuilder=new Card.CardBuilder<AuthenticationsBuilder>(this);
		return cardBuilder;
	}
	
	public final ElectronicDelivery.ElectronicDeliveryBuilder<AuthenticationsBuilder> electronicDelivery(){
		if(null==electronicDeliveryBuilder)
			electronicDeliveryBuilder=new ElectronicDelivery.ElectronicDeliveryBuilder<AuthenticationsBuilder>(this);
		return electronicDeliveryBuilder;
	}
	
	public final OrderItemDetails.OrderItemDetailsBuilder<AuthenticationsBuilder> orderItemDetails(){
		if(null==orderItemDetailsBuilder)
			orderItemDetailsBuilder=new OrderItemDetails.OrderItemDetailsBuilder<AuthenticationsBuilder>(this);
		return orderItemDetailsBuilder;
	}
	public final PurchasedGiftCardDetails.PurchasedGiftCardDetailsBuilder<AuthenticationsBuilder> purchasedGiftCardDetails(){
		if(null==purchasedGiftCardDetailsBuilder)
			purchasedGiftCardDetailsBuilder=new PurchasedGiftCardDetails.PurchasedGiftCardDetailsBuilder<AuthenticationsBuilder>(this);
		return purchasedGiftCardDetailsBuilder;
		
	}
	public final BillingCycle.BillingCycleBuilder<AuthenticationsBuilder>billingCycle(){
		if(null==billingCycleBuilder)
			billingCycleBuilder=new BillingCycle.BillingCycleBuilder<AuthenticationsBuilder>(this);
		return billingCycleBuilder;
	}
	
	public final BrowserDetails.BrowserDetailsBuilder<AuthenticationsBuilder> browserDetails(){
		if(null==browserDetailsBuilder)
			browserDetailsBuilder=new BrowserDetails.BrowserDetailsBuilder<AuthenticationsBuilder>(this);
		return browserDetailsBuilder;
	}
	
	public final BillingDetails.BillingDetailsBuilder<AuthenticationsBuilder>billingDetails(){
		if(null==billingDetailsBuilder)
			billingDetailsBuilder=new BillingDetails.BillingDetailsBuilder<AuthenticationsBuilder>(this);
		return billingDetailsBuilder;
	}
	
	public final AuthenticationsBuilder billingDetails(
			final com.paysafe.customervault.Address a){
		billingDetailsBuilder=new BillingDetails.BillingDetailsBuilder<
				AuthenticationsBuilder>(this, a);
		return this;
	}
	public final UserAccountDetails.UserAccountDetailsBuilder<AuthenticationsBuilder> userAccountDetails(){
		if(null==userAccountDetailsBuilder)
			userAccountDetailsBuilder=new UserAccountDetails.UserAccountDetailsBuilder<AuthenticationsBuilder>(this);
		return userAccountDetailsBuilder;
	}
	
	public final ShippingDetails.ShippingDetailsBuilder<AuthenticationsBuilder> shippingDetails(){
		if(null==shippingDetailsBuilder)
			shippingDetailsBuilder=new ShippingDetails.ShippingDetailsBuilder<AuthenticationsBuilder>(this);
		return shippingDetailsBuilder;
	}
	public final AuthenticationsBuilder shippingDetails(final com.paysafe.customervault.Address a){
		shippingDetailsBuilder=new ShippingDetails.ShippingDetailsBuilder<AuthenticationsBuilder>(this, a);
		return this;
	}
	
	public final Profile.ProfileBuilder<AuthenticationsBuilder> profile(){
		if(null==profileBuilder)
			profileBuilder=new Profile.ProfileBuilder<AuthenticationsBuilder>(this);
		return profileBuilder;
	}

	/**
     * Set the id property.
     *
     * @param id the id
     * @return AuthenticationsBuilder
     */
	public final AuthenticationsBuilder id(final Id<Authentications> id){
		authentications.setId(id);
		return this;
	}
	
	
	/**
     * Set the deviceFingerprintingId property.
     *
     * @param deviceFingerprintingId thedeviceFingerprintingId
     * @return AuthenticationsBuilder
     */
	public final AuthenticationsBuilder deviceFingerprintingId(final String deviceFingerprintingId){
		authentications.setDeviceFingerprintingId(deviceFingerprintingId);
		return this;
	}
	
	/**
     * Set the merchantRefNum property.
     *
     * @param merchantRefNum the merchant Ref Num
     * @return AuthenticationsBuilder
     */
	public final AuthenticationsBuilder merchantRefNum(final String merchantRefNum){
		authentications.setMerchantRefNum(merchantRefNum);
		return this;
	}
	
	/**
     * Set the amount property.
     *
     * @param amount the amount
     * @return AuthenticationsBuilder
     */
	public final AuthenticationsBuilder amount(final Integer amount){
		authentications.setAmount(amount);
		return this;
	}
	
	/**
     * Set the currency property.
     *
     * @param currency the currency
     * @return AuthenticationsBuilder
     */
	public final AuthenticationsBuilder currency(final String currency){
		authentications.setCurrency(currency);
		return this;
	}
	
	/**
     * Set the merchantUrl property.
     *
     * @param merchantUrl the merchantUrl
     * @return AuthenticationsBuilder
     */
	public final AuthenticationsBuilder merchantUrl(final String merchantUrl){
		authentications.setMerchantUrl(merchantUrl);
		return this;
	}
	
	/**
     * Set the txnTime property.
     *
     * @param txnTime the txnTime
     * @return AuthenticationsBuilder
     */
	public final AuthenticationsBuilder txnTime(final String txnTime){
		authentications.setTxnTime(txnTime);
		return this;
	}
	
	/**
     * Set the status property.
     *
     * @param status the status
     * @return AuthenticationsBuilder
     */
	public final AuthenticationsBuilder status(final Status status){
		authentications.setStatus(status);
		return this;
	}
	
	/**
     * Set the acsURL property.
     *
     * @param acsURL the acsURL
     * @return AuthenticationsBuilder
     */
	public final AuthenticationsBuilder acsURL(final String acsURL){
		authentications.setAcsURL(acsURL);
		return this;
	}
	
	/**
     * Set the payload property.
     *
     * @param payload the payload
     * @return AuthenticationsBuilder
     */
	public final AuthenticationsBuilder payload(final String payload){
		authentications.setPayload(payload);
		return this;
	}
	
	/**
     * Set the threeDEnrollment property.
     *
     * @param threeDEnrollment the threeDEnrollment
     * @return AuthenticationsBuilder
     */
	public final AuthenticationsBuilder threeDEnrollment(final ThreeDEnrollment threeDEnrollment){
		authentications.setThreeDEnrollment(threeDEnrollment);
		return this;
	}
	
	/**
     * Set the threeDResult property.
     *
     * @param threeDResult the threeDResult
     * @return AuthenticationsBuilder
     */
	public final AuthenticationsBuilder threeDResult(final ThreeDResult threeDResult){
		authentications.setThreeDResult(threeDResult);
		return this;
	}
	
	/**
     * Set the threeDSecureVersion property.
     *
     * @param threeDSecureVersion the threeDSecureVersion
     * @return AuthenticationsBuilder
     */
	public final AuthenticationsBuilder threeDSecureVersion(final String threeDSecureVersion){
		authentications.setThreeDSecureVersion(threeDSecureVersion);
		return this;
	}
	
	/**
     * Set the directoryServerTransactionId property.
     *
     * @param directoryServerTransactionId the directoryServerTransactionId
     * @return AuthenticationsBuilder
     */
	public final AuthenticationsBuilder directoryServerTransactionId(final String directoryServerTransactionId){
		authentications.setDirectoryServerTransactionId(directoryServerTransactionId);
		return this;
	}
	
	/**
     * Set the eci property.
     *
     * @param eci the eci
     * @return AuthenticationsBuilder
     */
	public final AuthenticationsBuilder eci(final Integer eci){
		authentications.setEci(eci);
		return this;
	}
	
	/**
     * Set the cavv property.
     *
     * @param cavv the cavv
     * @return AuthenticationsBuilder
     */
	public final AuthenticationsBuilder cavv(final String cavv){
		authentications.setCavv(cavv);
		return this;
	}
	
	/**
     * Set the xid property.
     *
     * @param xid the xid
     * @return AuthenticationsBuilder
     */
	public final AuthenticationsBuilder xid(final String xid){
		authentications.setXid(xid);
		return this;
	}
	
	/**
     * Set the sdkChallengePayload property.
     *
     * @param sdkChallengePayload the sdkChallengePayload
     * @return AuthenticationsBuilder
     */
	public final AuthenticationsBuilder sdkChallengePayload(final String sdkChallengePayload){
		authentications.setSdkChallengePayload(sdkChallengePayload);
		return this;
	}
	
	/**
     * Set the transactionIntent property.
     *
     * @param transactionIntent the transactionIntent
     * @return AuthenticationsBuilder
     */
	public final AuthenticationsBuilder transactionIntent(final TransactionIntent transactionIntent){
		authentications.setTransactionIntent(transactionIntent);
		return this;
	}
	
	/**
     * Set the maxAuthorizationsForInstalmentPayment property.
     *
     * @param maxAuthorizationsForInstalmentPayment the maxAuthorizationsForInstalmentPayment
     * @return AuthenticationsBuilder
     */
	public final AuthenticationsBuilder maxAuthorizationsForInstalmentPayment(final Integer maxAuthorizationsForInstalmentPayment){
		authentications.setMaxAuthorizationsForInstalmentPayment(maxAuthorizationsForInstalmentPayment);
		return this;
	}
	
	/**
     * Set the authenticationPurpose property.
     *
     * @param authenticationPurpose the authenticationPurpose
     * @return AuthenticationsBuilder
     */
	public final AuthenticationsBuilder authenticationPurpose(final AuthenticationPurpose authenticationPurpose){
		authentications.setAuthenticationPurpose(authenticationPurpose);
		return this;
	}
	
	/**
     * Set the deviceChannel property.
     *
     * @param deviceChannel the deviceChannel
     * @return AuthenticationsBuilder
     */
	public final AuthenticationsBuilder deviceChannel(final DeviceChannel deviceChannel){
		authentications.setDeviceChannel(deviceChannel);
		return this;
	}
	
	/**
     * Set the messageCategory property.
     *
     * @param messageCategory the messageCategory
     * @return AuthenticationsBuilder
     */
	public final AuthenticationsBuilder messageCategory(final MessageCategory messageCategory){
		authentications.setMessageCategory(messageCategory);
		return this;
	}
	/**
     * Set the initialPurchaseTime property.
     *
     * @param initialPurchaseTime the initial Purchase Time
     * @return AuthenticationsBuilder
     */
	public final AuthenticationsBuilder initialPurchaseTime(final String initialPurchaseTime){
		authentications.setInitialPurchaseTime(initialPurchaseTime);
		return this;
	}
	
	/**
     * Set the requestorChallengePreference property.
     *
     * @param requestorChallengePreference the requestor Challenge Preference
     * @return AuthenticationsBuilder
     */
	public final AuthenticationsBuilder requestorChallengePreference(final RequestorChallengePreference requestorChallengePreference){
		authentications.setRequestorChallengePreference(requestorChallengePreference);
		return this;
	}
  }
}
