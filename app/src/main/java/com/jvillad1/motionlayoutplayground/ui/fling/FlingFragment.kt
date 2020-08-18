package com.jvillad1.motionlayoutplayground.ui.fling

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.jvillad1.motionlayoutplayground.R
import com.jvillad1.motionlayoutplayground.data.charactersList
import com.jvillad1.motionlayoutplayground.ui.epoxy.CharactersController
import kotlinx.android.synthetic.main.fragment_fling.*
import kotlinx.android.synthetic.main.layout_video_container.*

class FlingFragment : Fragment(R.layout.fragment_fling) {

    // Epoxy controller
    private val charactersController: CharactersController by lazy { CharactersController() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupRecyclerView()
        charactersRecyclerView.onFlingListener = RecyclerViewSwipeListener(true, object : RecyclerViewSwipeListener.OnSwipeListener {
            override fun onSwipeUp() {
                constraintLayout.transitionToEnd()
            }

            override fun onSwipeDown() {
                constraintLayout.transitionToStart()
            }
        })
    }

    private fun setupRecyclerView() = charactersRecyclerView.apply {
        layoutManager = LinearLayoutManager(context)
        setController(charactersController)
        charactersController.setData(charactersList)
    }
}
