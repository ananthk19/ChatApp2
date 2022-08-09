package com.example.chatapp2

import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties
data class User(val name: String? = null, val email: String? = null) {
    // Null default values create a no-argument default constructor, which is needed
    // for deserialization from a DataSnapshot.
}