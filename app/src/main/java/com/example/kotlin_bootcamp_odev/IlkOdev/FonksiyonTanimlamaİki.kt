package com.example.kotlin_bootcamp_odev.IlkOdev

fun main() {
    println("Ic acilar toplami: ")
    println(icAciToplami(5))

    println("Maas hesapla: ")
    println(maasHesapla(22))

    println("Kota ucreti hesapla: ")
    println(kotaUcretiHesapla(60))
}

// 1. Kenar sayisina gore ic acilar toplamini hesapla
fun icAciToplami(kenarSayisi: Int): Int {
    return (kenarSayisi - 2) * 180
}

// 2. Gun sayisina gore maas hesapla
fun maasHesapla(gunSayisi: Int): Int {
    val saatlikUcret = 10
    val mesaiUcreti = 20
    val normalCalismaSaati = 8

    val toplamSaat = gunSayisi * normalCalismaSaati
    return if (toplamSaat <= 160) {
        toplamSaat * saatlikUcret
    } else {
        val mesaiSaati = toplamSaat - 160
        (160 * saatlikUcret) + (mesaiSaati * mesaiUcreti)
    }
}

// 3. Kota miktarina gore ucret hesapla
fun kotaUcretiHesapla(kota: Int): Int {
    val normalKota = 50
    val normalUcret = 100
    val ekstraGBUcreti = 4

    return if (kota <= normalKota) {
        normalUcret
    } else {
        val ekstraGB = kota - normalKota
        normalUcret + (ekstraGB * ekstraGBUcreti)
    }
}
