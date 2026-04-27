package p000;

import androidx.media3.common.C1213a;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class y5h {

    /* JADX INFO: renamed from: m */
    public static final int f100440m = 0;

    /* JADX INFO: renamed from: n */
    public static final int f100441n = 1;

    /* JADX INFO: renamed from: a */
    public final int f100442a;

    /* JADX INFO: renamed from: b */
    public final int f100443b;

    /* JADX INFO: renamed from: c */
    public final long f100444c;

    /* JADX INFO: renamed from: d */
    public final long f100445d;

    /* JADX INFO: renamed from: e */
    public final long f100446e;

    /* JADX INFO: renamed from: f */
    public final long f100447f;

    /* JADX INFO: renamed from: g */
    public final C1213a f100448g;

    /* JADX INFO: renamed from: h */
    public final int f100449h;

    /* JADX INFO: renamed from: i */
    @hib
    public final long[] f100450i;

    /* JADX INFO: renamed from: j */
    @hib
    public final long[] f100451j;

    /* JADX INFO: renamed from: k */
    public final int f100452k;

    /* JADX INFO: renamed from: l */
    @hib
    public final b6h[] f100453l;

    /* JADX INFO: renamed from: y5h$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC15497a {
    }

    public y5h(int i, int i2, long j, long j2, long j3, long j4, C1213a c1213a, int i3, @hib b6h[] b6hVarArr, int i4, @hib long[] jArr, @hib long[] jArr2) {
        this.f100442a = i;
        this.f100443b = i2;
        this.f100444c = j;
        this.f100445d = j2;
        this.f100446e = j3;
        this.f100447f = j4;
        this.f100448g = c1213a;
        this.f100449h = i3;
        this.f100453l = b6hVarArr;
        this.f100452k = i4;
        this.f100450i = jArr;
        this.f100451j = jArr2;
    }

    public y5h copyWithFormat(C1213a c1213a) {
        return new y5h(this.f100442a, this.f100443b, this.f100444c, this.f100445d, this.f100446e, this.f100447f, c1213a, this.f100449h, this.f100453l, this.f100452k, this.f100450i, this.f100451j);
    }

    public y5h copyWithoutEditLists() {
        return new y5h(this.f100442a, this.f100443b, this.f100444c, this.f100445d, this.f100446e, this.f100447f, this.f100448g, this.f100449h, this.f100453l, this.f100452k, null, null);
    }

    @hib
    public b6h getSampleDescriptionEncryptionBox(int i) {
        b6h[] b6hVarArr = this.f100453l;
        if (b6hVarArr == null) {
            return null;
        }
        return b6hVarArr[i];
    }
}
