package com.scorpapede.mbom.handler

import com.scorpapede.mbom.speach.HENRY_HENRY
import com.scorpapede.mbom.speach.ITS_ME
import com.scorpapede.mbom.speach.I_REALLY_LIKE_ME
import com.scorpapede.mbom.speach.MAYBE_ITS_YOU

class CoolestKidIntentHandler : BaseMonsterIntentHandler(
    "CoolestKidIntent",
    arrayListOf(
        HENRY_HENRY,
        MAYBE_ITS_YOU,
        ITS_ME,
        I_REALLY_LIKE_ME
    )
)