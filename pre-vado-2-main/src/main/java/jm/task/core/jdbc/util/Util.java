package jm.task.core.jdbc.util;

import jm.task.core.jdbc.model.User;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Util {
    //Util есть util, нехуй сказать нужен для подключения,вариаций в интернете дохуя, вот пример который мне понравился больше, есть хочешь другие смотри в гугле,
    // абсолютно дефолтная хуйня
    private static final String DRIVER = "здесь пишешь свое";
    private static final String HOST = "здесь пишешь свое?useSSL=false&allowMultiQueries=true&serverTimezone=UTC";
    //хуето непонятная после вопросиков, нужна для mySql, что бы он нахуй не крашнулся, если на postgre она не нужна
    private static final String LOGIN = "здесь пишешь свое";
    private static final String PASSWORD = "здесь пишешь свое";
    private static SessionFactory sessionFactory = null;

    public static SessionFactory getConnection() {
        try {
            Configuration configuration = new Configuration()
                    .setProperty("hibernate.connection.driver_class", DRIVER)
                    .setProperty("hibernate.connection.url", HOST)
                    .setProperty("hibernate.connection.username", LOGIN)
                    .setProperty("hibernate.connection.password", PASSWORD)
                    .setProperty("hibernate.dialect", "org.hibernate.dialect.пишешь диалект для бд к которой подключаешься")
                    .addAnnotatedClass(User.class)
                    .setProperty("hibernate.c3p0.min_size", "5")
                    .setProperty("hibernate.c3p0.max_size", "200")
                    .setProperty("hibernate.c3p0.max_statements", "200");
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return sessionFactory;
    }
}
