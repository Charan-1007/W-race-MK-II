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

class Vital : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var searchView: SearchView
    private var mList = ArrayList<LanguageData>()
    private lateinit var adapter: LanguageAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_vital, container, false)

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
                "01",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nApplication data layout error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data AB into PM backplane memory."
            )
        )

        mList.add(
            LanguageData(
                "02",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nInstallation Address error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nCheck hard-wired installation address. Reload application data AB into PM backplane memory."
            )
        )

        mList.add(
            LanguageData(
                "03",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nApplication data Compatibility Index error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data AB into PM backplane memory."
            )
        )

        mList.add(
            LanguageData(
                "04",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nRedundant/Stand-alone configuration error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nCheck hard-wired LK1/LK2 configuration in PM backplane."
            )
        )

        mList.add(
            LanguageData(
                "05",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nApplication data pointer data error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data AB into PM backplane memory."
            )
        )

        mList.add(
            LanguageData(
                "06",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nMD5/SHA1 value error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data AB into PM backplane memory."
            )
        )

        mList.add(
            LanguageData(
                "07",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nApplication data fixed SMB data error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data AB into PM backplane memory."
            )
        )

        mList.add(
            LanguageData(
                "08",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nApplication data variable SMB data error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data AB into PM backplane memory."
            )
        )

        mList.add(
            LanguageData(
                "09",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nApplication data global SMB data error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data AB into PM backplane memory."
            )
        )

        mList.add(
            LanguageData(
                "0A",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nApplication data number of SMB logic states error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data AB into PM backplane memory."
            )
        )

        mList.add(
            LanguageData(
                "0B",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nApplication data logic tree depth error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data AB into PM backplane memory."
            )
        )

        mList.add(
            LanguageData(
                "0C",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nApplication data logic states error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data AB into PM backplane memory."
            )
        )

        mList.add(
            LanguageData(
                "0D",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nApplication data logic node error\n\n\uD835\uDC00\uD835\uDC02\uD835\uDC13\uD835\uDC08\uD835\uDC0E\uD835\uDC0D:\nReload application data AB into PM backplane memory."
            )
        )

        mList.add(
            LanguageData(
                "0E",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nApplication data logic pointer error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data AB into PM backplane memory."
            )
        )

        mList.add(
            LanguageData(
                "0F",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nApplication data fixed WNC data error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data AB into PM backplane memory."
            )
        )

        mList.add(
            LanguageData(
                "10",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nApplication data variable WNC data error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data AB into PM backplane memory."
            )
        )

        mList.add(
            LanguageData(
                "11",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nApplication data DP global data error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data AB into PM backplane memory."
            )
        )

        mList.add(
            LanguageData(
                "12",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nApplication data SR latches filler byte error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data AB into PM backplane memory."
            )
        )

        mList.add(
            LanguageData(
                "13",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nApplication data SR latches logic state error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data AB into PM backplane memory."
            )
        )

        mList.add(
            LanguageData(
                "14",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nApplication data SR latches number of latches error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data AB into PM backplane memory."
            )
        )

        mList.add(
            LanguageData(
                "15",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nApplication data number of timers error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data AB into PM backplane memory."
            )
        )

        mList.add(
            LanguageData(
                "16",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nApplication data timers filler byte error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data AB into PM backplane memory."
            )
        )

        mList.add(
            LanguageData(
                "17",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nApplication data unused timer error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data AB into PM backplane memory."
            )
        )

        mList.add(
            LanguageData(
                "18",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nApplication data used timer error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data AB into PM backplane memory."
            )
        )

        mList.add(
            LanguageData(
                "19",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nApplication data timer value error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data AB into PM backplane memory."
            )
        )

        mList.add(
            LanguageData(
                "1A",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nApplication data number of TOD timers error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data AB into PM backplane memory."
            )
        )

        mList.add(
            LanguageData(
                "1B",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nApplication data TOD timers filler byte error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data AB into PM backplane memory."
            )
        )

        mList.add(
            LanguageData(
                "1C",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nApplication data TOD timers hour value error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data AB into PM backplane memory."
            )
        )

        mList.add(
            LanguageData(
                "1D",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nApplication data TOD timers minute value error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data AB into PM backplane memory."
            )
        )

        mList.add(
            LanguageData(
                "1E",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nApplication data TOD timer logic state error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data AB into PM backplane memory."
            )
        )

        mList.add(
            LanguageData(
                "1F",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nData consistency error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "20",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nSMB phase consistency error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "21",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nSMB sub-phase consistency error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "22",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nTx timestamp consistency error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "23",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nAck Rx PM timestamp consistency error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "24",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nAck IO timestamp error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "25",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nAck vital input error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "26",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nWNC Tx timestamp error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "27",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nWNC Ack timestamp error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "28",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nWNC Ack Rx timestamp error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "29",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nWNC Index error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "2A",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nTimer consistency error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "2B",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nLast active consistency error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "2C",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nTOD timer control consistency error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "2D",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nLogic sequence error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "2E",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nLogic depth check error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "2F",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nSR latches logic state check error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "30",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nNumber of stored SR latches error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "31",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nStored SR latches cycle number error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "32",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nStored SR latches output state error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "33",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nStored SR latches MD5/SHA1 value error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "34",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nStored SR latches CRC value error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "35",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nRedundant application data version error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data AB into inactive PM backplane."
            )
        )

        mList.add(
            LanguageData(
                "36",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nRedundant application data compatibility index error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data AB into inactive PM backplane."
            )
        )

        mList.add(
            LanguageData(
                "37",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nRedundant MD5/SHA1 value error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data AB into inactive PM backplane."
            )
        )

        mList.add(
            LanguageData(
                "38",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nSMB out message consistency error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "39",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nSMB previous active error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "3A",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nTimer error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "3B",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nTimer value error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "3C",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nCRC table data error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "3D",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nWNC message module type error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "3E",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nWNC message module number error\n\n\uD835\uDC00\uD835\uDC02\uD835\uDC13\uD835\uDC08\uD835\uDC0E\uD835\uDC0D:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "3F",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nWNC output message consistency error\n\n\uD835\uDC00\uD835\uDC02\uD835\uDC13\uD835\uDC08\uD835\uDC0E\uD835\uDC0D:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "40",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nWNC output message module number error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "41",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nWNC output message module type error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "42",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nWNC output check last module pointer error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "43",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nWNC encoder module number error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "44",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nWNC encoder module type error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "45",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nWNC encoder last module pointer error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "46",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nWNC encoder message bit number error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "47",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nWNC encoder message byte number error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "48",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nWNC encoder message length error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "49",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nWNC decoder module number error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "4A",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nWNC decoder module type error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "4B",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nWNC decoder last module pointer error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "4C",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nWNC decoder message bit number error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "4D",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nWNC decoder message byte number error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "4E",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nWNC input message module number error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "4F",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nWNC input message module type error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "50",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nWNC input message last pointer error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "52",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nHot-standby status error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nCheck Hot-standby status cable. Replace PM backplane. Replace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "53",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nRedundant synchronization number consistency error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "54",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nRequest to Shutdown logic state error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nCheck installation logic design. Replace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "55",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nVital software version error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "56",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nNon-vital software version error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "57",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nMax cycle time error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "58",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nCurrent time consistency error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "59",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nClock skew error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "5A",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nRedundant Tx sequence consistency error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "5B",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nComms Layout error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "5E",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nMax cycle time error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "5F",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nCycle number consistency error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "60",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nCurrent time consistency error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "61",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nClock skew error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "62",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nRedundant message error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nCheck hot-standby status cable. Replace PM backplane. Replace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "63",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\n \n\n𝐀𝐂𝐓𝐈𝐎𝐍:\n "
            )
        )

        mList.add(
            LanguageData(
                "64",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nNumber of logic states error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "65",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nLogic state read data error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "66",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nLogic state read pointer error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "67",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nLogic state write pointer error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "68",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nConsistency transference data error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "69",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nReset Vital Input count consistency error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board."
            )
        )

        mList.add(
            LanguageData(
                "6A",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nRedundant Layout error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "6B",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nRedundant Layout error in CED D\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "72",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nS4 CRC table data error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "73",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nS4 CRC message length error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "74",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nS4 output check message consistency error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "75",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nS4 output check message protocol version parity error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "76",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nS4 output check message module type error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "77",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nS4 output check message module number error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "78",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nS4 output check last pointer module error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "79",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nS4 encoder message module number error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "7A",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nS4 encoder message module type error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "7B",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nS4 encoder last pointer module error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "7C",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nS4 encoder message bit number error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "7D",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nS4 encoder message byte number error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "7E",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nS4 encoder message length error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "7F",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nS4 decoder message module number error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "80",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nS4 decoder message module type error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "81",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nS4 decoder last pointer module error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "82",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nS4 decoder message byte number error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "83",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nS4 decoder message bit number error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "84",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nS4 input check message module type error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "85",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nS4 input check message module number error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "86",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nS4 input check last pointer module error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "87  (CHA)",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nS4 in/out module number error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "88  (CHA)",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nS4 in/out module type error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "89",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nNumber of Field Configurable Timers is not in range\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data AB into PM backplane memory"
            )
        )

        mList.add(
            LanguageData(
                "8A",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nNumber of FCT timers is not consistent in CED AB and CED T\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data AB into inactive PM backplane. Reload application data (FCT data) into inactive PM backplane"
            )
        )

        mList.add(
            LanguageData(
                "8B  (CHB)",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nFCT Start condition error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data (FCT data) into inactive PM backplane"
            )
        )

        mList.add(
            LanguageData(
                "8C  (CHB)",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nFCT Expiry condition error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data (FCT data) into inactive PM backplane"
            )
        )

        mList.add(
            LanguageData(
                "8D  (CHB)",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nCED T application data SHA1 value error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data (FCT data) into inactive PM backplane"
            )
        )

        mList.add(
            LanguageData(
                "8E  (CHA)",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nCED T application data MD5 value error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data (FCT data) into inactive PM backplane"
            )
        )

        mList.add(
            LanguageData(
                "8F",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nRedundant application CED T version error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data (FCT data) into inactive PM backplane"
            )
        )

        mList.add(
            LanguageData(
                "90",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nRedundant application data CED T MD5/SHA1 value error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data (FCT data) into inactive PM backplane"
            )
        )

        mList.add(
            LanguageData(
                "91",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nCED T application data Number of FCT Timers error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data (FCT data) into PM backplane memory"
            )
        )

        mList.add(
            LanguageData(
                "92",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nCED T application data filler byte error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data (FCT data) into PM backplane memory"
            )
        )

        mList.add(
            LanguageData(
                "93",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nCED T application data FCT timer value error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data (FCT data) into PM backplane memory"
            )
        )

        mList.add(
            LanguageData(
                "94",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nCED T application date Logic State mapped is not in range\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data (FCT data) into PM backplane memory"
            )
        )

        mList.add(
            LanguageData(
                "95",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nError in CED Digisafe pointer data area\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data AB into PM backplane memory"
            )
        )

        mList.add(
            LanguageData(
                "96",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nCED T Layout is not correct\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data (FCT data) into PM backplane memory"
            )
        )

        mList.add(
            LanguageData(
                "97",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nCED T Installation address does not match Links in the backplane\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nCheck hard wired installation address. Reload application data (FCT data) into PM backplane memory"
            )
        )

        mList.add(
            LanguageData(
                "98",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nCED AB / CED T application data MD5/SHA1 value consistency error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data AB into PM backplane memory. Reload application data (FCT data) into PM backplane memory"
            )
        )

        mList.add(
            LanguageData(
                "99",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nError receiving CED T from non-vital software\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data AB into inactive PM backplane. Reload application data (FCT data) into inactive PM backplane. Replace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "9A  (CHA)",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nFCT timer error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "9B",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nCED AB application data Digisafe global data error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data AB into PM backplane memory"
            )
        )

        mList.add(
            LanguageData(
                "9C",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nCED AB application data fixed Digisafe data error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data AB into PM backplane memory"
            )
        )

        mList.add(
            LanguageData(
                "9D",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nApplication data variable Digisafe data error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReload application data AB into PM backplane memory"
            )
        )

        mList.add(
            LanguageData(
                "9E",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nDigisafe output message consistency error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "9F",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nDigisafe output message module number error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "A0",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nDigisafe output message module type error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "A1",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nDigisafe output message length error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "A2",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nDigisafe output check last module pointer error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "A3",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nDigisafe encoder message module number error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "A4",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nDigisafe encoder message module type error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "A5",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nDigisafe encoder message identifier error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "A6  (CHB)",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nDigisafe encoder message bit number error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "A7  (CHB)",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nDigisafe encoder message byte number error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "A8  (CHB)",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nDigisafe encoder message last pointer error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "A9",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nDigisafe decoder message module number error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "AA  (CHB)",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nDigisafe in/out module number error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "AB  (CHB)",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nDigisafe in/out module type error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "AC  (CHB)",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nDigisafe in/out message true/comp output message length consistency error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "AF  (CHB)",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nDigisafe in/out message identifier error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "B0  (CHA)",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nDigisafe input check max number of modules error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "B1",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nDigisafe input check message module type error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "B2",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nDigisafe input message module number error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "B3",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nDigisafe input check message last module pointer error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "B4  (CHB)",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nDigisafe input check SSI-SSI message identifier error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "B5",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nDigisafe module number error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "B6  (CHB)",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nDigisafe decoder last module pointer error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "B7  (CHB)",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nDigisafe decoder module local port error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "B8  (CHB)",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nDigisafe decoder message byte number error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "B9  (CHB)",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nDigisafe decoder message bit number error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "BA  (CHB)",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nDigisafe decoder module mapping error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "BB",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nDigisafe Module Type error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "BC  (CHA)",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nDigisafe SSI-SSI bad message identifier\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "BD  (CHA)",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nDigisafe message module type error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "BE  (CHB)",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nDigisafe decoder SSI-SSI message identifier error\n\n\uD835\uDC00\uD835\uDC02\uD835\uDC13\uD835\uDC08\uD835\uDC0E\uD835\uDC0D:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "BF",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nDigisafe decoder message module type error\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "C1",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nCycle min configured in CED is not in range\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nConfigure a valid value and reload application data AB into PM backplane memory"
            )
        )

        mList.add(
            LanguageData(
                "FE",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nNon-vital transference timeout\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )

        mList.add(
            LanguageData(
                "FF",
                R.drawable.error,
                "𝐅𝐀𝐔𝐋𝐓 𝐃𝐄𝐒𝐂𝐑𝐈𝐏𝐓𝐈𝐎𝐍:\nVital transference timeout\n\n𝐀𝐂𝐓𝐈𝐎𝐍:\nReplace the PM board"
            )
        )


    }
}
