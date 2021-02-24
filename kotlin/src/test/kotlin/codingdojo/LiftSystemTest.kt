package codingdojo

import org.junit.jupiter.api.Test

internal class LiftSystemTest {
    // TODO: finish writing this test
    @Test
    fun doSomething() {
        val liftA = Lift("A", 0)
        val lifts = LiftSystem(listOf(0, 1), listOf(liftA), emptyList())
        lifts.tick()
    }
}
