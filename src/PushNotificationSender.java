import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class PushNotificationSender {

    public static void main(String[] args) throws IOException {
        String message = "Push notification message";
        InetAddress group = InetAddress.getByName("192.168.1.60");
        MulticastSocket socket = new MulticastSocket();
        DatagramPacket packet = new DatagramPacket(message.getBytes(), message.length(), group, 4023);
        socket.send(packet);
        socket.close();
    }
}
