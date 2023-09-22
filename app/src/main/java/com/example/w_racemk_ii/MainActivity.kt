package com.example.w_racemk_ii


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.w_racemk_ii.about.About
import com.example.w_racemk_ii.home.Home
import nl.joery.animatedbottombar.AnimatedBottomBar


class MainActivity : AppCompatActivity() {
    private lateinit var bottomBar: AnimatedBottomBar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomBar=findViewById(R.id.bottom_bar)

        replaceFragment(Home())

        bottomBar.setOnTabSelectListener(object :AnimatedBottomBar.OnTabSelectListener{
            override fun onTabSelected(
                lastIndex: Int,
                lastTab: AnimatedBottomBar.Tab?,
                newIndex: Int,
                newTab: AnimatedBottomBar.Tab
            ) {
                //Toast.makeText(this@MainActivity,"$newTab",Toast.LENGTH_SHORT).show()

                when(newIndex){
                    0->replaceFragment(Home())
                    1->replaceFragment(About())
                    else->{

                    }


                }
            }

        })


    }

    fun replaceFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.fragments,fragment).commit()
    }

}