package com.example.JavaTutorial.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "university")
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private long id;




    @NotNull
    @Column(name = "universityName")
    private String universityName;


    @NotNull
    @Column(name = "universityAddress")
    private String universityAddress;

    @ManyToMany(mappedBy = "universities")
    @JsonIgnore
    private Set<Student> students;



}
