package com.paysafe.threedsecureV2;

import com.google.gson.annotations.Expose;
import com.paysafe.common.impl.DomainObject;
import com.paysafe.common.impl.GenericBuilder;
import com.paysafe.common.impl.NestedBuilder;

/**
 * The Class UserAccountDetails.
 */
public class UserAccountDetails implements DomainObject {

	/** The created Date. */
	@Expose
	private String createdDate;

	/** The created Range. */
	@Expose
	private CreatedRange createdRange;

	/** The changed Date. */
	@Expose
	private String changedDate;

	/** The changed Range. */
	@Expose
	private ChangedRange changedRange;

	/** The password Changed Date. */
	@Expose
	private String passwordChangedDate;

	/** The password Changed Range. */
	@Expose
	private PasswordChangedRange passwordChangedRange;

	/** The total Purchases Six Month Count. */
	@Expose
	private Integer totalPurchasesSixMonthCount;

	/** The add Card Attempts For LastDay. */
	@Expose
	private Integer addCardAttemptsForLastDay;

	/** The transactionCountForPreviousDay. */
	@Expose
	private Integer transactionCountForPreviousDay;

	/** The transaction Count For Previous Year. */
	@Expose
	private Integer transactionCountForPreviousYear;

	/** The suspicious Account Activity. */
	@Expose
	private Boolean suspiciousAccountActivity;

	/** The shipping Details Usage. */
	@Expose
	private ShippingDetailsUsage shippingDetailsUsage;

	/** The payment Account Details. */
	@Expose
	private PaymentAccountDetails paymentAccountDetails;

	/** The user Login. */
	@Expose
	private UserLogin userLogin;

	/** The prior ThreeDS Authentication. */
	@Expose
	private PriorThreeDSAuthentication priorThreeDSAuthentication;

	/** The travel Details. */
	@Expose
	private TravelDetails travelDetails;

	/**
	 * Gets the createdDate.
	 *
	 * @return the createdDate
	 */
	public String getCreatedDate() {
		return createdDate;
	}

	/**
	 * Sets the createdDate.
	 *
	 * @param createdDate the new createdDate
	 *            
	 */
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * Gets the createdRange.
	 *
	 * @return the createdRange
	 */
	public CreatedRange getCreatedRange() {
		return createdRange;
	}

	/**
	 * Sets the createdRange.
	 *
	 * @param createdRange the new createdRange
	 *            
	 */
	public void setCreatedRange(CreatedRange createdRange) {
		this.createdRange = createdRange;
	}

	/**
	 * Gets the changedDate.
	 *
	 * @return the changedDate
	 */
	public String getChangedDate() {
		return changedDate;
	}

	/**
	 * Sets the changedDate.
	 *
	 * @param changedDate the new changedDate
	 *           
	 */
	public void setChangedDate(String changedDate) {
		this.changedDate = changedDate;
	}

	/**
	 * Gets the changedRange.
	 *
	 * @return the changedRange
	 */
	public ChangedRange getChangedRange() {
		return changedRange;
	}

	/**
	 * Sets the changedRange.
	 *
	 * @param changedRange the new changedRange
	 *            
	 */
	public void setChangedRange(ChangedRange changedRange) {
		this.changedRange = changedRange;
	}

	/**
	 * Gets the passwordChangedDate.
	 *
	 * @return the passwordChangedDate
	 */
	public String getPasswordChangedDate() {
		return passwordChangedDate;
	}

	/**
	 * Sets the passwordChangedDate.
	 *
	 * @param passwordChangedDate the new passwordChangedDate
	 *            
	 */
	public void setPasswordChangedDate(String passwordChangedDate) {
		this.passwordChangedDate = passwordChangedDate;
	}

	/**
	 * Gets the passwordChangedRange.
	 *
	 * @return the passwordChangedRange
	 */
	public PasswordChangedRange getPasswordChangedRange() {
		return passwordChangedRange;
	}

	/**
	 * Sets the passwordChangedRange.
	 *
	 * @param passwordChangedRange the new passwordChangedRange
	 *            
	 */
	public void setPasswordChangedRange(PasswordChangedRange passwordChangedRange) {
		this.passwordChangedRange = passwordChangedRange;
	}

	/**
	 * Gets the totalPurchasesSixMonthCount.
	 *
	 * @return the totalPurchasesSixMonthCount
	 */
	public Integer getTotalPurchasesSixMonthCount() {
		return totalPurchasesSixMonthCount;
	}

	/**
	 * Sets the totalPurchasesSixMonthCount.
	 *
	 * @param totalPurchasesSixMonthCount the new totalPurchasesSixMonthCount
	 *            
	 */
	public void setTotalPurchasesSixMonthCount(Integer totalPurchasesSixMonthCount) {
		this.totalPurchasesSixMonthCount = totalPurchasesSixMonthCount;
	}

