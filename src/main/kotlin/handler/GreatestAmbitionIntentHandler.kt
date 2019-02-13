package com.scorpapede.mbom.handler

import com.scorpapede.mbom.speech.BOOK_REPORT_ON_ME
import com.scorpapede.mbom.speech.READING_RAINBOW
import com.scorpapede.mbom.speech.TO_BE_FREE_FROM_BELT

class GreatestAmbitionIntentHandler : BaseMonsterIntentHandler(
    "GreatestAmbitionIntent",
    arrayListOf(
        BOOK_REPORT_ON_ME,
        READING_RAINBOW,
        TO_BE_FREE_FROM_BELT
    )
) {
}