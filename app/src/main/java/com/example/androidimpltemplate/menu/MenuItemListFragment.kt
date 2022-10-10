package com.example.androidimpltemplate.menu

import android.content.Intent
import com.example.androidimpltemplate.R
import com.example.androidimpltemplate.base.BaseFragment
import com.example.androidimpltemplate.databinding.FragmentMenuItemListBinding
import com.example.androidimpltemplate.menu.adapter.MenuItemsArrayAdapter
import com.example.androidimpltemplate.menu.itemsenum.MenuItemsEnum
import com.example.androidimpltemplate.ui.ExampleFragment
import com.example.androidimpltemplate.ui.MainActivity
import com.example.androidimpltemplate.utils.extentions.navigateToTargetFragment

class MenuItemListFragment :
    BaseFragment<FragmentMenuItemListBinding>(FragmentMenuItemListBinding::inflate),
    MenuItemsArrayAdapter.Listener {

    override var statusBarVisibility: Boolean? = true

    private lateinit var mAdapterScreensReachableFromMenu: MenuItemsArrayAdapter

    override fun setup() {
        initMenuAdapter()
    }

    private fun initMenuAdapter() {
        mAdapterScreensReachableFromMenu =
            MenuItemsArrayAdapter(requireContext(), MenuItemsEnum.values(), this)
        binding.listScreens.adapter = mAdapterScreensReachableFromMenu
    }

    override fun onMenuItemClicked(menuItem: MenuItemsEnum?) {
        when (menuItem) {
            MenuItemsEnum.MAIN_ACTIVITY -> {
                startActivity(Intent(requireContext(), MainActivity::class.java))
            }
            MenuItemsEnum.SHARED_PREF_WITH_DELEGATION -> {
                this.navigateToTargetFragment(containerId = R.id.navHostFragment, ExampleFragment.newInstance())
            }
            else -> {}
        }
    }
}