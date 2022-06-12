package com.roundtofu.traditional_market.models

class ChatMessage(
        val id: String,
        val text: String,
        val fromId: String,
        val toId: String,
        val timestamp: Long
) {
    constructor() : this("", "", "", "", -1)
}