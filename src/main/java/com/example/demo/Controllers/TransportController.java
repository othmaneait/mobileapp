package com.example.demo.Controllers;

import com.example.demo.Models.AvailableTransport;
import com.example.demo.Models.User;
import com.example.demo.Services.TransportService;
import com.example.demo.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class TransportController {
    @Autowired
    private TransportService transportService;

    @GetMapping("/showtransportparpreference/{preference}")
    public List<AvailableTransport> findbypreference(@PathVariable String  preference ) {

            var transpots = (List<AvailableTransport>) transportService.findbypreference(preference);

        return transpots ;
    }
    @GetMapping("/showtransportparpreferenceandtime/{preference}/{time}")
public List<AvailableTransport> findbynameandate(@PathVariable String preference , @PathVariable String time){
        return transportService.findbynameand(preference,time);
    }



}
