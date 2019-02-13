package com.scorpapede.mbom.handler

import com.scorpapede.mbom.speech.ARE_YOU_BUSY_TONIGHT
import com.scorpapede.mbom.speech.MAYBE_ITS_YOU
import com.scorpapede.mbom.speech.YEAH_NO

class DoYouHaveAValentineIntentHandler : BaseMonsterIntentHandler(
    "DoYouHaveAValentineIntent",
    arrayListOf(
        ARE_YOU_BUSY_TONIGHT,
        MAYBE_ITS_YOU,
        YEAH_NO
    )
)