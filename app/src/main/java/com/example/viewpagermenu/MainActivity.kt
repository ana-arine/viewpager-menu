package com.example.viewpagermenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewpagermenu.adapter.TabsPagerAdapter
import com.example.viewpagermenu.fragments.BrownieFragment
import com.example.viewpagermenu.fragments.PizzaFragment
import com.example.viewpagermenu.fragments.QuicheFragment
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numberOfTabs = 3

        tabLayout.tabMode = TabLayout.MODE_FIXED
        tabLayout.isInlineLabel = true

        val adapter = TabsPagerAdapter(
            supportFragmentManager,
            lifecycle,
            numberOfTabs
        )

        viewPager.adapter = adapter
        viewPager.isUserInputEnabled = true

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            when (position) {
                0 -> tab.text = resources.getString(R.string.quiche)
                1 -> tab.text = resources.getString(R.string.pizza)
                2 -> tab.text = resources.getString(R.string.brownie)
            }
        }.attach()

    }
}