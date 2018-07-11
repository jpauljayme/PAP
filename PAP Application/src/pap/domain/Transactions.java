package pap.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *Class that defines the transaction with the customer.
 * @author @author      John Paul Jayme <jpaul.jayme.com>
 */

@Entity
public class Transactions implements Serializable {
    @Id
    @Column(name="TransactionID")
    private int transactionID;
    @Column(name="PersonID")
    private Person personID;
    @Column(name="AddedDate")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date addedDate;
    @Column(name="AddedBy")
    private int addedBy;
    @Column(name="ReceivedDate")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date receivedDate;
    @Column(name="ClothingWeight")
    private double clothingWeight;
    @Column(name="BeddingsWeight")
    private double beddingsWeight;
    @Column(name="TotalAmount")
    private Double totalAmount;
    @Column(name="TransactionType")
    private String transactionType;
    /**
     *Default constructor.
     */
    public Transactions(){
        this.transactionID = 0;
        this.personID = null;
        this.addedBy = 0;
        this.clothingWeight = 0;
        this.beddingsWeight = 0;
        this.totalAmount = 0.0;
        this.transactionType = null;
    }
    
    /**
     *Constructor that accepts parameters.
     * @param personID
     * @param addedBy
     * @param clothingWeight
     * @param beddingsWeight
     * @param totalAmount
     * @param transactionType
     */
    
    public Transactions(Person personID, int addedBy, float clothingWeight,
                        float beddingsWeight, double totalAmount,
                        String transactionType){
        this.personID = personID;
        this.addedBy = addedBy;
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
    public Person getPersonID() {
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
    public double getClothingWeight() {
        return clothingWeight;
    }

    /**
     * Returns the weight of bedding 
     * @return the beddingsWeight
     */
    public double getBeddingsWeight() {
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
     * Sets the Transaction's ID
     * @param transactionID the transactionID to set
     */
    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    /**
     * Sets the customer's PersonID
     * @param personID the personID to set
     */
    public void setPersonID(int personID) {
        this.personID.setPersonID(personID);
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
    public void setClothingWeight(double clothingWeight) {
        this.clothingWeight = clothingWeight;
    }

    /**
     * Sets the weight of bedding 
     * @param beddingsWeight the beddingsWeight to set
     */
    public void setBeddingsWeight(double beddingsWeight) {
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
