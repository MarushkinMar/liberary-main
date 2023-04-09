import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ChangeStudent {

    public void createStudent(String sql, Connection con) {
        try{
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setLong(1,5);
            statement.setString(2, "sasha");
            statement.setString(3,"a");
            int i = statement.executeUpdate();
            System.out.println("Добавлено строк" + i);}
        catch(Exception e){}


    }
    public void updateStudent(String sql, Connection con){
        try{
        Statement stmt = con.createStatement();// выполни запрос
        int i = stmt.executeUpdate(sql);
        System.out.println("Обновлено строк" + i);
        }
        catch(Exception e){}
    }
    public void deleteStudent(){}
    public List<Student> getStudent(String sql, Connection con){ return new ArrayList<>();}

    public Student getStudent(){return new Student();}

}
