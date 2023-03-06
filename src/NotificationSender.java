import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class NotificationSender {
    public static void main(String[] args) throws Exception {
        String message = "This is a notification";
        int port = 12345;
        InetAddress address = InetAddress.getByName("192.168.1.7");

        DatagramSocket socket = new DatagramSocket();
        DatagramPacket packet = new DatagramPacket(message.getBytes(), message.length(), address, port);
        socket.send(packet);
        socket.close();
    }
}
