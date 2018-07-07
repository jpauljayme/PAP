package pap.serverDateGenerator;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

/**
 *Date and time of the client side.
 * @author jaymezing
 */
public class DateClient {
     public static void main(String args[]) throws Exception
    {
        Socket soc=new Socket(InetAddress.getLocalHost(),5217);        
        BufferedReader in=new BufferedReader(new InputStreamReader(soc.getInputStream()  ));
        System.out.println(in.readLine());
    }    
}