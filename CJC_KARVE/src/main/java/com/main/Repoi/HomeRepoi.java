package com.main.Repoi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.model.Student2;


@Repository
public interface HomeRepoi extends JpaRepository<Student2, Integer> {

}
