package com.jvillad1.motionlayoutplayground.ui.swipe.epoxy

import android.widget.TextView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.jvillad1.motionlayoutplayground.R
import com.jvillad1.motionlayoutplayground.ui.swipe.epoxy.CharacterItemModel.CharacterHolder
import com.jvillad1.motionlayoutplayground.ui.swipe.model.CharacterUI

/**
 * EpoxyModelClass for the Character list.
 *
 * @author juan.villada
 */
@EpoxyModelClass(layout = R.layout.item_character)
abstract class CharacterItemModel : EpoxyModelWithHolder<CharacterHolder>() {

    @EpoxyAttribute
    lateinit var characterUI: CharacterUI

    @ExperimentalStdlibApi
    override fun bind(holder: CharacterHolder) = with(holder) {
        characterNameTextView.text = characterUI.name
        characterBirthYearTextView.text =
            characterBirthYearTextView.context.getString(R.string.character_search_birth_year, characterUI.birthYear)
        characterGenderTextView.text =
            characterGenderTextView.context.getString(R.string.character_search_gender, characterUI.gender)
    }

    class CharacterHolder : KotlinEpoxyHolder() {
        val characterNameTextView by bind<TextView>(R.id.characterNameTextView)
        val characterBirthYearTextView by bind<TextView>(R.id.characterBirthYearTextView)
        val characterGenderTextView by bind<TextView>(R.id.characterGenderTextView)
    }
}
