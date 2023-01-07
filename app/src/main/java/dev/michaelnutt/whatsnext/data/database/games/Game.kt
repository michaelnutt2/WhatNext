/**
 * Created by: Michael Nutt
 * Last Modified: 2023/01/07
 */
package dev.michaelnutt.whatsnext.data.database.games

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import dev.michaelnutt.whatsnext.utils.Platform
import dev.michaelnutt.whatsnext.utils.Rating
import java.util.Date

/**
 * Data class used to create a game variable using the metadata for the game as provided by the user
 */
@Entity(tableName = "games")
data class Game(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name="_id")
    val id: Int = 0,
    @ColumnInfo(name="title")
    val gameTitle: String,
    @ColumnInfo(name="platform")
    val platform: Platform?,
    @ColumnInfo(name="developer")
    val developer: String?,
    @ColumnInfo(name="publisher")
    val publisher: String?,
    @ColumnInfo(name="esrb_rating")
    val esrbRating: Rating?,
    @ColumnInfo(name="release_date")
    val releaseDate: Date?,
    @ColumnInfo(name="how_long_to_beat")
    val hltb: String?,
    @ColumnInfo(name="player_rating")
    val playerRating: Int?,
    @ColumnInfo(name="played")
    val donePlaying: Boolean = false,
    @ColumnInfo(name="play_time")
    val playTime: String?
) {

}
