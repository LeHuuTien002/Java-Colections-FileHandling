package com.tien;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so luong phan tu: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu: ");
            queue.add(scanner.nextLine());
        }

        System.out.println("Phan tu dau tien trong hang doi: " + queue.peek());

        System.out.println("Lay ra tung phan tu: ");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        scanner.close();
    }
}
