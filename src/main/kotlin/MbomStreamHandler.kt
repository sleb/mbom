package com.scorpapede.mbom

import com.amazon.ask.Skill
import com.amazon.ask.SkillStreamHandler
import com.amazon.ask.Skills
import com.scorpapede.mbom.handler.*

class MbomStreamHandler : SkillStreamHandler(getSkill())

fun getSkill(): Skill =
    Skills.standard()
        .addRequestHandlers(
            BestFriendIntentHandler(),
            CoolestKidIntentHandler(),
            DoYouHaveAValentineIntentHandler(),
            DoYouPlayFortniteIntentHandler(),
            FallbackIntentHandler(),
            FavoriteAnimalIntentHandler(),
            FavoriteColorIntentHandler(),
            FavoriteMovieIntentHandler(),
            FavoriteSongIntentHandler(),
            GreatestAmbitionIntentHandler(),
            HelpIntentHandler(),
            LaunchRequestHandler(),
            PrincipalsOfficeIntentHandler(),
            SessionEndedRequestHandler(),
            StopHandler(),
            WhatDoYouEatIntentHandler(),
            WhatIsYourFavoriteBookIntentHandler(),
            WordsOfWisdomIntentHandler()
        )
        .withSkillId("amzn1.ask.skill.0794c498-bde4-41cc-8f68-afd42e2c4b75")
        .build()
