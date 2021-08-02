package com.example.viewpagermenu.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpagermenu.fragments.BrownieFragment
import com.example.viewpagermenu.fragments.PizzaFragment
import com.example.viewpagermenu.fragments.QuicheFragment

class TabsPagerAdapter(fm: FragmentManager, lifecycle: Lifecycle, private var numAbas: Int)
    :FragmentStateAdapter(fm, lifecycle){
    override fun getItemCount(): Int = numAbas


    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> QuicheFragment()
            1 -> PizzaFragment()
            2 -> BrownieFragment()
            else -> QuicheFragment()
            }
    }

}