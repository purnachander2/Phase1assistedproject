package com.ecommerce;


import javax.el.ExpressionFactory;
import javax.swing.plaf.basic.BasicIconFactory;


import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.jaxb.cfg.spi.JaxbCfgHibernateConfiguration.JaxbCfgSessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

        private static final JaxbCfgSessionFactory sessionFactory = new JaxbCfgSessionFactory();
		private static BasicIconFactory JaxbCfgSessionFactory;

        static {
                try {
                        StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
                                        .configure("hibernate.cfg.xml").build();
                        Metadata metaData = new MetadataSources(standardRegistry).getMetadataBuilder().build();
                        JaxbCfgSessionFactory = (BasicIconFactory) metaData.getSessionFactoryBuilder().build();
                } catch (Throwable th) {
                        throw new ExceptionInInitializerError(th);
                }
        }

        public static JaxbCfgSessionFactory getSessionFactory() {
                return sessionFactory;
        }
}