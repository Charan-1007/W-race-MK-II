package com.example.w_racemk_ii.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentTransaction
import com.example.w_racemk_ii.R
import com.example.w_racemk_ii.home.codes.NonVital
import com.example.w_racemk_ii.home.codes.Rsa
import com.example.w_racemk_ii.home.codes.Vital

class Home : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        // Find the buttons by their IDs
        val button = view.findViewById<Button>(R.id.button)
        val button2 = view.findViewById<Button>(R.id.button2)
        val button3 = view.findViewById<Button>(R.id.button3)

        // Set click listeners for each button
        button.setOnClickListener {
            // Replace the current fragment with the VitalFragment
            replaceFragment(Vital())
        }

        button2.setOnClickListener {
            // Replace the current fragment with the NonVitalFragment
            replaceFragment(NonVital())
        }

        button3.setOnClickListener {
            // Replace the current fragment with the RsaFragment
            replaceFragment(Rsa())
        }

        return view
    }

    private fun replaceFragment(fragment: Fragment) {
        val transaction = requireActivity().supportFragmentManager.beginTransaction()

        // Delay the start of the animation by a small fraction of time (e.g., 100 milliseconds)
        val delayMillis = 150
        view?.postDelayed({
            transaction.setCustomAnimations(
                R.anim.slide_in,  // Enter animation
                R.anim.slide_out  // Exit animation
            )
            transaction.replace(R.id.main_home, fragment)
            transaction.addToBackStack(null) // Optional: Add to back stack
            transaction.commit()
        }, delayMillis.toLong())
    }
}
