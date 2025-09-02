package Lec7_Exercise;

import java.util.Scanner;

public class Ex5_Parse_Data_URL {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a URL:");
        String url = sc.nextLine();
        // Tìm vị trí của "://"
        int protocolEnd = url.indexOf("://");
        if (protocolEnd == -1) {
            System.out.println("Invalid URL format.");
            sc.close();
            return;
        }
        // Trích xuất protocol
        String protocol = url.substring(0, protocolEnd);
        // Tìm bắt đầu của domain
        int domainStart = protocolEnd + 3;
        // Tìm vị trí của "/" bắt đầu path
        int pathStart = url.indexOf("/", domainStart);
        String domain;
        String path;
        if (pathStart == -1) {
            // Nếu không có path, toàn bộ phần còn lại là domain
            domain = url.substring(domainStart);
            path = "";
        } else {
            domain = url.substring(domainStart, pathStart);
            path = url.substring(pathStart);
        }
        System.out.println("Protocol: " + protocol);
        System.out.println("Domain: " + domain);
        System.out.println("Path: " + path);
        sc.close();
    }
}
