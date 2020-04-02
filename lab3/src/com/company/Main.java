package com.company;

public class Main {
    public static void main(String[] args) {
        BookCollection test = new BookCollection();
        BookStream testStream = new BookStream(test);
        System.out.println(testStream.FindMaxPages());
        for(var i : testStream.SortBooksByPageCount()) {
            System.out.println(i);
        }
        testStream.PrintAuthorsForEach();
        for(var i : testStream.GetAuthorsNoDuplicates()) {
            System.out.println(i);
        }
    }
}
