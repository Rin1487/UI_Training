package com.example.android.ui_training.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.android.ui_training.FirstCard
import com.example.android.ui_training.SecondCard
import com.example.android.ui_training.ThirdCard

class PagerAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> FirstCard()
            1 -> SecondCard()
            else -> ThirdCard()
        }
    }
}