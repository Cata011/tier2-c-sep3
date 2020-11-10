package group2.tier2csep3;

import group2.tier2csep3.networking.SocketClient;
import group2.tier2csep3.networking.ClientConnection;
import group2.tier2csep3.service.ComponentService.ComponentService;
import group2.tier2csep3.service.ComponentService.ComponentServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tier2CSep3Application {

    public static void main(String[] args) throws InterruptedException {
        SocketClient client = new ClientConnection();
        ComponentService service = new ComponentServiceImpl(client);
        client.startClient();
        SpringApplication.run(Tier2CSep3Application.class, args);
    }

}
