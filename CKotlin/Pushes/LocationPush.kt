package Pushes

data class LocationPush(
    override val expiry: Long,
    override val xCoord: Double,
    override val yCoord: Double,
    override val radius: Double,
    override val text: String
) : ILocationPush,IExpiryPush {
}