package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class d8e extends IOException {

    /* JADX INFO: renamed from: a */
    public final c8e f28757a;

    public d8e(c8e c8eVar) {
        super("Resume failed because of " + c8eVar);
        this.f28757a = c8eVar;
    }

    public c8e getResumeFailedCause() {
        return this.f28757a;
    }
}
