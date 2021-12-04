package com.nepplus.viewpager_20211204.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.nepplus.viewpager_20211204.fragments.AddressFragment
import com.nepplus.viewpager_20211204.fragments.AgeFragment
import com.nepplus.viewpager_20211204.fragments.NameFragment

class MainViewPagerAdapter( fm : FragmentManager ) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        
        if(position == 0){
            return "이름"
        } else if (position ==  1) {
            return "거주지"
        } else {
            return "나이"
        }
        
    }


//    함수의 결과를 곧바로 3으로 지정
    override fun getCount() = 3

//    함수의 결과를 when (position)에 따라 return
    override fun getItem(position: Int): Fragment {

        return when(position) {
            0 -> NameFragment()
            1 -> AddressFragment()
            else -> AgeFragment()

        }

    }

}