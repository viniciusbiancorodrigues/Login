package model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
 data class Model (
        val description:String,
        val title:String,
        val urlToImage:String
        ):Parcelable