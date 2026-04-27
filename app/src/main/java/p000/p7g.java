package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public class p7g extends yq0 {

    /* JADX INFO: renamed from: b */
    public final Appendable f69941b;

    public p7g() {
        this(new StringBuilder());
    }

    public static String asString(ixe ixeVar) {
        return toString(ixeVar);
    }

    public static String toString(ixe ixeVar) {
        return new p7g().appendDescriptionOf(ixeVar).toString();
    }

    @Override // p000.yq0
    /* JADX INFO: renamed from: a */
    public void mo19313a(char c) {
        try {
            this.f69941b.append(c);
        } catch (IOException e) {
            throw new RuntimeException("Could not write description", e);
        }
    }

    @Override // p000.yq0
    /* JADX INFO: renamed from: b */
    public void mo19314b(String str) {
        try {
            this.f69941b.append(str);
        } catch (IOException e) {
            throw new RuntimeException("Could not write description", e);
        }
    }

    public p7g(Appendable appendable) {
        this.f69941b = appendable;
    }

    public String toString() {
        return this.f69941b.toString();
    }
}
