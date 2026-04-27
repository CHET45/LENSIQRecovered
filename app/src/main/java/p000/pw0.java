package p000;

import java.util.List;
import p000.ow0;

/* JADX INFO: loaded from: classes5.dex */
public interface pw0 extends rsa {
    ow0.EnumC10674c getConsistencySelectorCase();

    String getDatabase();

    vj1 getDatabaseBytes();

    String getDocuments(int i);

    vj1 getDocumentsBytes(int i);

    int getDocumentsCount();

    List<String> getDocumentsList();

    di4 getMask();

    idh getNewTransaction();

    f2h getReadTime();

    vj1 getTransaction();

    boolean hasMask();

    boolean hasNewTransaction();

    boolean hasReadTime();

    boolean hasTransaction();
}
