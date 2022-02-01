package org.lucasnscr.fetcher.mutation;

import lombok.RequiredArgsConstructor;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Mutation;
import org.eclipse.microprofile.graphql.Name;
import org.lucasnscr.domain.Account;
import org.lucasnscr.domain.Bank;
import org.lucasnscr.domain.User;
import org.lucasnscr.domain.input.AccountInput;
import org.lucasnscr.repository.AccountRepository;
import org.lucasnscr.repository.BankRepository;
import org.lucasnscr.repository.UserRepository;

import javax.transaction.Transactional;

@GraphQLApi
@RequiredArgsConstructor
public class AccountMutation {

    private final AccountRepository accountRepository;

    private final BankRepository bankRepository;

    private final UserRepository userRepository;

    @Mutation("createAccount")
    @Transactional
    public Account createAccount(@Name("account") AccountInput accountInput){
        User user = userRepository.findById(accountInput.getUserId());
        Bank bank = bankRepository.findById(accountInput.getBankId());

        var accountToSave = new Account(null, accountInput.getName(), accountInput.getAlias(), accountInput.getAmount(), user, bank);
        accountRepository.persistAndFlush(accountToSave);
        return accountToSave;
    }

}
