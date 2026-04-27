package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothManager;
import android.content.ContentResolver;
import android.content.Context;
import android.location.LocationManager;
import android.os.Build;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p000.cj2;
import p000.fee;
import p000.p7e;

/* JADX INFO: loaded from: classes6.dex */
@cj2(modules = {AbstractC0031d.class})
@l42
public interface a32 {

    /* JADX INFO: renamed from: a32$a */
    public static class C0028a {

        /* JADX INFO: renamed from: a */
        public static final String f238a = "enable-notification-value";

        /* JADX INFO: renamed from: b */
        public static final String f239b = "enable-indication-value";

        /* JADX INFO: renamed from: c */
        public static final String f240c = "disable-notification-value";

        private C0028a() {
        }
    }

    /* JADX INFO: renamed from: a32$b */
    @cj2.InterfaceC2328a
    public interface InterfaceC0029b {
        @d31
        InterfaceC0029b applicationContext(Context context);

        a32 build();
    }

    /* JADX INFO: renamed from: a32$c */
    @p7e({p7e.EnumC10826a.f69935b})
    public interface InterfaceC0030c {
        void onFinalize();
    }

    /* JADX INFO: renamed from: a32$d */
    @wxa(subcomponents = {d84.class})
    public static abstract class AbstractC0031d {

        /* JADX INFO: renamed from: a32$d$a */
        public class a implements InterfaceC0030c {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ExecutorService f241a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ woe f242b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ ExecutorService f243c;

            public a(ExecutorService executorService, woe woeVar, ExecutorService executorService2) {
                this.f241a = executorService;
                this.f242b = woeVar;
                this.f243c = executorService2;
            }

            @Override // p000.a32.InterfaceC0030c
            public void onFinalize() {
                this.f241a.shutdown();
                this.f242b.shutdown();
                this.f243c.shutdown();
            }
        }

        @pid
        /* JADX INFO: renamed from: A */
        public static ene m91A(@w8b(C0035h.f252b) int i, hid<fne> hidVar, hid<hne> hidVar2) {
            return i < 24 ? hidVar.get() : hidVar2.get();
        }

        @l42
        @pid
        /* JADX INFO: renamed from: C */
        public static une m92C(@w8b(C0035h.f252b) int i, hid<vne> hidVar, hid<xne> hidVar2, hid<zne> hidVar3) {
            return i < 21 ? hidVar.get() : i < 23 ? hidVar2.get() : hidVar3.get();
        }

        @pid
        @w8b(C0035h.f251a)
        /* JADX INFO: renamed from: D */
        public static int m93D(Context context) {
            try {
                return context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion;
            } catch (Throwable unused) {
                return Integer.MAX_VALUE;
            }
        }

        @hib
        @pid
        /* JADX INFO: renamed from: f */
        public static BluetoothAdapter m94f() {
            return BluetoothAdapter.getDefaultAdapter();
        }

        @l42
        @pid
        @w8b(C0034g.f250d)
        /* JADX INFO: renamed from: g */
        public static woe m95g() {
            return ofe.createSingleScheduler(new nfe());
        }

        @l42
        @pid
        @w8b(C0033f.f245a)
        /* JADX INFO: renamed from: h */
        public static ExecutorService m96h() {
            return Executors.newSingleThreadExecutor();
        }

        @l42
        @pid
        @w8b(C0034g.f249c)
        /* JADX INFO: renamed from: i */
        public static woe m97i(@w8b(C0033f.f245a) ExecutorService executorService) {
            return mpe.from(executorService);
        }

        @pid
        /* JADX INFO: renamed from: j */
        public static BluetoothManager m98j(Context context) {
            return (BluetoothManager) context.getSystemService("bluetooth");
        }

        @pid
        @w8b(C0034g.f247a)
        /* JADX INFO: renamed from: k */
        public static woe m99k() {
            return mpe.computation();
        }

