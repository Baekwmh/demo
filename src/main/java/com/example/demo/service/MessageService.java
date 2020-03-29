package com.example.demo.service;

import sun.plugin2.message.Message;

import java.util.List;

public interface MessageService {
    List<Message> findAll();
    Message findOne(Long id);
    Message save(Message message);
    void delete(Long id);
    Message update(Message message);
    Message updateText(Message message);

}

