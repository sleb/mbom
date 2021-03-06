package com.scorpapede.mbom.handler

import com.amazon.ask.dispatcher.request.handler.HandlerInput
import com.amazon.ask.dispatcher.request.handler.RequestHandler
import com.amazon.ask.model.Response
import com.amazon.ask.request.Predicates.intentName
import com.scorpapede.mbom.speach.speak
import java.util.*

private val RESPONSES = arrayListOf(
    "Ok, see you",
    "Bye",
    "Until next time",
    "You'll be back"
)

class StopHandler : RequestHandler {
    override fun canHandle(input: HandlerInput): Boolean =
        input.matches(intentName("AMAZON.StopIntent")
            .or(intentName("AMAZON.CancelIntent")))

    override fun handle(input: HandlerInput): Optional<Response> =
        input.responseBuilder
            .withSpeech(speak { +RESPONSES.random() }.toString())
            .withShouldEndSession(true)
            .build()
}