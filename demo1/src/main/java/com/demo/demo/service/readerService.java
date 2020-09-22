package com.demo.demo.service;

import com.demo.demo.entity.reader;



import java.util.List;

public interface readerService {
    //增
    boolean addAll(reader reader);

    //删
    boolean delete(Integer R000);

    //查
    List<reader> selectAll();

    //改
    boolean update(reader reader);
}
