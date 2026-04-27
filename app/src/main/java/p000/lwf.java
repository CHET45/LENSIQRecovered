package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class lwf implements gn2, Iterable<gn2>, uo8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final mrf f59095a;

    /* JADX INFO: renamed from: b */
    public final int f59096b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final qb7 f59097c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final kwf f59098d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final Object f59099e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final Iterable<gn2> f59100f = this;

    public lwf(@yfb mrf mrfVar, int i, @yfb qb7 qb7Var, @yfb kwf kwfVar) {
        this.f59095a = mrfVar;
        this.f59096b = i;
        this.f59097c = qb7Var;
        this.f59098d = kwfVar;
        this.f59099e = Integer.valueOf(qb7Var.getKey());
    }

    @Override // p000.fn2
    @yfb
    public Iterable<gn2> getCompositionGroups() {
        return this.f59100f;
    }

    @Override // p000.gn2
    @yfb
    public Iterable<Object> getData() {
        return new iwf(this.f59095a, this.f59096b, this.f59097c);
    }

    @Override // p000.gn2
    @yfb
    public Object getIdentity() {
        return this.f59098d.getIdentity(this.f59095a);
    }

    @yfb
    public final kwf getIdentityPath() {
        return this.f59098d;
    }

    @Override // p000.gn2
    @yfb
    public Object getKey() {
        return this.f59099e;
    }

    @Override // p000.gn2
    @gib
    public Object getNode() {
        return null;
    }

    public final int getParent() {
        return this.f59096b;
    }

    @Override // p000.gn2
    @gib
    public String getSourceInfo() {
        return this.f59097c.getSourceInformation();
    }

    @yfb
    public final qb7 getSourceInformation() {
        return this.f59097c;
    }

    @yfb
    public final mrf getTable() {
        return this.f59095a;
    }

    @Override // p000.fn2
    public boolean isEmpty() {
        ArrayList<Object> groups = this.f59097c.getGroups();
        boolean z = false;
        if (groups != null && !groups.isEmpty()) {
            z = true;
        }
        return !z;
    }

    @Override // java.lang.Iterable
    @yfb
    public Iterator<gn2> iterator() {
        return new jwf(this.f59095a, this.f59096b, this.f59097c, this.f59098d);
    }
}
