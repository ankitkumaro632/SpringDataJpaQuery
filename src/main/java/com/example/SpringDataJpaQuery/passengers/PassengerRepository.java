package com.example.SpringDataJpaQuery.passengers;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PassengerRepository extends JpaRepository<Passenger, Long>, CustomPassengerRepository {

    Passenger findFirstByOrderBySeatNumberAsc();

    Passenger findTopByOrderBySeatNumberAsc();

    List<Passenger> findByOrderBySeatNumberAsc();

    List<Passenger> findByFirstNameIgnoreCase(String firstName);

    List<Passenger> findByLastNameOrderBySeatNumberAsc(String lastName);

    List<Passenger> findByLastName(String lastName, Sort sort);

}