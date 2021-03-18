import Factory.SystemDataFactory
import Filters.*
import Pushes.IPush

fun main(args: Array<String>){
    val pushReader = PushReader(PushCreator(), SystemDataFactory)
    val sysData = pushReader.readSystem()
    val pushesList = mutableListOf<IPush>()
    with(pushReader) {
        while (hasPush()) {
            pushesList.add(readPush())
        }
    }
    val fpushesList = FilterManager(listOf(AgeFilter(),ExpiryFilter(),GenderFilter(),LocationFilter(),TechFilter()),sysData).getFiltredPushes(pushesList)
    if (fpushesList.isEmpty()) println(-1)
    else fpushesList.forEach{ println(it.text)}
}