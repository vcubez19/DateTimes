import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit
import java.util.*


fun main() {


    // Current year
    val year: Int = Calendar.getInstance().get(Calendar.YEAR)

    // Date formatter
    val formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy")

    // Now
    val today = LocalDate.now()

    // Formatted now
    val formattedToday = today.format(formatter)

    // Printing today's date
    println("Today is $formattedToday")

    // Next full moon
    val nextFullMoon: LocalDate = LocalDate.of(year,10,20)

    // Formatted version
    val formattedNextFullMoon = nextFullMoon.format(formatter)

    // Days until next full moon
    val daysUntil = today.until(nextFullMoon, ChronoUnit.DAYS)

    // Printing when the next full moon is
    println("The next full moon will be in $daysUntil days on $formattedNextFullMoon")



}

