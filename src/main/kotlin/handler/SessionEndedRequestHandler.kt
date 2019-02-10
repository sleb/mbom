package com.scorpapede.mbom.handler

import com.amazon.ask.dispatcher.request.handler.HandlerInput
import com.amazon.ask.dispatcher.request.handler.RequestHandler
import com.amazon.ask.model.Response
import com.amazon.ask.model.SessionEndedRequest
import com.amazon.ask.request.Predicates
import java.util.*

class SessionEndedRequestHandler : RequestHandler {
    override fun canHandle(input: HandlerInput): Boolean =
        input.matches(Predicates.requestType(SessionEndedRequest::class.java))

    override fun handle(input: HandlerInput): Optional<Response> =
        input.responseBuilder
            .withSpeech("bye")
            .build()
}