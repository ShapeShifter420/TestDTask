package Factory

import Pushes.ISystemData
import Pushes.SystemData

object SystemDataFactory : ISystemDataFactory {
    override fun create(param:Map<String,String>):ISystemData{
        return SystemData(age = param["age"]?.toInt() ?: 0,
            time = param["time"]?.toLong() ?: 0,
            gender = param["gender"] ?: "none",
            osVersion = param["os_version"]?.toInt() ?: 0,
            xCoord = param["x_coord"]?.toDouble() ?: 0.0,
            yCoord = param["y_coord"]?.toDouble() ?: 0.0)
    }
}