package p000;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p000.gh1;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class ba5 extends lyc {

    /* JADX INFO: renamed from: H2 */
    public static final int f13123H2 = 0;

    /* JADX INFO: renamed from: I2 */
    public static final int f13124I2 = 1;

    /* JADX INFO: renamed from: J2 */
    public static final int f13125J2 = 2;

    /* JADX INFO: renamed from: K2 */
    public static final int f13126K2 = 3;

    /* JADX INFO: renamed from: L2 */
    public static final gh1.InterfaceC6311a<ba5> f13127L2 = new gh1.InterfaceC6311a() { // from class: z95
        @Override // p000.gh1.InterfaceC6311a
        public final gh1 fromBundle(Bundle bundle) {
            return ba5.m3016a(bundle);
        }
    };

    /* JADX INFO: renamed from: M2 */
    public static final String f13128M2 = x0i.intToStringMaxRadix(1001);

    /* JADX INFO: renamed from: N2 */
    public static final String f13129N2 = x0i.intToStringMaxRadix(1002);

    /* JADX INFO: renamed from: O2 */
    public static final String f13130O2 = x0i.intToStringMaxRadix(1003);

    /* JADX INFO: renamed from: P2 */
    public static final String f13131P2 = x0i.intToStringMaxRadix(1004);

    /* JADX INFO: renamed from: Q2 */
    public static final String f13132Q2 = x0i.intToStringMaxRadix(1005);

    /* JADX INFO: renamed from: R2 */
    public static final String f13133R2 = x0i.intToStringMaxRadix(1006);

    /* JADX INFO: renamed from: A2 */
    public final int f13134A2;

    /* JADX INFO: renamed from: B2 */
    @hib
    public final String f13135B2;

    /* JADX INFO: renamed from: C2 */
    public final int f13136C2;

    /* JADX INFO: renamed from: D2 */
    @hib
    public final kq6 f13137D2;

    /* JADX INFO: renamed from: E2 */
    public final int f13138E2;

    /* JADX INFO: renamed from: F2 */
    @hib
    public final pja f13139F2;

    /* JADX INFO: renamed from: G2 */
    public final boolean f13140G2;

    /* JADX INFO: renamed from: ba5$a */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC1803a {
    }

    private ba5(int i, Throwable th, int i2) {
        this(i, th, null, i2, null, -1, null, 4, false);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ ba5 m3016a(Bundle bundle) {
        return new ba5(bundle);
    }

    public static ba5 createForRemote(String str) {
        return new ba5(3, null, str, 1001, null, -1, null, 4, false);
    }

    public static ba5 createForRenderer(Throwable th, String str, int i, @hib kq6 kq6Var, int i2, boolean z, int i3) {
        return new ba5(1, th, null, i3, str, i, kq6Var, kq6Var == null ? 4 : i2, z);
    }

    public static ba5 createForSource(IOException iOException, int i) {
        return new ba5(0, iOException, i);
    }

    @Deprecated
    public static ba5 createForUnexpected(RuntimeException runtimeException) {
        return createForUnexpected(runtimeException, 1000);
    }

    private static String deriveMessage(int i, @hib String str, @hib String str2, int i2, @hib kq6 kq6Var, int i3) {
        String str3;
        if (i == 0) {
            str3 = "Source error";
        } else if (i != 1) {
            str3 = i != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i2 + ", format=" + kq6Var + ", format_supported=" + x0i.getFormatSupportString(i3);
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }

    @yx1
    /* JADX INFO: renamed from: b */
    public ba5 m3017b(@hib pja pjaVar) {
        return new ba5((String) x0i.castNonNull(getMessage()), getCause(), this.f59257a, this.f13134A2, this.f13135B2, this.f13136C2, this.f13137D2, this.f13138E2, pjaVar, this.f59258b, this.f13140G2);
    }

    @Override // p000.lyc
    public boolean errorInfoEquals(@hib lyc lycVar) {
        if (!super.errorInfoEquals(lycVar)) {
            return false;
        }
        ba5 ba5Var = (ba5) x0i.castNonNull(lycVar);
        return this.f13134A2 == ba5Var.f13134A2 && x0i.areEqual(this.f13135B2, ba5Var.f13135B2) && this.f13136C2 == ba5Var.f13136C2 && x0i.areEqual(this.f13137D2, ba5Var.f13137D2) && this.f13138E2 == ba5Var.f13138E2 && x0i.areEqual(this.f13139F2, ba5Var.f13139F2) && this.f13140G2 == ba5Var.f13140G2;
    }

    public Exception getRendererException() {
        u80.checkState(this.f13134A2 == 1);
        return (Exception) u80.checkNotNull(getCause());
    }

    public IOException getSourceException() {
        u80.checkState(this.f13134A2 == 0);
        return (IOException) u80.checkNotNull(getCause());
    }

    public RuntimeException getUnexpectedException() {
        u80.checkState(this.f13134A2 == 2);
        return (RuntimeException) u80.checkNotNull(getCause());
    }

    @Override // p000.lyc, p000.gh1
    public Bundle toBundle() {
        Bundle bundle = super.toBundle();
        bundle.putInt(f13128M2, this.f13134A2);
        bundle.putString(f13129N2, this.f13135B2);
        bundle.putInt(f13130O2, this.f13136C2);
        kq6 kq6Var = this.f13137D2;
        if (kq6Var != null) {
            bundle.putBundle(f13131P2, kq6Var.toBundle());
        }
        bundle.putInt(f13132Q2, this.f13138E2);
        bundle.putBoolean(f13133R2, this.f13140G2);
        return bundle;
    }

    private ba5(int i, @hib Throwable th, @hib String str, int i2, @hib String str2, int i3, @hib kq6 kq6Var, int i4, boolean z) {
        this(deriveMessage(i, str, str2, i3, kq6Var, i4), th, i2, i, str2, i3, kq6Var, i4, null, SystemClock.elapsedRealtime(), z);
    }

    public static ba5 createForUnexpected(RuntimeException runtimeException, int i) {
        return new ba5(2, runtimeException, i);
    }

    private ba5(Bundle bundle) {
        super(bundle);
        this.f13134A2 = bundle.getInt(f13128M2, 2);
        this.f13135B2 = bundle.getString(f13129N2);
        this.f13136C2 = bundle.getInt(f13130O2, -1);
        Bundle bundle2 = bundle.getBundle(f13131P2);
        this.f13137D2 = bundle2 == null ? null : (kq6) kq6.f54972X2.fromBundle(bundle2);
        this.f13138E2 = bundle.getInt(f13132Q2, 4);
        this.f13140G2 = bundle.getBoolean(f13133R2, false);
        this.f13139F2 = null;
    }

    private ba5(String str, @hib Throwable th, int i, int i2, @hib String str2, int i3, @hib kq6 kq6Var, int i4, @hib pja pjaVar, long j, boolean z) {
        super(str, th, i, j);
        u80.checkArgument(!z || i2 == 1);
        u80.checkArgument(th != null || i2 == 3);
        this.f13134A2 = i2;
        this.f13135B2 = str2;
        this.f13136C2 = i3;
        this.f13137D2 = kq6Var;
        this.f13138E2 = i4;
        this.f13139F2 = pjaVar;
        this.f13140G2 = z;
    }
}
