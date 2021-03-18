package Factory

import Pushes.GenderPush
import Pushes.IPush

object GenderPushFactory : IPushFactory {
    override fun made(param: Map<String, String>): IPush = GenderPush(
        gender = param["gender"] ?: "none",
        text = param["text"] ?: "none"
    )
}