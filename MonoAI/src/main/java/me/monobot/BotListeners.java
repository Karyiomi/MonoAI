package me.monobot;

import net.dv8tion.jda.api.events.message.GenericMessageEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class BotListeners extends ListenerAdapter {

    private static final int MIN_MESSAGES = 5;
    private static final int MAX_MESSAGES = 15;
    private int messageCount = 0;
    private Random rand = new Random();

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        String messageContent = event.getMessage().getContentRaw();

        if (!event.getAuthor().isBot()) {
            messageCount++;
            if (messageCount >= MIN_MESSAGES && messageCount <= MAX_MESSAGES && rand.nextDouble() < 0.5) {
                event.getTextChannel().sendMessage("LOL").queue();
                messageCount = 0;
            }
        }
    }
}