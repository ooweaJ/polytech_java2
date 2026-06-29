package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class StrongBoxTest {

    @Test
    @DisplayName("PADLOCK 열쇠로 금고를 1024번 호출하여 내용물이 정상적으로 반환 그 전까지 NULL 반환")
    void PADLOCK_Test() {
        StrongBox<String> box = new StrongBox<String>(KeyType.PADLOCK);
        box.put("골드바");

        for (int i = 1; i < 1024; i++) {
            assertNull(box.get(), "1024 미만 일 때는 Null을 반환합니다");
        }

        assertEquals("골드바", box.get(), "1024번째에는 데이터가 정상 출력되어야 합니다");
    }

    @Test
    @DisplayName("BUTTON 열쇠로 금고를 10000번 호출하여 내용물이 정상적으로 반환 그 전까지 NULL 반환")
    void BUTTON_Test() {
        StrongBox<String> box = new StrongBox<String>(KeyType.BUTTON);
        box.put("비트코인");

        for (int i = 1; i < 10000; i++) {
            assertNull(box.get(), "10000 미만 일 때는 Null을 반환합니다");
        }

        assertEquals("비트코인", box.get(), "10000번째에는 데이터가 정상 출력되어야 합니다");
    }
}
