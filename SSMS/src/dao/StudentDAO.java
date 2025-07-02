package dao;

import model.Student;
import util.DBConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    public void addStudent(Student s) {
        String sql = "INSERT INTO students (id, name, age, course, marks) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, s.getId());
            ps.setString(2, s.getName());
            ps.setInt(3, s.getAge());
            ps.setString(4, s.getCourse());
            ps.setFloat(5, s.getMarks());

            ps.executeUpdate();
            System.out.println("Student inserted successfully.");

        } catch (SQLIntegrityConstraintViolationException e) {
            System.err.println("Error: Duplicate ID.");
        } catch (SQLException e) {
            System.err.println("DB Error: " + e.getMessage());
        }
    }

    public List<Student> getAllStudents() {
        List<Student> list = new ArrayList<>();
        String sql = "SELECT * FROM students";

        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Student s = new Student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("course"),
                        rs.getFloat("marks")
                );
                list.add(s);
            }

        } catch (SQLException e) {
            System.err.println("Error fetching students: " + e.getMessage());
        }

        return list;
    }

    public boolean deleteStudent(int id) throws Exception {
        String sql = "DELETE FROM students WHERE id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            int rows = ps.executeUpdate();
            return rows > 0;

        } catch (SQLException e) {
            throw new Exception("Error deleting student", e);    
        }
    }
    
}

	