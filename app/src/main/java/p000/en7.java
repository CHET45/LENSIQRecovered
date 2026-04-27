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
import p000.ih3;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface en7 extends ih3 {

    /* JADX INFO: renamed from: a */
    public static final l8d<String> f33587a = new l8d() { // from class: bn7
        @Override // p000.l8d
        public final boolean apply(Object obj) {
            return en7.lambda$static$0((String) obj);
        }
    };

    /* JADX INFO: renamed from: en7$a */
    public static abstract class AbstractC5405a implements InterfaceC5407c {

        /* JADX INFO: renamed from: a */
        public final C5411g f33588a = new C5411g();

        /* JADX INFO: renamed from: a */
        public abstract en7 m10158a(C5411g c5411g);

        @Override // p000.en7.InterfaceC5407c
        @op1
        public final InterfaceC5407c setDefaultRequestProperties(Map<String, String> map) {
            this.f33588a.clearAndSet(map);
            return this;
        }

        @Override // p000.en7.InterfaceC5407c, p000.ih3.InterfaceC7283a
        public final en7 createDataSource() {
            return m10158a(this.f33588a);
        }
    }

    /* JADX INFO: renamed from: en7$b */
    public static final class C5406b extends C5408d {
        public C5406b(IOException iOException, yh3 yh3Var) {
            super("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, yh3Var, 2007, 1);
        }
    }

    /* JADX INFO: renamed from: en7$c */
    public interface InterfaceC5407c extends ih3.InterfaceC7283a {
        @Override // p000.ih3.InterfaceC7283a
        en7 createDataSource();

        InterfaceC5407c setDefaultRequestProperties(Map<String, String> map);
    }

    /* JADX INFO: renamed from: en7$d */
    public static class C5408d extends rh3 {

        /* JADX INFO: renamed from: e */
        public static final int f33589e = 1;

        /* JADX INFO: renamed from: f */
        public static final int f33590f = 2;

        /* JADX INFO: renamed from: m */
        public static final int f33591m = 3;

        /* JADX INFO: renamed from: c */
        public final yh3 f33592c;

        /* JADX INFO: renamed from: d */
        public final int f33593d;

        /* JADX INFO: renamed from: en7$d$a */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        @Deprecated
        public C5408d(yh3 yh3Var, int i) {
            this(yh3Var, 2000, i);
        }

        private static int assignErrorCode(int i, int i2) {
            if (i == 2000 && i2 == 1) {
                return 2001;
            }
            return i;
        }

        public static C5408d createForIOException(IOException iOException, yh3 yh3Var, int i) {
            String message = iOException.getMessage();
            int i2 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !i80.toLowerCase(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
            return i2 == 2007 ? new C5406b(iOException, yh3Var) : new C5408d(iOException, yh3Var, i2, i);
        }

        public C5408d(yh3 yh3Var, int i, int i2) {
            super(assignErrorCode(i, i2));
            this.f33592c = yh3Var;
            this.f33593d = i2;
        }

        @Deprecated
        public C5408d(String str, yh3 yh3Var, int i) {
            this(str, yh3Var, 2000, i);
        }

        public C5408d(String str, yh3 yh3Var, int i, int i2) {
            super(str, assignErrorCode(i, i2));
            this.f33592c = yh3Var;
            this.f33593d = i2;
        }

        @Deprecated
        public C5408d(IOException iOException, yh3 yh3Var, int i) {
            this(iOException, yh3Var, 2000, i);
        }

        public C5408d(IOException iOException, yh3 yh3Var, int i, int i2) {
            super(iOException, assignErrorCode(i, i2));
            this.f33592c = yh3Var;
            this.f33593d = i2;
        }

        @Deprecated
        public C5408d(String str, IOException iOException, yh3 yh3Var, int i) {
            this(str, iOException, yh3Var, 2000, i);
        }

        public C5408d(String str, @hib IOException iOException, yh3 yh3Var, int i, int i2) {
            super(str, iOException, assignErrorCode(i, i2));
            this.f33592c = yh3Var;
            this.f33593d = i2;
        }
    }

    /* JADX INFO: renamed from: en7$e */
    public static final class C5409e extends C5408d {

        /* JADX INFO: renamed from: C */
        public final String f33594C;

        public C5409e(String str, yh3 yh3Var) {
            super("Invalid content type: " + str, yh3Var, 2003, 1);
            this.f33594C = str;
        }
    }

    /* JADX INFO: renamed from: en7$f */
    public static final class C5410f extends C5408d {

        /* JADX INFO: renamed from: C */
        public final int f33595C;

        /* JADX INFO: renamed from: F */
        @hib
        public final String f33596F;

        /* JADX INFO: renamed from: H */
        public final Map<String, List<String>> f33597H;

        /* JADX INFO: renamed from: L */
        public final byte[] f33598L;

        public C5410f(int i, @hib String str, @hib IOException iOException, Map<String, List<String>> map, yh3 yh3Var, byte[] bArr) {
            super("Response code: " + i, iOException, yh3Var, 2004, 1);
            this.f33595C = i;
            this.f33596F = str;
            this.f33597H = map;
            this.f33598L = bArr;
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

    void clearAllRequestProperties();

    void clearRequestProperty(String str);

    void close() throws C5408d;

    int getResponseCode();

    Map<String, List<String>> getResponseHeaders();

    long open(yh3 yh3Var) throws C5408d;

    int read(byte[] bArr, int i, int i2) throws C5408d;

    void setRequestProperty(String str, String str2);

    /* JADX INFO: renamed from: en7$g */
    public static final class C5411g {

        /* JADX INFO: renamed from: a */
        public final Map<String, String> f33599a = new HashMap();

        /* JADX INFO: renamed from: b */
        @hib
        public Map<String, String> f33600b;

        public synchronized void clear() {
            this.f33600b = null;
            this.f33599a.clear();
        }

        public synchronized void clearAndSet(Map<String, String> map) {
            this.f33600b = null;
            this.f33599a.clear();
            this.f33599a.putAll(map);
        }

        public synchronized Map<String, String> getSnapshot() {
            try {
                if (this.f33600b == null) {
                    this.f33600b = Collections.unmodifiableMap(new HashMap(this.f33599a));
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.f33600b;
        }

        public synchronized void remove(String str) {
            this.f33600b = null;
            this.f33599a.remove(str);
        }

        public synchronized void set(String str, String str2) {
            this.f33600b = null;
            this.f33599a.put(str, str2);
        }

        public synchronized void set(Map<String, String> map) {
            this.f33600b = null;
            this.f33599a.putAll(map);
        }
    }
}
