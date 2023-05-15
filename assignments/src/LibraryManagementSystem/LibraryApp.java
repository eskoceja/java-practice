package LibraryManagementSystem;

public class LibraryApp {
    public static void main(String[] args){
        //creating library
        LibraryManager<LibraryItem> library = new LibraryManager<>();

        Book book1 = new Book("A Court Of Thorns And Roses", 2015, "Sarah J Maas", "1639730192");
        Book book2 = new Book("A Court Of Mist And Fury", 2016, "Sarah J Maas", "1639730193");
        Book book3 = new Book("A Court Of Wings And Ruin", 2017, "Sarah J Maas","1639730194" );
        Book book4 = new Book("A Court Of Frost And Starlight", 2018, "Sarah J Maas", "1639730195");
        Book book5 = new Book("A Court Of Silver Flames",2021, "Sarah J Maas", "1639730196");

        DVD dvd1 = new DVD("Guardian of the Galaxy", 2014, "James Gunn", 122);
        DVD dvd2 = new DVD("Guardians of the Galaxy Vol. 2", 2017, "James Gunn", 137);
        DVD dvd3 = new DVD("Guardians of the Galaxy Vol. 3", 2023, "James Gunn", 150);

        //adding items to library
        System.out.println("Adding items to library: ");
        library.addItem(book1);
        library.addItem(book2);
        library.addItem(book3);
        library.addItem(book4);
        library.addItem(book5);
        library.addItem(dvd1);
        library.addItem(dvd2);
        library.addItem(dvd3);

        //display library
        System.out.println("Displaying Library: ");
        library.displayItems();
        System.out.println();

        //removing items
        System.out.println("Removing items from library: ");
        library.removeItem(book5);
        library.removeItem(dvd3);
        System.out.println();

        //display updates library
        System.out.println("Updated library after removing items:");
        library.displayItems();
        System.out.println();

        //getting item type
        System.out.println("Getting item type: ");
        System.out.println(book2.getItemType());
        System.out.println(dvd2.getItemType());
        System.out.println();

        //error handling
        System.out.println("Error handling: ");
        library.removeItem(book5);

    }
}
