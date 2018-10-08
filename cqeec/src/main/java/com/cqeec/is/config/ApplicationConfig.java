package com.cqeec.is.config;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
@ComponentScan(basePackages = "com.cqeec.is.bll")
@PropertySource("classpath:app.properties")
public class ApplicationConfig implements EnvironmentAware {
	private Environment env;

	// Spring配置文件ApplicationContext.xml

	@Override
	public void setEnvironment(Environment environment) {
		this.env = environment;
	}

	/**
	 * 数据源
	 * 
	 * @return 数据源
	 */
	@Bean
	public DataSource dataSource() {
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setDriverClassName(env.getProperty("jdbc.mySql.driverClass"));
		dataSource.setUrl(env.getProperty("jdbc.mySql.jdbcUrl"));
		dataSource.setUsername(env.getProperty("jdbc.mySql.user"));
		dataSource.setPassword(env.getProperty("jdbc.mySql.password"));
		return dataSource;
	}

	/**
	 * 会话工厂
	 */
	@Bean("sqlSessionFactoryBean")
	public SqlSessionFactoryBean sqlSessionFactoryBean() {
		SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();
		// 数据源
		ssfb.setDataSource(dataSource());
		// 实体类所在的包
		ssfb.setTypeAliasesPackage("com.cqeec.is.dml");
		return ssfb;
	}

	/**
	 * Mapper配置类
	 */
	@Bean
	public MapperScannerConfigurer mapperScannerConfigurer() {
		MapperScannerConfigurer msc = new MapperScannerConfigurer();
		// 设置Mapper扫描配置器的Sql会话工厂Bean名称
		msc.setSqlSessionFactoryBeanName("sqlSessionFactoryBean");
		msc.setBasePackage("com.cqeec.is.dal");
		return msc;
	}
	
	/**
	 * 事务管理器。
	 *
	 * @return 事务管理器。
	 */
	@Bean
	public DataSourceTransactionManager dataSourceTransactionManager() {
		return new DataSourceTransactionManager(dataSource());
	}
}
