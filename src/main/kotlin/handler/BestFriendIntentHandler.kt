package com.scorpapede.mbom.handler

import com.scorpapede.mbom.speech.ARAGOG_IS_COOL
import com.scorpapede.mbom.speech.BEAST
import com.scorpapede.mbom.speech.MAYBE_ITS_YOU

class BestFriendIntentHandler : BaseMonsterIntentHandler(
    "BestFriendIntent",
    arrayListOf(
        ARAGOG_IS_COOL,
        BEAST,
        MAYBE_ITS_YOU
    )
)