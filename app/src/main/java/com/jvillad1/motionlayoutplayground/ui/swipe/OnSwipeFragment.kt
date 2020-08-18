package com.jvillad1.motionlayoutplayground.ui.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.jvillad1.motionlayoutplayground.R
import kotlinx.android.synthetic.main.fragment_on_swipe.*

class OnSwipeFragment : Fragment(R.layout.fragment_on_swipe) {

    // Epoxy controller
    private val charactersController: CharactersController by lazy { CharactersController(this) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

    private fun setupRecyclerView() = charactersRecyclerView.apply {
        layoutManager = LinearLayoutManager(context)
        setController(charactersController)
        charactersController.setData(SearchDataWrapper(showSearchInfoCard = true))
    }
}
