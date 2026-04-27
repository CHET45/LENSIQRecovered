package p000;

import com.google.firebase.Timestamp;

/* JADX INFO: loaded from: classes5.dex */
public class a4f implements xdh {

    /* JADX INFO: renamed from: a */
    public static final a4f f400a = new a4f();

    private a4f() {
    }

    public static a4f getInstance() {
        return f400a;
    }

    @Override // p000.xdh
    public b2i applyToLocalView(@hib b2i b2iVar, Timestamp timestamp) {
        return b4f.valueOf(timestamp, b2iVar);
    }

    @Override // p000.xdh
    public b2i applyToRemoteDocument(@hib b2i b2iVar, b2i b2iVar2) {
        return b2iVar2;
    }

    @Override // p000.xdh
    @hib
    public b2i computeBaseValue(@hib b2i b2iVar) {
        return null;
    }
}
