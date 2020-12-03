package group2.tier2csep3.networking.communcation;

import com.google.gson.Gson;
import group2.tier2csep3.networking.util.*;

import java.io.*;
import java.net.Socket;

@org.springframework.stereotype.Component
public class ClientConnection implements SocketClient {

    @Override
    public void startClient() {
        try {
            new Thread(() -> communicate(new NetworkPackage(NetworkType.CONNECTION, "conFromTier2"))).start();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public String communicate(NetworkPackage networkPackage) {
        try {
            Gson gson = new Gson();
            Socket socket = new Socket("localhost", 2910);
            OutputStream out = socket.getOutputStream();
            InputStream in = socket.getInputStream();
            String request = gson.toJson(networkPackage);
            byte[] requestBytes = request.getBytes();
            out.write(requestBytes);

            byte[] data = new byte[16*1024];
            int count = in.read(data);
            String string = new String(data);
            String updatedString = "";
            for(int i=0;i<string.length();i++)
            {
                if(string.charAt(i) == 0)
                {
                    break;
                }
                updatedString += string.charAt(i);
            }

            if(!updatedString.equals("conFromTier3")) {
                System.out.println("FromTier3"+ updatedString);
                return updatedString;
            }
            else System.out.println("Client Connection problem");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void disconnect() {
        try {
//            in.close();
//            out.close();
//            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
