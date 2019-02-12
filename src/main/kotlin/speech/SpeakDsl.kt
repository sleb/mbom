package com.scorpapede.mbom.speach

interface Element {
    fun render(builder: StringBuilder)
}

class TextElement(private val text: String) : Element {
    override fun render(builder: StringBuilder) {
        builder.append(text)
    }
}

abstract class Tag(private val name: String) : Element {
    internal val children = arrayListOf<Element>()
    internal val attributes = hashMapOf<String, String>()

    protected fun <T : Element> initTag(tag: T, init: T.() -> Unit): T {
        tag.init()
        children.add(tag)
        return tag
    }

    override fun render(builder: StringBuilder) {
        builder.append("<$name")
        renderAttributes(builder)
        if (children.isEmpty()) {
            builder.append("/>")
        } else {
            builder.append(">")
            for (child in children) {
                child.render(builder)
            }
            builder.append("</$name>")
        }
    }

    private fun renderAttributes(builder: StringBuilder) {
        for ((k, v) in attributes) {
            builder.append(""" $k="$v"""")
        }
    }

    override fun toString(): String {
        val builder = StringBuilder()
        render(builder)
        return builder.toString()
    }
}

abstract class TagWithText(name: String) : Tag(name) {
    operator fun String.unaryPlus() {
        children.add(TextElement(this))
    }
}

abstract class SpeakTag(name: String) : TagWithText(name) {
    fun p(init: P.() -> Unit) = initTag(P(), init)
    fun audio(init: Audio.() -> Unit) = initTag(Audio(), init)
}

class Speak : SpeakTag("speak")
class P : SpeakTag("p")
class Audio : Tag("audio") {
    var src: String
        get() = attributes["src"]!!
        set(value) { attributes["src"] = value }
}

fun speak(init: Speak.() -> Unit): SpeakTag {
    val speak = Speak()
    speak.init()
    return speak
}
