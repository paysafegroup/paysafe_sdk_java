package com.paysafe.threedsecureV2;

import com.google.gson.annotations.Expose;
import com.paysafe.common.impl.DomainObject;
import com.paysafe.common.impl.GenericBuilder;
import com.paysafe.common.impl.NestedBuilder;

/**
 * The Class PriorThreeDSAuthentication.
 */
public class PriorThreeDSAuthentication implements DomainObject {
	/** The data. */
	@Expose
	private String data;

	/** The method. */
	@Expose
	private Method method;

	/** The time. */
	@Expose
	private String time;

	/** The id. */
	@Expose
	private String id;

	/**
	 * Gets the data.
	 *
	 * @return the data
	 */
	public String getData() {
		return data;
	}

	/**
	 * Sets the data.
	 *
	 * @param data the new data
	 *            
	 */
	public void setData(String data) {
		this.data = data;
	}

	/**
	 * Gets the method.
	 *
	 * @return the method
	 */
	public Method getMethod() {
		return method;
	}

	/**
	 * Sets the method.
	 * 
	 * @param method the new method
	 *            
	 */
	public void setMethod(Method method) {
		this.method = method;
	}

	/**
	 * Gets the time.
	 *
	 * @return the time
	 */
	public String getTime() {
		return time;
	}

	/**
	 * Sets the time.
	 *
	 * @param time the new time
	 *            
	 */
	public void setTime(String time) {
		this.time = time;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 *            
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * The builder class for PriorThreeDSAuthentication.
	 */
	public static class PriorThreeDSAuthenticationBuilder<BLDRT extends GenericBuilder>
			extends NestedBuilder<PriorThreeDSAuthentication, BLDRT> {

		private final PriorThreeDSAuthentication priorThreeDSAuthentication = new PriorThreeDSAuthentication();

		public PriorThreeDSAuthenticationBuilder(final BLDRT parent) {
			super(parent);
		}

		@Override
		public PriorThreeDSAuthentication build() {
			return priorThreeDSAuthentication;
		}

		/**
		 * Set the data property.
		 *
		 * @param data the data
		 *            
		 * @return PriorThreeDSAuthenticationBuilder
		 */
		public final PriorThreeDSAuthenticationBuilder<BLDRT> data(final String data) {
			priorThreeDSAuthentication.setData(data);
			return this;
		}

		/**
		 * Set the method property.
		 *
		 * @param method the method
		 *            
		 * @return PriorThreeDSAuthenticationBuilder
		 */
		public final PriorThreeDSAuthenticationBuilder<BLDRT> method(final Method method) {
			priorThreeDSAuthentication.setMethod(method);
			return this;
		}

		/**
		 * Set the time property.
		 *
		 * @param time the time
		 *            
		 * @return PriorThreeDSAuthenticationBuilder
		 */
		public final PriorThreeDSAuthenticationBuilder<BLDRT> time(final String time) {
			priorThreeDSAuthentication.setTime(time);
			return this;
		}

		/**
		 * Set the id property.
		 *
		 * @param id the id
		 *           
		 * @return PriorThreeDSAuthenticationBuilder
		 */
		public final PriorThreeDSAuthenticationBuilder<BLDRT> id(final String id) {
			priorThreeDSAuthentication.setId(id);
			return this;
		}
	}
}
