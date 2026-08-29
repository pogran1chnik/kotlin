package org.example.app

data class MainScreenState(
    val data: String = "",
    val isLoading: Boolean = false,
)

class MainScreenViewModel {
    var mainScreenState = MainScreenState()

    fun loadData(){
        mainScreenState = mainScreenState.copy(isLoading = true, data = "")
        Thread.sleep(1000)
        mainScreenState =mainScreenState.copy(isLoading = false, data = "Данные загружены")

    }
    fun printState(){
        println("mainScreenState = $mainScreenState")
        println()
    }
}
fun main() {

    val viewModel = MainScreenViewModel()

    println("Начальное состояние")
    viewModel.printState()

    println("Загрузка данных")
    viewModel.loadData()

    println("Финальное состояние")
    viewModel.printState()
}