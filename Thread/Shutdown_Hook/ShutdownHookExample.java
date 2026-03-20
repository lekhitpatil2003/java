public class ShutdownHookExample {
    public static void main(String[] args) {
        // Creating shutdown Hook
        Thread hook = new Thread (() -> {
            System.out.println("Shutdown Hook is running....");
            System.out.println("Cleaning Resources....");
        });

    // Registering shoutdown hook
    Runtime.getRuntime().addShutdownHook(hook);
    System.out.println("Main method is running ....");

    try {
        Thread.sleep(3000);
    } catch (Exception e) {
        e.printStackTrace();
    }
    System.out.println("Main method completed.");    
    }
}
