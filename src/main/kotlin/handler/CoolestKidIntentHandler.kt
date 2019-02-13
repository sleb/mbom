package com.scorpapede.mbom.handler

import com.scorpapede.mbom.speech.HENRY_HENRY
import com.scorpapede.mbom.speech.ITS_ME
import com.scorpapede.mbom.speech.I_REALLY_LIKE_ME
import com.scorpapede.mbom.speech.MAYBE_ITS_YOU

class CoolestKidIntentHandler : BaseMonsterIntentHandler(
    "CoolestKidIntent",
    arrayListOf(
        HENRY_HENRY,
        MAYBE_ITS_YOU,
        ITS_ME,
        I_REALLY_LIKE_ME
    )
)