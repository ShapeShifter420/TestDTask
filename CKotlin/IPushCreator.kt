import Pushes.IPush

interface IPushCreator {
    fun create(param: Map<String,String>) : IPush
}