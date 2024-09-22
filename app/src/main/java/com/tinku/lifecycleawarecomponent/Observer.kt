package com.tinku.lifecycleawarecomponent

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

class Observer : DefaultLifecycleObserver {

    override fun onCreate(owner: LifecycleOwner) {
        Log.d("Main", "ob- onCreate")
    }

}