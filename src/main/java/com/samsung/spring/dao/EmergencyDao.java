package com.samsung.spring.dao;

import com.samsung.spring.domain.Emergency;
import com.samsung.spring.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmergencyDao extends JpaRepository<Emergency, Long> {
}
