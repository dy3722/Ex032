package com.example.ex032.theEx032;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class LibraryManager {
    public static void main (String[] args)
    {
        Map<UUID, LibraryItem> inventory = new HashMap<>();

        Book b1 = new Book("The Beautiful Book1", 1999, 67, "David");
        inventory.put(b1.getItemId(),b1);

        Magazine m1 = new Magazine("The Beautiful Magazine1", 1967, "Ilon", 289841);
        inventory.put(m1.getItemId(),m1);

        Book b2 = new Book("The Beautiful Book2", 2001, 76, "David");
        inventory.put(b2.getItemId(),b2);

        Magazine m2 = new Magazine("The Beautiful Magazine2", 2001, "Ilon", 629447);
        inventory.put(m2.getItemId(),m2);

        Book b3 = new Book("The Beautiful Book3", 2005, 63, "David");
        inventory.put(b3.getItemId(),b3);

        UUID itemIdOfB1 = b1.getItemId();

        ((Book) inventory.get(inventory.get(itemIdOfB1))).displayFullDetails();

        UUID newUUID = UUID.randomUUID();
        if (inventory.get(newUUID) != null) //it's will not happened...
        {
            ((Book) inventory.get(inventory.get(newUUID))).displayFullDetails();
        }
        else //it's will happened:
        {
            System.out.println("No exist key");
        }

        inventory.get(b1.getItemId()).borrow();
        inventory.get(m1.getItemId()).borrow();

        for (LibraryItem libraryItem : inventory.values()) {
            if (libraryItem.isBorrowed())
            {
                System.out.println(libraryItem.calculateLateFee(10));
            }
        }

        String search = "Harry Potter";

        for (LibraryItem libraryItem : inventory.values()) {
            if (libraryItem instanceof Searchable)
            {
                if (((Searchable) libraryItem).matches(search)) System.out.println(libraryItem);
            }
        }

    }
}
