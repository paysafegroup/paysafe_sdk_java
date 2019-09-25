
package com.paysafe.threedsecureV2;

import com.google.gson.annotations.Expose;
import com.paysafe.common.impl.DomainObject;
import com.paysafe.common.impl.GenericBuilder;
import com.paysafe.common.impl.NestedBuilder;

/**
 * The Class OrderItemDetails.
 */
public class OrderItemDetails implements DomainObject {

	/** The preOrderItemAvailabilityDate. */
	@Expose
	private String preOrderItemAvailabilityDate;

	/** The preOrderPurchaseIndicator. */
	@Expose
	private PreOrderPurchaseIndicator preOrderPurchaseIndicator;

	/** The reorderItemsIndicator. */
	@Expose
	private ReorderItemsIndicator reorderItemsIndicator;

	/** The shippingIndicator. */
	@Expose
	private ShippingIndicator shippingIndicator;

	/**
	 * Gets the preOrderItemAvailabilityDate.
	 *
	 * @return the preOrderItemAvailabilityDate
	 */
	public String getPreOrderItemAvailabilityDate() {
		return preOrderItemAvailabilityDate;
	}

	/**
	 * Sets the preOrderItemAvailabilityDate.
	 *
	 * @param preOrderItemAvailabilityDate the new preOrderItemAvailabilityDate
	 *            
	 */
	public void setPreOrderItemAvailabilityDate(String preOrderItemAvailabilityDate) {
		this.preOrderItemAvailabilityDate = preOrderItemAvailabilityDate;
	}

	/**
	 * Gets the preOrderPurchaseIndicator.
	 *
	 * @return the preOrderPurchaseIndicator
	 */
	public PreOrderPurchaseIndicator getPreOrderPurchaseIndicator() {
		return preOrderPurchaseIndicator;
	}

	/**
	 * Sets the preOrderPurchaseIndicator.
	 *
	 * @param preOrderPurchaseIndicator the new preOrderPurchaseIndicator
	 *            
	 */
	public void setPreOrderPurchaseIndicator(PreOrderPurchaseIndicator preOrderPurchaseIndicator) {
		this.preOrderPurchaseIndicator = preOrderPurchaseIndicator;
	}

	/**
	 * Gets the reorderItemsIndicator.
	 *
	 * @return the reorderItemsIndicator
	 */
	public ReorderItemsIndicator getReorderItemsIndicator() {
		return reorderItemsIndicator;
	}

	/**
	 * Sets the reorderItemsIndicator.
	 * 
	 * @param reorderItemsIndicator the new reorderItemsIndicator
	 *            
	 */
	public void setReorderItemsIndicator(ReorderItemsIndicator reorderItemsIndicator) {
		this.reorderItemsIndicator = reorderItemsIndicator;
	}

	/**
	 * Gets the shippingIndicator.
	 *
	 * @return the shippingIndicator
	 */
	public ShippingIndicator getShippingIndicator() {
		return shippingIndicator;
	}

	/**
	 * Sets the shippingIndicator.
	 *
	 * @param shippingIndicator the new shippingIndicator
	 *           
	 */
	public void setShippingIndicator(ShippingIndicator shippingIndicator) {
		this.shippingIndicator = shippingIndicator;
	}

	/**
	 * The builder class for OrderItemDetails.
	 */
	public static class OrderItemDetailsBuilder<BLDRT extends GenericBuilder>
			extends NestedBuilder<OrderItemDetails, BLDRT> {

		public OrderItemDetailsBuilder(final BLDRT parent) {
			super(parent);
		}

		private final OrderItemDetails orderItemDetails = new OrderItemDetails();

		@Override
		public OrderItemDetails build() {
			return orderItemDetails;
		}

		/**
		 * Set the preOrderItemAvailabilityDate property.
		 *
		 * @param preOrderItemAvailabilityDate the preOrderItemAvailabilityDate
		 *           
		 * @return OrderItemDetailsBuilder
		 */
		public final OrderItemDetailsBuilder<BLDRT> preOrderItemAvailabilityDate(
				final String preOrderItemAvailabilityDate) {
			orderItemDetails.setPreOrderItemAvailabilityDate(preOrderItemAvailabilityDate);
			return this;
		}

		/**
		 * Set the preOrderPurchaseIndicator property.
		 *
		 * @param preOrderPurchaseIndicator the preOrderPurchaseIndicator
		 *            
		 * @return OrderItemDetailsBuilder
		 */
		public final OrderItemDetailsBuilder<BLDRT> preOrderPurchaseIndicator(
				final PreOrderPurchaseIndicator preOrderPurchaseIndicator) {
			orderItemDetails.setPreOrderPurchaseIndicator(preOrderPurchaseIndicator);
			return this;

		}

		/**
		 * Set the reorderItemsIndicator property.
		 *
		 * @param reorderItemsIndicator the reorderItemsIndicator
		 *            
		 * @return OrderItemDetailsBuilder
		 */
		public final OrderItemDetailsBuilder<BLDRT> reorderItemsIndicator(
				final ReorderItemsIndicator reorderItemsIndicator) {
			orderItemDetails.setReorderItemsIndicator(reorderItemsIndicator);
			return this;
		}

		/**
		 * Set the shippingIndicator property.
		 *
		 * @param shippingIndicator the shippingIndicator
		 *            
		 * @return OrderItemDetailsBuilder
		 */
		public final OrderItemDetailsBuilder<BLDRT> shippingIndicator(final ShippingIndicator shippingIndicator) {
			orderItemDetails.setShippingIndicator(shippingIndicator);
			return this;
		}
	}
}
