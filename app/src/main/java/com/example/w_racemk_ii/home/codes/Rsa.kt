package com.example.w_racemk_ii.home.codes

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

class Rsa : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var searchView: SearchView
    private var mList = ArrayList<LanguageData>()
    private lateinit var adapter: LanguageAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_rsa, container, false)

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
                if (query.lowercase(Locale.ROOT)
                    .let { i.title.lowercase(Locale.ROOT).contains(it) }
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
                "D 0A",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nApplication data layout error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data into RSA backplane memory"
            )
        )

        mList.add(
            LanguageData(
                "D 0B",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nInstallation Address error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nCheck hard-wired installation address. Reload application data into RSA backplane memory"
            )
        )

        mList.add(
            LanguageData(
                "D 0C",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nApplication data Compatibility index error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data into RSA backplane memory"
            )
        )

        mList.add(
            LanguageData(
                "D 0D",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nCRC value error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data into RSA backplane memory"
            )
        )

        mList.add(
            LanguageData(
                "D 0E",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nApplication Data not present\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data into RSA backplane memory"
            )
        )

        mList.add(
            LanguageData(
                "D 14",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nNumber of RSAs error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data into RSA backplane memory"
            )
        )

        mList.add(
            LanguageData(
                "D 15",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nFiller Byte error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data into RSA backplane memory"
            )
        )

        mList.add(
            LanguageData(
                "D 16",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nRSA Interface ID error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data into RSA backplane memory"
            )
        )

        mList.add(
            LanguageData(
                "D 17",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nRSA Port Address Error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data into RSA backplane memory"
            )
        )

        mList.add(
            LanguageData(
                "D 18",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nNumber of Remote Interfaces error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data into RSA backplane memory"
            )
        )

        mList.add(
            LanguageData(
                "D 19",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nTimeout error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data into RSA backplane memory"
            )
        )

        mList.add(
            LanguageData(
                "D 28",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nWatchdog error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nRestart RSA. If error does not clear, replace PM or RSA module."
            )
        )

    }
}
