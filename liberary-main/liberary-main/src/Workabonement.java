import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class Workabonement {
    public int createRekord(Abonement abonement){
        for(StudentBook book: abonement.getStudentBooks()){

        }
        return 0;
    }

    public List<Abonement> getAbonement(Connection con){
        // 1 получить список учеников(select student from abonement)
        new ChangeStudent().getStudent();
        //2 получить список учебников каждого ученика()

        return new ArrayList<>();
    }
}
