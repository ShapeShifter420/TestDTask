package Filters

import Pushes.IAgePush
import Pushes.IExpiryPush
import Pushes.IPush
import Pushes.ISystemData

class ExpiryFilter : IFilter {
    override fun allow(push: IPush): Boolean = push is IExpiryPush

    override fun filtration(push: IPush,sysData: ISystemData): Boolean {
        val expiryPush = push as IExpiryPush
        return sysData.time >= expiryPush.expiry
    }
}