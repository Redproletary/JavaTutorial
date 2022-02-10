package Classes;

public class Car2Demo {
    private Engine engine;

    class Engine {
        private boolean isRunning;

        public void start(){
            isRunning = true;
        } // start(boolean) method

        public void stop(){
            isRunning = false;
        } // stop(boolean) method

    } // Engine class

} // Car2Demo class
