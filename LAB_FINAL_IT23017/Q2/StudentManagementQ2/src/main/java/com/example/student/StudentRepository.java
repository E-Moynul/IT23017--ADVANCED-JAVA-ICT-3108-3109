package com.example.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // এই 'extends JpaRepository<Student, Long>' অংশটুকুই 'save' মেথডটি নিয়ে আসে
}