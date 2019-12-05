package com.example.examination.servises;

import com.example.examination.entity.User;
import com.example.examination.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserService implements BaseService<User> {

    private final UserRepository userRepository;


    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public User getByName(String name) {
        return null;
    }

    @Override
    public User getById(Long id) {
        return null;
    }

    @Override
    public void save(User user) {

    }
}
