package com.imc.login

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
 data class Model (
        val id:String,
        val name:String,
        val avatar:String
        ):Parcelable