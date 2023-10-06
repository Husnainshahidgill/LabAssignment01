public class LibraryItem {

    private String title;
    private String author;
    private int year;
    private boolean isBorrowed;
    private LibraryItemType itemType;

    public LibraryItem(String title, String author, int year,  LibraryItemType itemType) {
        this.title = title;
        this.author = author;
        this.year = year;
        /*this.isBorrowed = isBorrowed;*/
        this.itemType = itemType;
    }

    public LibraryItem() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public LibraryItemType getItemType() {
        return itemType;
    }

    public void setItemType(LibraryItemType itemType) {
        this.itemType = itemType;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null|| getClass()!= obj.getClass())
            return false;
        LibraryItem otherItem = (LibraryItem) obj;
        return title.equals(otherItem.title) && author.equals(otherItem.author) && year == otherItem.year;
    }




}
