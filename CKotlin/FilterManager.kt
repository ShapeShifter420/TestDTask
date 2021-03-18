import Filters.IFilter
import Pushes.IPush
import Pushes.ISystemData

class FilterManager(_filtersList: List<IFilter>,_sysData:ISystemData) {
    private val filtersList = _filtersList
    private val sysData = _sysData

    fun getFiltredPushes(pushesList: List<IPush>): List<IPush> {
        return pushesList.filter {
            var flag = true
            for (filter in filtersList) {
                if (flag && filter.allow(it)) {
                    flag = filter.filtration(it, sysData)
                    if(!flag) break
                }
            }
            flag
        }
    }
}