package Factory

import Pushes.ISystemData

interface ISystemDataFactory {
    fun create(param:Map<String,String>):ISystemData
}