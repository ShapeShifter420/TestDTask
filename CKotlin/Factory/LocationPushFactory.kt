package Factory

import Pushes.IPush
import Pushes.LocationPush

object LocationPushFactory : IPushFactory {
    override fun made(param: Map<String, String>): IPush = LocationPush(
        xCoord = param["x_coord"]?.toDouble() ?: 0.0,
        yCoord = param["y_coord"]?.toDouble() ?: 0.0,
        radius = param["radius"]?.toDouble() ?: 0.0,
        text = param["text"] ?: "none",
        expiry = param["expiry_date"]?.toLong() ?: 0,
    )
}