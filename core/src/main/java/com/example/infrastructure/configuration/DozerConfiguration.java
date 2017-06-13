package com.example.infrastructure.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

import org.dozer.spring.DozerBeanMapperFactoryBean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
class DozerConfiguration {

    @Value("${dozer.configuration}")
    Resource configuration;

    @Value("${dozer.mapping-locations}")
    Resource[] locations;

    @Bean
    DozerBeanMapperFactoryBean dozerBeanMapperFactoryBean() throws Exception {
        DozerBeanMapperFactoryBean dozerBeanMapperFactoryBean = new DozerBeanMapperFactoryBean();
        Resource[] resources = resources();
        dozerBeanMapperFactoryBean.setMappingFiles(resources);
        return dozerBeanMapperFactoryBean;
    }

    private Resource[] resources()
    {
        List<Resource> list = new ArrayList<>();
        list.add(configuration);
        list.addAll(Arrays.asList(locations));

        Resource[] resources = new Resource[list.size()];
        return list.toArray(resources);
    }
}