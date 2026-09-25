package AbstractDataTypes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentCollectionTest {

    @Test
    public void testAddStudent() {
        StudentCollection collection = new StudentCollectionImplementation();
        collection.addStudent(new Student(1, "Ali", 3.5));
        assertEquals(1, collection.getSize());
    }

    @Test
    public void testFindStudent() {
        StudentCollection collection = new StudentCollectionImplementation();
        collection.addStudent(new Student(2, "Sara", 3.8));
        Student found = collection.findStudent(2);
        assertNotNull(found);
        assertEquals("Sara", found.getName());
    }

    @Test
    public void testRemoveStudent() {
        StudentCollection collection = new StudentCollectionImplementation();
        collection.addStudent(new Student(3, "Ahmed", 3.2));
        collection.removeStudent(3);
        assertTrue(collection.isEmpty());
    }

    @Test
    public void testIsEmptyInitially() {
        StudentCollection collection = new StudentCollectionImplementation();
        assertTrue(collection.isEmpty());
    }
}