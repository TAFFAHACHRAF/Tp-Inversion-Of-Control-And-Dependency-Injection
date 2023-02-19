package com.taffah.blocking;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiThreedBlockingServer extends Thread{
    int clientCount;
    public static void main(String[] args) {
        new MultiThreedBlockingServer().start();
    }

    @Override
    public void run(){
        System.out.println("The server is starting using the port number 1234");
        try {
            ServerSocket serverSocket=new ServerSocket(1234);
            while (true){
                Socket socket=serverSocket.accept();
                ++clientCount;
                new Conversation(socket,clientCount).start();
            }
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
    class Conversation extends Thread{
        private Socket socket;
        private int clientId;
        public Conversation(Socket socket,int clientId){
            this.socket=socket;
            this.clientId=clientId;
        }
        @Override
        public void run(){
            try {
                InputStream is= socket.getInputStream();
                InputStreamReader isr=new InputStreamReader(is);
                BufferedReader br=new BufferedReader(isr);
                OutputStream os=socket.getOutputStream();
                PrintWriter pw=new PrintWriter(os,true);
                pw.println("New client connexion ==> "+clientId+" \n IP ==> "+socket.getRemoteSocketAddress().toString());
                pw.println("Welcome, your ID is => "+clientId);
                String request;
                while ((request=br.readLine())!=null){
                    System.out.println("New Request => IP="+socket.getRemoteSocketAddress().toString()+" Request"+request);
                    String response="Size = "+request.length();
                    pw.println(response);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
