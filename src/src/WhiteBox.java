import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WhiteBox {
    @Test
    void testcase1() {
        Person p = new Person(-7, "NORMAL");
        assertEquals(-1, p.account(p));
    }

    @Test
    void testcase2() {
        Person p = new Person(4, "NORMAL");
        assertEquals(100000, p.account(p));
    }

    @Test
    void testcase3() {
        Person p = new Person(4, "VIP");
        assertEquals(200000, p.account(p));
    }

    @Test
    void testcase4() {
        Person p = new Person(25, "VIP");
        assertEquals(1000000, p.account(p));
    }

    @Test
    void testcase5() {
        Person p = new Person(25, "NORMAL");
        assertEquals(500000, p.account(p));
    }
}