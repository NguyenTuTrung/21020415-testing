import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WhiteBox {

    @Test
    void testCase1() {
        Person p = new Person(0, "Junior");
        assertEquals("Dau vao khong hop le", p.decide(p));
    }
    @Test
    void testCase2() {
        Person p = new Person(16, "Junior");
        assertEquals("Khong thue", p.decide(p));
    }
    @Test
    void testCase3() {
        Person p = new Person(22, "Junior");
        assertEquals("Thue ban thoi gian", p.decide(p));
    }
    @Test
    void testCase4() {
        Person p = new Person(40, "Junior");
        assertEquals("Thue toan thoi gian", p.decide(p));
    }
    @Test
    void testCase5() {
        Person p = new Person(90, "Junior");
        assertEquals("Khong thue", p.decide(p));
    }

    // Senior
    @Test
    void testCase6() {
        Person p = new Person(0, "Senior");
        assertEquals("Dau vao khong hop le", p.decide(p));
    }
    @Test
    void testCase7() {
        Person p = new Person(16, "Senior");
        assertEquals("Khong thue", p.decide(p));
    }
    @Test
    void testCase8() {
        Person p = new Person(22, "Senior");
        assertEquals("Thue toan thoi gian", p.decide(p));
    }
    @Test
    void testCase9() {
        Person p = new Person(40, "Senior");
        assertEquals("Thue toan thoi gian", p.decide(p));
    }
    @Test
    void testCase10() {
        Person p = new Person(90, "Senior");
        assertEquals("Khong thue", p.decide(p));
    }

    // Chuoi khac
    @Test
    void testCase11() {
        Person p = new Person(0, "abc");
        assertEquals("Dau vao khong hop le", p.decide(p));
    }
}