package streamPractice;

public class Students {
    private final String name;
    private final String address;
    private final int rollNo;
    private final Faculty faculty;


    public String getName() {
        return name;
    }

    public String getAddress() {

        return address;
    }

    public int getRollNo() {
        return rollNo;
    }


    protected Students(String name, String address, int rollNo,Faculty faculty) {
        this.name = name;
        this.address = address;
        this.rollNo = rollNo;
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Student name is " + getName() + " address is " + getAddress() +"faculty is "+faculty.getUpperList();
    }

    public Faculty getFaculty() {
        return faculty;
    }
}
