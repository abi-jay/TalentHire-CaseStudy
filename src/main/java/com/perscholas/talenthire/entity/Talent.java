package com.perscholas.talenthire.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "talents")
public class Talent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    @NotNull(message = "Name can't be empty!")
    private String name;

    @Lob
    private String introduction;

    @Column(name = "talent")
    @NotNull(message = "Enter your talent")
    private String talent;
    private String location;
    private String email;

    @CreationTimestamp
    private LocalDateTime memberSince;
    private BigDecimal rate;
}
