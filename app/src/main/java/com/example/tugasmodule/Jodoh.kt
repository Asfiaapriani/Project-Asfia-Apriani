package com.example.tugasmodule

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Jodoh(
    val imgJodoh: Int,
    val nameJodoh: String,
    val descJodoh: String
): Parcelable
