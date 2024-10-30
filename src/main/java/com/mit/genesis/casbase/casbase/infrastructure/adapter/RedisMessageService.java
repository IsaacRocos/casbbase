package com.mit.genesis.casbase.casbase.infrastructure.adapter;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.mit.genesis.casbase.casbase.domain.service.MessageService;

@Service
public class RedisMessageService implements MessageService {

    private final RedisTemplate<String, String> redisTemplate;

    public RedisMessageService(RedisTemplate<String, String> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @Override
    public void publishMessage(String channel, String message) {
        redisTemplate.convertAndSend(channel, message);
    }

    @Override
    public String readMessage(String channel) {
        return "Función de lectura a implementar según requisitos"; 
    }
}

