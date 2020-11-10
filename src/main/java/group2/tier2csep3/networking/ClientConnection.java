package group2.tier2csep3.networking;

import com.google.gson.Gson;
import group2.tier2csep3.model.ComponentList;
import group2.tier2csep3.networking.util.ComponentEnum;
import group2.tier2csep3.networking.util.NetworkPackage;
import java.io.*;
import java.net.Socket;

@org.springframework.stereotype.Component
public class ClientConnection implements SocketClient {
    private Socket socket;

    @Override
    public ComponentList getAllComponents() {
        try {
            Gson gson = new Gson();
            Socket socket = new Socket("localhost", 2910);
            OutputStream out = socket.getOutputStream();
            InputStream in = socket.getInputStream();


            NetworkPackage request = new ComponentEnum();
            System.out.println(request);
            String requestString = gson.toJson(request.getType());
            System.out.println(requestString);
            byte[] requestBytes = requestString.getBytes();
            out.write(requestBytes);

            byte[] data = new byte[1024];
            int count = in.read(data);
            String string = new String(data);
            System.out.println(string);
            String updatedString = "";
            for(int i=0;i<string.length();i++)
            {
                if(string.charAt(i) == 0)
                {
                    break;
                }
                updatedString += string.charAt(i);
            }
            System.out.println(updatedString);
            return gson.fromJson(updatedString, ComponentList.class);


        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public void startClient() {
        try {
//            socket = new Socket("localhost", 2910);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void disconnect() {
        try {
//            in.close();
//            out.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
