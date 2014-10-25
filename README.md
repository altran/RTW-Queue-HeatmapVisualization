RTW-queue-visualization
=============


Example Output
===================

TODO: Try out the Mobile application at http://....


Installation
===================

* Copy Proprerties file
```
wget https://raw.githubusercontent.com/altran/RTW-queue-visualization/master/src/main/resources/local-overrides.properties
mkdir config_override
cp local-overrides.properties config_override/RTW-queue-visualization.properties
```
* Edit RTW-queue-visualization to suite your environment.

* Create database. Use sql resources\db\initialize_new_database.sql
** The updates to the database will be managed by Flyway


Running RTW-queue-visualization
===================

```
wget http://mvnrepo.cantara.no/content/repositories/snapshots/com/altran/iot/RTW-queue-visualization/0.1-SNAPSHOT/RTW-queue-visualization-0.1-20140811.125511-1.jar
java -jar RTW-queue-visualization-0.1-20140811.125511-1.jar
# java -jar target/RTW-queue-visualization-0.1-SNAPSHOT-with-deps.jar
```

Database
===================

Default behaviour of RTW-queue-visualization will use an embedded database.

The database setup in RTW-queue-visualization is utilizing Spring for configuration, and connection.
This will ensure you can connect RTW-queue-visualization to just about any database.
To use a permanent storage, see the Configuration section below.

Configuration
===================

See Installation, copy properties into config_override.

