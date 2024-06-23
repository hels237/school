package com.luv2code.shool.service;

import java.util.List;

public interface AbstractService<T>{
    Integer save(T object);
    List<T> findAll();
    T findById(Integer id);
    Integer delete(Integer id);
}