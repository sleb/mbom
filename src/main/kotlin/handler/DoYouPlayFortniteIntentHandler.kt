package com.scorpapede.mbom.handler

import com.scorpapede.mbom.speech.*

class DoYouPlayFortniteIntentHandler : BaseMonsterIntentHandler(
    "DoYouPlayFortniteIntent",
    arrayListOf(
        IN_IT_FOR_THE_DANCING,
        ONLY_IN_PLAYGROUND_MODE,
        READ_A_BOOK,
        YEAH_NO,
        YOU_GOT_TIME_TO_LEAN
    )
)