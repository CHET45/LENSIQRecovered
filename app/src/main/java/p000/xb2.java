package p000;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface xb2 extends rsa {
    String getDatabase();

    vj1 getDatabaseBytes();

    vj1 getTransaction();

    yri getWrites(int i);

    int getWritesCount();

    List<yri> getWritesList();
}
