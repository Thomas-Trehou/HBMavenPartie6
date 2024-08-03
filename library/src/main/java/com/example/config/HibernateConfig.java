package com.example.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.IOException;
import java.util.Properties;

public class HibernateConfig {
  private static final SessionFactory sessionFactory;

  static {
    try {
      Properties properties = new Properties();
      properties.load(HibernateConfig.class.getClassLoader().getResourceAsStream("application.properties"));

      Configuration configuration = new Configuration();
      configuration.setProperties(properties);
      sessionFactory = configuration.buildSessionFactory();
    } catch (IOException e) {
      throw new ExceptionInInitializerError("Failed to load hibernate properties");
    } catch (Throwable ex) {
      throw new ExceptionInInitializerError(ex);
    }
  }

  public static SessionFactory getSessionFactory() {
    return sessionFactory;
  }
}