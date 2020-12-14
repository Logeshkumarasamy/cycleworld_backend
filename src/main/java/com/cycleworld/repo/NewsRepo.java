package com.cycleworld.repo;

import com.cycleworld.Model.Newsletter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsRepo extends CrudRepository<Newsletter, Integer> {
}
