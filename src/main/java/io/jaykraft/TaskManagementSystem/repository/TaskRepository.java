package io.jaykraft.TaskManagementSystem.repository;

import io.jaykraft.TaskManagementSystem.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}
