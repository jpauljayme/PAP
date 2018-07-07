/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pap.hash;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Allena Denise
 */
public class MD5 {
    
    public static String hash(String password) throws NoSuchAlgorithmException{
        MessageDigest m = MessageDigest.getInstance("MD5");
        m.update(password.getBytes(),0,password.length());
        
        return (new BigInteger(1,m.digest()).toString(16));
    }
}
