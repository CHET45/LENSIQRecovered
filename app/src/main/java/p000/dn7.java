package p000;

import android.text.TextUtils;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000.gh3;

/* JADX INFO: loaded from: classes3.dex */
public interface dn7 extends gh3 {

    /* JADX INFO: renamed from: a */
    @ovh
    public static final l8d<String> f30187a = new l8d() { // from class: cn7
        @Override // p000.l8d
        public final boolean apply(Object obj) {
            return dn7.lambda$static$0((String) obj);
        }
    };

    /* JADX INFO: renamed from: dn7$a */
    @ovh
    public static abstract class AbstractC4877a implements InterfaceC4879c {

        /* JADX INFO: renamed from: a */
        public final C4883g f30188a = new C4883g();

        /* JADX INFO: renamed from: a */
        public abstract dn7 m9273a(C4883g c4883g);

        @Override // p000.dn7.InterfaceC4879c
        @op1
        public final InterfaceC4879c setDefaultRequestProperties(Map<String, String> map) {
            this.f30188a.clearAndSet(map);
            return this;
        }

        @Override // p000.dn7.InterfaceC4879c, p000.gh3.InterfaceC6313a
        public final dn7 createDataSource() {
            return m9273a(this.f30188a);
        }
    }

    /* JADX INFO: renamed from: dn7$b */
    public static final class C4878b extends C4880d {
        @ovh
        public C4878b(IOException iOException, xh3 xh3Var) {
            super("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, xh3Var, 2007, 1);
        }
    }

    /* JADX INFO: renamed from: dn7$c */
    public interface InterfaceC4879c extends gh3.InterfaceC6313a {
        @Override // p000.gh3.InterfaceC6313a
        @ovh
        dn7 createDataSource();

        @ovh
        InterfaceC4879c setDefaultRequestProperties(Map<String, String> map);
    }

    /* JADX INFO: renamed from: dn7$d */
    public static class C4880d extends sh3 {

        /* JADX INFO: renamed from: e */
        public static final int f30189e = 1;

        /* JADX INFO: renamed from: f */
        public static final int f30190f = 2;

        /* JADX INFO: renamed from: m */
        public static final int f30191m = 3;

        /* JADX INFO: renamed from: c */
        @ovh
        public final xh3 f30192c;

        /* JADX INFO: renamed from: d */
        public final int f30193d;

        /* JADX INFO: renamed from: dn7$d$a */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        @ovh
        @Deprecated
        public C4880d(xh3 xh3Var, int i) {
            this(xh3Var, 2000, i);
        }

        private static int assignErrorCode(int i, int i2) {
            if (i == 2000 && i2 == 1) {
                return 2001;
            }
            return i;
        }

        @ovh
        public static C4880d createForIOException(IOException iOException, xh3 xh3Var, int i) {
            String message = iOException.getMessage();
            int i2 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !i80.toLowerCase(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
            return i2 == 2007 ? new C4878b(iOException, xh3Var) : new C4880d(iOException, xh3Var, i2, i);
        }

        @ovh
        public C4880d(xh3 xh3Var, int i, int i2) {
            super(assignErrorCode(i, i2));
            this.f30192c = xh3Var;
            this.f30193d = i2;
        }

        @ovh
        @Deprecated
        public C4880d(String str, xh3 xh3Var, int i) {
            this(str, xh3Var, 2000, i);
        }

        @ovh
        public C4880d(String str, xh3 xh3Var, int i, int i2) {
            super(str, assignErrorCode(i, i2));
            this.f30192c = xh3Var;
            this.f30193d = i2;
        }

        @ovh
        @Deprecated
        public C4880d(IOException iOException, xh3 xh3Var, int i) {
            this(iOException, xh3Var, 2000, i);
        }

        @ovh
        public C4880d(IOException iOException, xh3 xh3Var, int i, int i2) {
            super(iOException, assignErrorCode(i, i2));
            this.f30192c = xh3Var;
            this.f30193d = i2;
        }

        @ovh
        @Deprecated
        public C4880d(String str, IOException iOException, xh3 xh3Var, int i) {
            this(str, iOException, xh3Var, 2000, i);
        }

        @ovh
        public C4880d(String str, @hib IOException iOException, xh3 xh3Var, int i, int i2) {
            super(str, iOException, assignErrorCode(i, i2));
            this.f30192c = xh3Var;
            this.f30193d = i2;
        }
    }

    /* JADX INFO: renamed from: dn7$e */
    public static final class C4881e extends C4880d {

        /* JADX INFO: renamed from: C */
        public final String f30194C;

        @ovh
        public C4881e(String str, xh3 xh3Var) {
            super("Invalid content type: " + str, xh3Var, 2003, 1);
            this.f30194C = str;
        }
    }

    /* JADX INFO: renamed from: dn7$f */
    public static final class C4882f extends C4880d {

        /* JADX INFO: renamed from: C */
        public final int f30195C;

        /* JADX INFO: renamed from: F */
        @hib
        public final String f30196F;

        /* JADX INFO: renamed from: H */
        @ovh
        public final Map<String, List<String>> f30197H;

        /* JADX INFO: renamed from: L */
        public final byte[] f30198L;

        @ovh
        public C4882f(int i, @hib String str, @hib IOException iOException, Map<String, List<String>> map, xh3 xh3Var, byte[] bArr) {
            super("Response code: " + i, iOException, xh3Var, 2004, 1);
            this.f30195C = i;
            this.f30196F = str;
            this.f30197H = map;
            this.f30198L = bArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ boolean lambda$static$0(String str) {
        if (str == null) {
            return false;
        }
        String lowerCase = i80.toLowerCase(str);
        if (TextUtils.isEmpty(lowerCase)) {
            return false;
        }
        return ((lowerCase.contains("text") && !lowerCase.contains("text/vtt")) || lowerCase.contains("html") || lowerCase.contains("xml")) ? false : true;
    }

    @ovh
    void clearAllRequestProperties();

    @ovh
    void clearRequestProperty(String str);

    @Override // p000.gh3
    @ovh
    void close() throws C4880d;

    @ovh
    int getResponseCode();

    @Override // p000.gh3
    @ovh
    Map<String, List<String>> getResponseHeaders();

    @Override // p000.gh3
    @ovh
    long open(xh3 xh3Var) throws C4880d;

    @Override // p000.bh3
    @ovh
    int read(byte[] bArr, int i, int i2) throws C4880d;

    @ovh
    void setRequestProperty(String str, String str2);

    /* JADX INFO: renamed from: dn7$g */
    @ovh
    public static final class C4883g {

        /* JADX INFO: renamed from: a */
        public final Map<String, String> f30199a = new HashMap();

        /* JADX INFO: renamed from: b */
        @hib
        public Map<String, String> f30200b;

        public synchronized void clear() {
            this.f30200b = null;
            this.f30199a.clear();
        }

        public synchronized void clearAndSet(Map<String, String> map) {
            this.f30200b = null;
            this.f30199a.clear();
            this.f30199a.putAll(map);
        }

        public synchronized Map<String, String> getSnapshot() {
            try {
                if (this.f30200b == null) {
                    this.f30200b = Collections.unmodifiableMap(new HashMap(this.f30199a));
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.f30200b;
        }

        public synchronized void remove(String str) {
            this.f30200b = null;
            this.f30199a.remove(str);
        }

        public synchronized void set(String str, String str2) {
            this.f30200b = null;
            this.f30199a.put(str, str2);
        }

        public synchronized void set(Map<String, String> map) {
            this.f30200b = null;
            this.f30199a.putAll(map);
        }
    }
}