        @l42
        @pid
        @w8b(C0033f.f246b)
        /* JADX INFO: renamed from: l */
        public static ExecutorService m100l() {
            return Executors.newCachedThreadPool();
        }

        @pid
        /* JADX INFO: renamed from: m */
        public static ContentResolver m101m(Context context) {
            return context.getContentResolver();
        }

        @pid
        @w8b(C0035h.f252b)
        /* JADX INFO: renamed from: n */
        public static int m102n() {
            return Build.VERSION.SDK_INT;
        }

        @pid
        @w8b(C0028a.f240c)
        /* JADX INFO: renamed from: o */
        public static byte[] m103o() {
            return BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE;
        }

        @pid
        @w8b(C0028a.f239b)
        /* JADX INFO: renamed from: p */
        public static byte[] m104p() {
            return BluetoothGattDescriptor.ENABLE_INDICATION_VALUE;
        }

        @pid
        @w8b(C0028a.f238a)
        /* JADX INFO: renamed from: q */
        public static byte[] m105q() {
            return BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE;
        }

        @pid
        /* JADX INFO: renamed from: r */
        public static InterfaceC0030c m106r(@w8b(C0033f.f245a) ExecutorService executorService, @w8b(C0034g.f250d) woe woeVar, @w8b(C0033f.f246b) ExecutorService executorService2) {
            return new a(executorService, woeVar, executorService2);
        }

        @igg({"InlinedApi"})
        @pid
        @w8b(C0035h.f253c)
        /* JADX INFO: renamed from: s */
        public static boolean m107s(Context context, @w8b(C0035h.f252b) int i) {
            return i >= 20 && context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
        }

