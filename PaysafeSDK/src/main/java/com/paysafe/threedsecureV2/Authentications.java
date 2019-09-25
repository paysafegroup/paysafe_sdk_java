package com.paysafe.threedsecureV2;

import com.google.gson.annotations.Expose;
import com.paysafe.cardpayments.ThreeDResult;
import com.paysafe.common.Error;
import com.paysafe.common.Id;
import com.paysafe.common.impl.BaseBuilder;
import com.paysafe.common.impl.BaseDomainObject;

/**
 * The Class Authentications.
 */
public class Authentications implements BaseDomainObject {

	/** The id. */
	private Id<Authentications> id;

	/** The deviceFingerprintingId. */
	@Expose
	private String deviceFingerprintingId;

	/** The merchant reference number. */
	@Expose
	private String merchantRefNum;

	/** The amount. */
	@Expose
	private Long amount;

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

	private String txnTime;

	/** The error. */

	private Error error;

	/** The status. */

	private Status status;

	/** The acsUrl. */

	private String acsUrl;

	/** The payload. */

	private String payload;

	/** The three d enrollment. */

	private ThreeDEnrollment threeDEnrollment;

	/** The three d result. */

	private ThreeDResult threeDResult;

	/** The three d Secure Version. */

	private String threeDSecureVersion;

	/** The directoryServerTransactionId. */

	private String directoryServerTransactionId;

	/** The eci. */

	private Integer eci;

	/** The cavv. */

	private String cavv;

	/** The xid. */

	private String xid;

	/** The sdk Challenge Payload. */

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

	/** The signature Status. */

	private SignatureStatus signatureStatus;

	/** The threeDSecureServerTransactionId. */
	private String threeDSecureServerTransactionId;

	/** The Merchant Category Code. */
	@Expose
	private String mcc;

	/** The merchantName. */
	@Expose
	private String merchantName;

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
	 *            
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
	 *            
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
	 *            
	 */
	public void setMerchantRefNum(String merchantRefNum) {
		this.merchantRefNum = merchantRefNum;
	}

	/**
	 * Gets the amount.
	 *
	 * @return the amount
	 */
	public Long getAmount() {
		return amount;
	}

