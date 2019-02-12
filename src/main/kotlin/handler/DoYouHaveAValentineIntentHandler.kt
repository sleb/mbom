package com.scorpapede.mbom.handler

import com.scorpapede.mbom.speach.ARE_YOU_BUSY_TONIGHT
import com.scorpapede.mbom.speach.COME_CLOSER
import com.scorpapede.mbom.speach.MAYBE_ITS_YOU
import com.scorpapede.mbom.speach.YEAH_NO

class DoYouHaveAValentineIntentHandler : BaseMonsterIntentHandler(
    "DoYouHaveAValentineIntent",
    arrayListOf(
        ARE_YOU_BUSY_TONIGHT,
        COME_CLOSER,
        MAYBE_ITS_YOU,
        YEAH_NO
    )
)