package seminars.third.tdd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyserTest {
    MoodAnalyser moodAnalyser;

    @BeforeEach
    void setUp() {
        moodAnalyser = new MoodAnalyser();
    }

    @Test
    void analyseGoodMood() {
        String res = moodAnalyser.analyseMood("Какой прекрасный день!");
        assertEquals("GoodMood", res);
    }

    @Test
    void analyseBadMood() {
        String res = moodAnalyser.analyseMood("Какое плохое утро!");
        assertEquals("BadMood", res);
    }

    @Test
    void analyseNormMood() {
        String res = moodAnalyser.analyseMood("Какой обычный день!");
        assertEquals("NormalMood", res);
    }
}