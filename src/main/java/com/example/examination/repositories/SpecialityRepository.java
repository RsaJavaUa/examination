package com.example.examination.repositories;

import com.example.examination.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecialityRepository  extends JpaRepository<User, Long> {
}
