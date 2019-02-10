package com.scorpapede.mbom.handler

import com.amazon.ask.dispatcher.request.handler.HandlerInput
import com.amazon.ask.dispatcher.request.handler.RequestHandler
import com.amazon.ask.model.LaunchRequest
import com.amazon.ask.model.Response
import com.amazon.ask.request.Predicates
import com.scorpapede.mbom.speach.HINTS
import com.scorpapede.mbom.speach.speak
import java.util.*

private val PRELUDES = arrayListOf(
    """Welcome to Henry's <emphasis level="moderate">monster book of monsters</emphasis>"""
)

private val GREETINGS = arrayListOf(
    "https://s3.amazonaws.com/sleb-mbom-audio/hey-there_1.mp3"
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

fun main() {
    println("""<speak><p>${PRELUDES.random()}</p><p>${HINTS.random()}<p><audio src="https://s3.amazonaws.com/sleb-mbom-audio/hey-there.mp3"/></p></speak>""")
}