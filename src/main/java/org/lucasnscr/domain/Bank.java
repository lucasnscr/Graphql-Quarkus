package org.lucasnscr.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "bank")
public class Bank {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String country;

    @OneToMany(mappedBy = "bank")
    private Set<User> users;

    @OneToMany(mappedBy = "bank")
    private Set<Account> accounts;
}
