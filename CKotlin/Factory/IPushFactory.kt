package Factory

import Pushes.IPush

interface IPushFactory {
    fun made(param:Map<String,String>):IPush
}