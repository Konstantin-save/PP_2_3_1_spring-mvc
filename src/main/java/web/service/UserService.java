package web.service;

import web.model.User;

import java.util.List;

//БИЗНЕС ЛОГИКА. Service-соединит звено между контроллером и Дао


public interface UserService {
    public List<User> getAllUser();   //метод возвр юзеров
    public void saveUser(User user);  //метод сохранения юзера в базу(при добавлении в форму)
    public  User getUser(long id); //возвращает юзера
    public void deleteUser(long id);



    void addUser(User user);

    void removeUser(long id);


    User getUserById(long id);
}
