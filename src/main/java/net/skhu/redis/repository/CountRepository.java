package net.skhu.redis.repository;

import org.springframework.data.repository.CrudRepository;

import net.skhu.redis.domain.Count;


public interface CountRepository extends CrudRepository<Count, String> {



}
