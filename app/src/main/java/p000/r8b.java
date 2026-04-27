package p000;

import java.net.URI;
import p000.q8b;

/* JADX INFO: loaded from: classes7.dex */
public class r8b extends s8b {

    /* JADX INFO: renamed from: a */
    public q8b.AbstractC11374d f77397a;

    public r8b(q8b.AbstractC11374d abstractC11374d) {
        this.f77397a = abstractC11374d;
    }

    @Override // p000.s8b
    /* JADX INFO: renamed from: b */
    public boolean mo10903b() {
        return true;
    }

    @Override // p000.q8b.AbstractC11374d
    public String getDefaultScheme() {
        return this.f77397a.getDefaultScheme();
    }

    @Override // p000.q8b.AbstractC11374d
    public q8b newNameResolver(URI uri, q8b.C11372b c11372b) {
        return this.f77397a.newNameResolver(uri, c11372b);
    }

    @Override // p000.s8b
    public int priority() {
        return 5;
    }
}
