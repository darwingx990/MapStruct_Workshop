package com.riwi.MapstructWorkshop.domain.repository;

import com.riwi.MapstructWorkshop.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
