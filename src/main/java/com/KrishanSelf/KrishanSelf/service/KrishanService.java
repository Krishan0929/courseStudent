package com.KrishanSelf.KrishanSelf.service;

import com.KrishanSelf.KrishanSelf.Exception.StudentNotFoundException;
import com.KrishanSelf.KrishanSelf.model.course;
import com.KrishanSelf.KrishanSelf.model.student;
import com.KrishanSelf.KrishanSelf.repository.courseRepo;
import com.KrishanSelf.KrishanSelf.repository.studentRepo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class KrishanService {
    @Autowired
    private studentRepo studentRepo;

    @Autowired
    private courseRepo courseRepo;

    private static Logger logger= LoggerFactory.getLogger(KrishanService.class);

    public List<student> getAllStudents() {
        return studentRepo.findAll();
    }

    public student getStudentById(int id)
    {
        logger.info("specific student details");
        return studentRepo.getById(id);
    }

    public List<course> getCourseForStudent(int id) {
         List name = new ArrayList<course>();

        student st = studentRepo.findById(id);
        if (st != null) {
            System.out.println(st.getCourses());
            return st.getCourses();
        }

        else if (st == null)
        {
            logger.error("student Not found");
            throw new StudentNotFoundException("Student not found with this id");
        }
     //List<course> courses = studentRepo.findById(id).getCourses();
        List<course> courses = st.getCourses();

        for (course Course : courses) {
            name.add(Course.getName());
        }
        logger.info("course detail with id");
        return name;
    }

    public course getCourseById(int id)
    {
        logger.info("specific student details");
        return courseRepo.findById(id);
    }

    public List<student> getSudentForCourse(int id) {
        List name = new ArrayList<student>();

        course st = courseRepo.findById(id);
        if (st != null) {

            return st.getStudents();
        }
         List<student> students = st.getStudents();

        for (student Student : students) {
            name.add(Student.getFirst_name());
        }
        return name;
    }
//action performed
}
