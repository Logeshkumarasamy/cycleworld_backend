package com.cycleworld.repo;

import com.cycleworld.Model.Feed;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedRepo extends CrudRepository<Feed , Integer> {
}
