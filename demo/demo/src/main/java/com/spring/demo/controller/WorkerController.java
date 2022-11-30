package com.spring.demo.controller;

import com.spring.demo.entity.Workers;
import com.spring.demo.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkerController {
    @Autowired
    private WorkerService workerService ;

    @PostMapping("/saveWorkers")
    public String saveWorkers(@RequestBody Workers workers){
        workerService.save(workers);
        return "success";
    }
    @PutMapping("/updates")
    public String update(@RequestBody Workers workers){
        return workerService.save(workers);


    }

}
