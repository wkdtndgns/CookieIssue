package net.skhu.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.skhu.mysql.domain.User;


public interface UserRepository extends JpaRepository<User, Long>{

}
