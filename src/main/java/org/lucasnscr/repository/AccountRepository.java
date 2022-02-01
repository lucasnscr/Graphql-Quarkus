package org.lucasnscr.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.lucasnscr.domain.Account;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AccountRepository implements PanacheRepository<Account> {
}
