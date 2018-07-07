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
    
    /*
     * GETTERS
     */

    /**
     * Returns the Credential ID
     * @return the credentialID
     */
    public int getCredentialID() {
        return credentialID;
    }

    /**
     * Returns the username
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Returns a hashed password
     * @return the password
     */
    public String getPassword() {
        return password;
    }
    
    
    /*
     * SETTERS
     */

    /**
     * Sets the username field
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Sets the password field
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
