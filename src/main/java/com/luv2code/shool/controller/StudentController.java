package com.luv2code.shool.controller;

import com.luv2code.shool.dto.StudentDto;
import com.luv2code.shool.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/school")
public class StudentController {

    private final StudentService studentService;

    @PostMapping("/")
    public ResponseEntity<Integer> save(@RequestBody StudentDto studentDto){
        return ResponseEntity.ok(studentService.save(studentDto));
    }

    @GetMapping("/{student-id}")
    public ResponseEntity<StudentDto> find(@PathVariable("student-id") Integer id){
        return ResponseEntity.ok(studentService.findById(id));
    }

    @GetMapping("/")
    public ResponseEntity<List<StudentDto>> findAll(){
        return ResponseEntity.ok(studentService.findAll());
    }

    @DeleteMapping("/{student-id}")
    public ResponseEntity<Integer> delete(@PathVariable("student-id") Integer id){
        return ResponseEntity.ok(studentService.delete(id));
    }
}
