package com.xavi.rockets.repository;

import com.xavi.rockets.domain.Rocket;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RocketRepository extends CrudRepository<Rocket, Long> {

}
