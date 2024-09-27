Bienvenido a este demo de CRUD para base de datos

Para crear la base de datos debes utilizar phpMyAdmin y crea la base de datos llamada "Jpa_prueba" , añade las tablas "facultades" y "carreras" con los atributos de cada clase.
Una vez creadas las tablas, podras añadir informacion y manipularla desde el codigo y la consola.

Fijate tu archivo de persistencia tenga esta configuracion para poder conectar con la base de datos de phpMyAdmin

<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<persistence xmlns="https://jakarta.ee/xml/ns/persistence"
             xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
             xsi:schemaLocation="https://jakarta.ee/xml/ns/persistence https://jakarta.ee/xml/ns/persistence/persistence_3_0.xsd"
             version="3.0">
    <persistence-unit name="default" transaction-type="RESOURCE_LOCAL">
        <provider>org.hibernate.jpa.HibernatePersistenceProvider</provider>
        <class>entidades.Facultad</class>

<properties>
    <property name="jakarta.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/Jpa_prueba"/>
    <property name="jakarta.persistence.jdbc.user" value="root"/>
    <property name="jakarta.persistence.jdbc.password" value=""/>
    <property name="jakarta.persistence.jdbc.driver" value="com.mysql.cj.jdbc.Driver"/>
    <property name="hibernate.dialect" value="org.hibernate.dialect.MySQLDialect"/>
</properties>                        
    </persistence-unit>
</persistence>
