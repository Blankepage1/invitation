package com.blankpage.invitation.repository;

import com.blankpage.invitation.domain.Invite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.util.List;

@Repository
public interface InviteRepository extends JpaRepository<Invite, Integer> {

    List<Invite> findByEvent(String name);
}
