package org.calvian.framework.database;

import org.calvian.framework.Framework;

public class DataBaseData {
    protected String dbHost = Framework.config.getString("host");
    protected String dbPort = Framework.config.getString("port");
    protected String dbUser = Framework.config.getString("user");
    protected String dbPass = Framework.config.getString("password");
    protected String dbName = Framework.config.getString("database");
}
