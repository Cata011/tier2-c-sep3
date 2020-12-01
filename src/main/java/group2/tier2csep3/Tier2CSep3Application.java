package group2.tier2csep3;

import group2.tier2csep3.networking.communcation.SocketClient;
import group2.tier2csep3.networking.communcation.ClientConnection;
import group2.tier2csep3.service.accountService.AccountService;
import group2.tier2csep3.service.accountService.AccountServiceImpl;
import group2.tier2csep3.service.buildService.BuildService;
import group2.tier2csep3.service.buildService.BuildServiceImpl;
import group2.tier2csep3.service.componentService.ComponentService;
import group2.tier2csep3.service.componentService.ComponentServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tier2CSep3Application {

    public static void main(String[] args) {
        SocketClient client = new ClientConnection();
        client.startClient();
        SpringApplication.run(Tier2CSep3Application.class, args);
    }

}
