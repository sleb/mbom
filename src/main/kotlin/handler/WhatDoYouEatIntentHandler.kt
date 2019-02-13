package com.scorpapede.mbom.handler

import com.scorpapede.mbom.speech.BLAST_ENDED_SKREWTS
import com.scorpapede.mbom.speech.COME_CLOSER
import com.scorpapede.mbom.speech.HUMANS_EH_PAPER
import com.scorpapede.mbom.speech.MMM_FINGERS

class WhatDoYouEatIntentHandler : BaseMonsterIntentHandler(
    "WhatDoYouEatIntent",
    arrayListOf(
        BLAST_ENDED_SKREWTS,
        COME_CLOSER,
        HUMANS_EH_PAPER,
        MMM_FINGERS
    )
)