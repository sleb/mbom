package com.scorpapede.mbom.handler

import com.scorpapede.mbom.speach.THE_PRINCIPAL_COMES_TO_MY_OFFICE
import com.scorpapede.mbom.speach.YEAH_NO

class PrincipalsOfficeIntentHandler : BaseMonsterIntentHandler(
    "PrincipalsOfficeIntent",
    arrayListOf(
        YEAH_NO,
        THE_PRINCIPAL_COMES_TO_MY_OFFICE
    )
)