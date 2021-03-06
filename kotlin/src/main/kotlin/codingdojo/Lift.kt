package codingdojo

class Lift(
        val id: String,
        private var floor: Int,
        private val requests: List<Int> = emptyList(),
        private val doorsOpen: Boolean = false) {

    fun getFloor() = floor

    fun hasRequestForFloor(floor: Int): Boolean {
        return requests.contains(floor)
    }

    fun areDoorsOpen(): Boolean {
        return doorsOpen
    }
}
