package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.exd;
import p000.p4d;

/* JADX INFO: loaded from: classes3.dex */
public class xwa {

    /* JADX INFO: renamed from: a */
    public final t2b f99563a;

    /* JADX INFO: renamed from: b */
    public final C15332a f99564b;

    /* JADX INFO: renamed from: xwa$a */
    public static class C15332a {

        /* JADX INFO: renamed from: a */
        public final Map<Class<?>, a<?>> f99565a = new HashMap();

        /* JADX INFO: renamed from: xwa$a$a */
        public static class a<Model> {

            /* JADX INFO: renamed from: a */
            public final List<vwa<Model, ?>> f99566a;

            public a(List<vwa<Model, ?>> list) {
                this.f99566a = list;
            }
        }

        public void clear() {
            this.f99565a.clear();
        }

        @hib
        public <Model> List<vwa<Model, ?>> get(Class<Model> cls) {
            a<?> aVar = this.f99565a.get(cls);
            if (aVar == null) {
                return null;
            }
            return (List<vwa<Model, ?>>) aVar.f99566a;
        }

        public <Model> void put(Class<Model> cls, List<vwa<Model, ?>> list) {
            if (this.f99565a.put(cls, new a<>(list)) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    public xwa(@efb p4d.InterfaceC10791a<List<Throwable>> interfaceC10791a) {
        this(new t2b(interfaceC10791a));
    }

    @efb
    private static <A> Class<A> getClass(@efb A a) {
        return (Class<A>) a.getClass();
    }

    @efb
    private synchronized <A> List<vwa<A, ?>> getModelLoadersForClass(@efb Class<A> cls) {
        List<vwa<A, ?>> listUnmodifiableList;
        listUnmodifiableList = this.f99564b.get(cls);
        if (listUnmodifiableList == null) {
            listUnmodifiableList = Collections.unmodifiableList(this.f99563a.m22335b(cls));
            this.f99564b.put(cls, listUnmodifiableList);
        }
        return listUnmodifiableList;
    }

    private <Model, Data> void tearDown(@efb List<wwa<? extends Model, ? extends Data>> list) {
        Iterator<wwa<? extends Model, ? extends Data>> it = list.iterator();
        while (it.hasNext()) {
            it.next().teardown();
        }
    }

    public synchronized <Model, Data> void append(@efb Class<Model> cls, @efb Class<Data> cls2, @efb wwa<? extends Model, ? extends Data> wwaVar) {
        this.f99563a.m22334a(cls, cls2, wwaVar);
        this.f99564b.clear();
    }

    public synchronized <Model, Data> vwa<Model, Data> build(@efb Class<Model> cls, @efb Class<Data> cls2) {
        return this.f99563a.build(cls, cls2);
    }

    @efb
    public synchronized List<Class<?>> getDataClasses(@efb Class<?> cls) {
        return this.f99563a.m22336c(cls);
    }

    @efb
    public <A> List<vwa<A, ?>> getModelLoaders(@efb A a) {
        List<vwa<A, ?>> modelLoadersForClass = getModelLoadersForClass(getClass(a));
        if (modelLoadersForClass.isEmpty()) {
            throw new exd.C5511c(a);
        }
        int size = modelLoadersForClass.size();
        List<vwa<A, ?>> listEmptyList = Collections.emptyList();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            vwa<A, ?> vwaVar = modelLoadersForClass.get(i);
            if (vwaVar.handles(a)) {
                if (z) {
                    listEmptyList = new ArrayList<>(size - i);
                    z = false;
                }
                listEmptyList.add(vwaVar);
            }
        }
        if (listEmptyList.isEmpty()) {
            throw new exd.C5511c(a, modelLoadersForClass);
        }
        return listEmptyList;
    }

    public synchronized <Model, Data> void prepend(@efb Class<Model> cls, @efb Class<Data> cls2, @efb wwa<? extends Model, ? extends Data> wwaVar) {
        this.f99563a.m22337d(cls, cls2, wwaVar);
        this.f99564b.clear();
    }

    public synchronized <Model, Data> void remove(@efb Class<Model> cls, @efb Class<Data> cls2) {
        tearDown(this.f99563a.m22338e(cls, cls2));
        this.f99564b.clear();
    }

    public synchronized <Model, Data> void replace(@efb Class<Model> cls, @efb Class<Data> cls2, @efb wwa<? extends Model, ? extends Data> wwaVar) {
        tearDown(this.f99563a.m22339f(cls, cls2, wwaVar));
        this.f99564b.clear();
    }

    private xwa(@efb t2b t2bVar) {
        this.f99564b = new C15332a();
        this.f99563a = t2bVar;
    }
}
