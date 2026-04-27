package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@xqi
@ovh
public interface wri extends wl4 {
    void putDownload(tk4 tk4Var) throws IOException;

    void removeDownload(String str) throws IOException;

    void setDownloadingStatesToQueued() throws IOException;

    void setStatesToRemoving() throws IOException;

    void setStopReason(int i) throws IOException;

    void setStopReason(String str, int i) throws IOException;
}
