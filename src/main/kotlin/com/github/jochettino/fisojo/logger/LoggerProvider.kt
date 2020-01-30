package com.github.jochettino.fisojo.logger

import org.apache.logging.log4j.Level
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.core.config.Configurator

/**
 * Class for providing the logger
 */
class LoggerProvider {

    init {
        Configurator.setLevel(LogManager.getRootLogger().name, Level.ERROR)
    }

    fun setDefaultLevel(newLevel: Level) {
        Configurator.setLevel(LogManager.getRootLogger().name, newLevel)
    }

    fun getLogger(name: String) = LogManager.getLogger(name)!!

    companion object {
        const val MAIN_LOGGER = "main"
    }
}