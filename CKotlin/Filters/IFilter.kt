package Filters

import Pushes.IPush
import Pushes.ISystemData

interface IFilter {
    fun allow(push: IPush):Boolean
    fun filtration(push: IPush,sysData:ISystemData):Boolean
}