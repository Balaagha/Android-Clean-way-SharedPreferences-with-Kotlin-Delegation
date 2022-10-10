package com.example.androidimpltemplate

import android.app.Application
import android.content.Context
import androidx.core.app.NotificationManagerCompat
import com.example.androidimpltemplate.manager.network.NetworkStatusListenerHelper
import com.example.androidimpltemplate.manager.notfication.NotificationHelper
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

val sharedApplicationContext: Context get() = sharedApplicationContextBackingProperty
    ?: throw IllegalStateException(
        "Application context not initialized yet."
    )
private var sharedApplicationContextBackingProperty: Context? = null


@HiltAndroidApp
class MyApplication : Application() {
    @Inject
    lateinit var networkStatusListenerHelper: NetworkStatusListenerHelper

    override fun onCreate() {
        super.onCreate()
        NotificationHelper.createNotificationChannel(
            this,
            NotificationManagerCompat.IMPORTANCE_DEFAULT, false,
            getString(R.string.app_name), "App notification channel."
        )

        sharedApplicationContextBackingProperty = applicationContext
        networkStatusListenerHelper.init()
    }
}