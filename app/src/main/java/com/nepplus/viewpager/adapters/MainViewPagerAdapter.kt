package com.nepplus.viewpager.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.nepplus.viewpager.fragements.BirthYearFragment
import com.nepplus.viewpager.fragements.HelloFragment
import com.nepplus.viewpager.fragements.NameFragment

class MainViewPagerAdapter( fm : FragmentManager ) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
      return when (position) {

          0 -> "이름"
          1 -> "인사"
          else -> "출생년도"

      }
    }

    override fun getCount(position: Int): Fragment {

    }

    override fun getItem(position: Int): Fragment {

        //각각의 포지션에 어떤 프레그먼트가 배치되어야 하는가?
        //listview 겟뷰랑 비슷

        return when (position) {

            0 -> HelloFragment
            1 -> NameFragment
            else -> BirthYearFragment

    }





    }
}