package testpackage

import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

class TestOther {

    @Test
    @Tag("TagFirst")
    fun myOtherTest1() {
        println("My Other Test 1")
    }

    @Test
    @Tag("TagSecond")
    fun myOtherTest2() {
        println("My Other Test 2")
    }

    @Test
    @Tag("TagFirst")
    @Tag("TagSecond")
    fun myOtherTest3() {
        println("My Other Test 3")
    }

}