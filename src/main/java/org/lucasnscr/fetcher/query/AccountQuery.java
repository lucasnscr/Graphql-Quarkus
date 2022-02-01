package org.lucasnscr.fetcher.query;

import lombok.RequiredArgsConstructor;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Name;
import org.eclipse.microprofile.graphql.Query;
import org.lucasnscr.domain.Account;
import org.lucasnscr.repository.AccountRepository;

import java.util.List;
import java.util.stream.Collectors;

@GraphQLApi
@RequiredArgsConstructor
public class AccountQuery {

    private final AccountRepository repository;

    @Query("accounts")
    public List<Account> findAll(){return repository.findAll().stream().collect(Collectors.toList());}

    @Query("account")
    public Account findById(@Name("id") Long id){return repository.findById(id);}

}
