package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p000.np6;

/* JADX INFO: loaded from: classes.dex */
public class wo6 {

    /* JADX INFO: renamed from: a */
    public static final pp9<String, Typeface> f94917a = new pp9<>(16);

    /* JADX INFO: renamed from: b */
    public static final ExecutorService f94918b = z3e.m26554a("fonts-androidx", 10, 10000);

    /* JADX INFO: renamed from: c */
    public static final Object f94919c = new Object();

    /* JADX INFO: renamed from: d */
    @xc7("LOCK")
    public static final scf<String, ArrayList<vu2<C14724e>>> f94920d = new scf<>();

    /* JADX INFO: renamed from: wo6$a */
    public class CallableC14720a implements Callable<C14724e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f94921a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f94922b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ to6 f94923c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f94924d;

        public CallableC14720a(String str, Context context, to6 to6Var, int i) {
            this.f94921a = str;
            this.f94922b = context;
            this.f94923c = to6Var;
            this.f94924d = i;
        }

        @Override // java.util.concurrent.Callable
        public C14724e call() {
            return wo6.m24677a(this.f94921a, this.f94922b, this.f94923c, this.f94924d);
        }
    }

    /* JADX INFO: renamed from: wo6$b */
    public class C14721b implements vu2<C14724e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ mo1 f94925a;

        public C14721b(mo1 mo1Var) {
            this.f94925a = mo1Var;
        }

        @Override // p000.vu2
        public void accept(C14724e c14724e) {
            if (c14724e == null) {
                c14724e = new C14724e(-3);
            }
            this.f94925a.m17481a(c14724e);
        }
    }

    /* JADX INFO: renamed from: wo6$c */
    public class CallableC14722c implements Callable<C14724e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f94926a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f94927b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ to6 f94928c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f94929d;

        public CallableC14722c(String str, Context context, to6 to6Var, int i) {
            this.f94926a = str;
            this.f94927b = context;
            this.f94928c = to6Var;
            this.f94929d = i;
        }

        @Override // java.util.concurrent.Callable
        public C14724e call() {
            try {
                return wo6.m24677a(this.f94926a, this.f94927b, this.f94928c, this.f94929d);
            } catch (Throwable unused) {
                return new C14724e(-3);
            }
        }
    }

    /* JADX INFO: renamed from: wo6$d */
    public class C14723d implements vu2<C14724e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f94930a;

        public C14723d(String str) {
            this.f94930a = str;
        }

        @Override // p000.vu2
        public void accept(C14724e c14724e) {
            synchronized (wo6.f94919c) {
                try {
                    scf<String, ArrayList<vu2<C14724e>>> scfVar = wo6.f94920d;
                    ArrayList<vu2<C14724e>> arrayList = scfVar.get(this.f94930a);
                    if (arrayList == null) {
                        return;
                    }
                    scfVar.remove(this.f94930a);
                    for (int i = 0; i < arrayList.size(); i++) {
                        arrayList.get(i).accept(c14724e);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private wo6() {
    }

    @efb
    /* JADX INFO: renamed from: a */
    public static C14724e m24677a(@efb String str, @efb Context context, @efb to6 to6Var, int i) {
        pp9<String, Typeface> pp9Var = f94917a;
        Typeface typeface = pp9Var.get(str);
        if (typeface != null) {
            return new C14724e(typeface);
        }
        try {
            np6.C9964b c9964bM22156b = so6.m22156b(context, to6Var, null);
            int fontFamilyResultStatus = getFontFamilyResultStatus(c9964bM22156b);
            if (fontFamilyResultStatus != 0) {
                return new C14724e(fontFamilyResultStatus);
            }
            Typeface typefaceCreateFromFontInfo = bnh.createFromFontInfo(context, null, c9964bM22156b.getFonts(), i);
            if (typefaceCreateFromFontInfo == null) {
                return new C14724e(-3);
            }
            pp9Var.put(str, typefaceCreateFromFontInfo);
            return new C14724e(typefaceCreateFromFontInfo);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C14724e(-1);
        }
    }

    /* JADX INFO: renamed from: b */
    public static Typeface m24678b(@efb Context context, @efb to6 to6Var, int i, @hib Executor executor, @efb mo1 mo1Var) {
        String strCreateCacheId = createCacheId(to6Var, i);
        Typeface typeface = f94917a.get(strCreateCacheId);
        if (typeface != null) {
            mo1Var.m17481a(new C14724e(typeface));
            return typeface;
        }
        C14721b c14721b = new C14721b(mo1Var);
        synchronized (f94919c) {
            try {
                scf<String, ArrayList<vu2<C14724e>>> scfVar = f94920d;
                ArrayList<vu2<C14724e>> arrayList = scfVar.get(strCreateCacheId);
                if (arrayList != null) {
                    arrayList.add(c14721b);
                    return null;
                }
                ArrayList<vu2<C14724e>> arrayList2 = new ArrayList<>();
                arrayList2.add(c14721b);
                scfVar.put(strCreateCacheId, arrayList2);
                CallableC14722c callableC14722c = new CallableC14722c(strCreateCacheId, context, to6Var, i);
                if (executor == null) {
                    executor = f94918b;
                }
                z3e.m26556c(executor, callableC14722c, new C14723d(strCreateCacheId));
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static Typeface m24679c(@efb Context context, @efb to6 to6Var, @efb mo1 mo1Var, int i, int i2) {
        String strCreateCacheId = createCacheId(to6Var, i);
        Typeface typeface = f94917a.get(strCreateCacheId);
        if (typeface != null) {
            mo1Var.m17481a(new C14724e(typeface));
            return typeface;
        }
        if (i2 == -1) {
            C14724e c14724eM24677a = m24677a(strCreateCacheId, context, to6Var, i);
            mo1Var.m17481a(c14724eM24677a);
            return c14724eM24677a.f94931a;
        }
        try {
            C14724e c14724e = (C14724e) z3e.m26557d(f94918b, new CallableC14720a(strCreateCacheId, context, to6Var, i), i2);
            mo1Var.m17481a(c14724e);
            return c14724e.f94931a;
        } catch (InterruptedException unused) {
            mo1Var.m17481a(new C14724e(-3));
            return null;
        }
    }

    private static String createCacheId(@efb to6 to6Var, int i) {
        return to6Var.m22737a() + "-" + i;
    }

    /* JADX INFO: renamed from: d */
    public static void m24680d() {
        f94917a.evictAll();
    }

    @igg({"WrongConstant"})
    private static int getFontFamilyResultStatus(@efb np6.C9964b c9964b) {
        int i = 1;
        if (c9964b.getStatusCode() != 0) {
            return c9964b.getStatusCode() != 1 ? -3 : -2;
        }
        np6.C9965c[] fonts = c9964b.getFonts();
        if (fonts != null && fonts.length != 0) {
            i = 0;
            for (np6.C9965c c9965c : fonts) {
                int resultCode = c9965c.getResultCode();
                if (resultCode != 0) {
                    if (resultCode < 0) {
                        return -3;
                    }
                    return resultCode;
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: wo6$e */
    public static final class C14724e {

        /* JADX INFO: renamed from: a */
        public final Typeface f94931a;

        /* JADX INFO: renamed from: b */
        public final int f94932b;

        public C14724e(int i) {
            this.f94931a = null;
            this.f94932b = i;
        }

        @igg({"WrongConstant"})
        /* JADX INFO: renamed from: a */
        public boolean m24681a() {
            return this.f94932b == 0;
        }

        @igg({"WrongConstant"})
        public C14724e(@efb Typeface typeface) {
            this.f94931a = typeface;
            this.f94932b = 0;
        }
    }
}
