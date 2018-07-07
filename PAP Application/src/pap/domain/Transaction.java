package pap.domain;

import java.util.Date;

/**
 *Class that defines the transaction with the customer.
 * @author @author      John Paul Jayme <jpaul.jayme.com>
 */
public class Transaction {
    private int transactionID;
    private int personID;
    private Date addedDate;
    private int addedBy;
    private Date receivedDate;
    private float clothingWeight;
    private float beddingsWeight;
    private Double totalAmount;
    private String transactionType;
    private static int transactionCounter = 1;
    /**
     *Default constructor.
     */
    public Transaction(){
        transactionID = transactionCounter++;
        this.personID = 0;
        this.addedDate = new Date();
        this.addedBy = 0;
        this.receivedDate = new Date();
        this.clothingWeight = 0;
        this.beddingsWeight = 0;
        this.totalAmount = 0.0;
        this.transactionType = "";
    }
    
    /**
     *Constructor that accepts parameters.
     * @param transactionID
     * @param personID
     * @param addedDate
     * @param addedBy
     * @param receivedDate
     * @param clothingWeight
     * @param beddingsWeight
     * @param totalAmount
     * @param transactionType
     */
    public Transaction(int transactionID, int personID, Date addedDate,
            int addedBy, Date receivedDate, 
            float clothingWeight, float beddingsWeight, double totalAmount,
            String transactionType){
        this.transactionID = transactionID;
        this.personID = personID;
        this.addedDate = addedDate;
        this.addedBy = addedBy;
        this.receivedDate = receivedDate;
        this.clothingWeight = clothingWeight;
        this.beddingsWeight = beddingsWeight;
        this.totalAmount = totalAmount;
        this.transactionType = transactionType;
    }
    
    /*
     * GETTERS
     */

    /**
     * Returns the Transaction ID
     * @return the transactionID
     */
    public int getTransactionID() {
        return transactionID;
    }

    /**
     * Returns the customer's PersonID
     * @return the personID
     */
    public int getPersonID() {
        return personID;
    }

    /**
     * Returns the date when the Transaction was added
     * @return the addedDate
     */
    public Date getAddedDate() {
        return addedDate;
    }

    /**
     * Returns the ID of the entity who added the Transaction
     * @return the addedBy
     */
    public int getAddedBy() {
        return addedBy;
    }

    /**
     * Returns the date when the laundry will be received
     * @return the receivedDate
     */
    public Date getReceivedDate() {
        return receivedDate;
    }

    /**
     * Returns the weight of clothes 
     * @return the clothingWeight
     */
    public float getClothingWeight() {
        return clothingWeight;
    }

    /**
     * Returns the weight of bedding 
     * @return the beddingsWeight
     */
    public float getBeddingsWeight() {
        return beddingsWeight;
    }

    /**
     * Returns the total amount to be paid
     * @return the totalAmount
     */
    public Double getTotalAmount() {
        return totalAmount;
    }

    /**
     * Returns the type of Transaction
     * @return the transactionType
     */
    public String getTransactionType() {
        return transactionType;
    }
    
    
    /*
     * SETTERS
     */

    /**
     * Sets the customer's PersonID
     * @param personID the personID to set
     */
    public void setPersonID(int personID) {
        this.personID = personID;
    }

    /**
     * Sets the date when the Transaction was added
     * @param addedDate the addedDate to set
     */
    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    /**
     * Sets the ID of the entity who added the Transaction
     * @param addedBy the addedBy to set
     */
    public void setAddedBy(int addedBy) {
        this.addedBy = addedBy;
    }

    /**
     * Sets the date when the laundry will be received
     * @param receivedDate the receivedDate to set
     */
    public void setReceivedDate(Date receivedDate) {
        this.receivedDate = receivedDate;
    }

    /**
     * Sets the weight of clothes 
     * @param clothingWeight the clothingWeight to set
     */
    public void setClothingWeight(float clothingWeight) {
        this.clothingWeight = clothingWeight;
    }

    /**
     * Sets the weight of bedding 
     * @param beddingsWeight the beddingsWeight to set
     */
    public void setBeddingsWeight(float beddingsWeight) {
        this.beddingsWeight = beddingsWeight;
    }

    /**
     * Sets the total amount to be paid
     * @param totalAmount the totalAmount to set
     */
    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * Sets the type of Transaction
     * @param transactionType the transactionType to set
     */
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }
}
