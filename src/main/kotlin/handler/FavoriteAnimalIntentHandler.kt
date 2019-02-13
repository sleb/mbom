package com.scorpapede.mbom.handler

import com.scorpapede.mbom.speech.ARAGOG_IS_COOL
import com.scorpapede.mbom.speech.BLAST_ENDED_SKREWTS

class FavoriteAnimalIntentHandler : BaseMonsterIntentHandler (
    "FavoriteAnimalIntent",
    arrayListOf(
        BLAST_ENDED_SKREWTS,
        ARAGOG_IS_COOL
    )
){
}