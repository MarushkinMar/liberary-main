import java.util.List;

public class Abonement {
    private Student student;
    private List<StudentBook> studentBooks;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<StudentBook> getStudentBooks() {
        return studentBooks;
    }

    public void setStudentBooks(List<StudentBook> studentBooks) {
        this.studentBooks = studentBooks;
    }
}
