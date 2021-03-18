package Filters

import Pushes.IPush
import Pushes.ILocationPush
import Pushes.ISystemData
import java.lang.Math.sqrt
import kotlin.math.pow

class LocationFilter : IFilter {
    override fun allow(push: IPush): Boolean = push is ILocationPush

    override fun filtration(push: IPush,sysData: ISystemData): Boolean {
        val locationPush = push as ILocationPush
        return kotlin.math.sqrt(
            (sysData.xCoord - locationPush.xCoord).pow(2.0) + (sysData.yCoord - locationPush.yCoord).pow(2.0)
        ) <=locationPush.radius
    }
}