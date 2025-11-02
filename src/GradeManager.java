import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GradeManager {
    private static final String FILE_NAME = "students.txt";

    public void saveStudents(List<Student> students) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Student s : students) {
                bw.write(s.getRollNo() + "," + s.getName() + "," + s.getMarks());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Student> loadStudents() {
        List<Student> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3) {
                    int roll = Integer.parseInt(data[0]);
                    String name = data[1];
                    double marks = Double.parseDouble(data[2]);
                    list.add(new Student(name, roll, marks));
                }
            }
        } catch (IOException e) {
            // Ignore if file not found initially
        }
        return list;
    }
}
