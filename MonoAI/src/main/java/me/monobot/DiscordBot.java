package me.monobot;


import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class DiscordBot {

    public static void main(String[] args) throws LoginException {

        JDA bot = JDABuilder.createDefault("MTEwMTE5ODkxMzA0MzY5MzYwOA.GHbq5J.LrUu7YZaLOGjvoUGp5cMpEkm4HJ9K01Ik_VXT0")
                .setActivity(Activity.playing("GUILTY GEAR -STRIVE-"))
                .addEventListeners(new BotListeners())
                .build();

    }
}
