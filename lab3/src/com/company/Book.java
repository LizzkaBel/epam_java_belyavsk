package com.company;

import java.util.ArrayList;
import java.util.List;

public class Book {
    public String name;
    public int pages;
    ArrayList<String> authors = new ArrayList<>();

    public Book(String name, int pages, String[] authors) {
        this.name = name;
        this.pages = pages;
        for(var i : authors) {
            this.authors.add(i);
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("name='").append(name).append('\'');
        sb.append(", pages=").append(pages);
        sb.append(", authors=").append(authors);
        sb.append('}');
        return sb.toString();
    }

    public int getPages() {
        return pages;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getAuthors() {
        return authors;
    }
}
