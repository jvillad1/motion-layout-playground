package com.jvillad1.motionlayoutplayground.ui.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Data class for Character UI model.
 */
@Parcelize
data class CharacterUI(
    val name: String,
    val birthYear: String,
    val gender: String
) : Parcelable
