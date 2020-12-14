package com.cycleworld.Controller;

import com.cycleworld.Model.Feed;
import com.cycleworld.Model.Newsletter;
import com.cycleworld.Service.Feedservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "*")

public class FeedController {
    @Autowired
    Feedservice feedservice;

    @PostMapping ("/api/user/feedback")
    public Feed sendData(@RequestBody Feed feed) {
        return feedservice.sendData(feed);
    }
    @GetMapping("/admin/feedback")
    public List<Feed> getallfeedback() {

        return feedservice.getallfeedback();
    }
}
