package org.lucasnscr.fetcher.query;

import lombok.RequiredArgsConstructor;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Name;
import org.eclipse.microprofile.graphql.Query;
import org.lucasnscr.domain.User;
import org.lucasnscr.repository.UserRepository;
import java.util.List;

@GraphQLApi
@RequiredArgsConstructor
public class UserQuery {

    private final UserRepository userRepository;

    @Query("users")
    public List<User> findAll() {return (List<User>) userRepository.findAll();}

    @Query("user")
    public User findById(@Name("id") Long id) {return userRepository.findById(id);}
}
