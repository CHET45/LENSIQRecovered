package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@xqi
@Deprecated
public interface vri extends vl4 {
    void putDownload(uk4 uk4Var) throws IOException;

    void removeDownload(String str) throws IOException;

    void setDownloadingStatesToQueued() throws IOException;

    void setStatesToRemoving() throws IOException;

    void setStopReason(int i) throws IOException;

    void setStopReason(String str, int i) throws IOException;
}
