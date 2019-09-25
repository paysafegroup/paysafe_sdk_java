package com.paysafe.threedsecureV2;

import com.google.gson.annotations.Expose;
import com.paysafe.common.impl.DomainObject;
import com.paysafe.common.impl.GenericBuilder;
import com.paysafe.common.impl.NestedBuilder;

/**
 * The Class UserLogin.
 */
public class UserLogin implements DomainObject {

	/** The data. */
	@Expose
	private String data;

	/** The authenticationMethod. */
	@Expose
	private AuthenticationMethod authenticationMethod;

	/** The time. */
	@Expose
	private String time;

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
	 * @param data
	 *            the new data
	 */
	public void setData(String data) {
		this.data = data;
	}

	/**
	 * Gets the authenticationMethod.
	 *
	 * @return the authenticationMethod
	 */
	public AuthenticationMethod getAuthenticationMethod() {
		return authenticationMethod;
	}

	/**
	 * Sets the authenticationMethod.
	 *
	 * @param authenticationMethod
	 *            the new authenticationMethod
	 */
	public void setAuthenticationMethod(AuthenticationMethod authenticationMethod) {
		this.authenticationMethod = authenticationMethod;
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
	 * @param time
	 *            the new time
	 */
	public void setTime(String time) {
		this.time = time;
	}

	/**
	 * The builder class for UserLogin.
	 */
	public static class UserLoginBuilder<BLDRT extends GenericBuilder> extends NestedBuilder<UserLogin, BLDRT> {

		public UserLoginBuilder(final BLDRT parent) {
			super(parent);
			// TODO Auto-generated constructor stub
		}

		private final UserLogin userLogin = new UserLogin();

		@Override
		public UserLogin build() {
			// TODO Auto-generated method stub
			return userLogin;
		}

		/**
		 * Set the data property.
		 *
		 * @param data
		 *            the data
		 * @return UserLoginBuilder
		 */
		public final UserLoginBuilder<BLDRT> data(final String data) {
			userLogin.setData(data);
			return this;
		}

		/**
		 * Set the authenticationMethod property.
		 *
		 * @param authenticationMethod
		 *            the authenticationMethod
		 * @return UserLoginBuilder
		 */
		public final UserLoginBuilder<BLDRT> authenticationMethod(final AuthenticationMethod authenticationMethod) {
			userLogin.setAuthenticationMethod(authenticationMethod);
			return this;
		}

		/**
		 * Set the time property.
		 *
		 * @param time
		 *            the time
		 * @return UserLoginBuilder
		 */
		public final UserLoginBuilder<BLDRT> time(final String time) {
			userLogin.setTime(time);
			return this;
		}
	}
}
