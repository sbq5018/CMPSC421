package psu.edu.attendancetracking;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class ClassController {

    Student student1 = new Student("Bartholomew", 1234, "hunter2", "blm1234", false);
    Student student2 = new Student("Doctor Student, Ph.D.", 2345, "hunter3", "dsp2345", false);

    public HashMap<Integer, Student> rosterH = new HashMap<>();

    public ClassController(){

    }

}
