package com.scorpapede.mbom.handler

import com.scorpapede.mbom.speach.ITS_ME
import com.scorpapede.mbom.speach.I_REALLY_LIKE_ME

class WhatIsYourFavoriteBookIntentHandler : BaseMonsterIntentHandler(
    "WhatIsYourFavoriteBookIntent",
    arrayListOf(
        I_REALLY_LIKE_ME,
        ITS_ME
    )
)