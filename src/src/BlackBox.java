import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BlackBox {

    /////// Junior
    @Test
    void testCase1() {
        Person p = new Person(0, "Junior");
        assertEquals("Dau vao khong hop le", p.decide(p));
    }
    @Test
    void testCase2() {
        Person p = new Person(1, "Junior");
        assertEquals("Khong thue", p.decide(p));
    }
    @Test
    void testCase3() {
        Person p = new Person(20, "Junior");
        assertEquals("Thue ban thoi gian", p.decide(p));
    }
    @Test
    void testCase4() {
        Person p = new Person(30, "Junior");
        assertEquals("Thue toan thoi gian", p.decide(p));
    }
    @Test
    void testCase5() {
        Person p = new Person(2147483646, "Junior");
        assertEquals("Khong thue", p.decide(p));
    }
    @Test
    void testCase6() {
        Person p = new Person(2147483647, "Junior");
        assertEquals("Khong thue", p.decide(p));
    }

    // Senior
    @Test
    void testCase7() {
        Person p = new Person(0, "Senior");
        assertEquals("Dau vao khong hop le", p.decide(p));
    }
    @Test
    void testCase8() {
        Person p = new Person(1, "Senior");
        assertEquals("Khong thue", p.decide(p));
    }
    @Test
    void testCase9() {
        Person p = new Person(20, "Senior");
        assertEquals("Thue toan thoi gian", p.decide(p));
    }
    @Test
    void testCase10() {
        Person p = new Person(30, "Senior");
        assertEquals("Thue toan thoi gian", p.decide(p));
    }
    @Test
    void testCase11() {
        Person p = new Person(2147483646, "Senior");
        assertEquals("Khong thue", p.decide(p));
    }
    @Test
    void testCase12() {
        Person p = new Person(2147483647, "Senior");
        assertEquals("Khong thue", p.decide(p));
    }

    ////// Chuoi khac
    @Test
    void testCase13() {
        Person p = new Person(0, "abc");
        assertEquals("Dau vao khong hop le", p.decide(p));
    }
    @Test
    void testCase14() {
        Person p = new Person(1, "abc");
        assertEquals("Dau vao khong hop le", p.decide(p));
    }
    @Test
    void testCase15() {
        Person p = new Person(20, "abc");
        assertEquals("Dau vao khong hop le", p.decide(p));
    }
    @Test
    void testCase16() {
        Person p = new Person(30, "abc");
        assertEquals("Dau vao khong hop le", p.decide(p));
    }
    @Test
    void testCase17() {
        Person p = new Person(2147483646, "abc");
        assertEquals("Dau vao khong hop le", p.decide(p));
    }
    @Test
    void testCase18() {
        Person p = new Person(2147483647, "abc");
        assertEquals("Dau vao khong hop le", p.decide(p));
    }
}
