package com.scorpapede.mbom.handler

import com.scorpapede.mbom.speach.*

class DoYouPlayFortniteIntentHandler : BaseMonsterIntentHandler(
    "DoYouPlayFortniteIntent",
    arrayListOf(
        ARE_YOU_BUSY_TONIGHT,
        IN_IT_FOR_THE_DANCING,
        ONLY_IN_PLAYGROUND_MODE,
        READ_A_BOOK,
        YEAH_NO,
        YOU_GOT_TIME_TO_LEAN
    )
)