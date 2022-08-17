package br.com.fernando.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fernando.model.Parking;


@Repository
public interface ParkingRepository extends JpaRepository<Parking, String> {
}
