package p000;

import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class yj8 implements xj5 {

    /* JADX INFO: renamed from: e */
    public static final int f101797e = 1;

    /* JADX INFO: renamed from: f */
    public static final int f101798f = 65496;

    /* JADX INFO: renamed from: g */
    public static final int f101799g = 2;

    /* JADX INFO: renamed from: d */
    public final xj5 f101800d;

    /* JADX INFO: renamed from: yj8$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC15692a {
    }

    public yj8() {
        this(0);
    }

    @Override // p000.xj5
    public void init(bk5 bk5Var) {
        this.f101800d.init(bk5Var);
    }

    @Override // p000.xj5
    public int read(ak5 ak5Var, d5d d5dVar) throws IOException {
        return this.f101800d.read(ak5Var, d5dVar);
    }

    @Override // p000.xj5
    public void release() {
        this.f101800d.release();
    }

    @Override // p000.xj5
    public void seek(long j, long j2) {
        this.f101800d.seek(j, j2);
    }

    @Override // p000.xj5
    public boolean sniff(ak5 ak5Var) throws IOException {
        return this.f101800d.sniff(ak5Var);
    }

    public yj8(int i) {
        if ((i & 1) != 0) {
            this.f101800d = new bof(65496, 2, "image/jpeg");
        } else {
            this.f101800d = new ak8();
        }
    }
}
