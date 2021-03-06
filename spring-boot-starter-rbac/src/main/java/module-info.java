open module de.vsfexperts.rbac.spring {

	requires transitive de.vsfexperts.rbac.configuration;

	requires transitive jul.to.slf4j;
	requires transitive logback.classic;
	requires transitive logback.core;
	requires transitive org.apache.log4j;
	requires transitive org.slf4j;

	requires transitive java.annotation;
	requires transitive org.apache.logging.log4j;
	requires transitive org.apache.logging.slf4j;
	requires transitive org.yaml.snakeyaml;
	requires transitive spring.aop;
	requires transitive spring.beans;
	requires transitive spring.boot;
	requires transitive spring.boot.autoconfigure;
	requires transitive spring.boot.configuration.processor;
	requires transitive spring.boot.starter;
	requires transitive spring.boot.starter.logging;
	requires transitive spring.context;
	requires transitive spring.core;
	requires transitive spring.expression;
	requires transitive spring.jcl;
	
	requires static transitive spring.boot.starter.security;
	requires static transitive spring.security.config;
	requires static transitive spring.security.core;
	requires static transitive spring.security.web;
	requires static transitive spring.web;

	exports de.vsfexperts.rbac.spring;
	exports de.vsfexperts.rbac.spring.configuration;
	exports de.vsfexperts.rbac.spring.mapping;
	exports de.vsfexperts.rbac.spring.supplier;
	exports de.vsfexperts.rbac.spring.userdetails;
}
