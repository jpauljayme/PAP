package pap.domain;

/**
 *Class forcCredential of a user in the system,
 * @author @author      John Paul Jayme <jpaul.jayme.com>
 */
public class Credential {
    private int credentialID;
    private String username;
    private String password;
    
    /**
     *Default constructor.
     */
    public Credential(){
        this.credentialID = 0;
        this.username = "";
        this.password = "";
    }
    
    /**
     *Constructor that accepts parameters.
     * @param credentialID
     * @param username
     * @param password
     */
    public Credential(int credentialID, String username, String password){
        this.credentialID = credentialID;
        this.username = username;
        this.password = password;
    }
}
