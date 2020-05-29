package down;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class download {
        static URL url = null;
        static String urlCatalog = null;
        static HttpURLConnection connection = null;
        static BufferedInputStream input = null;
        static RandomAccessFile file1 = null;
        static File file = null;

        public static void main(String[] args) throws IOException {
        file = new File("D:/音乐文件/mom.mp3");
        Scanner in = new Scanner(System.in);
        System.out.println("输入下载地址");
        urlCatalog = in.nextLine();
        url = new URL(urlCatalog);
        connection = (HttpURLConnection) url.openConnection();
        input = new BufferedInputStream(connection.getInputStream());
        if(connection.getResponseCode()/100!=2){
            System.out.println("连接失败！");
            return ;
        }
        int filesize = connection.getContentLength();//文件大小
        int download = 0;//已下载大小
        byte bytes[] = null;
        file1 = new RandomAccessFile(file,"rw");
        file1.seek(0);
        while(download<filesize){
            if(filesize-download>1024)   bytes = new byte[1024];
            else                         bytes = new byte[filesize-download];
            int read = input.read(bytes);
            file1.write(bytes,0,read);
            download = download+read;
            System.out.println("当前下载进度："+((download*1.0)/filesize)*100+"%");
        }
        System.out.println("下载完成，请到下载内查看文件！");

    }
}
