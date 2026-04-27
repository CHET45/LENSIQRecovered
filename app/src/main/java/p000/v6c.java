package p000;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public final class v6c<T> {

    /* JADX INFO: renamed from: e */
    public static final InterfaceC13888b<Object> f90104e = new C13887a();

    /* JADX INFO: renamed from: a */
    public final T f90105a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC13888b<T> f90106b;

    /* JADX INFO: renamed from: c */
    public final String f90107c;

    /* JADX INFO: renamed from: d */
    public volatile byte[] f90108d;

    /* JADX INFO: renamed from: v6c$a */
    public class C13887a implements InterfaceC13888b<Object> {
        @Override // p000.v6c.InterfaceC13888b
        public void update(@efb byte[] bArr, @efb Object obj, @efb MessageDigest messageDigest) {
        }
    }

    /* JADX INFO: renamed from: v6c$b */
    public interface InterfaceC13888b<T> {
        void update(@efb byte[] bArr, @efb T t, @efb MessageDigest messageDigest);
    }

    private v6c(@efb String str, @hib T t, @efb InterfaceC13888b<T> interfaceC13888b) {
        this.f90107c = t7d.checkNotEmpty(str);
        this.f90105a = t;
        this.f90106b = (InterfaceC13888b) t7d.checkNotNull(interfaceC13888b);
    }

    @efb
    public static <T> v6c<T> disk(@efb String str, @efb InterfaceC13888b<T> interfaceC13888b) {
        return new v6c<>(str, null, interfaceC13888b);
    }

    @efb
    private static <T> InterfaceC13888b<T> emptyUpdater() {
        return (InterfaceC13888b<T>) f90104e;
    }

    @efb
    private byte[] getKeyBytes() {
        if (this.f90108d == null) {
            this.f90108d = this.f90107c.getBytes(eq8.f33838b);
        }
        return this.f90108d;
    }

    @efb
    public static <T> v6c<T> memory(@efb String str) {
        return new v6c<>(str, null, emptyUpdater());
    }

    public boolean equals(Object obj) {
        if (obj instanceof v6c) {
            return this.f90107c.equals(((v6c) obj).f90107c);
        }
        return false;
    }

    @hib
    public T getDefaultValue() {
        return this.f90105a;
    }

    public int hashCode() {
        return this.f90107c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f90107c + "'}";
    }

    public void update(@efb T t, @efb MessageDigest messageDigest) {
        this.f90106b.update(getKeyBytes(), t, messageDigest);
    }

    @efb
    public static <T> v6c<T> disk(@efb String str, @hib T t, @efb InterfaceC13888b<T> interfaceC13888b) {
        return new v6c<>(str, t, interfaceC13888b);
    }

    @efb
    public static <T> v6c<T> memory(@efb String str, @efb T t) {
        return new v6c<>(str, t, emptyUpdater());
    }
}
