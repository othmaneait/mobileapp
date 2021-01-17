package com.example.demo.Services;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.Models.AvailableTransport;
import com.example.demo.Models.User;
import com.example.demo.Repositories.TransportRepo;
import com.example.demo.Repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TransportService {
    @Autowired
    private TransportRepo transportRepo ;

    public List<AvailableTransport> findbypreference(String preference){
        return transportRepo.findByNametransport(preference);

    }
    public List<AvailableTransport> findbynameand( String u , String v){
        return transportRepo.findbynameanddate(u,v) ;
    }
}

