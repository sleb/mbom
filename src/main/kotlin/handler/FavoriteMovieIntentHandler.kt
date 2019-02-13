package com.scorpapede.mbom.handler

import com.scorpapede.mbom.speech.FROZEN
import com.scorpapede.mbom.speech.YOU_TUBE

class FavoriteMovieIntentHandler : BaseMonsterIntentHandler(
    "FavoriteMovieIntent",
    arrayListOf(
        FROZEN,
        YOU_TUBE
    )
)