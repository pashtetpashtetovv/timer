package pashtetpashtetovv.repo;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import pashtetpashtetovv.entity.Task;

@Repository
public interface TaskRepo extends ReactiveCrudRepository<Task, String> {
}
