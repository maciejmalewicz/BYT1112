import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BookTest {

    public Book testBook;
    public byte[] image;
    public BookDescription testDescription;
    public Owner testOwner;
    public List<Review> testReview;
    public List<Note> testNote;

    @Before
    public void setup(){
        image = new byte[]{1,0,0,1,0};
        testDescription = new BookDescription("isbnDescription","includes many terrifying scenes");
        testReview = new ArrayList<>();
        testNote = new ArrayList<>();
        testOwner = new Owner(1L);

        testBook = new Book(1L,"isbnNumber","ShortLife",
                image,testReview,testDescription,testNote,testOwner);
    }
    @Test
    public void testConstruction(){
        Assert.assertEquals(testBook.getBookId(),Long.valueOf(1L));
        Assert.assertEquals(testBook.getISBN(),"isbnNumber" );
        Assert.assertEquals(testBook.getName(),"ShortLife" );
        Assert.assertEquals(testBook.getImage(),image );
        Assert.assertEquals(testBook.getReview(), testReview);
        Assert.assertEquals(testBook.getDescription(), testDescription);
        Assert.assertEquals(testBook.getNote(), testNote);
        Assert.assertEquals(testBook.getOwner(), testOwner);
    }
    @Test
    public void testGetters(){
        TestUtils.testGetter(testBook, "getBookId", "bookId");
        TestUtils.testGetter(testBook, "getISBN", "ISBN");
        TestUtils.testGetter(testBook, "getName", "name");
        TestUtils.testGetter(testBook, "getImage", "image");
        TestUtils.testGetter(testBook, "getReview", "review");
        TestUtils.testGetter(testBook, "getDescription", "description");
        TestUtils.testGetter(testBook, "getNote", "note");
        TestUtils.testGetter(testBook, "getOwner", "owner");
    }

    @Test
    public void testSetters(){
        TestUtils.testSetter(testBook, "setBookId", "bookId",1L);
        TestUtils.testSetter(testBook, "setISBN", "ISBN","isbnNumber");
        TestUtils.testSetter(testBook, "setName", "name", "ShortLife");
        TestUtils.testSetter(testBook, "setImage", "image", image);
        TestUtils.testSetter(testBook, "setReview", "review",testReview);
        TestUtils.testSetter(testBook, "setDescription", "description", testDescription);
        TestUtils.testSetter(testBook, "setNote", "note",testNote);
        TestUtils.testSetter(testBook, "setOwner", "owner",testOwner);
    }
}
