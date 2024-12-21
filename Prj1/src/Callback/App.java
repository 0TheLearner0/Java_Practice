package Callback;

public class App implements EventListener {

	private Button button;

    public App() {
        button = new Button();
        button.setEventListener(this); // Pass the current object (App instance)
    }

    // Override the onEvent method for the callback
    @Override
    public void onEvent() {
        System.out.println("Button clicked! Performing action in App.");
    }
    
    public static void main(String[] args) {
        App app = new App();  // Create an instance of App
        app.onEvent(); // Simulate a button click
    }
}
