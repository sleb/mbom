package com.scorpapede.mbom.handler

import com.scorpapede.mbom.speech.IS_SWAMP_A_COLOR
import com.scorpapede.mbom.speech.YEAH_NO

class FavoriteColorIntentHandler : BaseMonsterIntentHandler(
    "FavoriteColorIntent",
    arrayListOf(
        IS_SWAMP_A_COLOR,
        YEAH_NO
    )
)