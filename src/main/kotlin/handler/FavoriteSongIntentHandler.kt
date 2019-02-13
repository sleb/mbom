package com.scorpapede.mbom.handler

import com.scorpapede.mbom.speech.FROZEN
import com.scorpapede.mbom.speech.MAHAH_MANAH

class FavoriteSongIntentHandler : BaseMonsterIntentHandler(
    "FavoriteSongIntent",
    arrayListOf(
        FROZEN,
        MAHAH_MANAH
    )
)