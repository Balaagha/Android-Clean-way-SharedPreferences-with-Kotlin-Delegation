package com.example.androidimpltemplate.manager.sharedprefs

import android.content.Context
import android.content.SharedPreferences
import com.example.androidimpltemplate.sharedApplicationContext

private const val PREF_NAME = "defaultSharedPrefs"

object DefaultSharedPrefs : SharedPreferences by sharedApplicationContext.getSharedPreferences(
    PREF_NAME, Context.MODE_PRIVATE
)
