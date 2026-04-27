package p000;

import java.io.InputStream;
import p000.vwa;

/* JADX INFO: loaded from: classes3.dex */
public class fo7 implements vwa<k77, InputStream> {

    /* JADX INFO: renamed from: b */
    public static final v6c<Integer> f37237b = v6c.memory("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* JADX INFO: renamed from: a */
    @hib
    public final uwa<k77, k77> f37238a;

    /* JADX INFO: renamed from: fo7$a */
    public static class C5904a implements wwa<k77, InputStream> {

        /* JADX INFO: renamed from: a */
        public final uwa<k77, k77> f37239a = new uwa<>(500);

        @Override // p000.wwa
        @efb
        public vwa<k77, InputStream> build(t2b t2bVar) {
            return new fo7(this.f37239a);
        }

        @Override // p000.wwa
        public void teardown() {
        }
    }

    public fo7() {
        this(null);
    }

    public fo7(@hib uwa<k77, k77> uwaVar) {
        this.f37238a = uwaVar;
    }

    @Override // p000.vwa
    public vwa.C14279a<InputStream> buildLoadData(@efb k77 k77Var, int i, int i2, @efb i7c i7cVar) {
        uwa<k77, k77> uwaVar = this.f37238a;
        if (uwaVar != null) {
            k77 k77Var2 = uwaVar.get(k77Var, 0, 0);
            if (k77Var2 == null) {
                this.f37238a.put(k77Var, 0, 0, k77Var);
            } else {
                k77Var = k77Var2;
            }
        }
        return new vwa.C14279a<>(k77Var, new to7(k77Var, ((Integer) i7cVar.get(f37237b)).intValue()));
    }

    @Override // p000.vwa
    public boolean handles(@efb k77 k77Var) {
        return true;
    }
}
