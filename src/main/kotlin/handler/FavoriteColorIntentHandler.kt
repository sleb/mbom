package com.scorpapede.mbom.handler

import com.scorpapede.mbom.speech.IS_SWAMP_A_COLOR

class FavoriteColorIntentHandler : BaseMonsterIntentHandler(
    "FavoriteColorIntent",
    arrayListOf(
        IS_SWAMP_A_COLOR
    )
)