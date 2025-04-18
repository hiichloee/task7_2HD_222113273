package sit707_week7;

import org.junit.Before;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class TaskInboxServiceTest {

    private TaskInboxService inbox;

    @Before
    public void setUp() {
        inbox = new TaskInboxService();
    }

    @Test
    public void testAddTaskShouldAddSuccessfully() {
    	System.out.println("+++ Adding a task and verifying presence +++");
        inbox.addTask("Read Lecture Notes");
        assertTrue(inbox.hasTask("Read Lecture Notes"));
        System.out.println("--- testAddTaskShouldAddSuccessfully passed." + "\n");
    }

    @Test
    public void testGetAllTasksShouldReturnCorrectSize() {
    	System.out.println("+++ Adding tasks and checking size +++");
        inbox.addTask("Finish Assignment");
        inbox.addTask("Review PR");
        List<String> allTasks = inbox.getAllTasks();
        assertEquals(2, allTasks.size());
        System.out.println("--- testGetAllTasksShouldReturnCorrectSize passed." + "\n");
    }

    @Test
    public void testClearTasksShouldEmptyList() {
    	System.out.println("+++ Clearing task list and checking result +++");
        inbox.addTask("Prepare Quiz");
        inbox.clearTasks();
        assertEquals(0, inbox.getAllTasks().size());
        System.out.println("--- testClearTasksShouldEmptyList passed." + "\n");
    }

    @Test
    public void testFailingCaseShouldFail() {
    	System.out.println("+++ Checking non-existent task failure case +++");
        inbox.addTask("Dummy Task");
//        assertFalse(inbox.hasTask("Another Task")); // 故意失败的测试
        assertTrue(inbox.hasTask("Another Task"));
        System.out.println("--- testFailingCaseShouldFail failed." + "\n");
    }
}
