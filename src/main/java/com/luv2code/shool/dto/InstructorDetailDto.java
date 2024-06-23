package com.luv2code.shool.dto;

import com.luv2code.shool.model.InstructorDetails;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class InstructorDetailDto {

    private String hobbies;


    /*************************** mapping dto and entity ******************************/

    public static InstructorDetailDto fromEntity(InstructorDetails details){
        return
                InstructorDetailDto
                        .builder()
                        .hobbies(details.getHobbies())
                        .build();
    }

    public static InstructorDetails toEntity(InstructorDetailDto details){
        return
                InstructorDetails
                        .builder()
                        .hobbies(details.getHobbies())
                        .build();
    }


}
