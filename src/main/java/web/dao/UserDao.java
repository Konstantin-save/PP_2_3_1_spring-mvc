package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    public List<User> getAllUser();           //метод возвр .pthjd
    public void saveUser (User user);         //сохр юзера

    void addUser(User user);

    User getUserById(long id);

    public User getUser(long id);      //возвращает юзера
    public void deleteUser(long id);
}