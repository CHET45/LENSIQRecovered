package p000;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.C1213a;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Objects;
import p000.una;

/* JADX INFO: loaded from: classes3.dex */
public final class aa5 extends kyc {

    /* JADX INFO: renamed from: Z2 */
    @ovh
    public static final int f803Z2 = 0;

    /* JADX INFO: renamed from: a3 */
    @ovh
    public static final int f804a3 = 1;

    /* JADX INFO: renamed from: b3 */
    @ovh
    public static final int f805b3 = 2;

    /* JADX INFO: renamed from: c3 */
    @ovh
    public static final int f806c3 = 3;

    /* JADX INFO: renamed from: S2 */
    @ovh
    public final int f807S2;

    /* JADX INFO: renamed from: T2 */
    @hib
    @ovh
    public final String f808T2;

    /* JADX INFO: renamed from: U2 */
    @ovh
    public final int f809U2;

    /* JADX INFO: renamed from: V2 */
    @hib
    @ovh
    public final C1213a f810V2;

    /* JADX INFO: renamed from: W2 */
    @ovh
    public final int f811W2;

    /* JADX INFO: renamed from: X2 */
    @hib
    @ovh
    public final una.C13612b f812X2;

    /* JADX INFO: renamed from: Y2 */
    public final boolean f813Y2;

    /* JADX INFO: renamed from: aa5$a */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @ovh
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC0118a {
    }

    private aa5(int i, Throwable th, int i2) {
        this(i, th, null, i2, null, -1, null, 4, null, false);
    }

    @ovh
    public static aa5 createForRemote(String str) {
        return new aa5(3, null, str, 1001, null, -1, null, 4, null, false);
    }

    @ovh
    @Deprecated
    public static aa5 createForRenderer(Throwable th, String str, int i, @hib C1213a c1213a, int i2, boolean z, int i3) {
        return createForRenderer(th, str, i, c1213a, i2, null, z, i3);
    }

    @ovh
    public static aa5 createForSource(IOException iOException, int i) {
        return new aa5(0, iOException, i);
    }

    @ovh
    @Deprecated
    public static aa5 createForUnexpected(RuntimeException runtimeException) {
        return createForUnexpected(runtimeException, 1000);
    }

    private static String deriveMessage(int i, @hib String str, @hib String str2, int i2, @hib C1213a c1213a, int i3) {
        String str3;
        if (i == 0) {
            str3 = "Source error";
        } else if (i != 1) {
            str3 = i != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i2 + ", format=" + c1213a + ", format_supported=" + t0i.getFormatSupportString(i3);
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }

    @yx1
    /* JADX INFO: renamed from: a */
    public aa5 m257a(@hib una.C13612b c13612b) {
        return new aa5((String) t0i.castNonNull(getMessage()), getCause(), this.f55703a, this.f807S2, this.f808T2, this.f809U2, this.f810V2, this.f811W2, c13612b, this.f55704b, this.f813Y2);
    }

    @Override // p000.kyc
    public boolean errorInfoEquals(@hib kyc kycVar) {
        if (!super.errorInfoEquals(kycVar)) {
            return false;
        }
        aa5 aa5Var = (aa5) t0i.castNonNull(kycVar);
        return this.f807S2 == aa5Var.f807S2 && Objects.equals(this.f808T2, aa5Var.f808T2) && this.f809U2 == aa5Var.f809U2 && Objects.equals(this.f810V2, aa5Var.f810V2) && this.f811W2 == aa5Var.f811W2 && Objects.equals(this.f812X2, aa5Var.f812X2) && this.f813Y2 == aa5Var.f813Y2;
    }

    @ovh
    public Exception getRendererException() {
        v80.checkState(this.f807S2 == 1);
        return (Exception) v80.checkNotNull(getCause());
    }

    @ovh
    public IOException getSourceException() {
        v80.checkState(this.f807S2 == 0);
        return (IOException) v80.checkNotNull(getCause());
    }

    @ovh
    public RuntimeException getUnexpectedException() {
        v80.checkState(this.f807S2 == 2);
        return (RuntimeException) v80.checkNotNull(getCause());
    }

    private aa5(int i, @hib Throwable th, @hib String str, int i2, @hib String str2, int i3, @hib C1213a c1213a, int i4, @hib una.C13612b c13612b, boolean z) {
        this(deriveMessage(i, str, str2, i3, c1213a, i4), th, i2, i, str2, i3, c1213a, i4, c13612b, SystemClock.elapsedRealtime(), z);
    }

    @ovh
    public static aa5 createForRenderer(Throwable th, String str, int i, @hib C1213a c1213a, int i2, @hib una.C13612b c13612b, boolean z, int i3) {
        return new aa5(1, th, null, i3, str, i, c1213a, c1213a == null ? 4 : i2, c13612b, z);
    }

    @ovh
    public static aa5 createForUnexpected(RuntimeException runtimeException, int i) {
        return new aa5(2, runtimeException, i);
    }

    private aa5(String str, @hib Throwable th, int i, int i2, @hib String str2, int i3, @hib C1213a c1213a, int i4, @hib una.C13612b c13612b, long j, boolean z) {
        super(str, th, i, Bundle.EMPTY, j);
        v80.checkArgument(!z || i2 == 1);
        v80.checkArgument(th != null || i2 == 3);
        this.f807S2 = i2;
        this.f808T2 = str2;
        this.f809U2 = i3;
        this.f810V2 = c1213a;
        this.f811W2 = i4;
        this.f812X2 = c13612b;
        this.f813Y2 = z;
    }
}
