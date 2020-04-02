package com.company;

import org.apache.logging.log4j.core.util.JsonUtils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class BookStream {
    Stream<Book> stream;
    BookCollection collection = new BookCollection();

    private void UpdateStream() {
        stream.close();
        stream = collection.getArray().stream();
    }

    public BookStream(BookCollection input) {
        collection = input;
        stream = input.getArray().stream();
    }

    public long QuantityOfBooksWithMorePagesThan(int pagesInput) {
        long result = stream.filter((Book obj) -> { return obj.pages > pagesInput; }).count();
        UpdateStream();
        return result;
    }

    public ArrayList<Book> FilterBooksWithSingleAuthor() {
        ArrayList<Book> result = new ArrayList<Book>(stream.filter((Book obj) -> { return obj.authors.size() == 1; }).collect(toList()));
        UpdateStream();
        return result;
    }

//    public int FindMaxPages() {
//        int result = stream.max(Comparator.comparing(Book::getPages)).orElseThrow(NoSuchElementException::new).pages;
//        UpdateStream();
//        return result;
//    }

    public int FindMaxPages() {
//        ArrayList<Book> test = new ArrayList<>();
//        stream = test.stream();
        int result = stream.max(Comparator.comparing(Book::getPages)).orElse(new Book("", -1, new String[]{})).pages;
        UpdateStream();
        return result;
    }

    public int FindMinPages() {
        int result = stream.min(Comparator.comparing(Book::getPages)).get().pages;
        UpdateStream();
        return result;
    }

    public ArrayList<Book> SortBooksByPageCount() {
        ArrayList<Book> result = new ArrayList<Book>(stream.peek(obj -> System.out.println("Unsorted: " + obj)).sorted(Comparator.comparing(Book::getPages)).collect(toList()));
        UpdateStream();
        return result;
    }

    public ArrayList<Book> SortBooksByName() {
        ArrayList<Book> result = new ArrayList<>(stream.peek(obj -> System.out.println("Unsorted: " + obj)).sorted(Comparator.comparing(Book::getName)).collect(toList()));
        UpdateStream();
        return result;
    }

    public ArrayList<String> GetAuthors() {
        ArrayList<String> result = new ArrayList<>(stream.flatMap(e->e.getAuthors().stream()).collect(Collectors.toList()));
        UpdateStream();
        return result;
    }

    public ArrayList<String> GetAuthorsNoDuplicates() {
        ArrayList<String> result = new ArrayList<>(stream.flatMap(e->e.getAuthors().stream()).peek(obj -> System.out.println("May be a duplicate: " + obj)).distinct().collect(Collectors.toList()));
        UpdateStream();
        return result;
    }

    public void PrintAuthorsForEach() {
        stream.forEach(obj -> System.out.println(obj.authors));
        UpdateStream();
    }
}
