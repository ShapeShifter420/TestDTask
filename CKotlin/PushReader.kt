import Factory.ISystemDataFactory
import Factory.SystemDataFactory
import Pushes.IPush
import Pushes.ISystemData

class PushReader(_pushCreator: IPushCreator, _systemDataFactory: ISystemDataFactory) : IPushReader {
    private val pushCreator= _pushCreator
    private val systemDataFactory = _systemDataFactory
    private var N = 0
    fun readSystem():ISystemData{
        val param = mutableMapOf<String,String>()
        while(true){
            val p = readLine()!!.split(' ')
            if (p.size == 1) {N = p[0].toInt();break}
            param[p[0]] = p[1]
        }
        return systemDataFactory.create(param)
    }
    fun readPush(): IPush {
        N--
        val param = mutableMapOf<String,String>()
        for (i in 0 until readLine()!!.toInt()){
            val p = readLine()!!.split(' ')
            param[p[0]] = p[1]
        }
        return pushCreator.create(param)
    }
    fun hasPush() = N>0
}