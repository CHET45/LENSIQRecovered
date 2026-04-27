package p000;

import com.bumptech.glide.Priority;
import p000.bg3;
import p000.vwa;

/* JADX INFO: loaded from: classes3.dex */
public class eth<Model> implements vwa<Model, Model> {

    /* JADX INFO: renamed from: a */
    public static final eth<?> f34018a = new eth<>();

    /* JADX INFO: renamed from: eth$a */
    public static class C5466a<Model> implements wwa<Model, Model> {

        /* JADX INFO: renamed from: a */
        public static final C5466a<?> f34019a = new C5466a<>();

        @Deprecated
        public C5466a() {
        }

        public static <T> C5466a<T> getInstance() {
            return (C5466a<T>) f34019a;
        }

        @Override // p000.wwa
        @efb
        public vwa<Model, Model> build(t2b t2bVar) {
            return eth.getInstance();
        }

        @Override // p000.wwa
        public void teardown() {
        }
    }

    /* JADX INFO: renamed from: eth$b */
    public static class C5467b<Model> implements bg3<Model> {

        /* JADX INFO: renamed from: a */
        public final Model f34020a;

        public C5467b(Model model) {
            this.f34020a = model;
        }

        @Override // p000.bg3
        public void cancel() {
        }

        @Override // p000.bg3
        public void cleanup() {
        }

        @Override // p000.bg3
        @efb
        public Class<Model> getDataClass() {
            return (Class<Model>) this.f34020a.getClass();
        }

        @Override // p000.bg3
        @efb
        public hh3 getDataSource() {
            return hh3.LOCAL;
        }

        @Override // p000.bg3
        public void loadData(@efb Priority priority, @efb bg3.InterfaceC1883a<? super Model> interfaceC1883a) {
            interfaceC1883a.onDataReady(this.f34020a);
        }
    }

    @Deprecated
    public eth() {
    }

    public static <T> eth<T> getInstance() {
        return (eth<T>) f34018a;
    }

    @Override // p000.vwa
    public vwa.C14279a<Model> buildLoadData(@efb Model model, int i, int i2, @efb i7c i7cVar) {
        return new vwa.C14279a<>(new bkb(model), new C5467b(model));
    }

    @Override // p000.vwa
    public boolean handles(@efb Model model) {
        return true;
    }
}
