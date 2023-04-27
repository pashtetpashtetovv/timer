package pashtetpashtetovv.repo;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import pashtetpashtetovv.entity.TimeCode;
import reactor.core.publisher.Flux;

@Repository
public interface TimeCodeRepo extends ReactiveCrudRepository<TimeCode, String> {
    Flux<TimeCode> findByTask(String taskId);
}
