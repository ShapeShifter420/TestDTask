package Filters

import Pushes.IAgePush
import Pushes.IGenderPush
import Pushes.IPush
import Pushes.ISystemData

class GenderFilter : IFilter {
    override fun allow(push: IPush): Boolean = push is IGenderPush

    override fun filtration(push: IPush,sysData: ISystemData): Boolean {
        val genderPush = push as IGenderPush
        return sysData.gender == genderPush.gender
    }
}