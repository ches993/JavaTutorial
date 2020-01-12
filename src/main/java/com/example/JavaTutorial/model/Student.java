package com.example.JavaTutorial.model;


import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="student")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int studentId;
    @Column(name = "studentName")
    @NotNull
    private String name;
    @Column(name = "studentAge")
    @NotNull
    private String age;
    
}
