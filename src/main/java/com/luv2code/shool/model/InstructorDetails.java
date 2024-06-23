package com.luv2code.shool.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "instructor-detail")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InstructorDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String hobbies;

    @OneToOne
    @JoinColumn(name = "instructor_id")
    private Instructor instructor;

}