        @l42
        @pid
        /* JADX INFO: renamed from: t */
        public static hf8 m108t(@w8b(C0035h.f252b) int i, hid<if8> hidVar, hid<kf8> hidVar2) {
            return i < 26 ? hidVar.get() : hidVar2.get();
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
        
            if ((r4.requestedPermissionsFlags[r1] & 65536) == 0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
        
            return false;
         */
        @p000.l42
        @p000.pid
        @p000.w8b(p000.a32.C0035h.f254d)
        /* JADX INFO: renamed from: u */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static boolean m109u(android.content.Context r4) {
            /*
                r0 = 0
                android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2d
                java.lang.String r4 = r4.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2d
                r2 = 4096(0x1000, float:5.74E-42)
                android.content.pm.PackageInfo r4 = r1.getPackageInfo(r4, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2d
                r1 = r0
            L10:
                java.lang.String[] r2 = r4.requestedPermissions     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2d
                int r3 = r2.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2d
                if (r1 >= r3) goto L35
                java.lang.String r3 = "android.permission.BLUETOOTH_SCAN"
                r2 = r2[r1]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2d
                boolean r2 = r3.equals(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2d
                if (r2 != 0) goto L22
                int r1 = r1 + 1
                goto L10
            L22:
                int[] r4 = r4.requestedPermissionsFlags     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2d
                r4 = r4[r1]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2d
                r1 = 65536(0x10000, float:9.1835E-41)
                r4 = r4 & r1
                if (r4 == 0) goto L2c
                r0 = 1
            L2c:
                return r0
            L2d:
                r4 = move-exception
                java.lang.String r1 = "Could not find application PackageInfo"
                java.lang.Object[] r2 = new java.lang.Object[r0]
                p000.kfe.m14725e(r4, r1, r2)
            L35:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.a32.AbstractC0031d.m109u(android.content.Context):boolean");
        }

        @pid
        /* JADX INFO: renamed from: v */
        public static LocationManager m110v(Context context) {
            return (LocationManager) context.getSystemService(FirebaseAnalytics.C3552d.f23227s);
        }

        @pid
        @w8b(C0032e.f244a)
        /* JADX INFO: renamed from: w */
        public static vkb<Boolean> m111w(@w8b(C0035h.f252b) int i, xg9 xg9Var) {
            return i < 23 ? vwb.justOnNext(Boolean.TRUE) : xg9Var.get();
        }

        @pid
        /* JADX INFO: renamed from: x */
        public static ah9 m112x(@w8b(C0035h.f252b) int i, hid<bh9> hidVar, hid<dh9> hidVar2, hid<fh9> hidVar3) {
            return i < 23 ? hidVar.get() : i < 31 ? hidVar2.get() : hidVar3.get();
        }

        @pid
        @w8b(C0035h.f256f)
        /* JADX INFO: renamed from: y */
        public static String[][] m113y(@w8b(C0035h.f252b) int i, @w8b(C0035h.f251a) int i2) {
            return Math.min(i, i2) < 31 ? new String[0][] : new String[][]{new String[]{xnc.f98625v}};
        }

        @pid
        @w8b(C0035h.f255e)
        /* JADX INFO: renamed from: z */
        public static String[][] m114z(@w8b(C0035h.f252b) int i, @w8b(C0035h.f251a) int i2, @w8b(C0035h.f254d) boolean z) {
            int iMin = Math.min(i, i2);
            return iMin < 23 ? new String[0][] : iMin < 29 ? new String[][]{new String[]{xnc.f98584I, xnc.f98583H}} : iMin < 31 ? new String[][]{new String[]{xnc.f98583H}} : z ? new String[][]{new String[]{xnc.f98624u}} : new String[][]{new String[]{xnc.f98624u}, new String[]{xnc.f98583H}};
        }

        @a31
        /* JADX INFO: renamed from: B */
        public abstract sy6<ife, pne> m115B(wb8 wb8Var);

        @a31
        /* JADX INFO: renamed from: a */
        public abstract go0 m116a(ho0 ho0Var);

        @l42
        @a31
        /* JADX INFO: renamed from: b */
        public abstract g42 m117b(h42 h42Var);

        @l42
        @a31
        /* JADX INFO: renamed from: c */
        public abstract jee m118c(see seeVar);

        @a31
        /* JADX INFO: renamed from: d */
        public abstract vkb<fee.C5754b> m119d(fee feeVar);

        @a31
        @w8b(C0034g.f248b)
        /* JADX INFO: renamed from: e */
        public abstract woe m120e(@w8b(C0034g.f247a) woe woeVar);
    }

    /* JADX INFO: renamed from: a32$e */
    public static class C0032e {

        /* JADX INFO: renamed from: a */
        public static final String f244a = "location-ok-boolean-observable";

        private C0032e() {
        }
    }

    /* JADX INFO: renamed from: a32$f */
    public static class C0033f {

        /* JADX INFO: renamed from: a */
        public static final String f245a = "executor_bluetooth_interaction";

        /* JADX INFO: renamed from: b */
        public static final String f246b = "executor_connection_queue";

        private C0033f() {
        }
    }

    /* JADX INFO: renamed from: a32$g */
    public static class C0034g {

        /* JADX INFO: renamed from: a */
        public static final String f247a = "computation";

        /* JADX INFO: renamed from: b */
        public static final String f248b = "timeout";

        /* JADX INFO: renamed from: c */
        public static final String f249c = "bluetooth_interaction";

        /* JADX INFO: renamed from: d */
        public static final String f250d = "bluetooth_callbacks";

        private C0034g() {
        }
    }

    /* JADX INFO: renamed from: a32$h */
    public static class C0035h {

        /* JADX INFO: renamed from: a */
        public static final String f251a = "target-sdk";

        /* JADX INFO: renamed from: b */
        public static final String f252b = "device-sdk";

        /* JADX INFO: renamed from: c */
        public static final String f253c = "android-wear";

        /* JADX INFO: renamed from: d */
        public static final String f254d = "nearby-permission-never-for-location";

        /* JADX INFO: renamed from: e */
        public static final String f255e = "scan-permissions";

        /* JADX INFO: renamed from: f */
        public static final String f256f = "connect-permissions";

        private C0035h() {
        }
    }

    wg9 locationServicesOkObservable();

    jee rxBleClient();
}
