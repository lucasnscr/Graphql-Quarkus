package org.lucasnscr.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String firstName;

    private String lastName;

    private int age;

    private String address;

    private String country;

    private String city;

    @OneToMany(mappedBy = "user")
    private Set<Account> accounts;

    @ManyToOne()
    private Bank bank;
}
