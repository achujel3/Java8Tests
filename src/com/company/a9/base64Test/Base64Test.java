package com.company.a9.base64Test;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.UUID;

public class Base64Test {

    public static void main(String[] args) {

        try {

            String base64EncodedString = Base64.getEncoder()
                    .encodeToString("TutorialsPoint?Java8".getBytes("utf-8"));
            System.out.println("Base64 Encoded String (Basic): " + base64EncodedString);

            byte[] base64decodedBytes = Base64.getDecoder().decode(base64EncodedString);

            System.out.println("Original String: " + new String(base64decodedBytes, "utf-8"));
            base64EncodedString = Base64.getUrlEncoder()
                    .encodeToString("TutorialsPoint?java8".getBytes("utf-8"));
            System.out.println("Base64 Encoded String (URL): " + base64EncodedString);

            StringBuilder stringBuilder = new StringBuilder();

            for (int i = 0; i < 10; ++i) {
                stringBuilder.append(UUID.randomUUID().toString());
            }

            byte[] mimeBytes = stringBuilder.toString().getBytes("utf-8");
            String mimeEncodedString = Base64.getMimeEncoder().encodeToString(mimeBytes);
            System.out.println("Base64 Encoded String (MIME): " + mimeEncodedString);

        } catch (UnsupportedEncodingException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
