package com.company;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;


public class TwilioCaller {

    public static void sendText(){
        HttpResponse<JsonNode> response = Unirest.post("https://api.twilio.com/2010-04-01/Accounts/AC5b9484fa07930bdb684dde777d14db7c/Messages.json")
                .basicAuth("AC5b9484fa07930bdb684dde777d14db7c", "20203af23aa2e681f49d4e42ae506f42")
                .field("To","5615994224")
                .field("Body", "Ahoy from PC")
                .field("MessagingServiceSid", "MG932cffdb85d160fa3c986da2175f3231")
                .asJson();
        System.out.println(response.getStatus());
        System.out.println(response.getBody());
    }
}
