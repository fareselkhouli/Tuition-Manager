/**
 * This is the abstract class that represents a student
 */
public abstract class Student implements Comparable{
    private String fname;
    private String lname;
    protected int credit;

    public Student(String fname, String lname, int credit){}

    public int compareTo(Object obj){}

    public String toString(){}

    public abstract int tuitionDue(){}
}
