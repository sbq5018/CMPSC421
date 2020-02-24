package psu.edu.attendancetracking;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class StudentController {

    public HashMap<Integer, Student> students = new HashMap<>();

    @PostMapping
    public String createAccount(@RequestBody Student student) {

        students.put(student.userID, student);

        return "Added: " + student.getName();
    }

    @PostMapping
    public void createRecord(int classCode){

    }
}
