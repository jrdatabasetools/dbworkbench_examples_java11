
package plsql_workspace_examples;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import oracle.ucp.jdbc.PoolDataSource;
import oracle.ucp.jdbc.PoolDataSourceFactory;

@Configuration
@EnableAutoConfiguration
@ComponentScan("impl")
public class MainServer {
  @Bean
  DataSource dataSource() throws SQLException
  {
    PoolDataSource poolDataSource = PoolDataSourceFactory.getPoolDataSource();
    poolDataSource.setConnectionFactoryClassName("oracle.jdbc.pool.OracleDataSource");
    poolDataSource.setURL("jdbc:oracle:thin:@oracle_db:1521/xepdb1");
    poolDataSource.setUser("dbw_examples");
    poolDataSource.setPassword("dbw_examples");
    return poolDataSource;
  }

  public static void main(String[] args)
  {
    SpringApplication.run(MainServer.class, args);
  }
}
