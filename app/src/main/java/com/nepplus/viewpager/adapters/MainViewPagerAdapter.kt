package com.nepplus.viewpager.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.nepplus.viewpager.fragements.BirthYearFragment
import com.nepplus.viewpager.fragements.HelloFragment
import com.nepplus.viewpager.fragements.NameFragment

class MainViewPagerAdapter( fm : FragmentManager ) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        if (position == 0 ) {
            return "인사"

        }
        else if( position == 1) {
            return "이름"
        }
        else { return "출생년도"}
    }

    override fun getCount(): Int {
        //뷰페이저가 총 몇장짜리인지? return

        return 3

    }

    override fun getItem(position: Int): Fragment {

        //각각의 포지션에 어떤 프레그먼트가 배치되어야 하는가?
        //listview 겟뷰랑 비슷
        if ( position ==0 ) {
            return HelloFragment()
        }

        else if (position == 1) {
            return NameFragment
        }
        else {
            return BirthYearFragment()
        }
    }
}