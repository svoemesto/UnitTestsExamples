package testpackage

import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

class TestSome {

    @Test
    @Tag("TagFirst")
    fun mySomeTest1() {
        println("My Some Test 1")
    }

    @Test
    @Tag("TagSecond")
    fun mySomeTest2() {
        println("My Some Test 2")
    }

    @Test
    @Tag("TagFirst")
    @Tag("TagSecond")
    fun mySomeTest3() {
        println("My Some Test 3")
    }

}