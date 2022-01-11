package com.example.agendacomposeroom.presentation.edit.home

import com.example.agendacomposeroom.feature_users.domain.model.User

sealed class HomeEvent {
    data class DeleteUser(val user: User): HomeEvent()
}