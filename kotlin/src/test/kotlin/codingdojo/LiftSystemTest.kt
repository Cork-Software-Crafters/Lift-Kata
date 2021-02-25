package codingdojo

import org.junit.jupiter.api.Test

internal class LiftSystemTest {

    @Test
    fun `do something`() {
        val liftA = Lift("A", 0)
        val liftSystem = LiftSystem(floors = listOf(0, 1), lifts = listOf(liftA), calls = emptyList())

        liftSystem.tick()

        // TODO: finish writing this test
    }
}
