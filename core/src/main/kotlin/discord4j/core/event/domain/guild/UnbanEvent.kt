package discord4j.core.event.domain.guild

import discord4j.core.`object`.entity.Guild
import discord4j.core.await


suspend fun UnbanEvent.awaitGuild(): Guild = guild.await()
