package Factory

import Pushes.AgeSpecificPush
import Pushes.IPush

object AgeSpecificPushFactory : IPushFactory {
    override fun made(param: Map<String, String>): IPush = AgeSpecificPush(
        age = param["age"]?.toInt() ?: 0,
        expiry = param["expiry_date"]?.toLong() ?: 0,
        text = param["text"]!!
    )
}