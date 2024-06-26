package com.apiweb.ApiWeb.services;

import com.apiweb.ApiWeb.entity.Users;
import com.apiweb.ApiWeb.repository.UsersRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UsersRepository usersRepository;

    public UserService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public List<Users> create(Users users) {
        usersRepository.save(users);

        return list();
    }

    public List<Users> list() {
        Sort sort = Sort.by("name").descending();

        return usersRepository.findAll(sort);
    }



}
