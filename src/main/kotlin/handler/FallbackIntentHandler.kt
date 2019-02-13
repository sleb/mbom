package com.scorpapede.mbom.handler

import com.amazon.ask.dispatcher.request.handler.HandlerInput
import com.amazon.ask.dispatcher.request.handler.RequestHandler
import com.amazon.ask.model.Response
import com.amazon.ask.request.Predicates.intentName
import com.scorpapede.mbom.speach.*
import com.scorpapede.mbom.speech.CUMANA_WHAT_NOW
import com.scorpapede.mbom.speech.ENUNCIATE
import com.scorpapede.mbom.speech.YOURE_MUMBLING
import java.util.*

private val PRELUDES = arrayListOf(
    YOURE_MUMBLING,
    ENUNCIATE,
    CUMANA_WHAT_NOW
)

class FallbackIntentHandler : RequestHandler {
    override fun canHandle(input: HandlerInput): Boolean =
        input.matches(intentName("AMAZON.FallbackIntent"))

    override fun handle(input: HandlerInput): Optional<Response> {
        return input.responseBuilder
            .withSpeech(
                speak {
                    audio { src = PRELUDES.random() }
                    p { +HINTS.random() }
                }.toString()
            )
            .withReprompt(speak { +HINTS.random() }.toString())
            .build()
    }
}