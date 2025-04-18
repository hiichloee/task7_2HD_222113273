package sit707_week7;

import java.util.ArrayList;
import java.util.List;

public class TaskInboxService {
    private List<String> tasks;

    public TaskInboxService() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public List<String> getAllTasks() {
        return tasks;
    }

    public boolean hasTask(String task) {
        return tasks.contains(task);
    }

    public void clearTasks() {
        tasks.clear();
    }
}
