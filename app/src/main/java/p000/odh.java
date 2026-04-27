package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class odh {

    /* JADX INFO: renamed from: a */
    public final List<C10332a<?, ?>> f67367a = new ArrayList();

    /* JADX INFO: renamed from: odh$a */
    public static final class C10332a<Z, R> {

        /* JADX INFO: renamed from: a */
        public final Class<Z> f67368a;

        /* JADX INFO: renamed from: b */
        public final Class<R> f67369b;

        /* JADX INFO: renamed from: c */
        public final c7e<Z, R> f67370c;

        public C10332a(@efb Class<Z> cls, @efb Class<R> cls2, @efb c7e<Z, R> c7eVar) {
            this.f67368a = cls;
            this.f67369b = cls2;
            this.f67370c = c7eVar;
        }

        public boolean handles(@efb Class<?> cls, @efb Class<?> cls2) {
            return this.f67368a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f67369b);
        }
    }

    @efb
    public synchronized <Z, R> c7e<Z, R> get(@efb Class<Z> cls, @efb Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return gth.get();
        }
        for (C10332a<?, ?> c10332a : this.f67367a) {
            if (c10332a.handles(cls, cls2)) {
                return (c7e<Z, R>) c10332a.f67370c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    @efb
    public synchronized <Z, R> List<Class<R>> getTranscodeClasses(@efb Class<Z> cls, @efb Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (C10332a<?, ?> c10332a : this.f67367a) {
            if (c10332a.handles(cls, cls2) && !arrayList.contains(c10332a.f67369b)) {
                arrayList.add(c10332a.f67369b);
            }
        }
        return arrayList;
    }

    public synchronized <Z, R> void register(@efb Class<Z> cls, @efb Class<R> cls2, @efb c7e<Z, R> c7eVar) {
        this.f67367a.add(new C10332a<>(cls, cls2, c7eVar));
    }
}
