package com.luv2code.shool.dto;


import com.luv2code.shool.model.Course;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CourseDto {

    private String name;
    private String description;
    private String courseCode;




    /*************************** mapping dto and entity ******************************/

    public static CourseDto fromEntity(Course course){
        return CourseDto
                .builder()
                .name(course.getName())
                .description(course.getDescription()).
                courseCode(course.getCourseCode())
                .build();
    }

    public static Course toEntity(CourseDto courseDto){
        return Course
                .builder()
                .name(courseDto.getName())
                .description(courseDto.getDescription()).
                courseCode(courseDto.getCourseCode())
                .build();
    }

}
