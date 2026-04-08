package vn.edu.huce.ltudm.jpaexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.edu.huce.ltudm.jpaexample.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}
