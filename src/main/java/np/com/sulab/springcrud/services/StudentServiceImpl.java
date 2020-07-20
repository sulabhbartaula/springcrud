package np.com.sulab.springcrud.services;

import np.com.sulab.springcrud.domain.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentServiceImpl implements StudentService{

    private Map<Integer,Student> students;

    public StudentServiceImpl() {
        loadStudents();
    }

    @Override
    public List<Student> getAllStudents() {
        return new ArrayList<>(students.values());
    }

    private void loadStudents() {

        students = new HashMap<>();

        Student student1 = new Student();
        student1.setId(1);
        student1.setName("Sulabh Bartaula");
        student1.setGpa(6.75);

        students.put(1,student1);

        Student student2 = new Student();
        student2.setId(2);
        student2.setName("Durlabh Bartaula");
        student2.setGpa(7.00);

        students.put(2,student2);


    }
}
