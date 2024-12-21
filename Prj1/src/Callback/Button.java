package Callback;
//Class A that performs an action and notifies the listener 
public class Button {

	private EventListener listener;

    // Register the listener
    public void setEventListener(EventListener listener) {
        this.listener = listener;
    }

    // Simulate an event, like a button click
    public void click() {
        if (listener != null) {
            listener.onEvent();
        }
    }
}
