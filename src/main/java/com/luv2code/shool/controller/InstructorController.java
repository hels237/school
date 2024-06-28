package com.luv2code.shool.controller;

import com.luv2code.shool.dto.InstructorDto;
import com.luv2code.shool.service.InstructorService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "instructor management")
@RestController
@RequestMapping("/api/school/instructor")
@RequiredArgsConstructor
public class InstructorController {

    private final InstructorService instructorService;

    @PostMapping("/")
    @Operation(summary = " create the instructor ")
    public ResponseEntity<Integer> save(@RequestBody InstructorDto instructorDto){
        return ResponseEntity.ok(instructorService.save(instructorDto));
    }

    @GetMapping("/{instructor-id}")
    @Operation(summary = " get a instructor ",description = "retrieve a instructor by  id")
    public ResponseEntity<InstructorDto> find(@Parameter(name = "instructor-id",description = "provide an instructorId")
                                                  @PathVariable("instructor-id") Integer id){
        return  ResponseEntity.ok(instructorService.findById(id));
    }

    @GetMapping("/")
    @Operation(summary = " get all the instructor ")
    public ResponseEntity<List<InstructorDto>> findAll(){
        return ResponseEntity.ok(instructorService.findAll());
    }

    @DeleteMapping("/{instructor-id}")
    @Operation(summary = "delete a instructor ",description = "delete a instructor by id")
    public ResponseEntity<Integer> delete(@Parameter(name = "instructor-id",description = "provide an instructor id")@PathVariable("instructor-id") Integer id){
        return ResponseEntity.ok(instructorService.delete(id));
    }

}
