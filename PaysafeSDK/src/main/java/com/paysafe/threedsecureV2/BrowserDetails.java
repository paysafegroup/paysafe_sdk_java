package com.paysafe.threedsecureV2;

import com.google.gson.annotations.Expose;
import com.paysafe.common.impl.DomainObject;
import com.paysafe.common.impl.GenericBuilder;
import com.paysafe.common.impl.NestedBuilder;

/**
 * The Class BrowserDetails.
 */
public class BrowserDetails implements DomainObject {

	/** The java enabled. */
	@Expose
	private Boolean javaEnabled;

	/** The javascript enabled. */
	@Expose
	private Boolean javascriptEnabled;

	/** The browser language. */
	@Expose
	private String language;

	/** The colorDepthBits. */
	@Expose
	private ColorDepthBits colorDepthBits;

	/** The screenHeight. */
	@Expose
	private Integer screenHeight;

	/** The screenWidth. */
	@Expose
	private Integer screenWidth;

	/** The timezoneOffset. */
	@Expose
	private Integer timezoneOffset;

	/** The userAgent. */
	@Expose
	private String userAgent;

	/** The acceptHeader. */
	@Expose
	private String acceptHeader;

	/** The customerIp. */
	@Expose
	private String customerIp;

	/**
	 * Gets the javaEnabled.
	 *
	 * @return the javaEnabled
	 */
	public Boolean getJavaEnabled() {
		return javaEnabled;
	}

	/**
	 * Sets the javaEnabled.
	 *
	 * @param javaEnabled  the new javaEnabled
	 *           
	 */
	public void setJavaEnabled(Boolean javaEnabled) {
		this.javaEnabled = javaEnabled;
	}

	/**
	 * Gets the javascriptEnabled.
	 *
	 * @return the javascriptEnabled
	 */
	public Boolean getJavascriptEnabled() {
		return javascriptEnabled;
	}

	/**
	 * Sets the javascriptEnabled.
	 *
	 * @param javascriptEnabled the new javascriptEnabled
	 *            
	 */
	public void setJavascriptEnabled(Boolean javascriptEnabled) {
		this.javascriptEnabled = javascriptEnabled;
	}

	/**
	 * Gets the language.
	 *
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * Sets the language.
	 *
	 * @param language the new language
	 *            
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * Gets the colorDepthBits.
	 *
	 * @return the colorDepthBits
	 */
	public ColorDepthBits getColorDepthBits() {
		return colorDepthBits;
	}

	/**
	 * Sets the colorDepthBits.
	 *
	 * @param colorDepthBits the new colorDepthBits
	 *            
	 */
	public void setColorDepthBits(ColorDepthBits colorDepthBits) {
		this.colorDepthBits = colorDepthBits;
	}

	/**
	 * Gets the screenHeight.
	 *
	 * @return the screenHeight
	 */
	public Integer getScreenHeight() {
		return screenHeight;
	}

	/**
	 * Sets the screenHeight.
	 *
	 * @param screenHeight the new screenHeight
	 *            
	 */
	public void setScreenHeight(Integer screenHeight) {
		this.screenHeight = screenHeight;
	}

	/**
	 * Gets the screenWidth.
	 *
	 * @return the screenWidth
	 */
	public Integer getScreenWidth() {
		return screenWidth;
	}

	/**
	 * Sets the screenWidth.
	 *
	 * @param screenWidth the new screenWidth
	 *            
	 */
	public void setScreenWidth(Integer screenWidth) {
		this.screenWidth = screenWidth;
	}

	/**
	 * Gets the timezoneOffset.
	 *
	 * @return the timezoneOffset
	 */
	public Integer getTimezoneOffset() {
		return timezoneOffset;
	}

	/**
	 * Sets the timezoneOffset.
	 *
	 * @param timezoneOffset the new timezoneOffset
	 *            
	 */
	public void setTimezoneOffset(Integer timezoneOffset) {
		this.timezoneOffset = timezoneOffset;
	}

	/**
	 * Gets the userAgent.
	 *
	 * @return the userAgent
	 */
	public String getUserAgent() {
		return userAgent;
	}

	/**
	 * Sets the userAgent.
	 *
	 * @param userAgent the new userAgent
	 *            
	 */
	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	/**
	 * Gets the acceptHeader.
	 *
	 * @return the acceptHeader
	 */
	public String getAcceptHeader() {
		return acceptHeader;
	}

