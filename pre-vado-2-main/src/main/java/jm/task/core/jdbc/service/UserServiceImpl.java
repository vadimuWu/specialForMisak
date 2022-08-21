package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    //Создаем поле, на которое дрочат по ночам менторы, так называемое глубокая абстракция, описывать смысла нет ниже сделал, думаю сам разберешся
    //UserDao userDao = new UserDaoHibernateImpl();

    public void createUsersTable() {
        //обращаемся к переменной userDao и вызываем метод аналогичный названию
    }

    public void dropUsersTable() {
        //обращаемся к переменной userDao и вызываем метод аналогичный названию
    }

    public void saveUser(String name, String lastName, byte age) {
        //обращаемся к переменной userDao и вызываем метод аналогичный названию
    }

    public void removeUserById(long id) {
        //обращаемся к переменной userDao и вызываем метод аналогичный названию
    }

    public List<User> getAllUsers() {
        //обращаемся к переменной userDao и вызываем метод аналогичный названию, не забываем вернуть это тебе не void
    }

    public void cleanUsersTable() {
        //обращаемся к переменной userDao и вызываем метод аналогичный названию
    }
}
