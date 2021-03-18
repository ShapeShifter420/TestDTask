package Filters

import Pushes.IAgePush
import Pushes.IPush
import Pushes.ISystemData

class AgeFilter : IFilter {
    override fun allow(push: IPush): Boolean = push is IAgePush

    override fun filtration(push: IPush,sysData:ISystemData): Boolean {
        val agePush = push as IAgePush
        return sysData.age >= agePush.age
    }
}