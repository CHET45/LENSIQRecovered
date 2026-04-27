package p000;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface bsi extends rsa {
    yri getBaseWrites(int i);

    int getBaseWritesCount();

    List<yri> getBaseWritesList();

    int getBatchId();

    f2h getLocalWriteTime();

    yri getWrites(int i);

    int getWritesCount();

    List<yri> getWritesList();

    boolean hasLocalWriteTime();
}
