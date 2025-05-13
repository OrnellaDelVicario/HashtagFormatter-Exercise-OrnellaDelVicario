package org.hashtagformatter;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest extends TestCase {

    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    public void testFormatHashtagSimple() {
        assertEquals("#hello-world", HashtagFormatter.formatHashtag("Hello World"));
    }

    public void testFormatHashtagWithSpaces() {
        assertEquals("#java", HashtagFormatter.formatHashtag("  Java   "));
    }

    public void testFormatHashtagTooLong() {
        String input = "This is a very long sentence that should go over the character limit for a hashtag";
        assertNull(HashtagFormatter.formatHashtag(input));
    }

    public void testFormatHashtagNullInput() {
        assertNull(HashtagFormatter.formatHashtag(null));
    }
}
