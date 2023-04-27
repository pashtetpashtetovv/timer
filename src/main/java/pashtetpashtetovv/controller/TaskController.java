package pashtetpashtetovv.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pashtetpashtetovv.entity.mapper.TaskMapper;
import pashtetpashtetovv.service.TaskService;
import pashtetpashtetovv.entity.Task;
import pashtetpashtetovv.entity.dto.TaskDTO;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @Autowired
    private TaskMapper taskMapper;

    private static final Logger log = LoggerFactory.getLogger(TaskController.class);

    @PostMapping("/save")
    public Mono<TaskDTO> save(@RequestBody Task task){
        return taskService.save(task)
                .map(taskMapper::toDTO);
    }

    @GetMapping("/find/{id}")
    public Mono<TaskDTO> get(@PathVariable String id){
        return taskService.find(id)
                .map(taskMapper::toDTO);
    }

}
