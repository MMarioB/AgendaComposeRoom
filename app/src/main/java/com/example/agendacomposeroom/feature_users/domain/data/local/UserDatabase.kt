package com.example.agendacomposeroom.feature_users.domain.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.agendacomposeroom.feature_users.domain.data.local.dao.UserDao
import com.example.agendacomposeroom.feature_users.domain.model.User


@Database(
    entities = [User::class],
    version = 1,
    exportSchema = false
)
abstract class UserDatabase: RoomDatabase() {
    abstract val userDao: UserDao
}