package com.scorpapede.mbom.handler

import com.amazon.ask.dispatcher.request.handler.HandlerInput
import com.amazon.ask.dispatcher.request.handler.RequestHandler
import com.amazon.ask.model.Response
import com.amazon.ask.request.Predicates.intentName
import com.scorpapede.mbom.speach.speak
import java.util.*

private val RESPONSES = arrayListOf(
    "https://s3.amazonaws.com/sleb-mbom-audio/henry-henry_1.mp3",
    "https://s3.amazonaws.com/sleb-mbom-audio/maybe-its-you_1.mp3"
)

class CoolestKidIntentHandler : RequestHandler {
    override fun canHandle(input: HandlerInput): Boolean =
        input.matches(intentName("CoolestKidIntent"))

    override fun handle(input: HandlerInput): Optional<Response> =
        input.responseBuilder
            .withSpeech(
                speak {
                    audio { src = RESPONSES.random() }
                }.toString()
            )
            .withShouldEndSession(true)
            .build()
}