package com.example.androidimpltemplate.menu.itemsenum

enum class MenuItemsEnum(name: String) {

    MAIN_ACTIVITY("Main Activity Example"),
    SHARED_PREF_WITH_DELEGATION("Shared Pref with delegation example"),
    ;


    private var mName: String? = null

    init {
        mName = name
    }

    fun getMenuItemName(): String? {
        return mName
    }

}
