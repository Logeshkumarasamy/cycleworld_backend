package com.cycleworld.Service;

import com.cycleworld.Model.Newsletter;
import com.cycleworld.repo.NewsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsService {
    @Autowired
    NewsRepo newsrepo;
    public Newsletter sendMail (Newsletter newsletter) {
        return newsrepo.save(newsletter);
    }
}
