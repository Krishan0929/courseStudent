package com.KrishanSelf.KrishanSelf.service;

import com.KrishanSelf.KrishanSelf.Exception.StudentNotFoundException;
import com.KrishanSelf.KrishanSelf.model.course;
import com.KrishanSelf.KrishanSelf.model.student;
import com.KrishanSelf.KrishanSelf.repository.courseRepo;
import com.KrishanSelf.KrishanSelf.repository.studentRepo;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class KrishanService
{
    @Autowired
    private studentRepo studentRepo;

    @Autowired
    private courseRepo courseRepo;

    public List<student>  getAllStudents()
    {
        return studentRepo.findAll();
    }

    public student getStudentById(int id)
    {
        return studentRepo.getById(id);
    }

    public List<course> getCourseForStudent(int id) {
        List name = new ArrayList<>();

        try{
            studentRepo.findById(id).getCourses();
        }catch(NullPointerException ne){
            throw new StudentNotFoundException("Student not Found with this name");
        }

        List<course> courses = studentRepo.findById(id).getCourses();

        for (course Course : courses) {
            name.add(Course.getName());
        }
        return name;
    }
}
