package org.lucasnscr.fetcher.mutation;

import lombok.RequiredArgsConstructor;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Mutation;
import org.eclipse.microprofile.graphql.Name;
import org.lucasnscr.domain.User;
import org.lucasnscr.domain.input.UserInput;
import org.lucasnscr.repository.UserRepository;

import javax.transaction.Transactional;

@GraphQLApi
@RequiredArgsConstructor
public class UserMutation {

    private final UserRepository userRepository;

    @Mutation("createUser")
    @Transactional
    public User createUser(@Name("user") UserInput user) {
        var userToSave = new User(null, user.getFirstName(), user.getLastName(), user.getAge(), user.getAddress(), user.getCountry(), user.getCity(), null, null);
        userRepository.persistAndFlush(userToSave);
        return userToSave;
    }

}
