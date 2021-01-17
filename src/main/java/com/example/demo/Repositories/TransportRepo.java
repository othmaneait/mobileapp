package com.example.demo.Repositories;

import com.example.demo.Models.AvailableTransport;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransportRepo extends CrudRepository<AvailableTransport, Long> {
    public List<AvailableTransport> findByNametransport(String name);

    @Query("select t from AvailableTransport t where t.nametransport=:x and t.departuretime=:y")
    public List<AvailableTransport> findbynameanddate(@Param("x") String x , @Param("y") String y);

}