package net.skhu.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.skhu.mysql.domain.Event;
@Repository
public interface EventRepository extends JpaRepository<Event, Long>{

}
