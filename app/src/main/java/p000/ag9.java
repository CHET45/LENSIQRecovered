package p000;

import android.location.GnssMeasurementsEvent;
import android.location.GnssStatus;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.function.Consumer;
import p000.x77;

/* JADX INFO: loaded from: classes.dex */
public final class ag9 {

    /* JADX INFO: renamed from: a */
    public static final long f1402a = 30000;

    /* JADX INFO: renamed from: b */
    public static final long f1403b = 10000;

    /* JADX INFO: renamed from: c */
    public static final long f1404c = 5;

    /* JADX INFO: renamed from: d */
    public static Field f1405d;

    /* JADX INFO: renamed from: e */
    public static Class<?> f1406e;

    /* JADX INFO: renamed from: f */
    public static Method f1407f;

    /* JADX INFO: renamed from: g */
    public static Method f1408g;

    /* JADX INFO: renamed from: h */
    @xc7("sLocationListeners")
    public static final WeakHashMap<C0230l, WeakReference<C0231m>> f1409h = new WeakHashMap<>();

    /* JADX INFO: renamed from: ag9$a */
    public static class C0219a {

        /* JADX INFO: renamed from: a */
        public static Class<?> f1410a;

        /* JADX INFO: renamed from: b */
        public static Method f1411b;

        private C0219a() {
        }

        @igg({"BanUncheckedReflection"})
        @ih4
        /* JADX INFO: renamed from: a */
        public static boolean m503a(LocationManager locationManager, String str, vg9 vg9Var, wf9 wf9Var, Looper looper) {
            try {
                if (f1410a == null) {
                    f1410a = Class.forName("android.location.LocationRequest");
                }
                if (f1411b == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f1410a, LocationListener.class, Looper.class);
                    f1411b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                LocationRequest locationRequest = vg9Var.toLocationRequest(str);
                if (locationRequest == null) {
                    return false;
                }
                f1411b.invoke(locationManager, locationRequest, wf9Var, looper);
                return true;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
                return false;
            }
        }

