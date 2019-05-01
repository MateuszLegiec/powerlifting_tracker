package data;

import domain.Exercise;
import domain.User;
import lombok.Getter;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import java.util.Properties;

@Getter
abstract class HibernateConnector{

    private Session currentSession;

    private Transaction currentTransaction;

    private static SessionFactory getSessionFactory() {

        Properties properties = new Properties();

        properties.setProperty(Environment.DRIVER, "com.mysql.jdbc.Driver");
        properties.setProperty(Environment.URL, "jdbc:mysql://localhost:3306/strength_progress?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&createDatabaseIfNotExist=true&useUnicode=yes&characterEncoding=UTF-8");
        properties.setProperty(Environment.USER, "strengthProgressUser");
        properties.setProperty(Environment.PASS, "password");
     //   properties.setProperty(Environment.POOL_SIZE, "1");
        properties.setProperty(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
        properties.setProperty(Environment.SHOW_SQL, "true");
        properties.setProperty(Environment.HBM2DDL_AUTO, "update");
        properties.setProperty(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");

        Configuration configuration = new Configuration();
        configuration.setProperties(properties);
        configuration.addAnnotatedClass(User.class);
        configuration.addAnnotatedClass(Exercise.class);

        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties());
        return configuration.buildSessionFactory(builder.build());
    }

    public final void openCurrentSession() {
        currentSession = getSessionFactory().openSession();
    }

    public final void openCurrentSessionWithTransaction() {
        currentSession = getSessionFactory().openSession();
        currentTransaction = currentSession.beginTransaction();
    }

    public final void closeCurrentSession() {
        currentSession.close();
    }

    public final void closeCurrentSessionWithTransaction() {
        currentTransaction.commit();
        currentSession.close();
    }

}