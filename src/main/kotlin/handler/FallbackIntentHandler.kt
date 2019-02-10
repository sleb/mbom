package com.scorpapede.mbom.handler

import com.amazon.ask.dispatcher.request.handler.HandlerInput
import com.amazon.ask.dispatcher.request.handler.RequestHandler
import com.amazon.ask.model.Response
import com.amazon.ask.request.Predicates.intentName
import com.scorpapede.mbom.speach.HINTS
import com.scorpapede.mbom.speach.speak
import java.util.*

private val PRELUDES = arrayListOf(
    "Sorry, I didn't understand that",
    "Sorry, that didn't make any sense to me"
)

class FallbackIntentHandler : RequestHandler {
    override fun canHandle(input: HandlerInput): Boolean =
        input.matches(intentName("AMAZON.FallbackIntent"))

    override fun handle(input: HandlerInput): Optional<Response> {
        return input.responseBuilder
            .withSpeech(
                speak {
                    p { +PRELUDES.random() }
                    p { +HINTS.random() }
                }.toString()
            )
            .withReprompt(speak { +HINTS.random() }.toString())
            .build()
    }
}