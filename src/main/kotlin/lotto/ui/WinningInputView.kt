package lotto.ui

import lotto.data.LottoNumber
import lotto.data.LottoNumbers

object WinningInputView {
    fun askWinningNumbers(): LottoNumbers {
        println("지난 주 당첨 번호를 입력해 주세요.")
        val numbersString = readLine() ?: throw IllegalArgumentException("입력 값이 존재하지 않습니다.")
        val numbers = splitWinningNumbers(numbersString)
        return LottoNumbers(numbers)
    }

    private fun splitWinningNumbers(numbersString: String): List<Int> =
        numbersString.split(",").map { it.trim().toIntOrNull() ?: throw IllegalArgumentException("잘못된 입력값이 있습니다. ($it)") }
}
