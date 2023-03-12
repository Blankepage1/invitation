package com.blankpage.invitation.controller;

import com.blankpage.invitation.domain.Invite;
import com.blankpage.invitation.service.InviteService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.List;

@RestController
public class InvitationController {
    private InviteService inviteService;

    public InvitationController(InviteService inviteService) {
        this.inviteService = inviteService;
    }

    @PostMapping("/invite/save")
    public Mono<Invite> save(@RequestBody Invite invite) {
        return inviteService.save(invite);
    }

    @GetMapping("/invite/view")
    public List<Invite> viewInvitation() {
        return inviteService.viewInvitations();
    }

    @GetMapping("/views")
    public Flux<String> viewMultipleInvitation() {
        return Flux.just("test", "rest").log();
    }

    @GetMapping("/invite/view/{event}")
    public List<Invite> vieInvitationByEvent(@PathVariable String event) {
        return inviteService.viewInvitationsByEvent(event);
    }

    @GetMapping(value = "/stream", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Long> stream() {
        return Flux.interval(Duration.ofSeconds(1)).log();
    }
}
