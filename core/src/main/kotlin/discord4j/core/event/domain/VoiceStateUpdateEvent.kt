package discord4j.core.event.domain

import discord4j.core.`object`.VoiceState
import discord4j.core.grab


fun VoiceStateUpdateEvent.nullableOld(): VoiceState? = old.grab()
