package org.lucasnscr.fetcher.mutation;

import lombok.RequiredArgsConstructor;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Mutation;
import org.eclipse.microprofile.graphql.Name;
import org.lucasnscr.domain.Bank;
import org.lucasnscr.domain.input.BankInput;
import org.lucasnscr.repository.BankRepository;

import javax.transaction.Transactional;

@GraphQLApi
@RequiredArgsConstructor
public class BankMutation {

    private final BankRepository repository;

    @Mutation("createBank")
    @Transactional
    public Bank createBank(@Name("bank")BankInput bankInput){
        var bankToSave = new Bank(null, bankInput.getName(), bankInput.getCountry(), null, null);
        repository.persist(bankToSave);
        return bankToSave;
    }

}
