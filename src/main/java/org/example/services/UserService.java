package org.example.services;

import org.example.models.User;
import org.example.models.Usuario;
import org.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<Usuario> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<Usuario> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public Usuario createUser(Usuario user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
