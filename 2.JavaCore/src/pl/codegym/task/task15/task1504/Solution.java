package pl.codegym.task.task15.task1504;

import java.util.LinkedList;
import java.util.List;

/* 
OOP: książki
*/

public class Solution {
    public static void main(String[] args) {
        List<Book> books = new LinkedList<Book>();
        books.add(new MarkTwainBook("Tom Sawyer"));
        books.add(new AgathaChristieBook("Hercule Poirot"));
        System.out.println(books);
    }

    abstract static class Book {
        private String author;

        public Book(String author) {
            this.author = author;
        }

        public abstract Book getBook();

        public abstract String getTitle();

        private String getOutputByBookType() {
            String agathaChristieOutput = author + ": " + getBook().getTitle() + " jest detektywem";
            String markTwainOutput = getBook().getTitle() + " została napisana przez " + author;

            String output = "wynik";
            //tutaj wpisz swój kod
            if (this instanceof AgathaChristieBook) {
                output = agathaChristieOutput;
            }
            if (this instanceof MarkTwainBook) {
                output = markTwainOutput;
            }

            return output;
        }

        public String toString() {
            return getOutputByBookType();
        }
    }

    public static class MarkTwainBook extends Book {

        private String title;

        public MarkTwainBook(String title) {
            super("Mark Twain");
            this.title = title;
        }

        @Override
        public MarkTwainBook getBook() {
            return (MarkTwainBook) this;
        }

        @Override
        public String getTitle() {
            return this.title;
        }
    }

    public static class AgathaChristieBook extends Book {

        private String title;

        public AgathaChristieBook(String title) {
            super("Agatha Christie");
            this.title = title;
        }

        @Override
        public AgathaChristieBook getBook() {
            return (AgathaChristieBook) this;
        }

        @Override
        public String getTitle() {
            return this.title;
        }
    }
}
