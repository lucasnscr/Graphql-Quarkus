package org.lucasnscr.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.lucasnscr.domain.Bank;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BankRepository implements PanacheRepository<Bank> {

}
