package javaTest.generics;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by abhiramk on 11/06/15.
 */
public class Hostname {

    public static void main(String[] args) throws UnknownHostException {
        String hostname = "localhost";
        InetAddress addr;
        addr = InetAddress.getLocalHost();
        hostname = addr.getHostName();
        System.out.println(hostname);

    }

}
