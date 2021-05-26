package jrazek.orderapp.repository;

import jrazek.orderapp.model.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    @Query("select '*' from User WHERE (firstName=?1 AND lastName=?2)")
    List<User> getByFirstAndLastName(String name, String lastName);

    @Query("select '*' from User WHERE login=?1")
    List<User> getByLogin(String login);
}
