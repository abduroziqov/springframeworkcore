package uz.pdp.springframeworkcore;

import lombok.ToString;

@ToString
public class BaseDAO {
    private final String url;
    private final String user;
    private final String password;
    private final String database;
    private final String scheme;
    private final String driver;

    public BaseDAO(String url, String user, String password, String database, String scheme, String driver) {
        this.url = url;
        this.user = user;
        this.password = password;
        this.database = database;
        this.scheme = scheme;
        this.driver = driver;
    }
}
