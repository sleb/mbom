package com.scorpapede.mbom.handler

import com.scorpapede.mbom.speech.ITS_ME
import com.scorpapede.mbom.speech.I_REALLY_LIKE_ME

class WhatIsYourFavoriteBookIntentHandler : BaseMonsterIntentHandler(
    "WhatIsYourFavoriteBookIntent",
    arrayListOf(
        I_REALLY_LIKE_ME,
        ITS_ME
    )
)