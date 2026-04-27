package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
@ga8
public final class i0b {

    /* JADX INFO: renamed from: h */
    public static final int f45370h = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final f0b<Object> f45371a;

    /* JADX INFO: renamed from: b */
    @gib
    public final Object f45372b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final sz2 f45373c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final mrf f45374d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final C5897fo f45375e;

    /* JADX INFO: renamed from: f */
    @yfb
    public List<? extends scc<ssd, ? extends Object>> f45376f;

    /* JADX INFO: renamed from: g */
    @yfb
    public final qqc f45377g;

    public i0b(@yfb f0b<Object> f0bVar, @gib Object obj, @yfb sz2 sz2Var, @yfb mrf mrfVar, @yfb C5897fo c5897fo, @yfb List<? extends scc<ssd, ? extends Object>> list, @yfb qqc qqcVar) {
        this.f45371a = f0bVar;
        this.f45372b = obj;
        this.f45373c = sz2Var;
        this.f45374d = mrfVar;
        this.f45375e = c5897fo;
        this.f45376f = list;
        this.f45377g = qqcVar;
    }

    @yfb
    public final C5897fo getAnchor$runtime_release() {
        return this.f45375e;
    }

    @yfb
    public final sz2 getComposition$runtime_release() {
        return this.f45373c;
    }

    @yfb
    public final f0b<Object> getContent$runtime_release() {
        return this.f45371a;
    }

    @yfb
    public final List<scc<ssd, Object>> getInvalidations$runtime_release() {
        return this.f45376f;
    }

    @yfb
    public final qqc getLocals$runtime_release() {
        return this.f45377g;
    }

    @gib
    public final Object getParameter$runtime_release() {
        return this.f45372b;
    }

    @yfb
    public final mrf getSlotTable$runtime_release() {
        return this.f45374d;
    }

    public final void setInvalidations$runtime_release(@yfb List<? extends scc<ssd, ? extends Object>> list) {
        this.f45376f = list;
    }
}
