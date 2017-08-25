package app.model

import java.util.concurrent.atomic.AtomicLong

data class Customer(val firstName: String,
                    val lastName: String,
                    val address: String,
                    val dateOfBirth: String,
                    val phoneNumber: AtomicLong
                    )