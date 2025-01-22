package com.example.demo;

import co.elastic.clients.elasticsearch.core.InfoResponse;
import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.elc.ElasticsearchConfiguration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

import co.elastic.clients.elasticsearch.ElasticsearchClient;

@Configuration
@EnableElasticsearchRepositories(basePackages = "com.example.demo")
public class ElasticSearchConfig extends ElasticsearchConfiguration {

    @Override
    public ClientConfiguration clientConfiguration() {
        return ClientConfiguration.builder()
                .connectedTo("localhost:9200") // Elasticsearch 주소
//                .withBasicAuth("elastic", "000000") // 인증 정보
                .build();
    }

    @Bean
    public ElasticsearchClient elasticsearchClient() {
        return elasticsearchClient();
    }


}
