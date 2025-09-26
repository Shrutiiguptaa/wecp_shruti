package com.wecp.progressive.config;

<<<<<<< HEAD
import java.io.IOException;
=======
>>>>>>> bfc45e61ecaa78265aee29eb79e3d689dda129d2
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnectionManager {
<<<<<<< HEAD
    private static final Properties properties = new Properties();
=======

    private static final Properties properties = new Properties();

>>>>>>> bfc45e61ecaa78265aee29eb79e3d689dda129d2
    static {
        loadProperties();
    }

    private static void loadProperties() {
        try (InputStream input = DatabaseConnectionManager.class.getClassLoader()
                .getResourceAsStream("application.properties")) {
            if (input == null) {
<<<<<<< HEAD
                throw new IllegalStateException("resource.properties not found in classpath");
            }
            properties.load(input);
        } catch (IOException e) {
            throw new RuntimeException("Error loading properties file", e);
        }
    }

    public static Connection getConnection() throws SQLException {
        String url = properties.getProperty("spring.datasource.url");
=======
                throw new IllegalArgumentException("resource.properties not found in classpath");

            }
            properties.load(input);
        } catch (Exception e) {
            throw new RuntimeException("Error loading properties file", e);
        }

    }

    public static Connection getConnection() throws SQLException {
        String url = properties.getProperty("spring datasource.url");
>>>>>>> bfc45e61ecaa78265aee29eb79e3d689dda129d2
        String user = properties.getProperty("spring.datasource.username");
        String password = properties.getProperty("spring.datasource.password");
        return DriverManager.getConnection(url, user, password);
    }

}
