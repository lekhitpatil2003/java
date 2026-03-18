public class RuntimeExec {
    public static void main(String[] args) throws Exception{
        Runtime rt = Runtime.getRuntime(); // Object

        rt.exec("notepad"); // Windows

        System.out.println(rt.availableProcessors());
        System.out.println(rt.totalMemory());
        System.out.println(rt.freeMemory());
    }
}
