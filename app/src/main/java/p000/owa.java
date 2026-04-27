package p000;

import android.graphics.Rect;
import java.io.Closeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class owa implements Closeable {

    /* JADX INFO: renamed from: C */
    public static final int f69037C = 1;

    /* JADX INFO: renamed from: F */
    public static final int f69038F = 2;

    /* JADX INFO: renamed from: H */
    public static final int f69039H = 3;

    /* JADX INFO: renamed from: L */
    public static final int f69040L = 4;

    /* JADX INFO: renamed from: M */
    public static final int f69041M = 5;

    /* JADX INFO: renamed from: M1 */
    public static final int f69042M1 = 2;

    /* JADX INFO: renamed from: N */
    public static final int f69043N = 6;

    /* JADX INFO: renamed from: Q */
    public static final int f69044Q = 7;

    /* JADX INFO: renamed from: V1 */
    public static final int f69045V1 = 3;

    /* JADX INFO: renamed from: X */
    public static final int f69046X = 8;

    /* JADX INFO: renamed from: Y */
    public static final int f69047Y = 9;

    /* JADX INFO: renamed from: Z */
    public static final int f69048Z = 1;

    /* JADX INFO: renamed from: m */
    public static final int f69049m = 0;

    /* JADX INFO: renamed from: a */
    public final q8j f69050a;

    /* JADX INFO: renamed from: b */
    public final int f69051b;

    /* JADX INFO: renamed from: c */
    public final Rect f69052c;

    /* JADX INFO: renamed from: d */
    public final int f69053d;

    /* JADX INFO: renamed from: e */
    public final int f69054e;

    /* JADX INFO: renamed from: f */
    public int f69055f;

    /* JADX INFO: renamed from: owa$a */
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC10677a {
    }

    /* JADX INFO: renamed from: owa$b */
    public static final class C10678b {

        /* JADX INFO: renamed from: a */
        public final owa f69056a;

        public /* synthetic */ C10678b(owa owaVar, b9j b9jVar) {
            this.f69056a = owaVar;
        }

        public void acquire() {
            this.f69056a.zzd();
        }
    }

    /* JADX INFO: renamed from: owa$c */
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC10679c {
    }

    public owa(q8j q8jVar, int i, Rect rect, long j, int i2, int i3) {
        this.f69050a = q8jVar;
        this.f69051b = i;
        Rect rect2 = new Rect();
        this.f69052c = rect2;
        rect2.set(rect);
        this.f69053d = i2;
        this.f69054e = i3;
        this.f69055f = 1;
    }

    /* JADX INFO: renamed from: c */
    public static void m19068c(int i) {
        if (i == 0 || i == 90 || i == 180 || i == 270) {
            return;
        }
        StringBuilder sb = new StringBuilder(68);
        sb.append("Rotation value ");
        sb.append(i);
        sb.append(" is not valid. Use only 0, 90, 180 or 270.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzd() {
        this.f69055f++;
    }

    /* JADX INFO: renamed from: a */
    public final q8j m19069a() {
        return this.f69050a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        int i = this.f69055f - 1;
        this.f69055f = i;
        if (i == 0) {
            this.f69050a.zzc();
        }
    }

    @efb
    public List<qv7> getContainedImageProperties() {
        return Collections.singletonList(this.f69050a.zzb());
    }

    public int getHeight() {
        return this.f69054e;
    }

    @efb
    public C10678b getInternal() {
        return new C10678b(this, null);
    }

    public int getRotation() {
        return this.f69051b;
    }

    public int getWidth() {
        return this.f69053d;
    }
}
