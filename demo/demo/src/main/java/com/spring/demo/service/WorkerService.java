package com.spring.demo.service;

import com.spring.demo.entity.Workers;
import com.spring.demo.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkerService {
    @Autowired
    private WorkerRepository workerRepository;

    public String save(Workers workers){
        workerRepository.saveAndFlush(workers);
        return "saved successfully";
    }
    public String update(Workers workers){
        workerRepository.saveAndFlush(workers);
        return "updated";
    }




}
