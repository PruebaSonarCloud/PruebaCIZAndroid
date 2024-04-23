package com.example.pruebacizandroid

import kotlinx.coroutines.Dispatchers
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    private lateinit var exampleViewModel: ExampleViewModel

    @Before
    fun onBefore(){
        exampleViewModel = ExampleViewModel()
    }
    @Test
    fun testStringFun() {
        val str = exampleViewModel.getString("Zeydi")
        assertEquals("El valor del no coincide", str, "Zeydi") //Si se desea imprimir un mensaje
    }
}