package com.myprojects.CurdOpertions.Repository;

import com.myprojects.CurdOpertions.Entity.Student_list;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student_list, Long> {
}
