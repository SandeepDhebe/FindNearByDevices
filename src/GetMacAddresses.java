import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

public class GetMacAddresses {

    public static void main(String[] args) throws Exception {
        Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
        while (interfaces.hasMoreElements()) {
            NetworkInterface ni = interfaces.nextElement();
            byte[] mac = ni.getHardwareAddress();
            if (mac != null) {
                System.out.print("MAC Address: ");
                for (int i = 0; i < mac.length; i++) {
                    System.out.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : "");
                }
                System.out.println();
            }
        }
    }
}