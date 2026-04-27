package p000;

import p000.ma9;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zl4 extends xl4 {

    /* JADX INFO: renamed from: zl4$a */
    public static /* synthetic */ class C16171a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f105375a;

        static {
            int[] iArr = new int[x15.values().length];
            f105375a = iArr;
            try {
                iArr[x15.COMPLETED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f105375a[x15.CANCELED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f105375a[x15.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f105375a[x15.PRE_ALLOCATE_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f105375a[x15.FILE_BUSY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f105375a[x15.SAME_TASK_BUSY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void m26882a(@efb cn4 cn4Var);

    /* JADX INFO: renamed from: b */
    public abstract void m26883b(@efb cn4 cn4Var);

    /* JADX INFO: renamed from: c */
    public abstract void m26884c(@efb cn4 cn4Var, @efb Exception exc);

    /* JADX INFO: renamed from: d */
    public abstract void m26885d(@efb cn4 cn4Var);

    /* JADX INFO: renamed from: e */
    public abstract void m26886e(@efb cn4 cn4Var);

    @Override // p000.ma9.InterfaceC9236a
    public void taskEnd(@efb cn4 cn4Var, @efb x15 x15Var, @hib Exception exc, @efb ma9.C9237b c9237b) {
        switch (C16171a.f105375a[x15Var.ordinal()]) {
            case 1:
                m26883b(cn4Var);
                break;
            case 2:
                m26882a(cn4Var);
                break;
            case 3:
            case 4:
                m26884c(cn4Var, exc);
                break;
            case 5:
            case 6:
                m26886e(cn4Var);
                break;
            default:
                q0i.m19916w("DownloadListener3", "Don't support " + x15Var);
                break;
        }
    }

    @Override // p000.ma9.InterfaceC9236a
    public final void taskStart(@efb cn4 cn4Var, @efb ma9.C9237b c9237b) {
        m26885d(cn4Var);
    }
}
