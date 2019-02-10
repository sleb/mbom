package com.scorpapede.mbom.handler

import com.amazon.ask.dispatcher.request.handler.HandlerInput
import com.amazon.ask.dispatcher.request.handler.RequestHandler
import com.amazon.ask.model.Response
import com.amazon.ask.request.Predicates.intentName
import com.scorpapede.mbom.speach.HINTS
import com.scorpapede.mbom.speach.speak
import java.util.*

private val PRELUDES = arrayListOf(
    """This is the <emphasis level="moderate">monster book of monsters</emphasis>""",
    """You're speaking to Henry's <emphasis level="moderate">monster book of monsters</emphasis>""",
    """You don't need to be scared of Henry's <emphasis level="moderate">monster book of monsters</emphasis>"""
)

class HelpIntentHandler : RequestHandler {
    override fun canHandle(input: HandlerInput): Boolean =
        input.matches(intentName("AMAZON.HelpIntent"))

    override fun handle(input: HandlerInput): Optional<Response> = input.responseBuilder
        .withSpeech(
            speak {
                p { +PRELUDES.random() }
                p { +HINTS.random() }
            }.toString()
        )
        .withReprompt(speak { +HINTS.random() }.toString())
        .withShouldEndSession(false)
        .build()
}