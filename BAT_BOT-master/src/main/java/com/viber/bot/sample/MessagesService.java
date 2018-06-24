package com.viber.bot.sample;

import java.util.List;

public interface MessagesService {
    void save(ViberMessage message);

    List<String> listReplies();
}
