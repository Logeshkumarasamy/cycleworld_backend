package com.cycleworld.Service;

import com.cycleworld.Model.Feed;
import com.cycleworld.Model.Newsletter;
import com.cycleworld.repo.FeedRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Feedservice {

    @Autowired
    FeedRepo feedRepo;
    public Feed sendData (Feed feed) {
        return feedRepo.save(feed);
    }
    public List<Feed> getallfeedback() {
        return (List<Feed>) feedRepo.findAll();
    }

}
