package com.example.w_racemk_ii.about


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.w_racemk_ii.R

class About : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_about, container, false)

        // Get the button reference
        val githubButton = view.findViewById<Button>(R.id.githubButton)

        // Set the button click listener
        githubButton.setOnClickListener {
            // Open the GitHub link in a browser
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/Charan-1007/W-race-MK-II.git"))
            startActivity(intent)
        }

        return view
    }
}