        @igg({"BanUncheckedReflection"})
        @ih4
        @j5e(anyOf = {xnc.f98584I, xnc.f98583H})
        /* JADX INFO: renamed from: b */
        public static boolean m504b(LocationManager locationManager, String str, vg9 vg9Var, C0231m c0231m) {
            try {
                if (f1410a == null) {
                    f1410a = Class.forName("android.location.LocationRequest");
                }
                if (f1411b == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f1410a, LocationListener.class, Looper.class);
                    f1411b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                LocationRequest locationRequest = vg9Var.toLocationRequest(str);
                if (locationRequest == null) {
                    return false;
                }
                synchronized (ag9.f1409h) {
                    f1411b.invoke(locationManager, locationRequest, c0231m, Looper.getMainLooper());
                    ag9.m502c(locationManager, c0231m);
                }
                return true;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: ag9$b */
    @c5e(24)
    public static class C0220b {
        private C0220b() {
        }

        @ih4
        @j5e(xnc.f98583H)
        /* JADX INFO: renamed from: a */
        public static boolean m505a(@efb LocationManager locationManager, @efb GnssMeasurementsEvent.Callback callback) {
            return locationManager.registerGnssMeasurementsCallback(callback);
        }

        @ih4
        @j5e(xnc.f98583H)
        /* JADX INFO: renamed from: b */
        public static boolean m506b(@efb LocationManager locationManager, @efb GnssMeasurementsEvent.Callback callback, @efb Handler handler) {
            return locationManager.registerGnssMeasurementsCallback(callback, handler);
        }

        @ih4
        @j5e(anyOf = {xnc.f98584I, xnc.f98583H})
        /* JADX INFO: renamed from: c */
        public static boolean m507c(LocationManager locationManager, Handler handler, Executor executor, x77.AbstractC14964a abstractC14964a) {
            z7d.checkArgument(handler != null);
            scf<Object, Object> scfVar = C0225g.f1420a;
            synchronized (scfVar) {
                try {
                    C0232n c0232n = (C0232n) scfVar.get(abstractC14964a);
                    if (c0232n == null) {
                        c0232n = new C0232n(abstractC14964a);
                    } else {
                        c0232n.unregister();
                    }
                    c0232n.register(executor);
                    if (!locationManager.registerGnssStatusCallback(c0232n, handler)) {
                        return false;
                    }
                    scfVar.put(abstractC14964a, c0232n);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @ih4
        /* JADX INFO: renamed from: d */
        public static void m508d(@efb LocationManager locationManager, @efb GnssMeasurementsEvent.Callback callback) {
            locationManager.unregisterGnssMeasurementsCallback(callback);
        }

        @ih4
        /* JADX INFO: renamed from: e */
        public static void m509e(LocationManager locationManager, Object obj) {
            if (obj instanceof C0232n) {
                ((C0232n) obj).unregister();
            }
            locationManager.unregisterGnssStatusCallback((GnssStatus.Callback) obj);
        }
    }

    /* JADX INFO: renamed from: ag9$c */
    @c5e(28)
    public static class C0221c {
        private C0221c() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static String m510a(LocationManager locationManager) {
            return locationManager.getGnssHardwareModelName();
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static int m511b(LocationManager locationManager) {
            return locationManager.getGnssYearOfHardware();
        }

        @ih4
        /* JADX INFO: renamed from: c */
        public static boolean m512c(LocationManager locationManager) {
            return locationManager.isLocationEnabled();
        }
    }

    /* JADX INFO: renamed from: ag9$d */
    @c5e(30)
    public static class C0222d {

        /* JADX INFO: renamed from: a */
        public static Class<?> f1412a;

        /* JADX INFO: renamed from: b */
        public static Method f1413b;

        private C0222d() {
        }

        @ih4
        @j5e(anyOf = {xnc.f98584I, xnc.f98583H})
        /* JADX INFO: renamed from: a */
        public static void m513a(LocationManager locationManager, @efb String str, @hib CancellationSignal cancellationSignal, @efb Executor executor, @efb final vu2<Location> vu2Var) {
            Objects.requireNonNull(vu2Var);
            locationManager.getCurrentLocation(str, cancellationSignal, executor, new Consumer() { // from class: bg9
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    vu2Var.accept((Location) obj);
                }
            });
        }

        @ih4
        @j5e(anyOf = {xnc.f98584I, xnc.f98583H})
        public static boolean registerGnssStatusCallback(LocationManager locationManager, Handler handler, Executor executor, x77.AbstractC14964a abstractC14964a) {
            scf<Object, Object> scfVar = C0225g.f1420a;
            synchronized (scfVar) {
                try {
                    C0227i c0227i = (C0227i) scfVar.get(abstractC14964a);
                    if (c0227i == null) {
                        c0227i = new C0227i(abstractC14964a);
                    }
                    if (!locationManager.registerGnssStatusCallback(executor, c0227i)) {
                        return false;
                    }
                    scfVar.put(abstractC14964a, c0227i);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @ih4
        public static boolean tryRequestLocationUpdates(LocationManager locationManager, String str, vg9 vg9Var, Executor executor, wf9 wf9Var) {
            if (Build.VERSION.SDK_INT < 30) {
                return false;
            }
            try {
                if (f1412a == null) {
                    f1412a = Class.forName("android.location.LocationRequest");
                }
                if (f1413b == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f1412a, Executor.class, LocationListener.class);
                    f1413b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                LocationRequest locationRequest = vg9Var.toLocationRequest(str);
                if (locationRequest == null) {
                    return false;
                }
                f1413b.invoke(locationManager, locationRequest, executor, wf9Var);
                return true;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: ag9$e */
    @c5e(31)
    public static class C0223e {
        private C0223e() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static boolean m514a(LocationManager locationManager, @efb String str) {
            return locationManager.hasProvider(str);
        }

        @ih4
        @j5e(xnc.f98583H)
        /* JADX INFO: renamed from: b */
        public static boolean m515b(@efb LocationManager locationManager, @efb Executor executor, @efb GnssMeasurementsEvent.Callback callback) {
            return locationManager.registerGnssMeasurementsCallback(executor, callback);
        }

        @ih4
        @j5e(anyOf = {xnc.f98584I, xnc.f98583H})
        /* JADX INFO: renamed from: c */
        public static void m516c(LocationManager locationManager, @efb String str, @efb LocationRequest locationRequest, @efb Executor executor, @efb LocationListener locationListener) {
            locationManager.requestLocationUpdates(str, locationRequest, executor, locationListener);
        }
    }

    /* JADX INFO: renamed from: ag9$f */
    public static final class C0224f implements LocationListener {

        /* JADX INFO: renamed from: a */
        public final LocationManager f1414a;

        /* JADX INFO: renamed from: b */
        public final Executor f1415b;

        /* JADX INFO: renamed from: c */
        public final Handler f1416c = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: d */
        public vu2<Location> f1417d;

        /* JADX INFO: renamed from: e */
        @xc7("this")
        public boolean f1418e;

        /* JADX INFO: renamed from: f */
        @hib
        public Runnable f1419f;

        public C0224f(LocationManager locationManager, Executor executor, vu2<Location> vu2Var) {
            this.f1414a = locationManager;
            this.f1415b = executor;
            this.f1417d = vu2Var;
        }

        @j5e(anyOf = {xnc.f98584I, xnc.f98583H})
        private void cleanup() {
            this.f1417d = null;
            this.f1414a.removeUpdates(this);
            Runnable runnable = this.f1419f;
            if (runnable != null) {
                this.f1416c.removeCallbacks(runnable);
                this.f1419f = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$startTimeout$0() {
            this.f1419f = null;
            onLocationChanged((Location) null);
        }

        @j5e(anyOf = {xnc.f98584I, xnc.f98583H})
        public void cancel() {
            synchronized (this) {
                try {
                    if (this.f1418e) {
                        return;
                    }
                    this.f1418e = true;
                    cleanup();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.location.LocationListener
        @j5e(anyOf = {xnc.f98584I, xnc.f98583H})
        public void onLocationChanged(@hib final Location location) {
            synchronized (this) {
                try {
                    if (this.f1418e) {
                        return;
                    }
                    this.f1418e = true;
                    final vu2<Location> vu2Var = this.f1417d;
                    this.f1415b.execute(new Runnable() { // from class: dg9
                        @Override // java.lang.Runnable
                        public final void run() {
                            vu2Var.accept(location);
                        }
                    });
                    cleanup();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.location.LocationListener
        @j5e(anyOf = {xnc.f98584I, xnc.f98583H})
        public void onProviderDisabled(@efb String str) {
            onLocationChanged((Location) null);
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(@efb String str) {
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i, Bundle bundle) {
        }

        @igg({"MissingPermission"})
        public void startTimeout(long j) {
            synchronized (this) {
                try {
                    if (this.f1418e) {
                        return;
                    }
                    Runnable runnable = new Runnable() { // from class: cg9
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f16473a.lambda$startTimeout$0();
                        }
                    };
                    this.f1419f = runnable;
                    this.f1416c.postDelayed(runnable, j);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ag9$g */
    public static class C0225g {

        /* JADX INFO: renamed from: a */
        @xc7("sGnssStatusListeners")
        public static final scf<Object, Object> f1420a = new scf<>();

        /* JADX INFO: renamed from: b */
        @xc7("sGnssMeasurementListeners")
        public static final scf<GnssMeasurementsEvent.Callback, GnssMeasurementsEvent.Callback> f1421b = new scf<>();

        private C0225g() {
        }
    }

    /* JADX INFO: renamed from: ag9$h */
    @c5e(24)
    public static class C0226h extends GnssMeasurementsEvent.Callback {

        /* JADX INFO: renamed from: a */
        public final GnssMeasurementsEvent.Callback f1422a;

        /* JADX INFO: renamed from: b */
        @hib
        public volatile Executor f1423b;

        public C0226h(@efb GnssMeasurementsEvent.Callback callback, @efb Executor executor) {
            this.f1422a = callback;
            this.f1423b = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onGnssMeasurementsReceived$0(Executor executor, GnssMeasurementsEvent gnssMeasurementsEvent) {
            if (this.f1423b != executor) {
                return;
            }
            this.f1422a.onGnssMeasurementsReceived(gnssMeasurementsEvent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onStatusChanged$1(Executor executor, int i) {
            if (this.f1423b != executor) {
                return;
            }
            this.f1422a.onStatusChanged(i);
        }

        @Override // android.location.GnssMeasurementsEvent.Callback
        public void onGnssMeasurementsReceived(final GnssMeasurementsEvent gnssMeasurementsEvent) {
            final Executor executor = this.f1423b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: eg9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f32939a.lambda$onGnssMeasurementsReceived$0(executor, gnssMeasurementsEvent);
                }
            });
        }

        @Override // android.location.GnssMeasurementsEvent.Callback
        public void onStatusChanged(final int i) {
            final Executor executor = this.f1423b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: fg9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36523a.lambda$onStatusChanged$1(executor, i);
                }
            });
        }

        public void unregister() {
            this.f1423b = null;
        }
    }

    /* JADX INFO: renamed from: ag9$i */
    @c5e(30)
    public static class C0227i extends GnssStatus.Callback {

        /* JADX INFO: renamed from: a */
        public final x77.AbstractC14964a f1424a;

        public C0227i(x77.AbstractC14964a abstractC14964a) {
            z7d.checkArgument(abstractC14964a != null, "invalid null callback");
            this.f1424a = abstractC14964a;
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(int i) {
            this.f1424a.onFirstFix(i);
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(GnssStatus gnssStatus) {
            this.f1424a.onSatelliteStatusChanged(x77.wrap(gnssStatus));
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
            this.f1424a.onStarted();
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
            this.f1424a.onStopped();
        }
    }

    /* JADX INFO: renamed from: ag9$j */
    public static class C0228j implements GpsStatus.Listener {

        /* JADX INFO: renamed from: a */
        public final LocationManager f1425a;

        /* JADX INFO: renamed from: b */
        public final x77.AbstractC14964a f1426b;

        /* JADX INFO: renamed from: c */
        @hib
        public volatile Executor f1427c;

        public C0228j(LocationManager locationManager, x77.AbstractC14964a abstractC14964a) {
            z7d.checkArgument(abstractC14964a != null, "invalid null callback");
            this.f1425a = locationManager;
            this.f1426b = abstractC14964a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onGpsStatusChanged$0(Executor executor) {
            if (this.f1427c != executor) {
                return;
            }
            this.f1426b.onStarted();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onGpsStatusChanged$1(Executor executor) {
            if (this.f1427c != executor) {
                return;
            }
            this.f1426b.onStopped();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onGpsStatusChanged$2(Executor executor, int i) {
            if (this.f1427c != executor) {
                return;
            }
            this.f1426b.onFirstFix(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onGpsStatusChanged$3(Executor executor, x77 x77Var) {
            if (this.f1427c != executor) {
                return;
            }
            this.f1426b.onSatelliteStatusChanged(x77Var);
        }

        @Override // android.location.GpsStatus.Listener
        @j5e(xnc.f98583H)
        public void onGpsStatusChanged(int i) {
            GpsStatus gpsStatus;
            final Executor executor = this.f1427c;
            if (executor == null) {
                return;
            }
            if (i == 1) {
                executor.execute(new Runnable() { // from class: gg9
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f39771a.lambda$onGpsStatusChanged$0(executor);
                    }
                });
                return;
            }
            if (i == 2) {
                executor.execute(new Runnable() { // from class: hg9
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f43424a.lambda$onGpsStatusChanged$1(executor);
                    }
                });
                return;
            }
            if (i != 3) {
                if (i == 4 && (gpsStatus = this.f1425a.getGpsStatus(null)) != null) {
                    final x77 x77VarWrap = x77.wrap(gpsStatus);
                    executor.execute(new Runnable() { // from class: jg9
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f50494a.lambda$onGpsStatusChanged$3(executor, x77VarWrap);
                        }
                    });
                    return;
                }
                return;
            }
            GpsStatus gpsStatus2 = this.f1425a.getGpsStatus(null);
            if (gpsStatus2 != null) {
                final int timeToFirstFix = gpsStatus2.getTimeToFirstFix();
                executor.execute(new Runnable() { // from class: ig9
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f46793a.lambda$onGpsStatusChanged$2(executor, timeToFirstFix);
                    }
                });
            }
        }

        public void register(Executor executor) {
            z7d.checkState(this.f1427c == null);
            this.f1427c = executor;
        }

        public void unregister() {
            this.f1427c = null;
        }
    }

    /* JADX INFO: renamed from: ag9$k */
    public static final class ExecutorC0229k implements Executor {

        /* JADX INFO: renamed from: a */
        public final Handler f1428a;

        public ExecutorC0229k(@efb Handler handler) {
            this.f1428a = (Handler) z7d.checkNotNull(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(@efb Runnable runnable) {
            if (Looper.myLooper() == this.f1428a.getLooper()) {
                runnable.run();
            } else {
                if (this.f1428a.post((Runnable) z7d.checkNotNull(runnable))) {
                    return;
                }
                throw new RejectedExecutionException(this.f1428a + " is shutting down");
            }
        }
    }

    /* JADX INFO: renamed from: ag9$l */
    public static class C0230l {

        /* JADX INFO: renamed from: a */
        public final String f1429a;

        /* JADX INFO: renamed from: b */
        public final wf9 f1430b;

        public C0230l(String str, wf9 wf9Var) {
            this.f1429a = (String) pkb.requireNonNull(str, "invalid null provider");
            this.f1430b = (wf9) pkb.requireNonNull(wf9Var, "invalid null listener");
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0230l)) {
                return false;
            }
            C0230l c0230l = (C0230l) obj;
            return this.f1429a.equals(c0230l.f1429a) && this.f1430b.equals(c0230l.f1430b);
        }

        public int hashCode() {
            return pkb.hash(this.f1429a, this.f1430b);
        }
    }

    /* JADX INFO: renamed from: ag9$n */
    @c5e(24)
    public static class C0232n extends GnssStatus.Callback {

        /* JADX INFO: renamed from: a */
        public final x77.AbstractC14964a f1433a;

        /* JADX INFO: renamed from: b */
        @hib
        public volatile Executor f1434b;

        public C0232n(x77.AbstractC14964a abstractC14964a) {
            z7d.checkArgument(abstractC14964a != null, "invalid null callback");
            this.f1433a = abstractC14964a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onFirstFix$2(Executor executor, int i) {
            if (this.f1434b != executor) {
                return;
            }
            this.f1433a.onFirstFix(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onSatelliteStatusChanged$3(Executor executor, GnssStatus gnssStatus) {
            if (this.f1434b != executor) {
                return;
            }
            this.f1433a.onSatelliteStatusChanged(x77.wrap(gnssStatus));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onStarted$0(Executor executor) {
            if (this.f1434b != executor) {
                return;
            }
            this.f1433a.onStarted();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onStopped$1(Executor executor) {
            if (this.f1434b != executor) {
                return;
            }
            this.f1433a.onStopped();
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(final int i) {
            final Executor executor = this.f1434b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: qg9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f74382a.lambda$onFirstFix$2(executor, i);
                }
            });
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(final GnssStatus gnssStatus) {
            final Executor executor = this.f1434b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: rg9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f78236a.lambda$onSatelliteStatusChanged$3(executor, gnssStatus);
                }
            });
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
            final Executor executor = this.f1434b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: tg9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f84645a.lambda$onStarted$0(executor);
                }
            });
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
            final Executor executor = this.f1434b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: sg9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f81735a.lambda$onStopped$1(executor);
                }
            });
        }

        public void register(Executor executor) {
            z7d.checkArgument(executor != null, "invalid null executor");
            z7d.checkState(this.f1434b == null);
            this.f1434b = executor;
        }

        public void unregister() {
            this.f1434b = null;
        }
    }

    private ag9() {
    }

    @xc7("sLocationListeners")
    @j5e(anyOf = {xnc.f98584I, xnc.f98583H})
    /* JADX INFO: renamed from: c */
    public static void m502c(LocationManager locationManager, C0231m c0231m) {
        WeakReference<C0231m> weakReferencePut = f1409h.put(c0231m.getKey(), new WeakReference<>(c0231m));
        C0231m c0231m2 = weakReferencePut != null ? weakReferencePut.get() : null;
        if (c0231m2 != null) {
            c0231m2.unregister();
            locationManager.removeUpdates(c0231m2);
        }
    }

    @j5e(anyOf = {xnc.f98584I, xnc.f98583H})
    @Deprecated
    public static void getCurrentLocation(@efb LocationManager locationManager, @efb String str, @hib pq1 pq1Var, @efb Executor executor, @efb vu2<Location> vu2Var) {
        getCurrentLocation(locationManager, str, pq1Var != null ? (CancellationSignal) pq1Var.getCancellationSignalObject() : null, executor, vu2Var);
    }

    @hib
    public static String getGnssHardwareModelName(@efb LocationManager locationManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0221c.m510a(locationManager);
        }
        return null;
    }

    public static int getGnssYearOfHardware(@efb LocationManager locationManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0221c.m511b(locationManager);
        }
        return 0;
    }

    public static boolean hasProvider(@efb LocationManager locationManager, @efb String str) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C0223e.m514a(locationManager, str);
        }
        if (locationManager.getAllProviders().contains(str)) {
            return true;
        }
        try {
            return locationManager.getProvider(str) != null;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static boolean isLocationEnabled(@efb LocationManager locationManager) {
        return Build.VERSION.SDK_INT >= 28 ? C0221c.m512c(locationManager) : locationManager.isProviderEnabled("network") || locationManager.isProviderEnabled("gps");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$registerGnssStatusCallback$1(LocationManager locationManager, C0228j c0228j) throws Exception {
        return Boolean.valueOf(locationManager.addGpsStatusListener(c0228j));
    }

    @c5e(24)
    @j5e(xnc.f98583H)
    public static boolean registerGnssMeasurementsCallback(@efb LocationManager locationManager, @efb GnssMeasurementsEvent.Callback callback, @efb Handler handler) {
        int i = Build.VERSION.SDK_INT;
        if (i > 30) {
            return C0220b.m506b(locationManager, callback, handler);
        }
        if (i == 30) {
            return registerGnssMeasurementsCallbackOnR(locationManager, r85.create(handler), callback);
        }
        scf<GnssMeasurementsEvent.Callback, GnssMeasurementsEvent.Callback> scfVar = C0225g.f1421b;
        synchronized (scfVar) {
            try {
                unregisterGnssMeasurementsCallback(locationManager, callback);
                if (!C0220b.m506b(locationManager, callback, handler)) {
                    return false;
                }
                scfVar.put(callback, callback);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @c5e(30)
    private static boolean registerGnssMeasurementsCallbackOnR(@efb LocationManager locationManager, @efb Executor executor, @efb GnssMeasurementsEvent.Callback callback) {
        if (Build.VERSION.SDK_INT != 30) {
            throw new IllegalStateException();
        }
        try {
            if (f1406e == null) {
                f1406e = Class.forName("android.location.GnssRequest$Builder");
            }
            if (f1407f == null) {
                Method declaredMethod = f1406e.getDeclaredMethod(ocd.f67208g, null);
                f1407f = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            if (f1408g == null) {
                Method declaredMethod2 = LocationManager.class.getDeclaredMethod("registerGnssMeasurementsCallback", Class.forName("android.location.GnssRequest"), Executor.class, GnssMeasurementsEvent.Callback.class);
                f1408g = declaredMethod2;
                declaredMethod2.setAccessible(true);
            }
            Object objInvoke = f1408g.invoke(locationManager, f1407f.invoke(f1406e.getDeclaredConstructor(null).newInstance(null), null), executor, callback);
            if (objInvoke != null) {
                return ((Boolean) objInvoke).booleanValue();
            }
            return false;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            return false;
        }
    }

    @j5e(xnc.f98583H)
    public static boolean registerGnssStatusCallback(@efb LocationManager locationManager, @efb x77.AbstractC14964a abstractC14964a, @efb Handler handler) {
        return Build.VERSION.SDK_INT >= 30 ? registerGnssStatusCallback(locationManager, r85.create(handler), abstractC14964a) : registerGnssStatusCallback(locationManager, new ExecutorC0229k(handler), abstractC14964a);
    }

    @j5e(anyOf = {xnc.f98584I, xnc.f98583H})
    public static void removeUpdates(@efb LocationManager locationManager, @efb wf9 wf9Var) {
        WeakHashMap<C0230l, WeakReference<C0231m>> weakHashMap = f1409h;
        synchronized (weakHashMap) {
            try {
                Iterator<WeakReference<C0231m>> it = weakHashMap.values().iterator();
                ArrayList arrayList = null;
                while (it.hasNext()) {
                    C0231m c0231m = it.next().get();
                    if (c0231m != null) {
                        C0230l key = c0231m.getKey();
                        if (key.f1430b == wf9Var) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(key);
                            c0231m.unregister();
                            locationManager.removeUpdates(c0231m);
                        }
                    }
                }
                if (arrayList != null) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        f1409h.remove((C0230l) it2.next());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        locationManager.removeUpdates(wf9Var);
    }

    @j5e(anyOf = {xnc.f98584I, xnc.f98583H})
    public static void requestLocationUpdates(@efb LocationManager locationManager, @efb String str, @efb vg9 vg9Var, @efb Executor executor, @efb wf9 wf9Var) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            C0223e.m516c(locationManager, str, vg9Var.toLocationRequest(), executor, wf9Var);
            return;
        }
        if (i < 30 || !C0222d.tryRequestLocationUpdates(locationManager, str, vg9Var, executor, wf9Var)) {
            C0231m c0231m = new C0231m(new C0230l(str, wf9Var), executor);
            if (C0219a.m504b(locationManager, str, vg9Var, c0231m)) {
                return;
            }
            synchronized (f1409h) {
                locationManager.requestLocationUpdates(str, vg9Var.getIntervalMillis(), vg9Var.getMinUpdateDistanceMeters(), c0231m, Looper.getMainLooper());
                m502c(locationManager, c0231m);
            }
        }
    }

    @c5e(24)
    public static void unregisterGnssMeasurementsCallback(@efb LocationManager locationManager, @efb GnssMeasurementsEvent.Callback callback) {
        if (Build.VERSION.SDK_INT >= 30) {
            C0220b.m508d(locationManager, callback);
            return;
        }
        scf<GnssMeasurementsEvent.Callback, GnssMeasurementsEvent.Callback> scfVar = C0225g.f1421b;
        synchronized (scfVar) {
            try {
                GnssMeasurementsEvent.Callback callbackRemove = scfVar.remove(callback);
                if (callbackRemove != null) {
                    if (callbackRemove instanceof C0226h) {
                        ((C0226h) callbackRemove).unregister();
                    }
                    C0220b.m508d(locationManager, callbackRemove);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void unregisterGnssStatusCallback(@efb LocationManager locationManager, @efb x77.AbstractC14964a abstractC14964a) {
        scf<Object, Object> scfVar = C0225g.f1420a;
        synchronized (scfVar) {
            try {
                Object objRemove = scfVar.remove(abstractC14964a);
                if (objRemove != null) {
                    C0220b.m509e(locationManager, objRemove);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ag9$m */
    public static class C0231m implements LocationListener {

        /* JADX INFO: renamed from: a */
        @hib
        public volatile C0230l f1431a;

        /* JADX INFO: renamed from: b */
        public final Executor f1432b;

        public C0231m(@hib C0230l c0230l, Executor executor) {
            this.f1431a = c0230l;
            this.f1432b = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onFlushComplete$2(int i) {
            C0230l c0230l = this.f1431a;
            if (c0230l == null) {
                return;
            }
            c0230l.f1430b.onFlushComplete(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onLocationChanged$0(Location location) {
            C0230l c0230l = this.f1431a;
            if (c0230l == null) {
                return;
            }
            c0230l.f1430b.onLocationChanged(location);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onLocationChanged$1(List list) {
            C0230l c0230l = this.f1431a;
            if (c0230l == null) {
                return;
            }
            c0230l.f1430b.onLocationChanged((List<Location>) list);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onProviderDisabled$5(String str) {
            C0230l c0230l = this.f1431a;
            if (c0230l == null) {
                return;
            }
            c0230l.f1430b.onProviderDisabled(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onProviderEnabled$4(String str) {
            C0230l c0230l = this.f1431a;
            if (c0230l == null) {
                return;
            }
            c0230l.f1430b.onProviderEnabled(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onStatusChanged$3(String str, int i, Bundle bundle) {
            C0230l c0230l = this.f1431a;
            if (c0230l == null) {
                return;
            }
            c0230l.f1430b.onStatusChanged(str, i, bundle);
        }

        public C0230l getKey() {
            return (C0230l) pkb.requireNonNull(this.f1431a);
        }

        @Override // android.location.LocationListener
        public void onFlushComplete(final int i) {
            if (this.f1431a == null) {
                return;
            }
            this.f1432b.execute(new Runnable() { // from class: og9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f67585a.lambda$onFlushComplete$2(i);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(@efb final Location location) {
            if (this.f1431a == null) {
                return;
            }
            this.f1432b.execute(new Runnable() { // from class: ng9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f64469a.lambda$onLocationChanged$0(location);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(@efb final String str) {
            if (this.f1431a == null) {
                return;
            }
            this.f1432b.execute(new Runnable() { // from class: lg9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f57502a.lambda$onProviderDisabled$5(str);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(@efb final String str) {
            if (this.f1431a == null) {
                return;
            }
            this.f1432b.execute(new Runnable() { // from class: kg9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f54017a.lambda$onProviderEnabled$4(str);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(final String str, final int i, final Bundle bundle) {
            if (this.f1431a == null) {
                return;
            }
            this.f1432b.execute(new Runnable() { // from class: pg9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f70707a.lambda$onStatusChanged$3(str, i, bundle);
                }
            });
        }

        public void unregister() {
            this.f1431a = null;
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(@efb final List<Location> list) {
            if (this.f1431a == null) {
                return;
            }
            this.f1432b.execute(new Runnable() { // from class: mg9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f60964a.lambda$onLocationChanged$1(list);
                }
            });
        }
    }

    @j5e(anyOf = {xnc.f98584I, xnc.f98583H})
    public static void getCurrentLocation(@efb LocationManager locationManager, @efb String str, @hib CancellationSignal cancellationSignal, @efb Executor executor, @efb final vu2<Location> vu2Var) {
        if (Build.VERSION.SDK_INT >= 30) {
            C0222d.m513a(locationManager, str, cancellationSignal, executor, vu2Var);
            return;
        }
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        final Location lastKnownLocation = locationManager.getLastKnownLocation(str);
        if (lastKnownLocation != null && SystemClock.elapsedRealtime() - uf9.getElapsedRealtimeMillis(lastKnownLocation) < 10000) {
            executor.execute(new Runnable() { // from class: xf9
                @Override // java.lang.Runnable
                public final void run() {
                    vu2Var.accept(lastKnownLocation);
                }
            });
            return;
        }
        final C0224f c0224f = new C0224f(locationManager, executor, vu2Var);
        locationManager.requestLocationUpdates(str, 0L, 0.0f, c0224f, Looper.getMainLooper());
        if (cancellationSignal != null) {
            cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: yf9
                @Override // android.os.CancellationSignal.OnCancelListener
                public final void onCancel() {
                    c0224f.cancel();
                }
            });
        }
        c0224f.startTimeout(30000L);
    }

    @j5e(xnc.f98583H)
    public static boolean registerGnssStatusCallback(@efb LocationManager locationManager, @efb Executor executor, @efb x77.AbstractC14964a abstractC14964a) {
        if (Build.VERSION.SDK_INT >= 30) {
            return registerGnssStatusCallback(locationManager, null, executor, abstractC14964a);
        }
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        return registerGnssStatusCallback(locationManager, new Handler(looperMyLooper), executor, abstractC14964a);
    }

    @j5e(xnc.f98583H)
    private static boolean registerGnssStatusCallback(LocationManager locationManager, Handler handler, Executor executor, x77.AbstractC14964a abstractC14964a) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C0222d.registerGnssStatusCallback(locationManager, handler, executor, abstractC14964a);
        }
        return C0220b.m507c(locationManager, handler, executor, abstractC14964a);
    }

    @c5e(24)
    @j5e(xnc.f98583H)
    public static boolean registerGnssMeasurementsCallback(@efb LocationManager locationManager, @efb Executor executor, @efb GnssMeasurementsEvent.Callback callback) {
        int i = Build.VERSION.SDK_INT;
        if (i > 30) {
            return C0223e.m515b(locationManager, executor, callback);
        }
        if (i == 30) {
            return registerGnssMeasurementsCallbackOnR(locationManager, executor, callback);
        }
        scf<GnssMeasurementsEvent.Callback, GnssMeasurementsEvent.Callback> scfVar = C0225g.f1421b;
        synchronized (scfVar) {
            try {
                C0226h c0226h = new C0226h(callback, executor);
                unregisterGnssMeasurementsCallback(locationManager, callback);
                if (!C0220b.m505a(locationManager, c0226h)) {
                    return false;
                }
                scfVar.put(callback, c0226h);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @j5e(anyOf = {xnc.f98584I, xnc.f98583H})
    public static void requestLocationUpdates(@efb LocationManager locationManager, @efb String str, @efb vg9 vg9Var, @efb wf9 wf9Var, @efb Looper looper) {
        if (Build.VERSION.SDK_INT >= 31) {
            C0223e.m516c(locationManager, str, vg9Var.toLocationRequest(), r85.create(new Handler(looper)), wf9Var);
        } else {
            if (C0219a.m503a(locationManager, str, vg9Var, wf9Var, looper)) {
                return;
            }
            locationManager.requestLocationUpdates(str, vg9Var.getIntervalMillis(), vg9Var.getMinUpdateDistanceMeters(), wf9Var, looper);
        }
    }
}
