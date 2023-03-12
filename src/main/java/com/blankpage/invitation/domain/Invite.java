package com.blankpage.invitation.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "invite")
public class Invite {
    @Id
    int id;
    @Column
    String event;
    @Column
    String location;
    @Column
    String phone;
}
