package com.example.chatapp2

import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties
data class Message (val message: String? = null, val senderId: String? = null){}