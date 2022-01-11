package com.example.agendacomposeroom.presentation.edit.home

import com.example.agendacomposeroom.feature_users.domain.model.User

data class HomeState(
    val users: List<User> = emptyList()
)