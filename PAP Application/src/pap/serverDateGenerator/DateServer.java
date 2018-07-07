package pap.serverDateGenerator;

import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *Date and time of the server side.
 * @author jaymezing
 */
public class DateServer {
        public static void main(String args[]) throws Exception
    {
        ServerSocket s=new ServerSocket(5217);
        while(true)
        {
            System.out.println("Waiting For Connection ...");
            Socket soc=s.accept();
            DataOutputStream out=new DataOutputStream(soc.getOutputStream());
            DateFormat dateFormat = new SimpleDateFormat("MMMM dd yyyy hh:mm a");
            Date date = new Date();
            String formattedDate= dateFormat.format(date);
            out.writeBytes("Server Date: " + formattedDate);
            out.close();
            soc.close();
        }

    }
}
