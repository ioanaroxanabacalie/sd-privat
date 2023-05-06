

fun main(args: Array<String>) {
    val msg = Message.create("localhost:4848","testmesaj")
    println(msg)
    val serialized = msg.serialize()
    val deserialized = Message.deserialize(serialized)
    println(deserialized)
}