/**
 * Created by: Michael Nutt
 * Last Modified: 2023/01/07
 */
package dev.michaelnutt.whatsnext.data.database.games

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

/**
 * Interface class used to work with the games table in the database
 */
@Dao
interface GamesDao {
    /**
     * Method to insert given [Game] into the database
     */
    @Insert(onConflict=OnConflictStrategy.IGNORE)
    suspend fun insert(game: Game)

    /**
     * Method to update a given [Game] in the database, replacing with provided Game object
     */
    @Update
    suspend fun update(game: Game)

    /**
     * Returns a list of all the [Game] values in the database
     */
    @Query("SELECT * FROM games")
    suspend fun getAll(): List<Game>

    /**
     * Returns only the [Game] values that have not been played yet
     */
    @Query("SELECT * FROM games WHERE played=0")
    fun getAllUnplayedGames(): List<Game>

}