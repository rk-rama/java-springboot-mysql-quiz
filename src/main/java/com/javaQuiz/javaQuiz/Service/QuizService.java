//package com.javaQuiz.javaQuiz.Service;
//
//import org.springframework.stereotype.Service;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
package com.javaQuiz.javaQuiz.Service;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class QuizService {
    public List<String[]> getQuestionsByCategory(String category) {
        List<String[]> questionsList = new ArrayList<>();

        if (category == null) return questionsList;

        if (category.equalsIgnoreCase("java")) {
            questionsList.add(new String[]{"What is java ?", "Compiled", "Interpreted", "Both", "None", "Both"});
            questionsList.add(new String[]{"What is the size of 'double' in Java?", "4 bytes", "8 bytes", "16 bytes", "2 bytes", "8 bytes"});
            questionsList.add(new String[]{"Default value of 'int' variable?", "0", "null", "garbage value", "1", "0"});
            questionsList.add(new String[]{"Which component is used to compile Java code?", "JVM", "JRE", "JDK", "JIT", "JDK"});
            questionsList.add(new String[]{"Which of these is NOT a primitive data type?", "int", "char", "boolean", "String", "String"});
            questionsList.add(new String[]{"What is the extension of compiled java classes?", ".java", ".class", ".txt", ".js", ".class"});
            questionsList.add(new String[]{"Which operator is used for modulo?", "/", "%", "*", "&", "%"});
            questionsList.add(new String[]{"Which one is a valid identifier?", "123test", "_test", "$test", "Both _test and $test", "Both _test and $test"});
            questionsList.add(new String[]{"Default value of a boolean?", "true", "false", "0", "1", "false"});
            questionsList.add(new String[]{"Range of byte data type?", "-128 to 127", "-32768 to 32767", "0 to 255", "-127 to 128", "-128 to 127"});
            questionsList.add(new String[]{"Which keyword makes a variable constant?", "static", "final", "const", "immutable", "final"});
            questionsList.add(new String[]{"Which keyword is used for inheritance?", "extends", "implements", "inherits", "using", "extends"});
            questionsList.add(new String[]{"Mechanism of wrapping data and code together?", "Inheritance", "Encapsulation", "Polymorphism", "Abstraction", "Encapsulation"});
            questionsList.add(new String[]{"Which keyword refers to the current object?", "super", "this", "self", "object", "this"});
            questionsList.add(new String[]{"Method overloading is also known as?", "Static Binding", "Dynamic Binding", "Late Binding", "None", "Static Binding"});
            questionsList.add(new String[]{"Can we have multiple inheritance in Java classes?", "Yes", "No", "Only for abstract classes", "Only for final classes", "No"});
            questionsList.add(new String[]{"Which keyword is used to call parent class constructor?", "this", "parent", "super", "base", "super"});
            questionsList.add(new String[]{"An abstract class can have constructors?", "Yes", "No", "Only if it is public", "Only if it is final", "Yes"});
            questionsList.add(new String[]{"Which access modifier is most restrictive?", "public", "protected", "private", "default", "private"});
            questionsList.add(new String[]{"Can a final class be inherited?", "Yes", "No", "Maybe", "None", "No"});
            questionsList.add(new String[]{"Strings in Java are?", "Mutable", "Immutable", "Volatile", "Transient", "Immutable"});
            questionsList.add(new String[]{"Which class is used for mutable strings?", "String", "StringBuilder", "char[]", "Text", "StringBuilder"});
            questionsList.add(new String[]{"Where is String Pool located?", "Stack", "Heap", "PermGen/Metaspace", "Register", "Heap"});
            questionsList.add(new String[]{"How many objects are created: String s = new String('Hello');?", "1", "2", "0", "3", "2"});
            questionsList.add(new String[]{"Method to compare two strings for equality?", "==", "equals()", "compare()", "isEqual()", "equals()"});
            questionsList.add(new String[]{"Which block always executes in exception handling?", "try", "catch", "finally", "throw", "finally"});
            questionsList.add(new String[]{"Which class is the root of all exceptions?", "Exception", "Error", "Throwable", "RuntimeException", "Throwable"});
            questionsList.add(new String[]{"Is NullPointerException checked or unchecked?", "Checked", "Unchecked", "Both", "None", "Unchecked"});
            questionsList.add(new String[]{"Which method starts a thread?", "run()", "start()", "init()", "execute()", "start()"});
            questionsList.add(new String[]{"Which keyword is used to pause a thread?", "stop", "wait", "sleep", "suspend", "sleep"});
            questionsList.add(new String[]{"Which collection doesn't allow duplicates?", "List", "Set", "Map", "Vector", "Set"});
            questionsList.add(new String[]{"Root interface of Collection framework?", "List", "Set", "Collection", "Iterable", "Iterable"});
            questionsList.add(new String[]{"HashMap allows null keys?", "Yes", "No", "Only one", "Only two", "Only one"});
            questionsList.add(new String[]{"Vector is synchronized?", "Yes", "No", "Sometimes", "Depends on OS", "Yes"});
            questionsList.add(new String[]{"Which package contains Scanner class?", "java.io", "java.lang", "java.util", "java.net", "java.util"});
            questionsList.add(new String[]{"Does Garbage Collection guarantee memory safety?", "Yes", "No", "Partially", "None", "Yes"});
            questionsList.add(new String[]{"Which is not a loop in Java?", "for", "while", "do-while", "repeat-until", "repeat-until"});
            questionsList.add(new String[]{"Which operator is used for 'Not'?", "!", "~", "&", "|", "!"});
            questionsList.add(new String[]{"Can we main() method be overloaded?", "Yes", "No", "Only in interfaces", "None", "Yes"});
            questionsList.add(new String[]{"Size of char in Java?", "1 byte", "2 bytes", "4 bytes", "Depends on OS", "2 bytes"});

        }
        else if (category.equalsIgnoreCase("springboot")) {
            questionsList.add(new String[]{"What is Spring Boot?", "Framework", "Library", "Language", "OS", "Framework"});
            questionsList.add(new String[]{"Default port of Tomcat?", "8080", "3306", "80", "443", "8080"});
            questionsList.add(new String[]{"Which annotation is used for REST?", "@RestController", "@Controller", "@Service", "@Entity", "@RestController"});
            questionsList.add(new String[]{"Which annotation is used to mark a class as a Spring Boot application?", "@SpringBootApplication", "@EnableAutoConfiguration", "@ComponentScan", "@Configuration", "@SpringBootApplication"});
            questionsList.add(new String[]{"Which annotation combines @Configuration, @EnableAutoConfiguration, and @ComponentScan?", "@SpringBootApplication", "@Service", "@Controller", "@Component", "@SpringBootApplication"});
            questionsList.add(new String[]{"Which annotation is used to inject dependencies?", "@Inject", "@Autowired", "@Resource", "@Value", "@Autowired"});
            questionsList.add(new String[]{"Which annotation is used to handle GET requests?", "@PostMapping", "@GetMapping", "@PutMapping", "@DeleteMapping", "@GetMapping"});
            questionsList.add(new String[]{"Which annotation is used to define a RESTful controller?", "@Controller", "@RestController", "@Service", "@Component", "@RestController"});
            questionsList.add(new String[]{"Default port of an embedded Tomcat server?", "8080", "8081", "9090", "443", "8080"});
            questionsList.add(new String[]{"Which annotation is used to read properties from application.properties?", "@Value", "@PropertySource", "@ConfigurationProperties", "@ReadProperty", "@Value"});
            questionsList.add(new String[]{"What is the default scope of a Spring Bean?", "Prototype", "Singleton", "Request", "Session", "Singleton"});
            questionsList.add(new String[]{"Which annotation is used to mark a class as a service provider?", "@Service", "@Component", "@Repository", "@Controller", "@Service"});
            questionsList.add(new String[]{"Which annotation is used to map a specific HTTP request path?", "@RequestMapping", "@Path", "@Route", "@Handle", "@RequestMapping"});
            questionsList.add(new String[]{"Which interface is used for CRUD operations in Spring Data JPA?", "JpaRepository", "CrudRepository", "PagingAndSortingRepository", "SimpleRepository", "CrudRepository"});
            questionsList.add(new String[]{"Which annotation is used to mark a class as a JPA entity?", "@Table", "@Entity", "@Id", "@Column", "@Entity"});
            questionsList.add(new String[]{"Which annotation is used to define the primary key in an entity?", "@PrimaryKey", "@Id", "@Key", "@Main", "@Id"});
            questionsList.add(new String[]{"How do you enable JPA repositories in Spring Boot?", "@EnableJpaRepositories", "@JpaEnable", "@Repository", "@Database", "@EnableJpaRepositories"});
            questionsList.add(new String[]{"Which property file is used for database configuration?", "pom.xml", "application.properties", "web.xml", "config.xml", "application.properties"});
            questionsList.add(new String[]{"Which tool is used for database version control in Spring Boot?", "Hibernate", "Liquibase/Flyway", "JUnit", "Log4j", "Liquibase/Flyway"});
            questionsList.add(new String[]{"Default H2 console URL in Spring Boot?", "/h2", "/h2-console", "/db", "/admin", "/h2-console"});
            questionsList.add(new String[]{"Which dependency provides production-ready features like health checks?", "DevTools", "Actuator", "Security", "Web", "Actuator"});
            questionsList.add(new String[]{"Which tool provides automatic restarts when code changes?", "Actuator", "DevTools", "Maven", "Gradle", "DevTools"});
            questionsList.add(new String[]{"Actuator endpoint to check if the app is up?", "/info", "/status", "/health", "/metrics", "/health"});
            questionsList.add(new String[]{"What is the use of @Slf4j?", "Testing", "Logging", "Security", "Validation", "Logging"});
            questionsList.add(new String[]{"Which annotation is used for validation of request body?", "@Valid", "@NotNull", "@Check", "@Verify", "@Valid"});
            questionsList.add(new String[]{"How to change the server port in Spring Boot?", "server.port=9000", "port.number=9000", "app.port=9000", "config.port=9000", "server.port=9000"});
            questionsList.add(new String[]{"Default username for Spring Security?", "admin", "root", "user", "guest", "user"});
            questionsList.add(new String[]{"Which annotation enables Method Security?", "@EnableGlobalMethodSecurity", "@EnableSecurity", "@MethodSecurity", "@Secure", "@EnableGlobalMethodSecurity"});
            questionsList.add(new String[]{"Which class is used to customize security settings?", "WebSecurityConfigurerAdapter", "SecurityConfig", "AuthConfig", "WebSecurity", "WebSecurityConfigurerAdapter"});
            questionsList.add(new String[]{"Which annotation is used to schedule a task?", "@Task", "@Schedule", "@Scheduled", "@Cron", "@Scheduled"});
            questionsList.add(new String[]{"In Spring Boot, 'Fat JAR' refers to?", "A JAR with only source code", "A JAR with all dependencies and server", "A large database JAR", "None", "A JAR with all dependencies and server"});
            questionsList.add(new String[]{"How to define profile-specific properties?", "application-{profile}.properties", "config-{profile}.xml", "profile.properties", "None", "application-{profile}.properties"});
            questionsList.add(new String[]{"Which annotation is used to extract variables from the URL path?", "@RequestParam", "@PathVariable", "@UrlVariable", "@PathParam", "@PathVariable"});
            questionsList.add(new String[]{"Which annotation is used for cross-origin requests?", "@CrossOrigin", "@AllowOrigin", "@Cors", "@Access", "@CrossOrigin"});
            questionsList.add(new String[]{"What is the purpose of @Primary?", "Define main method", "Give priority to a bean", "Define primary key", "Initialize app", "Give priority to a bean"});

        }
        else if (category.equalsIgnoreCase("mysql")) {
            questionsList.add(new String[]{"MySQL is a?", "Database", "Browser", "Editor", "Hardware", "Database"});
            questionsList.add(new String[]{"Which keyword is used to sort results?", "ORDER BY", "SORT BY", "GROUP BY", "WHERE", "ORDER BY"});
            questionsList.add(new String[]{"Command to delete all data without table?", "DELETE", "DROP", "TRUNCATE", "REMOVE", "TRUNCATE"});
            questionsList.add(new String[]{"What does SQL stand for?", "Simple Query Language", "Structured Query Language", "Static Query Language", "System Query Language", "Structured Query Language"});
            questionsList.add(new String[]{"Which command is used to see the structure of a table?", "SHOW", "DESCRIBE", "STRUCT", "VIEW", "DESCRIBE"});
            questionsList.add(new String[]{"Which SQL statement is used to extract data from a database?", "GET", "EXTRACT", "SELECT", "OPEN", "SELECT"});
            questionsList.add(new String[]{"Which command is used to update data in a database?", "SAVE", "MODIFY", "UPDATE", "CHANGE", "UPDATE"});
            questionsList.add(new String[]{"Which SQL keyword is used to sort the result-set?", "SORT BY", "ORDER BY", "ARRANGE", "SET", "ORDER BY"});
            questionsList.add(new String[]{"Which data type is best for storing a small fixed-length string?", "VARCHAR", "CHAR", "TEXT", "BLOB", "CHAR"});
            questionsList.add(new String[]{"How do you select all columns from a table named 'Persons'?", "SELECT * FROM Persons", "SELECT [all] FROM Persons", "SELECT Persons", "SELECT . FROM Persons", "SELECT * FROM Persons"});
            questionsList.add(new String[]{"Which command is used to delete a table and its data?", "REMOVE", "DELETE", "DROP", "TRUNCATE", "DROP"});
            questionsList.add(new String[]{"What is the default port for MySQL?", "8080", "3306", "1433", "5432", "3306"});
            questionsList.add(new String[]{"Which operator is used to search for a specified pattern?", "BETWEEN", "LIKE", "MATCH", "SEARCH", "LIKE"});
            questionsList.add(new String[]{"Which constraint uniquely identifies each record in a table?", "UNIQUE", "FOREIGN KEY", "PRIMARY KEY", "NOT NULL", "PRIMARY KEY"});
            questionsList.add(new String[]{"Can a table have multiple Primary Keys?", "Yes", "No", "Only 2", "Depends on MySQL version", "No"});
            questionsList.add(new String[]{"Which key connects two tables?", "Primary Key", "Composite Key", "Foreign Key", "Super Key", "Foreign Key"});
            questionsList.add(new String[]{"Which constraint ensures that a column cannot have a NULL value?", "UNIQUE", "DEFAULT", "NOT NULL", "CHECK", "NOT NULL"});
            questionsList.add(new String[]{"What is the maximum number of UNIQUE keys in a table?", "1", "10", "Unlimited", "0", "Unlimited"});
            questionsList.add(new String[]{"Which clause is used with aggregate functions to filter results?", "WHERE", "HAVING", "LIMIT", "GROUP BY", "HAVING"});
            questionsList.add(new String[]{"Which command removes all records from a table but keeps the structure?", "DROP", "TRUNCATE", "REMOVE", "CLEAR", "TRUNCATE"});
            questionsList.add(new String[]{"Which join returns all records when there is a match in either left or right table?", "INNER JOIN", "LEFT JOIN", "RIGHT JOIN", "FULL JOIN", "FULL JOIN"});
            questionsList.add(new String[]{"Which join returns only the records that have matching values in both tables?", "INNER JOIN", "OUTER JOIN", "LEFT JOIN", "CROSS JOIN", "INNER JOIN"});
            questionsList.add(new String[]{"Which function is used to count the number of rows?", "SUM()", "COUNT()", "TOTAL()", "MAX()", "COUNT()"});
            questionsList.add(new String[]{"What is the difference between DELETE and TRUNCATE?", "DELETE is DML, TRUNCATE is DDL", "DELETE is DDL, TRUNCATE is DML", "Both are same", "DELETE is faster", "DELETE is DML, TRUNCATE is DDL"});
            questionsList.add(new String[]{"Which function finds the highest value in a column?", "TOP()", "MAX()", "HIGH()", "GREATEST()", "MAX()"});
            questionsList.add(new String[]{"In SQL, what is the 'AS' keyword used for?", "To change table name", "To create an Alias", "To sort data", "To join tables", "To create an Alias"});
            questionsList.add(new String[]{"Which command is used to undo the changes since the last COMMIT?", "UNDO", "REVERT", "ROLLBACK", "BACKUP", "ROLLBACK"});
            questionsList.add(new String[]{"What is ACID in databases?", "Chemicals", "Database Properties", "A query type", "A storage engine", "Database Properties"});
            questionsList.add(new String[]{"Which wildcard character represents zero or more characters in LIKE?", "?", "_", "%", "*", "%"});
            questionsList.add(new String[]{"Which storage engine is default in MySQL 5.5.5+?", "MyISAM", "Memory", "InnoDB", "CSV", "InnoDB"});
            questionsList.add(new String[]{"How to limit the number of rows returned in MySQL?", "TOP", "LIMIT", "FETCH", "ROWCOUNT", "LIMIT"});
            questionsList.add(new String[]{"Which command is used to add a new column to an existing table?", "UPDATE TABLE", "MODIFY TABLE", "ALTER TABLE", "ADD TABLE", "ALTER TABLE"});
            questionsList.add(new String[]{"What is a View in MySQL?", "A real table", "A virtual table", "A database backup", "A storage engine", "A virtual table"});
            questionsList.add(new String[]{"Which function is used to remove leading and trailing spaces?", "CLEAN()", "TRIM()", "STRIP()", "REMOVE()", "TRIM()"});
            questionsList.add(new String[]{"Which statement is used to prevent duplicate values in a SELECT?", "UNIQUE", "DISTINCT", "DIFFERENT", "ONLY", "DISTINCT"});
            questionsList.add(new String[]{"What is the index of the first character in a MySQL string?", "0", "1", "-1", "None", "1"});
        }

        return questionsList;
    }
}