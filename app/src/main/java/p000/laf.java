package p000;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p000.maf;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
public interface laf<C extends maf> {

    /* JADX INFO: renamed from: a */
    public static final int f56992a = 1;

    /* JADX INFO: renamed from: b */
    public static final int f56993b = 2;

    /* JADX INFO: renamed from: c */
    public static final int f56994c = 3;

    /* JADX INFO: renamed from: d */
    public static final int f56995d = 5;

    /* JADX INFO: renamed from: e */
    public static final int f56996e = 0;

    /* JADX INFO: renamed from: laf$a */
    @Retention(RetentionPolicy.SOURCE)
    @p7e({p7e.EnumC10826a.f69935b})
    public @interface InterfaceC8747a {
    }

    /* JADX INFO: renamed from: laf$b */
    @Retention(RetentionPolicy.SOURCE)
    @p7e({p7e.EnumC10826a.f69935b})
    public @interface InterfaceC8748b {
    }

    /* JADX INFO: renamed from: laf$c */
    @Retention(RetentionPolicy.SOURCE)
    @p7e({p7e.EnumC10826a.f69935b})
    public @interface InterfaceC8749c {
    }

    void addCallback(C c);

    int getState();

    void removeCallback(C c);

    void setState(int i);
}
