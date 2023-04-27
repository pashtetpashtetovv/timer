package pashtetpashtetovv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pashtetpashtetovv.repo.TimeCodeRepo;
import pashtetpashtetovv.entity.TimeCode;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TimeCodeService {

    @Autowired
    private TimeCodeRepo timeCodeRepo;

    public Mono<TimeCode> save(TimeCode timeCode) {
        return timeCodeRepo.save(timeCode);
    }

    public Mono<TimeCode> find(String id) {
        return timeCodeRepo.findById(id);
    }

    public Flux<TimeCode> findAll() {
        return timeCodeRepo.findAll();
    }

    public Flux<TimeCode> findByTaskId(String taskId) {
        return timeCodeRepo.findByTask(taskId);
    }
}
