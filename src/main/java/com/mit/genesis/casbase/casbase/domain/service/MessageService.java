package com.mit.genesis.casbase.casbase.domain.service;

public interface MessageService {
	
    void publishMessage(String channel, String message);
    String readMessage(String channel);
	
    
    
    
}
