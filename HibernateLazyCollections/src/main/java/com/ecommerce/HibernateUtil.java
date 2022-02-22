package com.ecommerce;

import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.jaxb.cfg.spi.JaxbCfgHibernateConfiguration.JaxbCfgSessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

        private static final JaxbCfgSessionFactory sessionFactory = new JaxbCfgSessionFactory();

        static {
                try {
                        StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
                                        .configure("hibernate.cfg.xml").build();
                        Metadata metaData = new MetadataSources(standardRegistry).getMetadataBuilder().build();
                        JaxbCfgSessionFactory JspFactory = (JaxbCfgSessionFactory) metaData.getSessionFactoryBuilder().build();
                } catch (Throwable th) {
                        throw new ExceptionInInitializerError(th);
                }
        }

        public static JaxbCfgSessionFactory getSessionFactory() {
                return getSessionFactory();
        }

		public static JaxbCfgSessionFactory getSessionfactory() {
			return sessionFactory;
		}
}