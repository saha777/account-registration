package com.account.registration.repository;

import com.account.registration.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
    User findByEmail(String email);
    User findByConfirmationToken(String confirmationToken);
}
