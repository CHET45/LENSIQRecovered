package p000;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p000.p7e;

/* JADX INFO: renamed from: g6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6140g6 {

    /* JADX INFO: renamed from: A */
    public static final int f38843A = 64;

    /* JADX INFO: renamed from: B */
    public static final int f38844B = 128;

    /* JADX INFO: renamed from: C */
    public static final int f38845C = 256;

    /* JADX INFO: renamed from: D */
    public static final int f38846D = 512;

    /* JADX INFO: renamed from: E */
    public static final int f38847E = 1024;

    /* JADX INFO: renamed from: F */
    public static final int f38848F = 2048;

    /* JADX INFO: renamed from: G */
    public static final int f38849G = 4096;

    /* JADX INFO: renamed from: H */
    public static final int f38850H = -1;

    /* JADX INFO: renamed from: a */
    @Deprecated
    public static final int f38851a = 128;

    /* JADX INFO: renamed from: b */
    @Deprecated
    public static final int f38852b = 256;

    /* JADX INFO: renamed from: c */
    @Deprecated
    public static final int f38853c = 512;

    /* JADX INFO: renamed from: d */
    @Deprecated
    public static final int f38854d = 1024;

    /* JADX INFO: renamed from: e */
    @Deprecated
    public static final int f38855e = 2048;

    /* JADX INFO: renamed from: f */
    @Deprecated
    public static final int f38856f = 4096;

    /* JADX INFO: renamed from: g */
    @Deprecated
    public static final int f38857g = 8192;

    /* JADX INFO: renamed from: h */
    public static final int f38858h = 16384;

    /* JADX INFO: renamed from: i */
    public static final int f38859i = 32768;

    /* JADX INFO: renamed from: j */
    public static final int f38860j = 65536;

    /* JADX INFO: renamed from: k */
    public static final int f38861k = 131072;

    /* JADX INFO: renamed from: l */
    public static final int f38862l = 262144;

    /* JADX INFO: renamed from: m */
    public static final int f38863m = 524288;

    /* JADX INFO: renamed from: n */
    public static final int f38864n = 1048576;

    /* JADX INFO: renamed from: o */
    public static final int f38865o = 2097152;

    /* JADX INFO: renamed from: p */
    public static final int f38866p = 4194304;

    /* JADX INFO: renamed from: q */
    public static final int f38867q = 8388608;

    /* JADX INFO: renamed from: r */
    public static final int f38868r = 16777216;

    /* JADX INFO: renamed from: s */
    public static final int f38869s = 67108864;

    /* JADX INFO: renamed from: t */
    public static final int f38870t = 0;

    /* JADX INFO: renamed from: u */
    public static final int f38871u = 1;

    /* JADX INFO: renamed from: v */
    public static final int f38872v = 2;

    /* JADX INFO: renamed from: w */
    public static final int f38873w = 4;

    /* JADX INFO: renamed from: x */
    public static final int f38874x = 8;

    /* JADX INFO: renamed from: y */
    public static final int f38875y = 16;

    /* JADX INFO: renamed from: z */
    public static final int f38876z = 32;

    /* JADX INFO: renamed from: g6$a */
    @c5e(34)
    public static class a {
        private a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static boolean m11412a(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.isAccessibilityDataSensitive();
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static void m11413b(AccessibilityEvent accessibilityEvent, boolean z) {
            accessibilityEvent.setAccessibilityDataSensitive(z);
        }
    }

    /* JADX INFO: renamed from: g6$b */
    @Retention(RetentionPolicy.SOURCE)
    @p7e({p7e.EnumC10826a.f69936c})
    public @interface b {
    }

    private C6140g6() {
    }

    @Deprecated
    public static void appendRecord(AccessibilityEvent accessibilityEvent, C9716n7 c9716n7) {
        accessibilityEvent.appendRecord((AccessibilityRecord) c9716n7.getImpl());
    }

    @Deprecated
    public static C9716n7 asRecord(AccessibilityEvent accessibilityEvent) {
        return new C9716n7(accessibilityEvent);
    }

    public static int getAction(@efb AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getAction();
    }

    @igg({"WrongConstant"})
    public static int getContentChangeTypes(@efb AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    public static int getMovementGranularity(@efb AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getMovementGranularity();
    }

    @Deprecated
    public static C9716n7 getRecord(AccessibilityEvent accessibilityEvent, int i) {
        return new C9716n7(accessibilityEvent.getRecord(i));
    }

    @Deprecated
    public static int getRecordCount(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getRecordCount();
    }

    public static boolean isAccessibilityDataSensitive(@efb AccessibilityEvent accessibilityEvent) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.m11412a(accessibilityEvent);
        }
        return false;
    }

    public static void setAccessibilityDataSensitive(@efb AccessibilityEvent accessibilityEvent, boolean z) {
        if (Build.VERSION.SDK_INT >= 34) {
            a.m11413b(accessibilityEvent, z);
        }
    }

    public static void setAction(@efb AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setAction(i);
    }

    public static void setContentChangeTypes(@efb AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setContentChangeTypes(i);
    }

    public static void setMovementGranularity(@efb AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setMovementGranularity(i);
    }
}
