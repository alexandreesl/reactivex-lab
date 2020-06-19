import com.alexandreesl.examples.flowables.flowableExample
import com.alexandreesl.examples.flowables.flowableSubscribeOnExample
import com.alexandreesl.examples.operators.*
import com.alexandreesl.examples.schedulers.schedulersExample

fun main(args: Array<String>) {
    runOperatorsExamples()
    flowableExample()
    flowableSubscribeOnExample()
    schedulersExample()

}

private fun runOperatorsExamples() {
    firstExample()
    prefixExample()
    evenNumbersExample()
    distinctSumExample()
    evenNumbersWithprintlnExample()
    distinctSumWithDefaultExample()
    divisionWithResumeNextExample()
}