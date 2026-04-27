package p000;

import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface dl4 extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    int getCount();

    tk4 getDownload();

    int getPosition();

    default boolean isAfterLast() {
        return getCount() == 0 || getPosition() == getCount();
    }

    default boolean isBeforeFirst() {
        return getCount() == 0 || getPosition() == -1;
    }

    boolean isClosed();

    default boolean isFirst() {
        return getPosition() == 0 && getCount() != 0;
    }

    default boolean isLast() {
        int count = getCount();
        return getPosition() == count + (-1) && count != 0;
    }

    default boolean moveToFirst() {
        return moveToPosition(0);
    }

    default boolean moveToLast() {
        return moveToPosition(getCount() - 1);
    }

    default boolean moveToNext() {
        return moveToPosition(getPosition() + 1);
    }

    boolean moveToPosition(int i);

    default boolean moveToPrevious() {
        return moveToPosition(getPosition() - 1);
    }
}
