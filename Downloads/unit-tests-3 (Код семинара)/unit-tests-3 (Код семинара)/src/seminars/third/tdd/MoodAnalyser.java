package seminars.third.tdd;

public class MoodAnalyser {

    public String analyseMood(String message) {
        if (message.contains("прекрасн") || message.contains("хорош")) {
            return "GoodMood";
        }
        if (message.contains("ужасн") || message.contains("плох")) {
            return "BadMood";
        }
        else return "NormalMood";
        }
    }
