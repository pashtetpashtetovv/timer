package pashtetpashtetovv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pashtetpashtetovv.entity.Task;
import pashtetpashtetovv.repo.TaskRepo;
import reactor.core.publisher.Mono;

@Service
public class TaskService {

    @Autowired
    private TaskRepo taskRepo;

    public Mono<Task> save(Task task){
        return taskRepo.save(task);
    }

    public Mono<Task> find(String id){
        return taskRepo.findById(id);
    }

}
