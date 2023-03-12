package com.blankpage.invitation.service;

import com.blankpage.invitation.domain.Invite;
import com.blankpage.invitation.repository.InviteRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class InviteService {
    private InviteRepository inviteRepository;

    public InviteService(InviteRepository inviteRepository) {
        this.inviteRepository = inviteRepository;
    }

    public Mono<Invite> save(Invite invite) {
        return Mono.just(inviteRepository.save(invite));
    }

    public List<Invite> viewInvitations() {
        return inviteRepository.findAll();
    }

    public List<Invite> viewInvitationsByEvent(String event) {
        return inviteRepository.findByEvent(event);
    }
}
