package com.tien;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentMap {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so luong sinh vien: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap ID sinh vien: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nhap ten sin vien: ");
            String name = scanner.nextLine();
            students.put(id, name);
        }

        System.out.println("Danh sach sinh vien: ");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Ten: " + entry.getValue());
        }
        
        scanner.close();
    }
}
