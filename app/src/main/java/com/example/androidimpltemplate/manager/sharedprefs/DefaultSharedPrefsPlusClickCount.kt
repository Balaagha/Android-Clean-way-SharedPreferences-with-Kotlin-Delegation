package com.example.androidimpltemplate.manager.sharedprefs

import androidx.core.content.edit

private const val PREF_CLICK_COUNT = "prefClickCount"

var DefaultSharedPrefs.clickCount: Int
    get() = getInt(PREF_CLICK_COUNT, 0)
    set(value) = edit {
        putInt(PREF_CLICK_COUNT, value)
    }