	/**
	 * Sets the acceptHeader.
	 *
	 * @param acceptHeader the new acceptHeader
	 *            
	 */
	public void setAcceptHeader(String acceptHeader) {
		this.acceptHeader = acceptHeader;
	}

	/**
	 * Gets the customerIp.
	 *
	 * @return the customerIp
	 */
	public String getCustomerIp() {
		return customerIp;
	}

	/**
	 * Sets the customerIp.
	 *
	 * @param customerIp the new customerIp
	 *           
	 */
	public void setCustomerIp(String customerIp) {
		this.customerIp = customerIp;
	}

	/**
	 * The builder class for BrowserDetails.
	 */
	public static class BrowserDetailsBuilder<BLDRT extends GenericBuilder>
			extends NestedBuilder<BrowserDetails, BLDRT> {
		public BrowserDetailsBuilder(final BLDRT parent) {
			super(parent);
			// TODO Auto-generated constructor stub
		}

		private final BrowserDetails browserDetails = new BrowserDetails();

		@Override
		public BrowserDetails build() {
			// TODO Auto-generated method stub
			return browserDetails;
		}

		/**
		 * Set the javaEnabled property.
		 *
		 * @param javaEnabled the javaEnabled
		 *            
		 * @return BrowserDetailsBuilder
		 */
		public final BrowserDetailsBuilder<BLDRT> javaEnabled(final Boolean javaEnabled) {
			browserDetails.setJavaEnabled(javaEnabled);
			return this;
		}

		/**
		 * Set the javascriptEnabled property.
		 *
		 * @param javascriptEnabled the javascriptEnabled
		 *            
		 * @return BrowserDetailsBuilder
		 */
		public final BrowserDetailsBuilder<BLDRT> javascriptEnabled(final Boolean javascriptEnabled) {
			browserDetails.setJavascriptEnabled(javascriptEnabled);
			return this;
		}

		/**
		 * Set the language property.
		 *
		 * @param language the language
		 *            
		 * @return BrowserDetailsBuilder
		 */
		public final BrowserDetailsBuilder<BLDRT> language(final String language) {
			browserDetails.setLanguage(language);
			return this;
		}

		/**
		 * Set the colorDepthBits property.
		 *
		 * @param colorDepthBits the colorDepthBits
		 *           
		 * @return BrowserDetailsBuilder
		 */
		public final BrowserDetailsBuilder<BLDRT> colorDepthBits(final ColorDepthBits colorDepthBits) {
			browserDetails.setColorDepthBits(colorDepthBits);
			return this;
		}

		/**
		 * Set the screenHeight property.
		 *
		 * @param screenHeight the screenHeight
		 *            
		 * @return BrowserDetailsBuilder
		 */
		public final BrowserDetailsBuilder<BLDRT> screenHeight(final Integer screenHeight) {
			browserDetails.setScreenHeight(screenHeight);
			return this;
		}

		/**
		 * Set the screenWidth property.
		 *
		 * @param screenWidth the screenWidth
		 *            
		 * @return BrowserDetailsBuilder
		 */
		public final BrowserDetailsBuilder<BLDRT> screenWidth(final Integer screenWidth) {
			browserDetails.setScreenWidth(screenWidth);
			return this;
		}

		/**
		 * Set the timezoneOffset property.
		 *
		 * @param timezoneOffset the timezoneOffset
		 *            
		 * @return BrowserDetailsBuilder
		 */
		public final BrowserDetailsBuilder<BLDRT> timezoneOffset(final Integer timezoneOffset) {
			browserDetails.setTimezoneOffset(timezoneOffset);
			return this;
		}

		/**
		 * Set the userAgent property.
		 *
		 * @param userAgent the userAgent
		 *            
		 * @return BrowserDetailsBuilder
		 */
		public final BrowserDetailsBuilder<BLDRT> userAgent(final String userAgent) {
			browserDetails.setUserAgent(userAgent);
			return this;
		}

		/**
		 * Set the acceptHeader property.
		 *
		 * @param acceptHeader the acceptHeader
		 *            
		 * @return BrowserDetailsBuilder
		 */
		public final BrowserDetailsBuilder<BLDRT> acceptHeader(final String acceptHeader) {
			browserDetails.setAcceptHeader(acceptHeader);
			return this;
		}

		/**
		 * Set the customerIp property.
		 *
		 * @param customerIp the customerIp
		 *            
		 * @return BrowserDetailsBuilder
		 */
		public final BrowserDetailsBuilder<BLDRT> customerIp(final String customerIp) {
			browserDetails.setCustomerIp(customerIp);
			return this;
		}
	}
}
