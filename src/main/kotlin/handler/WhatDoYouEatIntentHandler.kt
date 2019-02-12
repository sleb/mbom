package com.scorpapede.mbom.handler

import com.scorpapede.mbom.speach.BLAST_ENDED_SKREWTS
import com.scorpapede.mbom.speach.COME_CLOSER
import com.scorpapede.mbom.speach.HUMANS_EH_PAPER
import com.scorpapede.mbom.speach.MMM_FINGERS

class WhatDoYouEatIntentHandler : BaseMonsterIntentHandler(
    "WhatDoYouEatIntent",
    arrayListOf(
        BLAST_ENDED_SKREWTS,
        COME_CLOSER,
        HUMANS_EH_PAPER,
        MMM_FINGERS
    )
)