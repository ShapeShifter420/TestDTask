package Pushes

data class SystemData(override val age: Int,
                      override val time: Long,
                      override val gender: String,
                      override val osVersion: Int,
                      override val xCoord: Double,
                      override val yCoord: Double
) :ISystemData {
}