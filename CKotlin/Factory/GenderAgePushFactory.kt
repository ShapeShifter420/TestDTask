package Factory

import Pushes.GenderAgePush
import Pushes.IPush

object GenderAgePushFactory : IPushFactory {
    override fun made(param: Map<String, String>): IPush = GenderAgePush(
        age = param["age"]?.toInt() ?: 0,
        gender = param["gender"] ?: "none",
        text = param["text"] ?: "none"
    )
}