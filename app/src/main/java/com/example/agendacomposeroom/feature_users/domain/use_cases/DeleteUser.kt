package com.example.agendacomposeroom.feature_users.domain.use_cases

import com.example.agendacomposeroom.feature_users.domain.model.User
import com.example.agendacomposeroom.feature_users.domain.repository.UserRepository
import javax.inject.Inject

class DeleteUser @Inject constructor(
    private val repository: UserRepository
) {
    suspend operator fun invoke(user: User) {
        repository.deleteUser(user)
    }
}