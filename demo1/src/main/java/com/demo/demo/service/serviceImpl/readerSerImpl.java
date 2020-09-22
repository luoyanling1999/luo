package com.demo.demo.service.serviceImpl;

import com.demo.demo.dao.readerDao;
import com.demo.demo.entity.reader;
import com.demo.demo.service.readerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class readerSerImpl implements readerService {
    @Autowired
    private readerDao readerDao;

    @Override
    public boolean addAll(reader reader) {
        return readerDao.addAll(reader);
    }

    @Override
    public boolean delete(Integer R000) {
        return readerDao.delete(R000);
    }

    @Override
    public List<reader> selectAll() {
        return readerDao.selectAll();
    }

    @Override
    public boolean update(reader reader) {
        return readerDao.update(reader);
    }
}
