package p000;

import java.io.Serializable;
import java.util.Random;

/* JADX INFO: loaded from: classes7.dex */
public final class nxc extends AbstractC12415s3 implements Serializable {

    /* JADX INFO: renamed from: d */
    @yfb
    public static final C10108a f65967d = new C10108a(null);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: c */
    @yfb
    public final Random f65968c;

    /* JADX INFO: renamed from: nxc$a */
    public static final class C10108a {
        public /* synthetic */ C10108a(jt3 jt3Var) {
            this();
        }

        private C10108a() {
        }
    }

    public nxc(@yfb Random random) {
        md8.checkNotNullParameter(random, "impl");
        this.f65968c = random;
    }

    @Override // p000.AbstractC12415s3
    @yfb
    public Random getImpl() {
        return this.f65968c;
    }
}
