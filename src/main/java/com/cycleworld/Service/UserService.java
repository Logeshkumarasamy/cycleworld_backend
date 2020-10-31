package com.cycleworld.Service;

import com.cycleworld.Model.UserDetails;
import com.cycleworld.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Service
@CrossOrigin(origins = "*")
public class UserService {
    @Autowired
    UserRepo userrepo;

    public UserDetails createuser(UserDetails userDetails) {
        return userrepo.save(userDetails);
    }

    public List<UserDetails> getAllUser() {
        return (List<UserDetails>) userrepo.findAll();
    }
    public UserDetails factchBypasswordandemailid(String gmailId ,String passworld) {
        return userrepo.findBygmailIdAndPassworld(gmailId , passworld);
    }

}
