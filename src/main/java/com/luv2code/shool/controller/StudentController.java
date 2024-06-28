package com.luv2code.shool.controller;

import com.luv2code.shool.dto.StudentDto;
import com.luv2code.shool.service.StudentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "student management")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/school/student")
public class StudentController {

    private final StudentService studentService;

    @PostMapping("/")
    @Operation( summary = "create a student" , description = " save a student and return an Id")
    public ResponseEntity<Integer> save(@RequestBody StudentDto studentDto){
        return ResponseEntity.ok(studentService.save(studentDto));
    }


    @GetMapping("/{student-id}")
    @Operation(summary = " get a student by is ID ",description = "retrieve a student")
    public ResponseEntity<StudentDto> find(@Parameter(description = " ID of a student to be search")
                                               @PathVariable("student-id") Integer id){
        return ResponseEntity.ok(studentService.findById(id));
    }

    @GetMapping("/")
    @Operation(summary = " get all the student ")
    public ResponseEntity<List<StudentDto>> findAll(){
        return ResponseEntity.ok(studentService.findAll());
    }

    @DeleteMapping("/{student-id}")
    @Operation(summary = "delete a student  ",description = "delete a student by their id")
    public ResponseEntity<Integer> delete(@Parameter(description = "ID of a student to") @PathVariable("student-id") Integer id){
        return ResponseEntity.ok(studentService.delete(id));
    }

}
