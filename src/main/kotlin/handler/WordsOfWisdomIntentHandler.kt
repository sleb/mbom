package com.scorpapede.mbom.handler

import com.scorpapede.mbom.speech.*

class WordsOfWisdomIntentHandler : BaseMonsterIntentHandler(
    "WordsOfWisdomIntent",
    arrayListOf(
        AWESOMESAUSE,
        YOU_GOT_THIS,
        YOU_CAN_DO_IT,
        SHAKE_SOME_PEPPER,
        SAFE_RESPECTFUL_RESPONSIBLE
    )
)