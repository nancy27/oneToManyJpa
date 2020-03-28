package com.example.oneToManyJPA;

import com.example.oneToManyJPA.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends JpaRepository<Address,Integer> {
    List<Address> findAllByEmployeeId(Integer employeeId);
}
