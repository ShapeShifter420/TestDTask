package Pushes

data class AgeSpecificPush(override val age: Int, override val expiry: Long, override val text: String) :IAgePush,IExpiryPush{
}