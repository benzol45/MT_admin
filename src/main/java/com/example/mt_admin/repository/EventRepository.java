package com.example.mt_admin.repository;

import com.example.mt_admin.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
    List<Event> findAllByHideIsFalseOrderByDateAsc();
}
