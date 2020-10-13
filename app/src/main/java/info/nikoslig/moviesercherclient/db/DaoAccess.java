package info.nikoslig.moviesercherclient.db;

//import android.arch.persistence.room.Dao;
//import android.arch.persistence.room.Delete;
//import android.arch.persistence.room.Insert;
//import android.arch.persistence.room.Query;
//import android.arch.persistence.room.Update;
//import android.database.Cursor;
//
//import java.util.List;
//
//
//@Dao
//public interface DaoAccess {
//
//    @Insert
//    void insertMovie(MovieModel movies);
//
//    /**
//     * Query database to get one movie
//     *
//     * @param movieId Movie Id
//     * @return Fetched Movie Model otherwise null
//     */
//    @Query("SELECT*FROM MovieModel WHERE movieId =:movieId")
//    MovieModel fetchOneMovieByMovieId(long movieId);
//
//    /**
//     * Query database to get all saved movies
//     *
//     * @return List of Movies saved
//     */
//    @Query("SELECT*FROM MovieModel")
//    List<MovieModel> fetchAllMovie();
//
//    /**
//     * Select all movies.
//     *
//     * @return A {@link Cursor} of all the cheeses in the table.
//     */
//    @Query("SELECT * FROM MovieModel")
//    Cursor selectAll();
//
//    /**
//     * Update database to save movies
//     *
//     * @param movieModel Movies Model to update
//     */
//    @Update
//    void updateMovie(MovieModel movieModel);
//
//    /**
//     * Delete the movie from database
//     *
//     * @param movieModel Movie Model to delete
//     */
//    @Delete
//    void deleteMovie(MovieModel movieModel);
//}