package com.taghavi.flexiblerecyclerviewadapter.itemViewModels

import com.taghavi.flexiblerecyclerviewadapter.CarListViewModel
import com.taghavi.flexiblerecyclerviewadapter.ItemViewModel
import com.taghavi.flexiblerecyclerviewadapter.R

class HeaderViewModel(val title: String) : ItemViewModel {

    override val layoutId: Int = R.layout.item_header

    override val viewType: Int = CarListViewModel.HEADER_ITEM

    override fun areItemsTheSame(other: ItemViewModel) = this === other

    override fun areContentsTheSame(other: ItemViewModel): Boolean {
        return if (other is HeaderViewModel) {
            other.title == title
        } else {
            false
        }
    }
}