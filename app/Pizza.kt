import java.util.UUID


data class Pizza(
    val id: String = UUID.randomUUID().toString(),
    val title: String,
    val description: String,
    val cost: Double,
    val image: String,
    val size: String,
    val typeOfDought: String,
    val weight: Int

    )