package com.demo.tasklist.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.demo.tasklist.Model.OneTask;

public interface TaskListRepository extends MongoRepository<OneTask,String> {
}
