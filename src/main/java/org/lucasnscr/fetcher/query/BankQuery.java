package org.lucasnscr.fetcher.query;

import lombok.RequiredArgsConstructor;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Name;
import org.eclipse.microprofile.graphql.Query;
import org.lucasnscr.domain.Bank;
import org.lucasnscr.repository.BankRepository;

import java.util.List;
import java.util.stream.Collectors;

@GraphQLApi
@RequiredArgsConstructor
public class BankQuery {

    private final BankRepository repository;

    @Query("banks")
    public List<Bank> findAll() {
        return repository.findAll().stream().collect(Collectors.toList());
    }
    @Query("bank")
    public Bank findById(@Name("id") Long id) { return repository.findById(id);}
}
