package Factory

import Pushes.IPush
import Pushes.TechPush

object TechPushFactory : IPushFactory {
    override fun made(param: Map<String, String>): IPush = TechPush(
        text = param["text"] ?: "none",
        osVersion = param["os_version"]?.toInt() ?: 0
    )
}