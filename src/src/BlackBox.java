import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BlackBox {
    @Test
    void testcase1() {
        Person p = new Person(-5, "NORMAL");
        assertEquals(-1, p.account(p));
    }

    @Test
    void testcase2() {
        Person p = new Person(4, "NORMAL");
        assertEquals(100000, p.account(p));
    }

    @Test
    void testcase3() {
        Person p = new Person(20, "NORMAL");
        assertEquals(500000, p.account(p));
    }

    @Test
    void testcase4() {
        Person p = new Person(-4, "VIP");
        assertEquals(-1, p.account(p));
    }

    @Test
    void testcase5() {
        Person p = new Person(3, "VIP");
        assertEquals(200000, p.account(p));
    }

    @Test
    void testcase6() {
        Person p = new Person(25, "VIP");
        assertEquals(1000000, p.account(p));
    }
}