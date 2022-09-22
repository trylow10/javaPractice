package streamPractice;

import java.util.ArrayList;
import java.util.List;

public enum Faculty {
    BBA(1),BBS(2),BCA(3);
    int priority;

    Faculty() {
    }
    Faculty(int priority) {
        this.priority = priority;
    }


    public int getPriority() {
        return this.priority;
    }

    public List<Faculty> getUpperList() {
        List<Faculty> faculties = new ArrayList<>();
        if (this.priority == 1) {
            faculties.add(Faculty.BBS);
            faculties.add(Faculty.BCA);
        }
        if (this.priority == 2) {
            faculties.add(Faculty.BCA);
        }
        return faculties;
    }

}
