package Pushes

data class GenderAgePush(override val age: Int, override val gender: String, override val text: String) : IGenderPush,IAgePush {
}