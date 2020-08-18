package com.jvillad1.motionlayoutplayground.ui.swipe.epoxy

import com.airbnb.epoxy.TypedEpoxyController
import com.jvillad1.motionlayoutplayground.ui.swipe.model.CharacterUI

class CharactersController() : TypedEpoxyController<List<CharacterUI>>() {

    override fun buildModels(characters: List<CharacterUI>) {
        if (characters.isNotEmpty()) {
            characters.forEach {
                characterItem {
                    id(it.name)
                    characterUI(it)
                }
            }
        }
    }
}
