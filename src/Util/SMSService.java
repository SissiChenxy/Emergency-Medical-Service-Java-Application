/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SMSService {
    // Find your Account Sid and Auth Token at twilio.com/console
    public static final String ACCOUNT_SID = "AC04b1472e5f0a39668635a9d90105fcb7";
    public static final String AUTH_TOKEN = "c95096a3f9ee974ff79a6bc1e53a1144";

    public static void sendMessage(String messageContent, String phoneNumber) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message
            .creator(new PhoneNumber(phoneNumber), // to
                     new PhoneNumber("+16176069471"), // from
                     messageContent)
            .create();

        System.out.println(message.getSid());
    }
}