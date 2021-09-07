package com.KrishanSelf.KrishanSelf.repository;

import com.KrishanSelf.KrishanSelf.model.course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface courseRepo extends JpaRepository<course,Integer> {
}
