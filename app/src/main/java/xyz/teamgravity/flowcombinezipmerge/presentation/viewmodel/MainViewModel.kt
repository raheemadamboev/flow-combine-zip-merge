package xyz.teamgravity.flowcombinezipmerge.presentation.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*

class MainViewModel : ViewModel() {

    private val flow1: Flow<Int> = (1..10).asFlow().onEach { delay(1_000) }
    private val flow2: Flow<Int> = (10..20).asFlow().onEach { delay(300) }

    var combine: String by mutableStateOf("")
        private set

    var zip: String by mutableStateOf("")
        private set

    var merge: String by mutableStateOf("")
        private set

    init {
        combine()
        zip()
        merge()
    }

    private fun combine() {
        combine(flow1, flow2) { number1, number2 ->
            combine += "($number1, $number2)\n"
        }.launchIn(viewModelScope)
    }

    private fun zip() {
        flow1.zip(flow2) { number1, number2 ->
            zip += "($number1, $number2)\n"
        }.launchIn(viewModelScope)
    }

    private fun merge() {
        merge(flow1, flow2).onEach { number ->
            merge += "($number)\n"
        }.launchIn(viewModelScope)
    }
}