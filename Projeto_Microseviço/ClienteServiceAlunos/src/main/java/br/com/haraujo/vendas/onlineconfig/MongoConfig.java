/**
 * 
 */
package br.com.haraujo.vendas.onlineconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@Configuration
@EnableMongoRepositories(basePackages = "br.com.haraujo.vendas.online.repository")
public class MongoConfig {

}
