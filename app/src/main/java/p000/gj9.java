package p000;

import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.arthenica.ffmpegkit.MediaInformation;
import com.blankj.utilcode.util.C2473f;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gj9 {

    /* JADX INFO: renamed from: d */
    @yfb
    public static final C6339b f39941d = new C6339b(null);

    /* JADX INFO: renamed from: e */
    @yfb
    public static final ConcurrentHashMap<String, gj9> f39942e = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a */
    @yfb
    public final String f39943a;

    /* JADX INFO: renamed from: b */
    public boolean f39944b;

    /* JADX INFO: renamed from: c */
    @yfb
    public EnumC6341d f39945c;

    /* JADX INFO: renamed from: gj9$a */
    @dwf({"SMAP\nLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Logger.kt\ncom/google/firebase/logger/Logger$AndroidLogger\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1#2:197\n*E\n"})
    public static final class C6338a extends gj9 {

        /* JADX INFO: renamed from: gj9$a$a */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f39946a;

            static {
                int[] iArr = new int[EnumC6341d.values().length];
                try {
                    iArr[EnumC6341d.f39949b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC6341d.f39950c.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC6341d.f39951d.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC6341d.f39952e.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC6341d.f39953f.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f39946a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6338a(@yfb String str, boolean z, @yfb EnumC6341d enumC6341d) {
            super(str, z, enumC6341d, null);
            md8.checkNotNullParameter(str, "tag");
            md8.checkNotNullParameter(enumC6341d, "minLevel");
        }

        @Override // p000.gj9
        public int log(@yfb EnumC6341d enumC6341d, @yfb String str, @yfb Object[] objArr, @gib Throwable th) {
            md8.checkNotNullParameter(enumC6341d, FirebaseAnalytics.C3552d.f23228t);
            md8.checkNotNullParameter(str, MediaInformation.KEY_FORMAT_PROPERTIES);
            md8.checkNotNullParameter(objArr, C2473f.f17565y);
            if (objArr.length != 0) {
                l7g l7gVar = l7g.f56714a;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                str = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                md8.checkNotNullExpressionValue(str, "format(...)");
            }
            int i = a.f39946a[enumC6341d.ordinal()];
            if (i == 1) {
                String tag = getTag();
                return th != null ? Log.v(tag, str, th) : Log.v(tag, str);
            }
            if (i == 2) {
                String tag2 = getTag();
                return th != null ? Log.d(tag2, str, th) : Log.d(tag2, str);
            }
            if (i == 3) {
                String tag3 = getTag();
                return th != null ? Log.i(tag3, str, th) : Log.i(tag3, str);
            }
            if (i == 4) {
                String tag4 = getTag();
                return th != null ? Log.w(tag4, str, th) : Log.w(tag4, str);
            }
            if (i != 5) {
                throw new ceb();
            }
            String tag5 = getTag();
            return th != null ? Log.e(tag5, str, th) : Log.e(tag5, str);
        }
    }

    /* JADX INFO: renamed from: gj9$b */
    @dwf({"SMAP\nLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Logger.kt\ncom/google/firebase/logger/Logger$Companion\n+ 2 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n72#2,2:197\n1#3:199\n*S KotlinDebug\n*F\n+ 1 Logger.kt\ncom/google/firebase/logger/Logger$Companion\n*L\n180#1:197,2\n180#1:199\n*E\n"})
    public static final class C6339b {
        public /* synthetic */ C6339b(jt3 jt3Var) {
            this();
        }

        public static /* synthetic */ gj9 getLogger$default(C6339b c6339b, String str, boolean z, EnumC6341d enumC6341d, int i, Object obj) {
            if ((i & 2) != 0) {
                z = true;
            }
            if ((i & 4) != 0) {
                enumC6341d = EnumC6341d.f39951d;
            }
            return c6339b.getLogger(str, z, enumC6341d);
        }

        public static /* synthetic */ C6340c setupFakeLogger$default(C6339b c6339b, String str, boolean z, EnumC6341d enumC6341d, int i, Object obj) {
            if ((i & 2) != 0) {
                z = true;
            }
            if ((i & 4) != 0) {
                enumC6341d = EnumC6341d.f39950c;
            }
            return c6339b.setupFakeLogger(str, z, enumC6341d);
        }

        @do8
        @yfb
        public final gj9 getLogger(@yfb String str, boolean z, @yfb EnumC6341d enumC6341d) {
            Object objPutIfAbsent;
            md8.checkNotNullParameter(str, "tag");
            md8.checkNotNullParameter(enumC6341d, "minLevel");
            ConcurrentHashMap concurrentHashMap = gj9.f39942e;
            Object c6338a = concurrentHashMap.get(str);
            if (c6338a == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(str, (c6338a = new C6338a(str, z, enumC6341d)))) != null) {
                c6338a = objPutIfAbsent;
            }
            md8.checkNotNullExpressionValue(c6338a, "getOrPut(...)");
            return (gj9) c6338a;
        }

        @do8
        @yfb
        @fdi
        public final C6340c setupFakeLogger(@yfb String str, boolean z, @yfb EnumC6341d enumC6341d) {
            md8.checkNotNullParameter(str, "tag");
            md8.checkNotNullParameter(enumC6341d, "minLevel");
            C6340c c6340c = new C6340c(str, z, enumC6341d);
            gj9.f39942e.put(str, c6340c);
            return c6340c;
        }

        private C6339b() {
        }
    }

    /* JADX INFO: renamed from: gj9$c */
    @dwf({"SMAP\nLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Logger.kt\ncom/google/firebase/logger/Logger$FakeLogger\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1755#2,3:197\n1755#2,3:200\n1#3:203\n*S KotlinDebug\n*F\n+ 1 Logger.kt\ncom/google/firebase/logger/Logger$FakeLogger\n*L\n144#1:197,3\n148#1:200,3\n*E\n"})
    @fdi
    public static final class C6340c extends gj9 {

        /* JADX INFO: renamed from: f */
        @yfb
        public final List<String> f39947f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6340c(@yfb String str, boolean z, @yfb EnumC6341d enumC6341d) {
            super(str, z, enumC6341d, null);
            md8.checkNotNullParameter(str, "tag");
            md8.checkNotNullParameter(enumC6341d, "minLevel");
            this.f39947f = new ArrayList();
        }

        private final String toLogMessage(EnumC6341d enumC6341d, String str, Object[] objArr, Throwable th) {
            if (objArr.length != 0) {
                l7g l7gVar = l7g.f56714a;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                str = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                md8.checkNotNullExpressionValue(str, "format(...)");
            }
            if (th != null) {
                String str2 = enumC6341d + ' ' + str + ' ' + Log.getStackTraceString(th);
                if (str2 != null) {
                    return str2;
                }
            }
            return enumC6341d + ' ' + str;
        }

        @fdi
        public final void clearLogMessages() {
            this.f39947f.clear();
        }

        @fdi
        public final boolean hasLogMessage(@yfb String str) {
            md8.checkNotNullParameter(str, g55.f38799h);
            List<String> list = this.f39947f;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (m9g.contains$default((CharSequence) it.next(), (CharSequence) str, false, 2, (Object) null)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @fdi
        public final boolean hasLogMessageThat(@yfb qy6<? super String, Boolean> qy6Var) {
            md8.checkNotNullParameter(qy6Var, "predicate");
            List<String> list = this.f39947f;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (qy6Var.invoke(it.next()).booleanValue()) {
                    return true;
                }
            }
            return false;
        }

        @Override // p000.gj9
        public int log(@yfb EnumC6341d enumC6341d, @yfb String str, @yfb Object[] objArr, @gib Throwable th) {
            md8.checkNotNullParameter(enumC6341d, FirebaseAnalytics.C3552d.f23228t);
            md8.checkNotNullParameter(str, MediaInformation.KEY_FORMAT_PROPERTIES);
            md8.checkNotNullParameter(objArr, C2473f.f17565y);
            String logMessage = toLogMessage(enumC6341d, str, objArr, th);
            System.out.println((Object) ("Log: " + logMessage));
            this.f39947f.add(logMessage);
            return logMessage.length();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: gj9$d */
    public static final class EnumC6341d {

        /* JADX INFO: renamed from: C */
        public static final /* synthetic */ v35 f39948C;

        /* JADX INFO: renamed from: b */
        public static final EnumC6341d f39949b = new EnumC6341d("VERBOSE", 0, 2);

        /* JADX INFO: renamed from: c */
        public static final EnumC6341d f39950c = new EnumC6341d("DEBUG", 1, 3);

        /* JADX INFO: renamed from: d */
        public static final EnumC6341d f39951d = new EnumC6341d("INFO", 2, 4);

        /* JADX INFO: renamed from: e */
        public static final EnumC6341d f39952e = new EnumC6341d("WARN", 3, 5);

        /* JADX INFO: renamed from: f */
        public static final EnumC6341d f39953f = new EnumC6341d("ERROR", 4, 6);

        /* JADX INFO: renamed from: m */
        public static final /* synthetic */ EnumC6341d[] f39954m;

        /* JADX INFO: renamed from: a */
        public final int f39955a;

        private static final /* synthetic */ EnumC6341d[] $values() {
            return new EnumC6341d[]{f39949b, f39950c, f39951d, f39952e, f39953f};
        }

        static {
            EnumC6341d[] enumC6341dArr$values = $values();
            f39954m = enumC6341dArr$values;
            f39948C = x35.enumEntries(enumC6341dArr$values);
        }

        private EnumC6341d(String str, int i, int i2) {
            this.f39955a = i2;
        }

        @yfb
        public static v35<EnumC6341d> getEntries() {
            return f39948C;
        }

        public static EnumC6341d valueOf(String str) {
            return (EnumC6341d) Enum.valueOf(EnumC6341d.class, str);
        }

        public static EnumC6341d[] values() {
            return (EnumC6341d[]) f39954m.clone();
        }

        public final int getPriority$com_google_firebase_firebase_common() {
            return this.f39955a;
        }
    }

    public /* synthetic */ gj9(String str, boolean z, EnumC6341d enumC6341d, jt3 jt3Var) {
        this(str, z, enumC6341d);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m11707a(gj9 gj9Var, EnumC6341d enumC6341d, String str, Object[] objArr, Throwable th, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logIfAble");
        }
        if ((i & 4) != 0) {
            objArr = new Object[0];
        }
        return gj9Var.logIfAble(enumC6341d, str, objArr, th);
    }

    public static /* synthetic */ int debug$default(gj9 gj9Var, String str, Object[] objArr, Throwable th, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: debug");
        }
        if ((i & 4) != 0) {
            th = null;
        }
        return gj9Var.debug(str, objArr, th);
    }

    public static /* synthetic */ int error$default(gj9 gj9Var, String str, Object[] objArr, Throwable th, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
        }
        if ((i & 4) != 0) {
            th = null;
        }
        return gj9Var.error(str, objArr, th);
    }

    @do8
    @yfb
    public static final gj9 getLogger(@yfb String str, boolean z, @yfb EnumC6341d enumC6341d) {
        return f39941d.getLogger(str, z, enumC6341d);
    }

    public static /* synthetic */ int info$default(gj9 gj9Var, String str, Object[] objArr, Throwable th, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: info");
        }
        if ((i & 4) != 0) {
            th = null;
        }
        return gj9Var.info(str, objArr, th);
    }

    private final int logIfAble(EnumC6341d enumC6341d, String str, Object[] objArr, Throwable th) {
        if (!this.f39944b || (this.f39945c.getPriority$com_google_firebase_firebase_common() > enumC6341d.getPriority$com_google_firebase_firebase_common() && !Log.isLoggable(this.f39943a, enumC6341d.getPriority$com_google_firebase_firebase_common()))) {
            return 0;
        }
        return log(enumC6341d, str, objArr, th);
    }

    @do8
    @yfb
    @fdi
    public static final C6340c setupFakeLogger(@yfb String str, boolean z, @yfb EnumC6341d enumC6341d) {
        return f39941d.setupFakeLogger(str, z, enumC6341d);
    }

    public static /* synthetic */ int verbose$default(gj9 gj9Var, String str, Object[] objArr, Throwable th, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verbose");
        }
        if ((i & 4) != 0) {
            th = null;
        }
        return gj9Var.verbose(str, objArr, th);
    }

    public static /* synthetic */ int warn$default(gj9 gj9Var, String str, Object[] objArr, Throwable th, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: warn");
        }
        if ((i & 4) != 0) {
            th = null;
        }
        return gj9Var.warn(str, objArr, th);
    }

    @yn8
    public final int debug(@yfb String str) {
        md8.checkNotNullParameter(str, NotificationCompat.CATEGORY_MESSAGE);
        return debug$default(this, str, null, 2, null);
    }

    @yn8
    public final int error(@yfb String str) {
        md8.checkNotNullParameter(str, NotificationCompat.CATEGORY_MESSAGE);
        return error$default(this, str, null, 2, null);
    }

    public final boolean getEnabled() {
        return this.f39944b;
    }

    @yfb
    public final EnumC6341d getMinLevel() {
        return this.f39945c;
    }

    @yfb
    public final String getTag() {
        return this.f39943a;
    }

    @yn8
    public final int info(@yfb String str) {
        md8.checkNotNullParameter(str, NotificationCompat.CATEGORY_MESSAGE);
        return info$default(this, str, null, 2, null);
    }

    public abstract int log(@yfb EnumC6341d enumC6341d, @yfb String str, @yfb Object[] objArr, @gib Throwable th);

    public final void setEnabled(boolean z) {
        this.f39944b = z;
    }

    public final void setMinLevel(@yfb EnumC6341d enumC6341d) {
        md8.checkNotNullParameter(enumC6341d, "<set-?>");
        this.f39945c = enumC6341d;
    }

    @yn8
    public final int verbose(@yfb String str) {
        md8.checkNotNullParameter(str, NotificationCompat.CATEGORY_MESSAGE);
        return verbose$default(this, str, null, 2, null);
    }

    @yn8
    public final int warn(@yfb String str) {
        md8.checkNotNullParameter(str, NotificationCompat.CATEGORY_MESSAGE);
        return warn$default(this, str, null, 2, null);
    }

    private gj9(String str, boolean z, EnumC6341d enumC6341d) {
        this.f39943a = str;
        this.f39944b = z;
        this.f39945c = enumC6341d;
    }

    public static /* synthetic */ int debug$default(gj9 gj9Var, String str, Throwable th, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: debug");
        }
        if ((i & 2) != 0) {
            th = null;
        }
        return gj9Var.debug(str, th);
    }

    public static /* synthetic */ int error$default(gj9 gj9Var, String str, Throwable th, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
        }
        if ((i & 2) != 0) {
            th = null;
        }
        return gj9Var.error(str, th);
    }

    public static /* synthetic */ int info$default(gj9 gj9Var, String str, Throwable th, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: info");
        }
        if ((i & 2) != 0) {
            th = null;
        }
        return gj9Var.info(str, th);
    }

    public static /* synthetic */ int verbose$default(gj9 gj9Var, String str, Throwable th, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verbose");
        }
        if ((i & 2) != 0) {
            th = null;
        }
        return gj9Var.verbose(str, th);
    }

    public static /* synthetic */ int warn$default(gj9 gj9Var, String str, Throwable th, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: warn");
        }
        if ((i & 2) != 0) {
            th = null;
        }
        return gj9Var.warn(str, th);
    }

    @yn8
    public final int debug(@yfb String str, @yfb Object... objArr) {
        md8.checkNotNullParameter(str, MediaInformation.KEY_FORMAT_PROPERTIES);
        md8.checkNotNullParameter(objArr, C2473f.f17565y);
        return debug$default(this, str, objArr, null, 4, null);
    }

    @yn8
    public final int error(@yfb String str, @yfb Object... objArr) {
        md8.checkNotNullParameter(str, MediaInformation.KEY_FORMAT_PROPERTIES);
        md8.checkNotNullParameter(objArr, C2473f.f17565y);
        return error$default(this, str, objArr, null, 4, null);
    }

    @yn8
    public final int info(@yfb String str, @yfb Object... objArr) {
        md8.checkNotNullParameter(str, MediaInformation.KEY_FORMAT_PROPERTIES);
        md8.checkNotNullParameter(objArr, C2473f.f17565y);
        return info$default(this, str, objArr, null, 4, null);
    }

    @yn8
    public final int verbose(@yfb String str, @yfb Object... objArr) {
        md8.checkNotNullParameter(str, MediaInformation.KEY_FORMAT_PROPERTIES);
        md8.checkNotNullParameter(objArr, C2473f.f17565y);
        return verbose$default(this, str, objArr, null, 4, null);
    }

    @yn8
    public final int warn(@yfb String str, @yfb Object... objArr) {
        md8.checkNotNullParameter(str, MediaInformation.KEY_FORMAT_PROPERTIES);
        md8.checkNotNullParameter(objArr, C2473f.f17565y);
        return warn$default(this, str, objArr, null, 4, null);
    }

    @yn8
    public final int debug(@yfb String str, @yfb Object[] objArr, @gib Throwable th) {
        md8.checkNotNullParameter(str, MediaInformation.KEY_FORMAT_PROPERTIES);
        md8.checkNotNullParameter(objArr, C2473f.f17565y);
        return logIfAble(EnumC6341d.f39950c, str, objArr, th);
    }

    @yn8
    public final int error(@yfb String str, @yfb Object[] objArr, @gib Throwable th) {
        md8.checkNotNullParameter(str, MediaInformation.KEY_FORMAT_PROPERTIES);
        md8.checkNotNullParameter(objArr, C2473f.f17565y);
        return logIfAble(EnumC6341d.f39953f, str, objArr, th);
    }

    @yn8
    public final int info(@yfb String str, @yfb Object[] objArr, @gib Throwable th) {
        md8.checkNotNullParameter(str, MediaInformation.KEY_FORMAT_PROPERTIES);
        md8.checkNotNullParameter(objArr, C2473f.f17565y);
        return logIfAble(EnumC6341d.f39951d, str, objArr, th);
    }

    @yn8
    public final int verbose(@yfb String str, @yfb Object[] objArr, @gib Throwable th) {
        md8.checkNotNullParameter(str, MediaInformation.KEY_FORMAT_PROPERTIES);
        md8.checkNotNullParameter(objArr, C2473f.f17565y);
        return logIfAble(EnumC6341d.f39949b, str, objArr, th);
    }

    @yn8
    public final int warn(@yfb String str, @yfb Object[] objArr, @gib Throwable th) {
        md8.checkNotNullParameter(str, MediaInformation.KEY_FORMAT_PROPERTIES);
        md8.checkNotNullParameter(objArr, C2473f.f17565y);
        return logIfAble(EnumC6341d.f39952e, str, objArr, th);
    }

    @yn8
    public final int debug(@yfb String str, @gib Throwable th) {
        md8.checkNotNullParameter(str, NotificationCompat.CATEGORY_MESSAGE);
        return m11707a(this, EnumC6341d.f39950c, str, null, th, 4, null);
    }

    @yn8
    public final int error(@yfb String str, @gib Throwable th) {
        md8.checkNotNullParameter(str, NotificationCompat.CATEGORY_MESSAGE);
        return m11707a(this, EnumC6341d.f39953f, str, null, th, 4, null);
    }

    @yn8
    public final int info(@yfb String str, @gib Throwable th) {
        md8.checkNotNullParameter(str, NotificationCompat.CATEGORY_MESSAGE);
        return m11707a(this, EnumC6341d.f39951d, str, null, th, 4, null);
    }

    @yn8
    public final int verbose(@yfb String str, @gib Throwable th) {
        md8.checkNotNullParameter(str, NotificationCompat.CATEGORY_MESSAGE);
        return m11707a(this, EnumC6341d.f39949b, str, null, th, 4, null);
    }

    @yn8
    public final int warn(@yfb String str, @gib Throwable th) {
        md8.checkNotNullParameter(str, NotificationCompat.CATEGORY_MESSAGE);
        return m11707a(this, EnumC6341d.f39952e, str, null, th, 4, null);
    }
}
