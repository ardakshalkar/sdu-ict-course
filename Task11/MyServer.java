import java.io.*;
import java.util.*;
import java.net.*;
public class MyServer{
	public static void main(String args[])throws Exception{
		ServerSocket ss=new ServerSocket(9080);
		Socket client = ss.accept();
		Scanner in =new Scanner(client.getInputStream());
		while (true){
			String s = in.nextLine();
			if (s==null || s.trim().length()==0)
				break;
			System.out.println(s);
		}
		PrintWriter out = new PrintWriter(client.getOutputStream(),true);
		String document = "<html><body>Salem Alem</body></html>";
		String response = "HTTP/1.1 200 OK\r\n" +
                    "Server: YarServer/2009-09-09\r\n" +
                    "Content-Type: text/html\r\n" +
                    "Content-Length: " + document.length() + "\r\n" +
                    "Connection: close\r\n\r\n";
		out.println(response+document);
		
	}
}
