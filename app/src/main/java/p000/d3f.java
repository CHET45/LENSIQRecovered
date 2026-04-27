package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class d3f extends IOException {

    /* JADX INFO: renamed from: a */
    public final int f28348a;

    public d3f(int i, long j) {
        super("Response code can't handled on internal " + i + " with current offset " + j);
        this.f28348a = i;
    }

    public int getResponseCode() {
        return this.f28348a;
    }
}
