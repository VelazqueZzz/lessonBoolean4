//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val trainingDay = 5
    val odd = trainingDay % 2 != 0
//оор
    println(
        "Упражнения для рук:    $odd\n" +
                "Упражнения для ног:    ${!odd}\n" +
                "Упражнения для спины:  ${!odd}\n" +
                "Упражнения для пресса: $odd"
    )
}