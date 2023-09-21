package com.example.w_racemk_ii.home.codes

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.w_racemk_ii.R
import com.example.w_racemk_ii.home.LanguageAdapter
import com.example.w_racemk_ii.home.LanguageData
import java.util.Locale

class NonVital : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var searchView: SearchView
    private var mList = ArrayList<LanguageData>()
    private lateinit var adapter: LanguageAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_non_vital, container, false)

        recyclerView = root.findViewById(R.id.recyclerView)
        searchView = root.findViewById(R.id.searchView)

        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        addDataToList()
        adapter = LanguageAdapter(mList)
        recyclerView.adapter = adapter

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                filterList(newText)
                return true
            }
        })

        return root
    }

    private fun filterList(query: String?) {
        if (query != null) {
            val filteredList = ArrayList<LanguageData>()
            for (i in mList) {
                if (query?.lowercase(Locale.ROOT)
                        ?.let { i.title.lowercase(Locale.ROOT).contains(it) } == true
                ) {
                    filteredList.add(i)
                }
            }

            if (filteredList.isEmpty()) {
                // You can use a Snack bar or any other way to show a message
            } else {
                adapter.setFilteredList(filteredList)
            }
        }
    }

    private fun addDataToList() {
        mList.add(
            LanguageData(
                "0001",
                R.drawable.error,
                "𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nConsistency check of Common Core Inter-FPGA Interface ICD\nVersions between True and Comp channels/FPGA’s failed\n𝐏𝐑𝐎𝐂𝐄𝐒𝐒 𝐂𝐇𝐀𝐍𝐍𝐄𝐋:\nTrue Common\n𝐀𝐂𝐓𝐈𝐎𝐍 𝐎𝐍 𝐅𝐀𝐈𝐋𝐔𝐑𝐄:\nReplace module"
            )
        )

        // Add other LanguageData items here...

        // Example:
        mList.add(
            LanguageData(
                "0101",
                R.drawable.error,
                "𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nIO Module Time Stamp Difference Check (True) found a difference\n𝐏𝐑𝐎𝐂𝐄𝐒𝐒 𝐂𝐇𝐀𝐍𝐍𝐄𝐋:\nTrue Common\n𝐀𝐂𝐓𝐈𝐎𝐍 𝐎𝐍 𝐅𝐀𝐈𝐋𝐔𝐑𝐄:\nReplace module"
            )
        )



        mList.add(
            LanguageData(
                "01A1",
                R.drawable.error,
                "𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nIO Module Time Stamp Difference Check (True) found a difference\n𝐏𝐑𝐎𝐂𝐄𝐒𝐒 𝐂𝐇𝐀𝐍𝐍𝐄𝐋:\nTrue Common\n𝐀𝐂𝐓𝐈𝐎𝐍 𝐎𝐍 𝐅𝐀𝐈𝐋𝐔𝐑𝐄:\nReplace module"
            )
        )


        mList.add(
            LanguageData(
                "1C01",
                R.drawable.error,
                "𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nIO Module Time Stamp Difference Check (True) found a difference\n𝐏𝐑𝐎𝐂𝐄𝐒𝐒 𝐂𝐇𝐀𝐍𝐍𝐄𝐋:\nTrue Common\n𝐀𝐂𝐓𝐈𝐎𝐍 𝐎𝐍 𝐅𝐀𝐈𝐋𝐔𝐑𝐄:\nReplace module"
            )
        )
    }
}
