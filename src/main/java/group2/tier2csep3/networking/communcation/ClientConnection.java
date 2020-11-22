package group2.tier2csep3.networking.communcation;

import com.google.gson.Gson;
import group2.tier2csep3.networking.util.*;

import java.io.*;
import java.net.Socket;

@org.springframework.stereotype.Component
public class ClientConnection implements SocketClient {

//    @Override
//    public ComponentList getAllComponents() {           //TODO: maybe separate common parts from this method so that you don't have repeatable files
//        try {
//            Gson gson = new Gson();
//            Socket socket = new Socket("localhost", 2910);
//            OutputStream out = socket.getOutputStream();
//            InputStream in = socket.getInputStream();
//
//            NetworkPackage request = new ComponentEnum();
//            String requestString = gson.toJson(request.getType());
//            byte[] requestBytes = requestString.getBytes();
//            out.write(requestBytes);
//
//            byte[] data = new byte[1024];
//            int count = in.read(data);
//            String string = new String(data);
//            System.out.println(string);
//            String updatedString = "";
//            for(int i=0;i<string.length();i++)
//            {
//                if(string.charAt(i) == 0)
//                {
//                    break;
//                }
//                updatedString += string.charAt(i);
//            }
//            System.out.println(updatedString);
//            return gson.fromJson(updatedString, ComponentList.class);
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    @Override
//    public BuildList getMyBuilds(int userId) {
//        try {
//            Gson gson = new Gson();
//            Socket socket = new Socket("localhost", 2910);
//            OutputStream out = socket.getOutputStream();
//            InputStream in = socket.getInputStream();
//
//            NetworkPackage request = new BuildEnum();
//            String requestString = gson.toJson(request.getType());
//
//            System.out.println(requestString);
//
//            requestString += "_" + userId;
//
//            System.out.println(requestString);
//
//
//            byte[] requestBytes = requestString.getBytes();
//            out.write(requestBytes);
//
//            byte[] data = new byte[1024];
//            int count = in.read(data);
//            String string = new String(data);
//            System.out.println(string);
//            String updatedString = "";
//            for(int i=0;i<string.length();i++)
//            {
//                if(string.charAt(i) == 0)
//                {
//                    break;
//                }
//                updatedString += string.charAt(i);
//            }
//            System.out.println(updatedString);
//
//            return gson.fromJson(updatedString, BuildList.class);
//
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    @Override
//    public Account getMyAccount(String username, String password) {
//        try {
//            Gson gson = new Gson();                                         //TODO: make this to send 2 stuff one after the other
//            Socket socket = new Socket("localhost", 2910);
//            OutputStream out = socket.getOutputStream();
//            InputStream in = socket.getInputStream();
//
//            NetworkPackage request = new LoginEnum();
//            String requestString = gson.toJson(request.getType());
////            requestString += "_" + username + "_" + password;
//            byte[] requestBytes = requestString.getBytes();
//            out.write(requestBytes);
//
//            byte[] data = new byte[1024];
//            int count = in.read(data);
//            String string = new String(data);
//            System.out.println(string);
//            String updatedString = "";
//            for(int i=0;i<string.length();i++)
//            {
//                if(string.charAt(i) == 0)
//                {
//                    break;
//                }
//                updatedString += string.charAt(i);
//            }
//            System.out.println(updatedString);
//
//
//            return gson.fromJson(updatedString, Account.class);
//
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    @Override
//    public void register(Account account) {
//        try {
//            Gson gson = new Gson();
//            Socket socket = new Socket("localhost", 2910);
//            OutputStream out = socket.getOutputStream();
//            InputStream in = socket.getInputStream();
//
//            NetworkPackage request = new RegisterEnum();
//            String requestString = gson.toJson(request.getType());
//            byte[] requestBytes = requestString.getBytes();
//            out.write(requestBytes);
//
//            byte[] data = new byte[1024];
//            int count = in.read(data);
//            String string = new String(data);
//            System.out.println(string);
//            String updatedString = "";
//            for (int i = 0; i < string.length(); i++) {
//                if (string.charAt(i) == 0) {
//                    break;
//                }
//                updatedString += string.charAt(i);
//            }
//            System.out.println(updatedString);
//
//            String accountToSend = gson.toJson(account);
//            byte[] bytesToSend = accountToSend.getBytes();
//            out.write(bytesToSend);
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//    }


    @Override
    public void startClient() {
        try {
            new Thread(() -> communicate(new NetworkPackage(NetworkType.CONNECTION, new Object()))).start();
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

            System.out.println(networkPackage.toString());

            String request = gson.toJson(networkPackage);

            System.out.println(request);

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

            if(!updatedString.equals("con")) {
                return updatedString;
            }
            else System.out.println("mata");
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
