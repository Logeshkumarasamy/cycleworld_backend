package com.cycleworld.Controller;

import com.cycleworld.Model.Newsletter;
import com.cycleworld.Model.UserDetails;
import com.cycleworld.Service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class NewsController {
    @Autowired
    NewsService newsserviec;

    @PostMapping("/api/user/Newsletter")
    public Newsletter sendMail(@RequestBody Newsletter newsletter) {
        return newsserviec.sendMail(newsletter);
    }
}
