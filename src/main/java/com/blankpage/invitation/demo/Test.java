package com.blankpage.invitation.demo;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "test")
public class Test {
    @Id
    String id;
    @Column(name = "name")
    String name;
    @Column(name = "COLUMN1")
    String column;
}
