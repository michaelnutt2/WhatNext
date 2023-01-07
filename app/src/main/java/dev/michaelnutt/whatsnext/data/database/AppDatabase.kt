/**
 * Created by: Michael Nutt
 * Last Modified: 2023/01/07
 */
package dev.michaelnutt.whatsnext.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import dev.michaelnutt.whatsnext.data.database.games.Game

@Database(entities = [Game::class], version=1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    private val TAG = "AppDatabase"

    abstract fun gamesDao(): GamesDao
}