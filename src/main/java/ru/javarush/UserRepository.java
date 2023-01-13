package ru.javarush;

public interface UserRepository {
    User findById(String id);
}
