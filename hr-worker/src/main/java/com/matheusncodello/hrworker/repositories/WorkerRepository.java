package com.matheusncodello.hrworker.repositories;

import com.matheusncodello.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