	/**
	 * Gets the addCardAttemptsForLastDay.
	 *
	 * @return the addCardAttemptsForLastDay
	 */
	public Integer getAddCardAttemptsForLastDay() {
		return addCardAttemptsForLastDay;
	}

	/**
	 * Sets the addCardAttemptsForLastDay.
	 *
	 * @param addCardAttemptsForLastDay the new addCardAttemptsForLastDay
	 *            
	 */
	public void setAddCardAttemptsForLastDay(Integer addCardAttemptsForLastDay) {
		this.addCardAttemptsForLastDay = addCardAttemptsForLastDay;
	}

	/**
	 * Gets the transactionCountForPreviousDay.
	 *
	 * @return the transactionCountForPreviousDay
	 */
	public Integer getTransactionCountForPreviousDay() {
		return transactionCountForPreviousDay;
	}

	/**
	 * Sets the transactionCountForPreviousDay.
	 *
	 * @param transactionCountForPreviousDay the new transactionCountForPreviousDay
	 *            
	 */
	public void setTransactionCountForPreviousDay(Integer transactionCountForPreviousDay) {
		this.transactionCountForPreviousDay = transactionCountForPreviousDay;
	}

	/**
	 * Gets the transactionCountForPreviousYear.
	 *
	 * @return the transactionCountForPreviousYear
	 */
	public Integer getTransactionCountForPreviousYear() {
		return transactionCountForPreviousYear;
	}

	/**
	 * Sets the transactionCountForPreviousYear.
	 *
	 * @param transactionCountForPreviousYear the new transactionCountForPreviousYear
	 *            
	 */
	public void setTransactionCountForPreviousYear(Integer transactionCountForPreviousYear) {
		this.transactionCountForPreviousYear = transactionCountForPreviousYear;
	}

	/**
	 * Gets the suspiciousAccountActivity.
	 *
	 * @return the suspiciousAccountActivity
	 */
	public Boolean getSuspiciousAccountActivity() {
		return suspiciousAccountActivity;
	}

	/**
	 * Sets the suspiciousAccountActivity.
	 *
	 * @param suspiciousAccountActivity the new suspiciousAccountActivity
	 *            
	 */
	public void setSuspiciousAccountActivity(Boolean suspiciousAccountActivity) {
		this.suspiciousAccountActivity = suspiciousAccountActivity;
	}

	/**
	 * Gets the shippingDetailsUsage.
	 *
	 * @return the shippingDetailsUsage
	 */
	public ShippingDetailsUsage getShippingDetailsUsage() {
		return shippingDetailsUsage;
	}

	/**
	 * Sets the shippingDetailsUsage.
	 *
	 * @param shippingDetailsUsage the new shippingDetailsUsage
	 *            
	 */
	public void setShippingDetailsUsage(ShippingDetailsUsage shippingDetailsUsage) {
		this.shippingDetailsUsage = shippingDetailsUsage;
	}

	/**
	 * Gets the paymentAccountDetails.
	 *
	 * @return the paymentAccountDetails
	 */
	public PaymentAccountDetails getPaymentAccountDetails() {
		return paymentAccountDetails;
	}

	/**
	 * Sets the paymentAccountDetails.
	 *
	 * @param paymentAccountDetails the new paymentAccountDetails
	 *            
	 */
	public void setPaymentAccountDetails(PaymentAccountDetails paymentAccountDetails) {
		this.paymentAccountDetails = paymentAccountDetails;
	}

	/**
	 * Gets the userLogin.
	 *
	 * @return the userLogin
	 */
	public UserLogin getUserLogin() {
		return userLogin;
	}

	/**
	 * Sets the userLogin.
	 *
	 * @param userLogin the new userLogin
	 *            
	 */
	public void setUserLogin(UserLogin userLogin) {
		this.userLogin = userLogin;
	}

	/**
	 * Gets the priorThreeDSAuthentication.
	 *
	 * @return the priorThreeDSAuthentication
	 */
	public PriorThreeDSAuthentication getPriorThreeDSAuthentication() {
		return priorThreeDSAuthentication;
	}

	/**
	 * Sets the priorThreeDSAuthentication.
	 *
	 * @param priorThreeDSAuthentication the new priorThreeDSAuthentication
	 *           
	 */
	public void setPriorThreeDSAuthentication(PriorThreeDSAuthentication priorThreeDSAuthentication) {
		this.priorThreeDSAuthentication = priorThreeDSAuthentication;
	}

