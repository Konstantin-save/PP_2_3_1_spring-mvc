package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.PersistenceCreator;
import org.springframework.stereotype.Component;
import web.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContexts;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

    private EntityManager entityManager;

    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<User> getAllUser() {
        List<User> AllUser = entityManager.createQuery("select u from User u", User.class).getResultList();    //запрос всех пользователей
        return AllUser;
    }

    @Override
    public void saveUser(User user) {         //прописываем реальную работу метода saveUser(т.к.DAO отвеч за раб с БД), далее он вызывается в UserServiceImpI и далее из него в Controller
        entityManager.merge(user);       //????какой запрос     saveOrUpdate: если Id=0,то юзер добавл, если Id!=0, то будет изменен существующий юзер
    }

    @Override
    public void addUser(User user) {

        entityManager.merge(user);
    }
     @Override
    public User getUserById(long id) {
        User user = entityManager.find(User.class, id);        //возвр по id
        return user;
    }

    @Override
    public User getUser(long id) {                           //возвр юзера
        User user = entityManager.find(User.class, id);
        return user;
    }

    @Override
    public void deleteUser(long id) {
        TypedQuery <User> typedQuery = (TypedQuery<User>) entityManager.createQuery("delete from User where id =: userId"); //
        typedQuery.setParameter("userId",id);
        typedQuery.executeUpdate();
    }


}