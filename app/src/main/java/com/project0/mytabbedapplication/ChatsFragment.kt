package com.project0.mytabbedapplication

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class ChatsFragment : Fragment() {
    var my_chats:ListView? = null

    companion object {
        fun newInstance() = ChatsFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var root: View = inflater.inflate(R.layout.chats_fragment, container, false)
        my_chats = root.findViewById(R.id.mListChats)
        my_chats!!.setOnItemClickListener(AdapterView.OnItemClickListener { parent, view, position, id ->
            var name = parent.getItemAtPosition(position).toString()
            Toast.makeText(context,name+"clicked",Toast.LENGTH_LONG).show()
        })
        return root
    }

}