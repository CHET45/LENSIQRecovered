package p000;

import okhttp3.internal.p017ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes8.dex */
public class m67 {

    /* JADX INFO: renamed from: a */
    public char f60007a;

    /* JADX INFO: renamed from: b */
    public boolean f60008b;

    public m67() {
        reset();
    }

    private void reset() {
        this.f60007a = (char) 1;
        this.f60008b = false;
    }

    /* JADX INFO: renamed from: a */
    public void m16647a(@hib m67 m67Var) {
        if (m67Var == null) {
            reset();
        } else {
            this.f60008b = m67Var.f60008b;
            this.f60007a = m67Var.f60007a;
        }
    }

    public void setInIsOpaque(boolean z) {
        this.f60008b = z;
    }

    public void setInSampleSize(@h78(from = 1, m12174to = WebSocketProtocol.PAYLOAD_SHORT_MAX) int i) {
        if (i < 1 || i > 65535) {
            this.f60007a = (char) 1;
        } else {
            this.f60007a = (char) i;
        }
    }
}
