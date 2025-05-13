package org.hashtagformatter;

public class HashtagFormatter {

    public static String formatHashtag(String sentence) {
        if (sentence == null) return null;

        sentence = sentence.trim();
        String[] words = sentence.split(" ");
        StringBuilder hashtag = new StringBuilder("#");

        for (String word : words) {
            if (!word.isEmpty()) {
                hashtag.append(word.toLowerCase()).append("-");
            }
        }

        if (hashtag.length() > 1 && hashtag.charAt(hashtag.length() - 1) == '-') {
            hashtag.deleteCharAt(hashtag.length() - 1);
        }

        if (hashtag.length() > 50) {
            return null;
        }

        return hashtag.toString();
    }
}
