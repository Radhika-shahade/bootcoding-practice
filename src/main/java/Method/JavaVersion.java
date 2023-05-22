package Method;

public class JavaVersion {
    public static void main(String[] args) {
        System.out.println("\n Java Version"+ System.getProperty("java.version"));
        System.out.println("Java Runtime version:"+ System.getProperty("java.runtime.version"));
        System.out.println("Java Home"+ System.getProperty("java.home"));
        System.out.println("Java Vendor"+ System.getProperty("java vendor"));
        System.out.println("Java vendor url"+ System.getProperty("java.vendor.url"));
        System.out.println("Java class path"+ System.getProperty("java.class.path"));
    }

}
