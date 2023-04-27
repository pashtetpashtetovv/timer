package pashtetpashtetovv.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pashtetpashtetovv.service.TimeCodeService;
import pashtetpashtetovv.entity.TimeCode;
import pashtetpashtetovv.entity.dto.TimeCodeDTO;
import pashtetpashtetovv.entity.mapper.TimeCodeMapper;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/timeCode")
public class TimeCodeController {

    @Autowired
    private TimeCodeMapper tcMapper;

    @Autowired
    private TimeCodeService timeCodeService;

    private static final Logger log = LoggerFactory.getLogger(TimeCodeController.class);

    @PostMapping("/save")
    public Mono<TimeCodeDTO> save(@RequestBody TimeCode timeCode) {
        return timeCodeService.save(timeCode).map(
                tcMapper::toDTO
        );
    }

    @GetMapping("/get/{id}")
    public Mono<TimeCodeDTO> find(@PathVariable String id) {
        return timeCodeService.find(id).map(
                tcMapper::toDTO
        );
    }

    @GetMapping("/find/all")
    public Flux<TimeCodeDTO> findAll() {
        return timeCodeService.findAll().map(
                tcMapper::toDTO
        );
    }

    @GetMapping("/find")
    public Flux<TimeCodeDTO> findAll(@RequestParam String taskID) {
        return timeCodeService.findByTaskId(taskID).map(
                tcMapper::toDTO
        );
    }
}
