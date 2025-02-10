package com.tien;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileStudentManager {
    private static final String FILE_NAME = "students.txt";

    public static void writeStudentsToFile(List<String> students) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (String student : students) {
                writer.write(student);
                writer.newLine();
            }
            System.out.println("Ghi danh sách sinh viên thành công.");
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi file: " + e.getMessage());
        }
    }

    public static List<String> readStudentsFromFile() {
        List<String> students = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                students.add(line);
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
        }
        return students;
    }

    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Nguyen Van A");
        students.add("Tran Thi B");
        students.add("Le Van C");

        writeStudentsToFile(students);

        List<String> readStudents = readStudentsFromFile();
        System.out.println("Danh sách sinh viên từ file:");
        for (String student : readStudents) {
            System.out.println(student);
        }
    }
}
