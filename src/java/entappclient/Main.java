package entappclient;

import ejb.EJBRemoteInterface;
import javax.ejb.EJB;

public class Main {
    @EJB
    private static EJBRemoteInterface mySession;

    public static void main(String... args) {
         System.err.println("result = " + mySession.getResult());
    }
}
