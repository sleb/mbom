package com.scorpapede.mbom.handler

import com.amazon.ask.dispatcher.request.handler.HandlerInput
import com.amazon.ask.dispatcher.request.handler.RequestHandler
import com.amazon.ask.model.LaunchRequest
import com.amazon.ask.model.Response
import com.amazon.ask.request.Predicates
import com.scorpapede.mbom.speach.*
import com.scorpapede.mbom.speech.*
import java.util.*

private val PRELUDES = arrayListOf(
    """Welcome to Henry's <emphasis level="moderate">monster book of monsters</emphasis>"""
)

private val GREETINGS = arrayListOf(
    ASK_ME_ANYTHING,
    CHAPSTICK,
    STICK_OF_GUM,
    SEA_OTTERS_ROCK,
    MMM_FINGERS,
    MAHAH_MANAH,
    I_NEED_A_SNACK,
    I_HATE_SNOW,
    HOWS_IT_GOING,
    COME_CLOSER
)

class LaunchRequestHandler : RequestHandler {
    override fun canHandle(input: HandlerInput): Boolean =
        input.matches(Predicates.requestType(LaunchRequest::class.java))

    override fun handle(input: HandlerInput): Optional<Response> = input.responseBuilder
        .withSpeech(
            speak {
                p { +PRELUDES.random() }
                p {
                    audio { src = GREETINGS.random() }
                }
                p { +HINTS.random() }
            }.toString())
        .withReprompt(speak { +HINTS.random() }.toString())
        .build()
}