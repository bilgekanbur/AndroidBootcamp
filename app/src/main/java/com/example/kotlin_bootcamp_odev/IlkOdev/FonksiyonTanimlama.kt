package com.example.kotlin_bootcamp_odev.IlkOdev


fun main() {
    println("Dereceyi Fahrenheit'a cevir: ")
    println(celsiusToFahrenheit(25.0))

    println("Dikdortgenin cevresi: ")
    println(dikdortgenCevresi(5, 10))

    println("Faktoriyel hesapla: ")
    println(faktoriyel(5))

    println("Kelime icindeki 'a' harfi sayisi: ")
    println(harfSayisi("Ankara"))
}

// 1. soru
fun celsiusToFahrenheit(celsius: Double): Double {
    return celsius * 1.8 + 32
}

// 2. soru
fun dikdortgenCevresi(kenar1: Int, kenar2: Int): Int {
    return 2 * (kenar1 + kenar2)
}

// 3. soru
fun faktoriyel(sayi: Int): Int {
    var sonuc = 1
    for (i in 1..sayi) {
        sonuc *= i
    }
    return sonuc
}

// 4. soru
fun harfSayisi(kelime: String): Int {
    return kelime.count { it == 'a' || it == 'A' }
}
