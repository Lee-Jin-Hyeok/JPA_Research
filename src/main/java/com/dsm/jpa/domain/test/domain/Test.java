package com.dsm.jpa.domain.test.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "test")
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "a")
    private String a;

    @Column(name = "b")
    private String b;
}