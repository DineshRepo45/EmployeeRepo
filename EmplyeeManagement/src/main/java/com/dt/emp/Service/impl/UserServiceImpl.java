package com.dt.emp.Service.impl;

import com.dt.emp.Repository.UserRepository;
import com.dt.emp.Service.UserService;
import com.dt.emp.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }
}
