package com.atam.rabbitmq.producer;

import com.atam.rabbitmq.model.RegisterModel;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegisterProducer {
    private  final RabbitTemplate rabbitTemplate;
    String directExchange="direct-exchange-tahmin";
    String registerBindingKey="register-binding-key";
    public void sendNewSkor(RegisterModel model){

        rabbitTemplate.convertAndSend(directExchange,registerBindingKey,model);
    }
}
