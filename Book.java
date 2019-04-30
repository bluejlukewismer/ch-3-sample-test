
/**
 * The book goes in the backpack
 * 
 * @author Luke Wismer
 * @version 1.1.1 
 */
public class Book
{

    private String title;
    private int weight;
    private boolean isTextBook; 

    /**
     * Constructor for objects of class Book
     */
    public Book(String title, int weight)
    {
        this.title =  title;
        this.weight = weight;
        isTextBook = true;
        if (weight < 0 ) {
             
         this.weight = 0;
         System.out.println("book to heavy");
        }
    }

    public Book()
    {
        title = "notebook";
        weight = 1;
        isTextBook = false;
    }

    public int getWeight()
    {
        return weight; 
    }

    public String getTitle()
    {
        return title;
    }

    public boolean getIsTextBook()
    {
        return isTextBook;
    }

    
}
