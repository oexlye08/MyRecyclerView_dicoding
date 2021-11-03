package id.my.okisulton.myrecyclerview

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
 *Created by Oki Sulton on 03/11/21.
 **/
@Parcelize
data class Hero(
    var name: String,
    var description: String,
    var photo: String
) : Parcelable
