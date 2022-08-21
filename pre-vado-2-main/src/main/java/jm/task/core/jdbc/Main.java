package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;


public class Main {
    private static final User user1 = new User(//создаешь своего Usera);
    private static final User user2 = new User(//создаешь своего Usera);
    private static final User user3 = new User(//создаешь своего Usera);
    private static final User user4 = new User(//создаешь своего Usera);

    public static void main(String[] args) {
        // на это тоже дрочат менторы))
        //UserDao userDao = new UserDaoHibernateImpl();
        userDao.createUsersTable();
        userDao.saveUser(user1.getName(), user1.getLastName(), user1.getAge());
        userDao.saveUser(user2.getName(), user2.getLastName(), user2.getAge());
        userDao.saveUser(user3.getName(), user3.getLastName(), user3.getAge());
        userDao.saveUser(user4.getName(), user4.getLastName(), user4.getAge());
        userDao.getAllUsers();
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
        //надеюсь у тебя все получилось солнышко, с любовью sniper66659
    }
}
