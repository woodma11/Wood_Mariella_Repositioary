import java.util.ArrayList;

//My project is inspired by the Pinterest app, where users can pin their images, videos, and articles to a visual board.
// Each subclass inherits fields (title, url) from the parent class Pin but also consists of unique attributes, such as image resolution, video duration, or article source.
//The Pin class defines an abstract method display() which each subclass overrides with its own implementation.
//User is composed of Board objects and Board is composed of Pin objects

//The main() method inside PinItApp ties everything together<3

public class PinItApp {
    public static void main(String[] args) {
        User user = new User("Mariella Wood");

        Board inspirationBoard = new Board("Tech Inspiration");

        inspirationBoard.addPin(new ImagePin("Beautiful UI Design", "https://example.com/ui.jpg", "1920x1080"));
        inspirationBoard.addPin(new VideoPin("Intro to Java OOP", "https://example.com/java.mp4", "15 mins"));
        inspirationBoard.addPin(new ArticlePin("The Future of AI", "https://example.com/ai-article", "TechCrunch"));

        user.addBoard(inspirationBoard);

        user.showBoards();
    }

    abstract static class Pin {
        private String title;
        private String url;

        public Pin(String title, String url) {
            this.title = title;
            this.url = url;
        }

        public String getTitle() {
            return title;
        }

        public String getUrl() {
            return url;
        }

        public abstract void display();
    }

    // First Child Class
    static class ImagePin extends Pin {
        private String resolution;

        public ImagePin(String title, String url, String resolution) {
            super(title, url);
            this.resolution = resolution;
        }

        @Override
        public void display() {
            System.out.println("Image Pin: \"" + getTitle() + "\"");
            System.out.println("   URL: " + getUrl());
            System.out.println("   Resolution: " + resolution);
            System.out.println();
        }
    }

    // Second Child Class
    static class VideoPin extends Pin {
        private String duration;

        public VideoPin(String title, String url, String duration) {
            super(title, url);
            this.duration = duration;
        }

        @Override
        public void display() {
            System.out.println("Video Pin: \"" + getTitle() + "\"");
            System.out.println("   URL: " + getUrl());
            System.out.println("   Duration: " + duration);
            System.out.println();
        }
    }

    //Third Child Class
    static class ArticlePin extends Pin {
        private String source;

        public ArticlePin(String title, String url, String source) {
            super(title, url);
            this.source = source;
        }

        @Override
        public void display() {
            System.out.println("Article Pin: \"" + getTitle() + "\"");
            System.out.println("   URL: " + getUrl());
            System.out.println("   Source: " + source);
            System.out.println();
        }
    }

    // Board Composition Class
    static class Board {
        private String name;
        private ArrayList<Pin> pins = new ArrayList<>();

        public Board(String name) {
            this.name = name;
        }

        public void addPin(Pin p) {
            pins.add(p);
        }

        public void showPins() {
            System.out.println("Board: " + name);
            System.out.println("---------------");
            for (Pin p : pins) {
                p.display(); // Polymorphism in action
            }
        }

        public String getName() {
            return name;
        }
    }

    //User Composition class
    static class User {
        private String name;
        private ArrayList<Board> boards = new ArrayList<>();

        public User(String name) {
            this.name = name;
        }

        public void addBoard(Board b) {
            boards.add(b);
        }

        public void showBoards() {
            System.out.println("User: " + name);
            System.out.println();
            for (Board b : boards) {
                b.showPins();
            }
        }
    }
}
