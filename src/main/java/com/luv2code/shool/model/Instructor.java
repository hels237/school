package com.luv2code.shool.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "instructor")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstname;
    private String lastname;
    private String email;

    @OneToMany(mappedBy = "instructor")
    private List<Course> courses;

    @OneToOne(mappedBy = "instructor")
    private InstructorDetails instructorDetails;
}
