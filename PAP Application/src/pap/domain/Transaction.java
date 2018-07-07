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
    private String addedBy;
    private boolean isReceived;
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
        this.isReceived = false;
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
     * @param isReceived
     * @param receivedDate
     * @param clothingWeight
     * @param beddingsWeight
     * @param totalAmount
     * @param transactionType
     */
    public Transaction(int transactionID, int personID, Date addedDate,
            String addedBy, boolean isReceived, Date receivedDate, 
            float clothingWeight, float beddingsWeight, double totalAmount,
            String transactionType){
        this.transactionID = transactionID;
        this.personID = personID;
        this.addedDate = addedDate;
        this.isReceived = isReceived;
        this.receivedDate = receivedDate;
        this.clothingWeight = clothingWeight;
        this.beddingsWeight = beddingsWeight;
        this.totalAmount = totalAmount;
        this.transactionType = transactionType;
    }
}
