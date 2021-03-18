package Filters

import Pushes.IPush
import Pushes.ISystemData
import Pushes.ITechPush

class TechFilter : IFilter {
    override fun allow(push: IPush): Boolean = push is ITechPush

    override fun filtration(push: IPush,sysData: ISystemData): Boolean {
        val techPush = push as ITechPush
        return sysData.osVersion <= techPush.osVersion
    }
}