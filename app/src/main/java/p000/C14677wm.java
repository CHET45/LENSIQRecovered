package p000;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: wm */
/* JADX INFO: loaded from: classes8.dex */
public class C14677wm extends ude {

    /* JADX INFO: renamed from: b */
    public final boolean f94674b;

    public C14677wm(boolean z) {
        this.f94674b = z;
    }

    /* JADX INFO: renamed from: c */
    public C8145jz m24663c() {
        return new C8145jz(this);
    }

    /* JADX INFO: renamed from: d */
    public as7 m24664d() {
        return new as7();
    }

    /* JADX INFO: renamed from: e */
    public xh8 m24665e() {
        return new xh8();
    }

    /* JADX INFO: renamed from: f */
    public zh8 m24666f() {
        return new zh8();
    }

    /* JADX INFO: renamed from: g */
    public ude m24667g() {
        return this.f94674b ? new ffg() : new whb();
    }

    @Override // p000.ude
    public tde runnerForClass(Class<?> cls) throws Throwable {
        Iterator it = Arrays.asList(m24664d(), m24663c(), m24667g(), m24665e(), m24666f()).iterator();
        while (it.hasNext()) {
            tde tdeVarSafeRunnerForClass = ((ude) it.next()).safeRunnerForClass(cls);
            if (tdeVarSafeRunnerForClass != null) {
                return tdeVarSafeRunnerForClass;
            }
        }
        return null;
    }
}
