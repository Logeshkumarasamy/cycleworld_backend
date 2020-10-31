package com.cycleworld.repo;

import com.cycleworld.Model.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Repository
@CrossOrigin(origins = "*")
public interface UserRepo extends CrudRepository<UserDetails,Integer> {

    public UserDetails findBygmailIdAndPassworld(String gmailId , String passworld);
}
