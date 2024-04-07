package com.myprojects.CurdOpertions.Controller;

import com.myprojects.CurdOpertions.Entity.Student_list;
import com.myprojects.CurdOpertions.Repository.StudentRepo;
//import com.myprojects.CurdOpertions.Service.StudentListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Studentlist")
public class StudentListController {

    @Autowired
    private StudentRepo studentrepo;

    @GetMapping
    public List<Student_list> getAllStudentlist() {
        return studentrepo.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Student_list> getTestById(@PathVariable Long id) {
        System.out.println("Getting test with ID: " + id);
        return studentrepo.findById(id);
    }

    @PutMapping("/{id}")
    public Student_list update(@PathVariable Long id, @RequestBody Student_list student_List) {
        System.out.println("Updating Student List with ID: " + id);
        Student_list existingstudentlist = studentrepo.findById(id).orElse(null);
        if (existingstudentlist == null) {
            System.out.println("Student not found, skipping update");
            return null;
        }
        existingstudentlist.setName(student_List.getName());
        existingstudentlist.setClassd(student_List.getClassd());
        existingstudentlist.setEmail(student_List.getEmail());
        existingstudentlist.setSGroups(student_List.getSGroups());
        return studentrepo.save(existingstudentlist);
    }
    @PostMapping
    public Student_list createTest(@RequestBody Student_list student_List) {
        System.out.println("Creating Student_list: " + student_List);
        return studentrepo.save(student_List);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        System.out.println("Deleting Student with ID: " + id);
        Student_list student_List = studentrepo.findById(id).orElse(null);
        if (student_List == null) {
            System.out.println("Student not found, skipping delete");
            return;
        }
        studentrepo.delete(student_List);
        System.out.println("Deleted Successfully");
    }



}


