package np.com.sulab.springcrud.contollers;

import np.com.sulab.springcrud.domain.Student;
import np.com.sulab.springcrud.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

    private StudentService studentService;

    @Autowired
    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping("/students")
    public String displayStudents(Model model){
        model.addAttribute("students",studentService.getAllStudents());
        return "students";
    }
}
