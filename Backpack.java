
/**
 * The book goes in the backpack
 * 
 * @author Luke Wismer
 * @version 1.1.1 
 */
public class Backpack
{
    // fields:
    private boolean isFull;
    private int weight;
    private int numberOfBooks;
    private Book[] bookArray;

    /**
     * Constructor for objects of class Backpack
     */
    public Backpack()
    {
        bookArray = new Book[4];
        isFull = false;
        weight = 0;
        numberOfBooks = 0;
    }

    public int getNumberOfBooks()
    {
        return numberOfBooks;
    }

    public int getWeight()
    {
        return weight;
    }

    public boolean isItFull()
    {
        return isFull;
    }

    public void setFull()
    {
        if(numberOfBooks >= 3)
        {
            isFull = true;
        }
    }

    private void putBookInBackPack(Book book1)
    {
        bookArray[numberOfBooks] = book1;
    }

    public void addBook(String title, int bookWeight)
    {
        Book b1 = new Book(title, bookWeight);
    }
}
