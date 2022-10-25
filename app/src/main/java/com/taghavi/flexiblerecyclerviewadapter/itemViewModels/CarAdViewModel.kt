package com.taghavi.flexiblerecyclerviewadapter.itemViewModels

import android.graphics.Color
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.taghavi.flexiblerecyclerviewadapter.CarListViewModel
import com.taghavi.flexiblerecyclerviewadapter.ItemViewModel
import com.taghavi.flexiblerecyclerviewadapter.R
import com.taghavi.flexiblerecyclerviewadapter.BR
import java.util.Random

class CarAdViewModel(
    val id: Long,
    val make: String,
    val mode: String,
    val price: String,
    @get:Bindable var borderColor: Int = Color.RED
) : BaseObservable(), ItemViewModel {

    override val layoutId: Int = R.layout.item_car_listing_ad

    override val viewType: Int = CarListViewModel.AD_ITEM

    fun onClick() {
        borderColor = getRandomColor()
        notifyPropertyChanged(BR.borderColor)
    }

    private fun getRandomColor(): Int {
        val rnd = Random()
        return Color.rgb(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256))
    }

    override fun areItemsTheSame(other: ItemViewModel) = this === other

    override fun areContentsTheSame(other: ItemViewModel): Boolean {
        return if (other is CarListingViewModel) {
            other.id == id
        } else {
            false
        }
    }
}