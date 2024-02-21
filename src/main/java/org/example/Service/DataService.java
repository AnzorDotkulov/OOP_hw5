package org.example.Service;
import org.example.Model.User;
import java.util.List;
public interface DataService {
    User create(User user);
    List<User> read();
}