package Pushes

data class LocationAgePush(
    override val age: Int,
    override val xCoord: Double,
    override val yCoord: Double,
    override val radius: Double,
    override val text: String
) : ILocationPush,IAgePush {
}