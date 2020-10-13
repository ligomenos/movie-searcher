package info.nikoslig.moviesercherclient.Utils;
//
//import android.arch.persistence.room.Room;
//import android.content.ContentProvider;
//import android.content.ContentValues;
//import android.content.UriMatcher;
//import android.database.Cursor;
//import android.net.Uri;
//import android.support.annotation.NonNull;
//import android.support.annotation.Nullable;
//
//import info.nikoslig.moviesercherclient.db.MovieDatabase;
//
//public class MovieContentProvider extends ContentProvider {
//    // prepare the UriMatcher
//    private static final UriMatcher URI_MATCHER;
//    private static final int ITEM_LIST = 1;
//    private static final String DATABASE_NAME = "movie_db";
//
//    static {
//        URI_MATCHER = new UriMatcher(UriMatcher.NO_MATCH);
//        URI_MATCHER.addURI(MovieContract.AUTHORITY, "items", ITEM_LIST);
//    }
//
//    @Override
//    public boolean onCreate() {
//        return true;
//    }
//
//    @Nullable
//    @Override
//    public Cursor query(@NonNull Uri uri, @Nullable String[] projection, @Nullable String selection, @Nullable String[] selectionArgs, @Nullable String sortOrder) {
//        MovieDatabase movieDatabase = Room.databaseBuilder(getContext(), MovieDatabase.class, DATABASE_NAME)
//                .fallbackToDestructiveMigration()
//                .build();
//
//        Cursor cursor = movieDatabase.daoAccess().selectAll();
//        return cursor;
//    }
//
//    @Nullable
//    @Override
//    public String getType(@NonNull Uri uri) {
//
//        switch (URI_MATCHER.match(uri)) {
//            case ITEM_LIST:
//                return MovieContract.Items.CONTENT_TYPE;
//            default:
//                return null;
//        }
//    }
//
//    @Nullable
//    @Override
//    public Uri insert(@NonNull Uri uri, @Nullable ContentValues values) {
//        return null;
//    }
//
//    @Override
//    public int delete(@NonNull Uri uri, @Nullable String selection, @Nullable String[] selectionArgs) {
//        return 0;
//    }
//
//    @Override
//    public int update(@NonNull Uri uri, @Nullable ContentValues values, @Nullable String selection, @Nullable String[] selectionArgs) {
//        return 0;
//    }
//}
