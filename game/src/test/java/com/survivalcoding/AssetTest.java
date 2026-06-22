package com.survivalcoding;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AssetTest {

    private Book myBook;
    private Computer myComputer;

    private Patent myPatent;

    @BeforeEach
    void setUp() {
        myBook = new Book("자바의 정석", 30000, "Red", 0.8, "978-89-94492-03-2");
        myComputer = new Computer("맥북 프로", 2500000, "Space Gray", 1.4, "Apple");
        myPatent = new Patent("특허권", "KR-2026-12345", "누군가의 특허");
    }

    @Test
    @DisplayName("Thing 인터페이스 타입에 대입 가능하고 무게를 다룰 수 있어야 한다")
    void interfacePolymorphismTest() {
        Thing item1 = myBook;
        Thing item2 = myComputer;

        assertEquals(0.8, item1.GetWeight(), "책의 무게가 올바르게 조회되어야 합니다.");
        assertEquals(1.4, item2.GetWeight(), "컴퓨터의 무게가 올바르게 조회되어야 합니다.");

        item1.SetWeight(0.9);
        assertEquals(0.9, item1.GetWeight(), "인터페이스를 통해 변경한 무게가 실제 객체 필드에 반영되어야 합니다.");
    }

    @Test
    @DisplayName("유,무 형자산은 최상위 추상 클래스인 Asset의 상속을 받으므로 name 필드를 공유해야 한다")
    void abstractClassInheritanceTest() {
        Asset asset1 = myBook;
        Asset asset2 = myPatent;

        assertEquals("자바의 정석", asset1.GetName(), "부모 Asset 타입으로 접근해도 자식의 name 필드에 접근 가능해야 합니다.");
        assertEquals("특허권", asset2.GetName(), "부모 Asset 타입으로 접근해도 자식의 name 필드에 접근 가능해야 합니다.");
    }

}