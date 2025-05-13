package org.hashtagformatter;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("📢 Enter a sentence to convert into a hashtag:");
        String input = scanner.nextLine();

        String result = HashtagFormatter.formatHashtag(input);

        if (result != null) {
            System.out.println("✅ Generated hashtag: " + result);
        } else {
            System.out.println("❌ Invalid hashtag (might exceed 50 characters or be empty).");
        }

        scanner.close();
    }
}
