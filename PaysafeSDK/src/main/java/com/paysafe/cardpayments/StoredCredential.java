package com.paysafe.cardpayments;

import com.google.gson.annotations.Expose;
import com.paysafe.common.impl.DomainObject;
import com.paysafe.common.impl.GenericBuilder;
import com.paysafe.common.impl.NestedBuilder;

public class StoredCredential implements DomainObject {

  /** The type. */
  @Expose
  private Type type;

  /** The occurrence. */
  @Expose
  private Occurrence occurrence;

  /**
   * Id of the initial recurring payment transaction.
   */
  @Expose
  private String initialTransactionId;

  /**
   * Id of the initial recurring payment transaction in case this transaction was processed through external PSP.
   */
  @Expose
  private String externalInitialTransactionId;

  /**
   * Gets the type.
   *
   * @return the type
   */
  public Type getType() {
    return type;
  }

  /**
   * Sets the type.
   *
   * @param type the new type
   */
  public void setType(Type type) {
    this.type = type;
  }

  /**
   * Gets the occurrence.
   *
   * @return the occurrence
   */
  public Occurrence getOccurrence() {
    return occurrence;
  }

  /**
   * Sets the occurrence.
   *
   * @param occurrence the new occurrence
   */
  public void setOccurrence(Occurrence occurrence) {
    this.occurrence = occurrence;
  }

  /**
   * Gets the initial recurring payment transaction id.
   *
   * @return the initial recurring payment transaction id
   */
  public String getInitialTransactionId() {
    return initialTransactionId;
  }

  /**
   * Sets the initial recurring payment transaction id.
   *
   * @param initialTransactionId the new initial recurring payment transaction id
   */
  public void setInitialTransactionId(String initialTransactionId) {
    this.initialTransactionId = initialTransactionId;
  }

  /**
   * Gets the external initial recurring payment transaction id.
   *
   * @return the external initial recurring payment transaction id
   */
  public String getExternalInitialTransactionId() {
    return externalInitialTransactionId;
  }

  /**
   * Sets the external initial recurring payment transaction id.
   *
   * @param externalInitialTransactionId the new external initial recurring payment transaction id
   */
  public void setExternalInitialTransactionId(String externalInitialTransactionId) {
    this.externalInitialTransactionId = externalInitialTransactionId;
  }

  /**
   * The builder class for StoredCredential.
   */
  public static class StoredCredentialBuilder<BLDRT extends GenericBuilder> extends
      NestedBuilder<StoredCredential, BLDRT> {

    public StoredCredentialBuilder(final BLDRT parent) {
      super(parent);
      // TODO Auto-generated constructor stub
    }

    private final StoredCredential storedCredential = new StoredCredential();

    @Override
    public StoredCredential build() {
      // TODO Auto-generated method stub
      return storedCredential;
    }

    /**
     * Set the type property.
     *
     * @param type the type
     * @return StoredCredentialBuilder
     */
    public final StoredCredentialBuilder<BLDRT> type(final Type type) {
      storedCredential.setType(type);
      return this;
    }

    /**
     * Set the occurrence property.
     *
     * @param occurrence the occurrence
     * @return StoredCredentialBuilder
     */
    public final StoredCredentialBuilder<BLDRT> occurrence(final Occurrence occurrence) {
      storedCredential.setOccurrence(occurrence);
      return this;
    }

    /**
     * Set the initial recurring payment transaction id property.
     *
     * @param initialTransactionId the initial recurring payment transaction id
     * @return StoredCredentialBuilder
     */
    public final StoredCredentialBuilder<BLDRT> initialTransactionId(final String initialTransactionId) {
      storedCredential.setInitialTransactionId(initialTransactionId);
      return this;
    }

    /**
     * Set the external initial recurring payment transaction id.
     *
     * @param externalInitialTransactionId the external initial recurring payment transaction
     * @return StoredCredentialBuilder
     */
    public final StoredCredentialBuilder<BLDRT> externalInitialTransactionId(final String externalInitialTransactionId) {
      storedCredential.setExternalInitialTransactionId(externalInitialTransactionId);
      return this;
    }

  }

}
