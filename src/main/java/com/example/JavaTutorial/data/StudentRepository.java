package com.example.JavaTutorial.data;

import com.example.JavaTutorial.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

        Student findStudentByUsername(@Param(value = "username")String username);

        List<Student> findAll();

        @Query(value = "SELECT * FROM student WHERE student.username LIKE 'A%' OR student.username LIKE  'B%' ORDER BY student.username", nativeQuery = true)
        List<Student> findStudentWhereUsernameStartsFromAorB();




}



//        @RestResource(exported = false)
//        @Query(value = "SELECT * FROM person p WHERE (p.id NOT IN (SELECT person_id FROM person_event WHERE cast(event_id as varchar ) = cast(:eventId as varchar )))" +
//                "and (:firstName is null or lower(p.first_name) like '%' || lower(cast(:firstName as varchar)) || '%')", nativeQuery = true)
//        Page<Person> findPersonsNotAttending(@Param("eventId") Long eventId,
//                                             @Param("firstName") String firstName,
//                                             Pageable pageable);
//
//        @RestResource(exported = false)
//        @Query(value = "SELECT new com.endava.itcommunity.dto.PersonWithEventsCount(p.id, p.firstName, p.lastName, COUNT(pe)) FROM Person p " +
//                "JOIN p.events pe " +
//                "GROUP BY p " +
//                "ORDER BY COUNT(pe) DESC", countQuery = "SELECT COUNT(p) FROM Person p")
//        Page<PersonWithEventsCount> topActive(Pageable pageable);
//
//        Person findByEmail(@Param("email") String email);


