package com.KrishanSelf.KrishanSelf.repository;

import com.KrishanSelf.KrishanSelf.model.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentRepo extends JpaRepository<student,Integer>
{

   student findById(int id);
}
