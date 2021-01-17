package com.example.demo.Models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "availabletransport")

public class AvailableTransport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nametransport;
    private String departuretime;

    private String arrivaltime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNametransport() {
        return nametransport;
    }

    public void setNametransport(String nametransport) {
        this.nametransport = nametransport;
    }

    public String getDeparturetime() {
        return departuretime;
    }

    public void setDeparturetime(String departuretime) {
        this.departuretime = departuretime;
    }

    public String getArrivaltime() {
        return arrivaltime;
    }

    public void setArrivaltime(String arrivaltime) {
        this.arrivaltime = arrivaltime;
    }
}
