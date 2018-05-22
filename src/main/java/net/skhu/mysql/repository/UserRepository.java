package net.skhu.mysql.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import net.skhu.mysql.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	@Procedure
	public void inserting_user_ten_thousands();
	public Optional<User> findByLoginId(String loginId);
}
