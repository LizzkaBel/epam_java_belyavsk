package com.company;

import java.util.ArrayList;
import java.util.List;

public class BookCollection {
    ArrayList<Book> collection = new ArrayList<>();

    public BookCollection() {
            collection.add(new Book("In Search of Lost Time", 4215, new String[]{"Marcel Proust"}));
            collection.add(new Book( "Ulysses", 730, new String[]{"James Joyce"}));
            collection.add(new Book( "Don Quixote", 863, new String[]{"Miguel de Cervantes"}));
            collection.add(new Book( "The Great Gatsby", 218, new String[]{"F. Scott Fitzgerald"}));
            collection.add(new Book( "One Hundred Years of Solitude", 448, new String[]{"Gabriel Garcia Marquez"}));
            collection.add(new Book( "The Brothers Karamazov", 824, new String[]{"Fyodor Dostoyevsky"}));
            collection.add(new Book( "Crime and Punishment", 545, new String[]{"Fyodor Dostoyevsky"}));
    }

    public ArrayList<Book> getArray() {
        return collection;
    }

}
