package com.atam.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {

    String directExchangeTahmin="direct-exchange-tahmin";
    String queueTahmin="queue-tahmin";
    String saveBindingKey="save-binding-key";
    @Bean
    DirectExchange directExchangeTahmin(){
        return new DirectExchange(directExchangeTahmin);
    }

    @Bean
    Queue queueTahmin(){
        return new Queue(queueTahmin);
    }

    @Bean
    public Binding bindingSaveDirectExchange(final Queue queueTahmin, final DirectExchange directExchangeTahmin){
        return BindingBuilder.bind(queueTahmin).to(directExchangeTahmin).with(saveBindingKey);
    }
}
