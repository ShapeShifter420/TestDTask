import Factory.*
import Pushes.IPush
import Pushes.SimplePush

class PushCreator : IPushCreator {
    override fun create(param: Map<String, String>):IPush = when(param["type"]){
        "AgeSpecificPush"-> AgeSpecificPushFactory.made(param)
        "GenderAgePush"-> GenderAgePushFactory.made(param)
        "GenderPush"-> GenderPushFactory.made(param)
        "LocationAgePush"-> LocationAgePushFactory.made(param)
        "LocationPush"-> LocationPushFactory.made(param)
        "TechPush"-> TechPushFactory.made(param)
        else -> SimplePush(param["text"] ?: "none")
    }
}