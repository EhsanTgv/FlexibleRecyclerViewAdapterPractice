package com.taghavi.flexiblerecyclerviewadapter

sealed class CarListEvent {
    data class ShowSelectedCar(val carDetails: String) : CarListEvent()
}