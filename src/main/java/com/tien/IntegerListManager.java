package com.tien;

import java.util.ArrayList;
import java.util.Scanner;

public class IntegerListManager {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so luong phan tu: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + (i + 1) + ": ");
            numbers.add(scanner.nextInt());
        }

        System.out.println("Danh sach so nguyen: " + numbers);
        System.out.println("Phan tu lon nhat: " + numbers.stream().max(Integer::compare).orElse(null));
        System.out.println("Phan tu nho nhat: " + numbers.stream().min(Integer::compare).orElse(null));
        
        scanner.close();
    }
}
