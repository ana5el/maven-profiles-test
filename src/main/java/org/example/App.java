package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        final String workingDirectory = System.getProperty("user.dir");
        final String fileSeparator = System.getProperty("file.separator");
        final String javaHome = System.getProperty("java.home");
        final String javaVersion = System.getProperty("java.property");
        final String osName = System.getProperty("os.name");
        final String userName = System.getProperty("user.name");

        System.out.println(userName);
        System.out.println(workingDirectory);
    }
}
