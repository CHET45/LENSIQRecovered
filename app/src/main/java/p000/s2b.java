package p000;

import com.bumptech.glide.Priority;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p000.bg3;
import p000.p4d;
import p000.vwa;

/* JADX INFO: loaded from: classes3.dex */
public class s2b<Model, Data> implements vwa<Model, Data> {

    /* JADX INFO: renamed from: a */
    public final List<vwa<Model, Data>> f80433a;

    /* JADX INFO: renamed from: b */
    public final p4d.InterfaceC10791a<List<Throwable>> f80434b;

    /* JADX INFO: renamed from: s2b$a */
    public static class C12408a<Data> implements bg3<Data>, bg3.InterfaceC1883a<Data> {

        /* JADX INFO: renamed from: a */
        public final List<bg3<Data>> f80435a;

        /* JADX INFO: renamed from: b */
        public final p4d.InterfaceC10791a<List<Throwable>> f80436b;

        /* JADX INFO: renamed from: c */
        public int f80437c;

        /* JADX INFO: renamed from: d */
        public Priority f80438d;

        /* JADX INFO: renamed from: e */
        public bg3.InterfaceC1883a<? super Data> f80439e;

        /* JADX INFO: renamed from: f */
        @hib
        public List<Throwable> f80440f;

        /* JADX INFO: renamed from: m */
        public boolean f80441m;

        public C12408a(@efb List<bg3<Data>> list, @efb p4d.InterfaceC10791a<List<Throwable>> interfaceC10791a) {
            this.f80436b = interfaceC10791a;
            t7d.checkNotEmpty(list);
            this.f80435a = list;
            this.f80437c = 0;
        }

        private void startNextOrFail() {
            if (this.f80441m) {
                return;
            }
            if (this.f80437c < this.f80435a.size() - 1) {
                this.f80437c++;
                loadData(this.f80438d, this.f80439e);
            } else {
                t7d.checkNotNull(this.f80440f);
                this.f80439e.onLoadFailed(new a77("Fetch failed", new ArrayList(this.f80440f)));
            }
        }

        @Override // p000.bg3
        public void cancel() {
            this.f80441m = true;
            Iterator<bg3<Data>> it = this.f80435a.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
        }

        @Override // p000.bg3
        public void cleanup() {
            List<Throwable> list = this.f80440f;
            if (list != null) {
                this.f80436b.release(list);
            }
            this.f80440f = null;
            Iterator<bg3<Data>> it = this.f80435a.iterator();
            while (it.hasNext()) {
                it.next().cleanup();
            }
        }

        @Override // p000.bg3
        @efb
        public Class<Data> getDataClass() {
            return this.f80435a.get(0).getDataClass();
        }

        @Override // p000.bg3
        @efb
        public hh3 getDataSource() {
            return this.f80435a.get(0).getDataSource();
        }

        @Override // p000.bg3
        public void loadData(@efb Priority priority, @efb bg3.InterfaceC1883a<? super Data> interfaceC1883a) {
            this.f80438d = priority;
            this.f80439e = interfaceC1883a;
            this.f80440f = this.f80436b.acquire();
            this.f80435a.get(this.f80437c).loadData(priority, this);
            if (this.f80441m) {
                cancel();
            }
        }

        @Override // p000.bg3.InterfaceC1883a
        public void onDataReady(@hib Data data) {
            if (data != null) {
                this.f80439e.onDataReady(data);
            } else {
                startNextOrFail();
            }
        }

        @Override // p000.bg3.InterfaceC1883a
        public void onLoadFailed(@efb Exception exc) {
            ((List) t7d.checkNotNull(this.f80440f)).add(exc);
            startNextOrFail();
        }
    }

    public s2b(@efb List<vwa<Model, Data>> list, @efb p4d.InterfaceC10791a<List<Throwable>> interfaceC10791a) {
        this.f80433a = list;
        this.f80434b = interfaceC10791a;
    }

    @Override // p000.vwa
    public vwa.C14279a<Data> buildLoadData(@efb Model model, int i, int i2, @efb i7c i7cVar) {
        vwa.C14279a<Data> c14279aBuildLoadData;
        int size = this.f80433a.size();
        ArrayList arrayList = new ArrayList(size);
        eq8 eq8Var = null;
        for (int i3 = 0; i3 < size; i3++) {
            vwa<Model, Data> vwaVar = this.f80433a.get(i3);
            if (vwaVar.handles(model) && (c14279aBuildLoadData = vwaVar.buildLoadData(model, i, i2, i7cVar)) != null) {
                eq8Var = c14279aBuildLoadData.f92420a;
                arrayList.add(c14279aBuildLoadData.f92422c);
            }
        }
        if (arrayList.isEmpty() || eq8Var == null) {
            return null;
        }
        return new vwa.C14279a<>(eq8Var, new C12408a(arrayList, this.f80434b));
    }

    @Override // p000.vwa
    public boolean handles(@efb Model model) {
        Iterator<vwa<Model, Data>> it = this.f80433a.iterator();
        while (it.hasNext()) {
            if (it.next().handles(model)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f80433a.toArray()) + '}';
    }
}
