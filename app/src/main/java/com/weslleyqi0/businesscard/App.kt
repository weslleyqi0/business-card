package com.weslleyqi0.businesscard

import android.app.Application
import com.weslleyqi0.businesscard.data.AppDatabase
import com.weslleyqi0.businesscard.data.BusinessCardRepository

class App : Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}