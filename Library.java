import java.sql.SQLOutput;

public class Library {

    private LibraryItem items[] = new LibraryItem[100];

    public void addItem(LibraryItem item){
        for (int i=0; i< items.length; i++){
            if (items[i] == null){
                items[i] = item;
                System.out.println("Added");
                return;
            }
        }
    }


    public void borrowItem(LibraryItem bTitle){
        for (int i=0; i < items.length; i++){
            if (items[i] != null && items[i].getTitle().equals(bTitle) ){
                items[i].setBorrowed(true);
                System.out.println(bTitle + "Borrowed");
                return;

            }
            //System.out.println(LibraryItem + "Borrowed");
        }
    }

    public void returnItem(LibraryItem bTitle){
        for (int i=0 ; i<items.length; i++){
            if(items[i] != null && items[i].getTitle().equals(bTitle) && items[i].isBorrowed()){

                items[i].setBorrowed(false);
                System.out.println(bTitle + "returned");


            }
        }
    }
    public void displayAvailableItems() {
        for (int i = 0; i < items.length; i++) {
            LibraryItem libraryItem = items[i];
            if (libraryItem != null && !libraryItem.isBorrowed()) {
                System.out.println(libraryItem.getTitle() +"by" + libraryItem.getAuthor());
            }
        }
    }
    public void displayBorrowedItems() {
        for (int i = 0; i < items.length; i++) {
            LibraryItem libraryItem = items[i];
            if (libraryItem != null && libraryItem.isBorrowed()) {
                System.out.println(libraryItem.getTitle() + "by "+ libraryItem.getAuthor());
            }
        }
    }



}

