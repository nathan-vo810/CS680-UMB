package edu.umb.cs680.hw08;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FileTest {

    private String[] fileToStringArray(File f) {
        String[] fileInfo = {
                f.getName(),
                String.valueOf(f.isDirectory()),
                String.valueOf(f.getSize()),
                f.getParent().getName()
        };

        return fileInfo;
    }

    private static Directory root, applications, home, code;
    private static File a, b, c, d, e, f;
    private static Link x, y;

    @BeforeAll
    public static void setUp() {
        root = new Directory(null, "root");

        applications = new Directory(root, "applications");
        home = new Directory(root, "home");
        root.appendChild(applications);
        root.appendChild((home));

        a = new File(applications, "a", 10);
        b = new File(applications, "b", 10);
        applications.appendChild(a);
        applications.appendChild(b);


        c = new File(home, "c", 10);
        d = new File(home, "d", 10);
        code = new Directory(home, "code");
        home.appendChild(c);
        home.appendChild(d);
        home.appendChild(code);

        e = new File(code, "e", 10);
        f = new File(code, "f", 10);
        code.appendChild(e);
        code.appendChild(f);

        x = new Link(home, "x", applications);
        y = new Link(code, "y", b);
        home.appendChild(x);
        code.appendChild(y);
    }

    @Test
    public void verifyFileEqualityA() {
        String[] expected = {"a", "false", "10", "applications"};
        String[] actual = fileToStringArray(a);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void verifyFileEqualityB() {
        String[] expected = {"b", "false", "10", "applications"};
        String[] actual = fileToStringArray(b);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void verifyFileEqualityC() {
        String[] expected = {"c", "false", "10", "home"};
        String[] actual = fileToStringArray(c);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void verifyFileEqualityD() {
        String[] expected = {"d", "false", "10", "home"};
        String[] actual = fileToStringArray(d);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void verifyFileEqualityE() {
        String[] expected = {"e", "false", "10", "code"};
        String[] actual = fileToStringArray(e);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void verifyFileEqualityF() {
        String[] expected = {"f", "false", "10", "code"};
        String[] actual = fileToStringArray(f);
        assertArrayEquals(expected, actual);
    }
}
