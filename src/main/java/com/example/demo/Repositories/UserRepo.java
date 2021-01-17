package com.example.demo.Repositories;
import com.example.demo.Models.AvailableTransport;
import com.example.demo.Models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {

}
