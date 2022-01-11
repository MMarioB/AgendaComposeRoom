package com.example.agendacomposeroom.feature_users.domain.use_cases

import com.example.agendacomposeroom.feature_users.domain.model.User
import com.example.agendacomposeroom.feature_users.domain.repository.UserRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetUsers @Inject constructor(
    private val repository: UserRepository
) {
    operator fun invoke(): Flow<List<User>> {
        return repository.getUsers()
    }
}