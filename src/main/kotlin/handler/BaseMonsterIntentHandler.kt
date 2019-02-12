package com.scorpapede.mbom.handler

import com.amazon.ask.dispatcher.request.handler.HandlerInput
import com.amazon.ask.dispatcher.request.handler.RequestHandler
import com.amazon.ask.model.Response
import com.amazon.ask.request.Predicates.intentName
import com.scorpapede.mbom.speach.HINTS
import com.scorpapede.mbom.speach.MMM_FINGERS
import com.scorpapede.mbom.speach.speak
import java.util.*

abstract class BaseMonsterIntentHandler(
    private val intent: String,
    private val responses: List<String>
) : RequestHandler {

    override fun canHandle(input: HandlerInput): Boolean =
        input.matches(intentName(intent))

    override fun handle(input: HandlerInput): Optional<Response> =
        input.responseBuilder
            .withSpeech(
                speak {
                    audio { src = responses.random() }
                }.toString()
            )
            .withShouldEndSession(false)
            .withReprompt(speak { +HINTS.random() }.toString())
            .build()
}