package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public interface gd1 {
    @efb
    bd1 createAndInsert(@efb cn4 cn4Var) throws IOException;

    @hib
    bd1 findAnotherInfoFromCompare(@efb cn4 cn4Var, @efb bd1 bd1Var);

    int findOrCreateId(@efb cn4 cn4Var);

    @hib
    bd1 get(int i);

    @hib
    String getResponseFilename(String str);

    boolean isFileDirty(int i);

    boolean isOnlyMemoryCache();

    void remove(int i);

    boolean update(@efb bd1 bd1Var) throws IOException;
}
