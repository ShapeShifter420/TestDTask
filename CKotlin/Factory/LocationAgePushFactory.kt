package Factory

import Pushes.IPush
import Pushes.LocationAgePush

object LocationAgePushFactory : IPushFactory {
    override fun made(param: Map<String, String>): IPush = LocationAgePush(
        age = param["age"]?.toInt() ?: 0,
        xCoord = param["x_coord"]?.toDouble() ?: 0.0,
        yCoord = param["y_coord"]?.toDouble() ?: 0.0,
        radius = param["radius"]?.toDouble() ?: 0.0,
        text = param["text"] ?: "none"
    )
}