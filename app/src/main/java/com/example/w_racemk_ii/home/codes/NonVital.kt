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
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nApplication data layout error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data into backplane."
            )
        )

        mList.add(
            LanguageData(
                "D 0B",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nInstallation Address error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nCheck hard-wired installation address. Reload application data into backplane."
            )
        )

        mList.add(
            LanguageData(
                "D 0C",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nApplication data Compatibility index error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data into backplane."
            )
        )

        mList.add(
            LanguageData(
                "D 0D",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nCRC value error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data into backplane."
            )
        )

        mList.add(
            LanguageData(
                "D 0E",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nApplication Data not present\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data into backplane."
            )
        )

        mList.add(
            LanguageData(
                "D 14",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nModbus Session OK logic state error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "D 15",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nModbus Session LOC timeout error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "D 16",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nDiagnostic port address error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data D into backplane."
            )
        )

        mList.add(
            LanguageData(
                "D 17",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nWSL/S2 slot value error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data D into backplane (WSL/S2 protocol not implemented)."
            )
        )

        mList.add(
            LanguageData(
                "D 18",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nNon-vital number of sessions error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data D into backplane."
            )
        )

        mList.add(
            LanguageData(
                "D 19",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nNon-vital session type value error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "D 1A",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nNon-vital session logic state value error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "D 1B",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nNon-vital session address error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "D 1C",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nModbus Session identifier error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "D 1D",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nWSL/S2 or WSA/S2 housing value error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data D into backplane."
            )
        )

        mList.add(
            LanguageData(
                "D 1E",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄S𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nWSA/S2 data word length error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "D 1F",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nModbus Client/Server indication error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "D 20",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄S𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nWSL/SL broadcast window error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data D into backplane (WSL/S2 protocol not implemented)."
            )
        )

        mList.add(
            LanguageData(
                "D 21",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄S𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nRemote SMB interface number error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data D into backplane."
            )
        )

        mList.add(
            LanguageData(
                "D 22",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄S𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nRemote SMB Filler Byte error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data D into backplane."
            )
        )

        mList.add(
            LanguageData(
                "D 23",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄S𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nRemote SMB timeout value error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data D into backplane."
            )
        )

        mList.add(
            LanguageData(
                "D 24",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nModbus input/output mapping data pointer error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "D 25",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nModbus number of input/output registers error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "D 28",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nWatchdog error, any non-vital process is missing\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "D 29",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nModbus handler Client/Server indication error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "D 2A",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nModbus handler session type error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "D 2B",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nBad Digisafe protocol UDP communication port error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data D into PM backplane."
            )
        )

        mList.add(
            LanguageData(
                "D FC",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nCycle number and fault buffer index consistency error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )


    }
}
