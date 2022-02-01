package org.lucasnscr.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.lucasnscr.domain.User;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserRepository implements PanacheRepository<User> {
}
