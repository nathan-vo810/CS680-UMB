package edu.umb.cs680.hw08;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkTest {
    private String[] linkToStringArray(Link l) {
        String[] linkInfo = {
                l.getName(),
                String.valueOf(l.isDirectory()),
                String.valueOf(l.getSize()),
                l.getParent().getName(),
                l.getTarget().getName()
        };

        return linkInfo;
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
    public void verifyLinkEqualityX() {
        String[] expected = {"x", "false", "0", "home", "applications"};
        String[] actual = linkToStringArray(x);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void verifyLinkEqualityY() {
        String[] expected = {"y", "false", "0", "code", "b"};
        String[] actual = linkToStringArray(y);
        assertArrayEquals(expected, actual);
    }
}
