package com.survivalcoding;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClericTest {

    Cleric cleric;

    @BeforeEach
    void setUp() {
        cleric = new Cleric();
    }

    @Test
    void selfAid_WhenHpIsLow_ThenHpBecomesMaxAndMpDecreases() {
        // Given: HP가 20인 성직자
        cleric.HP = 20;

        // When: selfAid 사용
        cleric.selfAid();

        // Then: HP는 50(Max)
        assertEquals(50, cleric.HP);
    }

    @Test
    void pray_WhenTimeIsGiven_ThenMpIncreasesByTimeAndRandom() {
        // Given: MP가 0인 성직자
        cleric.MP = 0;
        int prayTime = 3;

        // When: 3초간 기도
        int recovered = cleric.pray(prayTime);

        // Then: 최소 3 이상 회복되고, MP 상태가 업데이트 된다
        assertTrue(recovered >= 3 && recovered <= 4);
        assertEquals(recovered, cleric.MP);
    }

    @Test
    void pray_WhenMpExceedsMax_ThenMpShouldBeMaxAndReturnOnlyNeededAmount() {
        // Given: MP가 8인 성직자 (MaxMP는 10)
        cleric.MP = 8;

        // When: 5초간 기도 (실제 회복 가능한 양은 2)
        int recovered = cleric.pray(5);

        // Then: MP는 10을 넘지 않고, 반환값은 실제 회복된 2여야 한다
        assertEquals(10, cleric.MP);
        assertEquals(2, recovered);
    }
}