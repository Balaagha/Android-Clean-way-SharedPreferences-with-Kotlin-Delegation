package com.example.androidimpltemplate.manager.sharedprefs

import android.content.Context
import android.content.SharedPreferences
import com.example.androidimpltemplate.sharedApplicationContext

@Deprecated(message = "Use delegation instead!")
object BadDefaultSharedPrefs : SharedPreferences {

    private const val PREF_NAME = "defaultSharedPrefs"

    private val prefs = sharedApplicationContext.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)

    override fun getAll(): MutableMap<String, *> {
        return prefs.all
    }

    override fun getString(p0: String?, p1: String?): String? {
        return getString(p0, p1)
    }

    override fun getStringSet(p0: String?, p1: MutableSet<String>?): MutableSet<String>? {
        return getStringSet(p0, p1)
    }

    override fun getInt(p0: String?, p1: Int): Int {
        return getInt(p0, p1)
    }

    override fun getLong(p0: String?, p1: Long): Long {
        return getLong(p0, p1)
    }

    override fun getFloat(p0: String?, p1: Float): Float {
        return getFloat(p0, p1)
    }

    override fun getBoolean(p0: String?, p1: Boolean): Boolean {
        return getBoolean(p0, p1)
    }

    override fun contains(p0: String?): Boolean {
        return contains(p0)
    }

    override fun edit(): SharedPreferences.Editor {
        return edit()
    }

    override fun registerOnSharedPreferenceChangeListener(p0: SharedPreferences.OnSharedPreferenceChangeListener?) {
        registerOnSharedPreferenceChangeListener(p0)
    }

    override fun unregisterOnSharedPreferenceChangeListener(p0: SharedPreferences.OnSharedPreferenceChangeListener?) {
        unregisterOnSharedPreferenceChangeListener(p0)
    }
}
