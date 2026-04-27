package p000;

import android.database.Cursor;

/* JADX INFO: loaded from: classes.dex */
public final class ya3 {
    @gib
    public static final byte[] getBlobOrNull(@yfb Cursor cursor, int i) {
        if (cursor.isNull(i)) {
            return null;
        }
        return cursor.getBlob(i);
    }

    @gib
    public static final Double getDoubleOrNull(@yfb Cursor cursor, int i) {
        if (cursor.isNull(i)) {
            return null;
        }
        return Double.valueOf(cursor.getDouble(i));
    }

    @gib
    public static final Float getFloatOrNull(@yfb Cursor cursor, int i) {
        if (cursor.isNull(i)) {
            return null;
        }
        return Float.valueOf(cursor.getFloat(i));
    }

    @gib
    public static final Integer getIntOrNull(@yfb Cursor cursor, int i) {
        if (cursor.isNull(i)) {
            return null;
        }
        return Integer.valueOf(cursor.getInt(i));
    }

    @gib
    public static final Long getLongOrNull(@yfb Cursor cursor, int i) {
        if (cursor.isNull(i)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i));
    }

    @gib
    public static final Short getShortOrNull(@yfb Cursor cursor, int i) {
        if (cursor.isNull(i)) {
            return null;
        }
        return Short.valueOf(cursor.getShort(i));
    }

    @gib
    public static final String getStringOrNull(@yfb Cursor cursor, int i) {
        if (cursor.isNull(i)) {
            return null;
        }
        return cursor.getString(i);
    }
}