	/**
	 * Gets the travelDetails.
	 *
	 * @return the travelDetails
	 */
	public TravelDetails getTravelDetails() {
		return travelDetails;
	}

	/**
	 * Sets the travelDetails.
	 *
	 * @param travelDetails the new travelDetails
	 *            
	 */
	public void setTravelDetails(TravelDetails travelDetails) {
		this.travelDetails = travelDetails;
	}

	/**
	 * The builder class for userAccountDetails.
	 */
	public static class UserAccountDetailsBuilder<BLDRT extends GenericBuilder>
			extends NestedBuilder<UserAccountDetails, BLDRT> {
		public UserAccountDetailsBuilder(final BLDRT parent) {
			super(parent);
			// TODO Auto-generated constructor stub
		}

		private final UserAccountDetails userAccountDetails = new UserAccountDetails();
		/** The shipping Details Usage builder. */
		private ShippingDetailsUsage.ShippingDetailsUsageBuilder<UserAccountDetailsBuilder<BLDRT>> shippingDetailsUsageBuilder;

		/** The Payment Account Details builder. */
		private PaymentAccountDetails.PaymentAccountDetailsBuilder<UserAccountDetailsBuilder<BLDRT>> paymentAccountDetailsBuilder;

		/** The User Login builder. */
		private UserLogin.UserLoginBuilder<UserAccountDetailsBuilder<BLDRT>> userLoginBuilder;

		/** The Prior ThreeDS Authentication builder. */
		private PriorThreeDSAuthentication.PriorThreeDSAuthenticationBuilder<UserAccountDetailsBuilder<BLDRT>> priorThreeDSAuthenticationBuilder;

		/** The Travel Details builder. */
		private TravelDetails.TravelDetailsBuilder<UserAccountDetailsBuilder<BLDRT>> travelDetailsBuilder;

		@Override
		public UserAccountDetails build() {
			if (null != shippingDetailsUsageBuilder) {
				userAccountDetails.setShippingDetailsUsage(shippingDetailsUsageBuilder.build());
			}
			if (null != paymentAccountDetailsBuilder) {
				userAccountDetails.setPaymentAccountDetails(paymentAccountDetailsBuilder.build());
			}
			if (null != userLoginBuilder) {
				userAccountDetails.setUserLogin(userLoginBuilder.build());
			}
			if (null != priorThreeDSAuthenticationBuilder) {
				userAccountDetails.setPriorThreeDSAuthentication(priorThreeDSAuthenticationBuilder.build());
			}
			if (null != travelDetailsBuilder) {
				userAccountDetails.setTravelDetails(travelDetailsBuilder.build());
			}
			return userAccountDetails;
		}

		public final ShippingDetailsUsage.ShippingDetailsUsageBuilder<UserAccountDetailsBuilder<BLDRT>> shippingDetailsUsage() {
			if (null == shippingDetailsUsageBuilder) {
				shippingDetailsUsageBuilder = new ShippingDetailsUsage.ShippingDetailsUsageBuilder<UserAccountDetailsBuilder<BLDRT>>(
						this);
			}
			return shippingDetailsUsageBuilder;
		}

		public final PaymentAccountDetails.PaymentAccountDetailsBuilder<UserAccountDetailsBuilder<BLDRT>> paymentAccountDetails() {
			if (null == paymentAccountDetailsBuilder) {
				paymentAccountDetailsBuilder = new PaymentAccountDetails.PaymentAccountDetailsBuilder<UserAccountDetailsBuilder<BLDRT>>(
						this);
			}
			return paymentAccountDetailsBuilder;
		}

		public final UserLogin.UserLoginBuilder<UserAccountDetailsBuilder<BLDRT>> userLogin() {
			if (null == userLoginBuilder) {
				userLoginBuilder = new UserLogin.UserLoginBuilder<UserAccountDetailsBuilder<BLDRT>>(this);
			}
			return userLoginBuilder;
		}

		public final PriorThreeDSAuthentication.PriorThreeDSAuthenticationBuilder<UserAccountDetailsBuilder<BLDRT>> priorThreeDSAuthentication() {
			if (null == priorThreeDSAuthenticationBuilder) {
				priorThreeDSAuthenticationBuilder = new PriorThreeDSAuthentication.PriorThreeDSAuthenticationBuilder<UserAccountDetailsBuilder<BLDRT>>(
						this);
			}
			return priorThreeDSAuthenticationBuilder;
		}

		public final TravelDetails.TravelDetailsBuilder<UserAccountDetailsBuilder<BLDRT>> travelDetails() {
			if (null == travelDetailsBuilder) {
				travelDetailsBuilder = new TravelDetails.TravelDetailsBuilder<UserAccountDetailsBuilder<BLDRT>>(this);
			}
			return travelDetailsBuilder;
		}

		/**
		 * Set the createdDate property.
		 *
		 * @param createdDate the createdDate
		 *            
		 * @return UserAccountDetailsBuilder
		 */
		public final UserAccountDetailsBuilder<BLDRT> createdDate(final String createdDate) {
			userAccountDetails.setCreatedDate(createdDate);
			return this;
		}

		/**
		 * Set the createdRange property.
		 *
		 * @param createdRange the createdRange
		 *            
		 * @return UserAccountDetailsBuilder
		 */
		public final UserAccountDetailsBuilder<BLDRT> createdRange(final CreatedRange createdRange) {
			userAccountDetails.setCreatedRange(createdRange);
			return this;
		}

		/**
		 * Set the changedDate property.
		 *
		 * @param changedDate the changedDate
		 *            
		 * @return UserAccountDetailsBuilder
		 */
		public final UserAccountDetailsBuilder<BLDRT> changedDate(final String changedDate) {
			userAccountDetails.setChangedDate(changedDate);
			return this;
		}

		/**
		 * Set the changedRange property.
		 *
		 * @param changedRange the changedRange
		 *            
		 * @return UserAccountDetailsBuilder
		 */
		public final UserAccountDetailsBuilder<BLDRT> changedRange(final ChangedRange changedRange) {
			userAccountDetails.setChangedRange(changedRange);
			return this;
		}

		/**
		 * Set the passwordChangedDate property.
		 *
		 * @param passwordChangedDate the passwordChangedDate
		 *            
		 * @return UserAccountDetailsBuilder
		 */
		public final UserAccountDetailsBuilder<BLDRT> passwordChangedDate(final String passwordChangedDate) {
			userAccountDetails.setPasswordChangedDate(passwordChangedDate);
			return this;
		}

		/**
		 * Set the passwordChangedRange property.
		 *
		 * @param passwordChangedRange the passwordChangedRange
		 *            
		 * @return UserAccountDetailsBuilder
		 */
		public final UserAccountDetailsBuilder<BLDRT> passwordChangedRange(
				final PasswordChangedRange passwordChangedRange) {
			userAccountDetails.setPasswordChangedRange(passwordChangedRange);
			return this;
		}

		/**
		 * Set the totalPurchasesSixMonthCount property.
		 *
		 * @param totalPurchasesSixMonthCount the totalPurchasesSixMonthCount
		 *            
		 * @return UserAccountDetailsBuilder
		 */
		public final UserAccountDetailsBuilder<BLDRT> totalPurchasesSixMonthCount(
				final Integer totalPurchasesSixMonthCount) {
			userAccountDetails.setTotalPurchasesSixMonthCount(totalPurchasesSixMonthCount);
			return this;
		}

		/**
		 * Set the addCardAttemptsForLastDay property.
		 *
		 * @param addCardAttemptsForLastDay the addCardAttemptsForLastDay
		 *            
		 * @return UserAccountDetailsBuilder
		 */
		public final UserAccountDetailsBuilder<BLDRT> addCardAttemptsForLastDay(
				final Integer addCardAttemptsForLastDay) {
			userAccountDetails.setAddCardAttemptsForLastDay(addCardAttemptsForLastDay);
			return this;
		}

		/**
		 * Set the transactionCountForPreviousDay property.
		 *
		 * @param transactionCountForPreviousDay the transactionCountForPreviousDay
		 *            
		 * @return UserAccountDetailsBuilder
		 */
		public final UserAccountDetailsBuilder<BLDRT> transactionCountForPreviousDay(
				final Integer transactionCountForPreviousDay) {
			userAccountDetails.setTransactionCountForPreviousDay(transactionCountForPreviousDay);
			return this;
		}

		/**
		 * Set the transactionCountForPreviousYear property.
		 *
		 * @param transactionCountForPreviousYear the transactionCountForPreviousYear
		 *            
		 * @return UserAccountDetailsBuilder
		 */
		public final UserAccountDetailsBuilder<BLDRT> transactionCountForPreviousYear(
				final Integer transactionCountForPreviousYear) {
			userAccountDetails.setTransactionCountForPreviousYear(transactionCountForPreviousYear);
			return this;
		}

		/**
		 * Set the suspiciousAccountActivity property.
		 * 
		 * @param suspiciousAccountActivity the suspiciousAccountActivity
		 *            
		 * @return UserAccountDetailsBuilder
		 */
		public final UserAccountDetailsBuilder<BLDRT> suspiciousAccountActivity(
				final Boolean suspiciousAccountActivity) {
			userAccountDetails.setSuspiciousAccountActivity(suspiciousAccountActivity);
			return this;
		}
	}

}