	/**
	 * Sets the amount.
	 *
	 * @param amount the new amount
	 *            
	 */
	public void setAmount(Long amount) {
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
	 *            
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
	 *            
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
	 *            
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
	 *            
	 */
	public void setTxnTime(String txnTime) {
		this.txnTime = txnTime;
	}
	/**
	 * Gets the error.
	 *
	 * @return the error
	 */

	public Error getError() {
		return error;
	}

	/**
	 * Sets the error.
	 *
	 * @param error the new error
	 *            
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
	 *            
	 */
	public void setStatus(Status status) {
		this.status = status;
	}

	/**
	 * Gets the acsUrl.
	 *
	 * @return the acsUrl
	 */
	public String getAcsUrl() {
		return acsUrl;
	}

	/**
	 * Sets the acsURL.
	 *
	 * @param acsURL  the new acsURL
	 *           
	 */
	public void setAcsUrl(String acsUrl) {
		this.acsUrl = acsUrl;
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
	 *          
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
	 *            
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
	 *            
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
	 *            
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
	 *            
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
	 *            
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
	 *            
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
	 *            
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
	 *            
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
	 *            
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
	 *            
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
	 *            
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
	 *            
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
	 *            
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
	 *            
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
	 *            
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
	 *            
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
	 *           
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
	 *            
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
	 *            
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
	 *            
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
	 *            
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
	 *            
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
	 *           
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
	 *            
	 */
	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	/**
	 * Gets the signatureStatus.
	 *
	 * @return the signatureStatus
	 */
	public SignatureStatus getSignatureStatus() {
		return signatureStatus;
	}

	/**
	 * Sets the signatureStatus.
	 *
	 * @param signatureStatus the new signatureStatus
	 *            
	 */
	public void setSignatureStatus(SignatureStatus signatureStatus) {
		this.signatureStatus = signatureStatus;
	}

	/**
	 * Gets the threeDSecureServerTransactionId.
	 *
	 * @return the threeDSecureServerTransactionId
	 */
	public String getThreeDSecureServerTransactionId() {
		return threeDSecureServerTransactionId;
	}

	/**
	 * Sets the threeDSecureServerTransactionId.
	 *
	 * @param threeDSecureServerTransactionId the new threeDSecureServerTransactionId
	 *            
	 */
	public void setThreeDSecureServerTransactionId(String threeDSecureServerTransactionId) {
		this.threeDSecureServerTransactionId = threeDSecureServerTransactionId;
	}

	/**
	 * Gets the mcc.
	 *
	 * @return the mcc
	 */
	public String getMcc() {
		return mcc;
	}

	/**
	 * Sets the mcc.
	 *
	 * @param mcc the new mcc
	 *            
	 */
	public void setMcc(String mcc) {
		this.mcc = mcc;
	}

	/**
	 * Gets the merchantName.
	 *
	 * @return the merchantName
	 */
	public String getMerchantName() {
		return merchantName;
	}

	/**
	 * Sets the merchantName.
	 *
	 * @param merchantName the new merchantName
	 *            
	 */
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	/**
	 * Get an Authentications builder.
	 *
	 * @return AuthenticationsBuilder
	 */
	public static final AuthenticationsBuilder builder() {
		return new AuthenticationsBuilder();
	}

	/**
	 * The builder class for Authentications.
	 */
	public static class AuthenticationsBuilder extends BaseBuilder<Authentications> {
		/** The Authentications. */
		private final Authentications authentications = new Authentications();

		/** The card builder. */
		private Card.CardBuilder<AuthenticationsBuilder> cardBuilder;

		/** The electronic delivery builder. */
		private ElectronicDelivery.ElectronicDeliveryBuilder<AuthenticationsBuilder> electronicDeliveryBuilder;

		/** The order item details builder. */
		private OrderItemDetails.OrderItemDetailsBuilder<AuthenticationsBuilder> orderItemDetailsBuilder;

		/** The purchased gift card details builder. */
		private PurchasedGiftCardDetails.PurchasedGiftCardDetailsBuilder<AuthenticationsBuilder> purchasedGiftCardDetailsBuilder;

		/** The billing cycle builder. */
		private BillingCycle.BillingCycleBuilder<AuthenticationsBuilder> billingCycleBuilder;

		/** The browser details builder. */
		private BrowserDetails.BrowserDetailsBuilder<AuthenticationsBuilder> browserDetailsBuilder;

		/** The User Account Details builder. */
		private UserAccountDetails.UserAccountDetailsBuilder<AuthenticationsBuilder> userAccountDetailsBuilder;

		/** The Billing Details builder. */
		private BillingDetails.BillingDetailsBuilder<AuthenticationsBuilder> billingDetailsBuilder;

		/** The Shipping Details builder. */
		private ShippingDetails.ShippingDetailsBuilder<AuthenticationsBuilder> shippingDetailsBuilder;

		/** The Profile builder. */
		private Profile.ProfileBuilder<AuthenticationsBuilder> profileBuilder;

		/**
		 * Build this Authentications object.
		 *
		 * @return Authentications
		 */
		@Override
		public Authentications build() {
			if (null != cardBuilder) {
				authentications.setCard(cardBuilder.build());
			}
			if (null != electronicDeliveryBuilder) {
				authentications.setElectronicDelivery(electronicDeliveryBuilder.build());
			}
			if (null != orderItemDetailsBuilder) {
				authentications.setOrderItemDetails(orderItemDetailsBuilder.build());
			}
			if (null != purchasedGiftCardDetailsBuilder) {
				authentications.setPurchasedGiftCardDetails(purchasedGiftCardDetailsBuilder.build());
			}
			if (null != billingCycleBuilder) {
				authentications.setBillingCycle(billingCycleBuilder.build());
			}
			if (null != browserDetailsBuilder) {
				authentications.setBrowserDetails(browserDetailsBuilder.build());
			}
			if (null != userAccountDetailsBuilder) {
				authentications.setUserAccountDetails(userAccountDetailsBuilder.build());
			}
			if (null != billingDetailsBuilder) {
				authentications.setBillingDetails(billingDetailsBuilder.build());
			}
			if (null != shippingDetailsBuilder) {
				authentications.setShippingDetails(shippingDetailsBuilder.build());
			}
			if (null != profileBuilder) {
				authentications.setProfile(profileBuilder.build());
			}
			return authentications;
		}

		/**
		 * Build a card within this authentications.
		 *
		 * @return Card.CardBuilder< AuthenticationsBuilder >
		 */
		public final Card.CardBuilder<AuthenticationsBuilder> card() {
			if (null == cardBuilder)
				cardBuilder = new Card.CardBuilder<AuthenticationsBuilder>(this);
			return cardBuilder;
		}

		public final ElectronicDelivery.ElectronicDeliveryBuilder<AuthenticationsBuilder> electronicDelivery() {
			if (null == electronicDeliveryBuilder)
				electronicDeliveryBuilder = new ElectronicDelivery.ElectronicDeliveryBuilder<AuthenticationsBuilder>(
						this);
			return electronicDeliveryBuilder;
		}

		public final OrderItemDetails.OrderItemDetailsBuilder<AuthenticationsBuilder> orderItemDetails() {
			if (null == orderItemDetailsBuilder)
				orderItemDetailsBuilder = new OrderItemDetails.OrderItemDetailsBuilder<AuthenticationsBuilder>(this);
			return orderItemDetailsBuilder;
		}

		public final PurchasedGiftCardDetails.PurchasedGiftCardDetailsBuilder<AuthenticationsBuilder> purchasedGiftCardDetails() {
			if (null == purchasedGiftCardDetailsBuilder)
				purchasedGiftCardDetailsBuilder = new PurchasedGiftCardDetails.PurchasedGiftCardDetailsBuilder<AuthenticationsBuilder>(
						this);
			return purchasedGiftCardDetailsBuilder;

		}

		public final BillingCycle.BillingCycleBuilder<AuthenticationsBuilder> billingCycle() {
			if (null == billingCycleBuilder)
				billingCycleBuilder = new BillingCycle.BillingCycleBuilder<AuthenticationsBuilder>(this);
			return billingCycleBuilder;
		}

		public final BrowserDetails.BrowserDetailsBuilder<AuthenticationsBuilder> browserDetails() {
			if (null == browserDetailsBuilder)
				browserDetailsBuilder = new BrowserDetails.BrowserDetailsBuilder<AuthenticationsBuilder>(this);
			return browserDetailsBuilder;
		}

		public final BillingDetails.BillingDetailsBuilder<AuthenticationsBuilder> billingDetails() {
			if (null == billingDetailsBuilder)
				billingDetailsBuilder = new BillingDetails.BillingDetailsBuilder<AuthenticationsBuilder>(this);
			return billingDetailsBuilder;
		}

		public final UserAccountDetails.UserAccountDetailsBuilder<AuthenticationsBuilder> userAccountDetails() {
			if (null == userAccountDetailsBuilder)
				userAccountDetailsBuilder = new UserAccountDetails.UserAccountDetailsBuilder<AuthenticationsBuilder>(
						this);
			return userAccountDetailsBuilder;
		}

		public final ShippingDetails.ShippingDetailsBuilder<AuthenticationsBuilder> shippingDetails() {
			if (null == shippingDetailsBuilder)
				shippingDetailsBuilder = new ShippingDetails.ShippingDetailsBuilder<AuthenticationsBuilder>(this);
			return shippingDetailsBuilder;
		}

		public final Profile.ProfileBuilder<AuthenticationsBuilder> profile() {
			if (null == profileBuilder)
				profileBuilder = new Profile.ProfileBuilder<AuthenticationsBuilder>(this);
			return profileBuilder;
		}

		/**
		 * Set the amount property.
		 *
		 * @param amount the amount
		 *            
		 * @return AuthenticationsBuilder
		 */
		public final AuthenticationsBuilder amount(final Long amount) {
			authentications.setAmount(amount);
			return this;
		}

		/**
		 * Set the currency property.
		 * 
		 * @param currency the currency
		 *            
		 * @return AuthenticationsBuilder
		 */
		public final AuthenticationsBuilder currency(final String currency) {
			authentications.setCurrency(currency);
			return this;
		}

		/**
		 * Set the merchantRefNum property.
		 *
		 * @param merchantRefNum the merchant Ref Num
		 *            
		 * @return AuthenticationsBuilder
		 */
		public final AuthenticationsBuilder merchantRefNum(final String merchantRefNum) {
			authentications.setMerchantRefNum(merchantRefNum);
			return this;
		}

		/**
		 * Set the merchantUrl property.
		 *
		 * @param merchantUrl the merchantUrl
		 *            
		 * @return AuthenticationsBuilder
		 */
		public final AuthenticationsBuilder merchantUrl(final String merchantUrl) {
			authentications.setMerchantUrl(merchantUrl);
			return this;
		}

		/**
		 * Set the deviceFingerprintingId property.
		 *
		 * @param deviceFingerprintingId the deviceFingerprintingId
		 *            
		 * @return AuthenticationsBuilder
		 */
		public final AuthenticationsBuilder deviceFingerprintingId(final String deviceFingerprintingId) {
			authentications.setDeviceFingerprintingId(deviceFingerprintingId);
			return this;
		}

		/**
		 * Set the deviceChannel property.
		 *
		 * @param deviceChannel the device Channel
		 *            
		 * @return AuthenticationsBuilder
		 */
		public final AuthenticationsBuilder deviceChannel(final DeviceChannel deviceChannel) {
			authentications.setDeviceChannel(deviceChannel);
			return this;
		}

		/**
		 * Set the requestorChallengePreference property.
		 *
		 * @param requestorChallengePreference the requestor Challenge Preference
		 *            
		 * @return AuthenticationsBuilder
		 */
		public final AuthenticationsBuilder requestorChallengePreference(
				final RequestorChallengePreference requestorChallengePreference) {
			authentications.setRequestorChallengePreference(requestorChallengePreference);
			return this;
		}

		/**
		 * Set the messageCategory property.
		 *
		 * @param messageCategory the message Category
		 *            
		 * @return AuthenticationsBuilder
		 */
		public final AuthenticationsBuilder messageCategory(final MessageCategory messageCategory) {
			authentications.setMessageCategory(messageCategory);
			return this;
		}

		/**
		 * Set the transactionIntent property.
		 *
		 * @param transactionIntent the transactionIntent
		 *            
		 * @return AuthenticationsBuilder
		 */
		public final AuthenticationsBuilder transactionIntent(final TransactionIntent transactionIntent) {
			authentications.setTransactionIntent(transactionIntent);
			return this;
		}

		/**
		 * Set the authenticationPurpose property.
		 *
		 * @param authenticationPurpose the authenticationPurpose
		 *            
		 * @return AuthenticationsBuilder
		 */
		public final AuthenticationsBuilder authenticationPurpose(final AuthenticationPurpose authenticationPurpose) {
			authentications.setAuthenticationPurpose(authenticationPurpose);
			return this;
		}

		/**
		 * Set the maxAuthorizations For Instalment Payment property.
		 *
		 * @param maxAuthorizationsForInstalmentPayment the maxAuthorizations For Instalment Payment
		 *            
		 *            
		 * @return AuthenticationsBuilder
		 */
		public final AuthenticationsBuilder maxAuthorizationsForInstalmentPayment(
				final Integer maxAuthorizationsForInstalmentPayment) {
			authentications.setMaxAuthorizationsForInstalmentPayment(maxAuthorizationsForInstalmentPayment);
			return this;
		}

		/**
		 * Set the initialPurchaseTime property.
		 *
		 * @param initialPurchaseTime the initial Purchase Time
		 *            
		 * @return AuthenticationsBuilder
		 */
		public final AuthenticationsBuilder initialPurchaseTime(final String initialPurchaseTime) {
			authentications.setInitialPurchaseTime(initialPurchaseTime);
			return this;
		}

		/**
		 * Set the mcc property.
		 *
		 * @param mcc the mcc
		 *            
		 * @return AuthenticationsBuilder
		 */
		public final AuthenticationsBuilder mcc(final String mcc) {
			authentications.setMcc(mcc);
			return this;
		}

		/**
		 * Set the merchantName property.
		 *
		 * @param merchantName the merchantName
		 *            
		 * @return AuthenticationsBuilder
		 */
		public final AuthenticationsBuilder merchantName(final String merchantName) {
			authentications.setMerchantName(merchantName);
			return this;
		}
	}
}
