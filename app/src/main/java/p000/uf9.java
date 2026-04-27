package p000;

import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class uf9 {

    /* JADX INFO: renamed from: a */
    public static final String f87886a = "mockLocation";

    /* JADX INFO: renamed from: b */
    public static final String f87887b = "verticalAccuracy";

    /* JADX INFO: renamed from: c */
    public static final String f87888c = "speedAccuracy";

    /* JADX INFO: renamed from: d */
    public static final String f87889d = "bearingAccuracy";

    /* JADX INFO: renamed from: e */
    public static final String f87890e = "androidx.core.location.extra.MSL_ALTITUDE";

    /* JADX INFO: renamed from: f */
    public static final String f87891f = "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY";

    /* JADX INFO: renamed from: g */
    @hib
    public static Method f87892g;

    /* JADX INFO: renamed from: h */
    @hib
    public static Field f87893h;

    /* JADX INFO: renamed from: i */
    @hib
    public static Integer f87894i;

    /* JADX INFO: renamed from: j */
    @hib
    public static Integer f87895j;

    /* JADX INFO: renamed from: k */
    @hib
    public static Integer f87896k;

    /* JADX INFO: renamed from: uf9$a */
    @c5e(26)
    public static class C13528a {
        private C13528a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static float m23296a(Location location) {
            return location.getBearingAccuracyDegrees();
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static float m23297b(Location location) {
            return location.getSpeedAccuracyMetersPerSecond();
        }

        @ih4
        /* JADX INFO: renamed from: c */
        public static float m23298c(Location location) {
            return location.getVerticalAccuracyMeters();
        }

        @ih4
        /* JADX INFO: renamed from: d */
        public static boolean m23299d(Location location) {
            return location.hasBearingAccuracy();
        }

        @ih4
        /* JADX INFO: renamed from: e */
        public static boolean m23300e(Location location) {
            return location.hasSpeedAccuracy();
        }

        @ih4
        /* JADX INFO: renamed from: f */
        public static boolean m23301f(Location location) {
            return location.hasVerticalAccuracy();
        }

        @ih4
        /* JADX INFO: renamed from: g */
        public static void m23302g(Location location) {
            try {
                uf9.m23292a().setByte(location, (byte) (uf9.m23292a().getByte(location) & (~uf9.m23293b())));
            } catch (IllegalAccessException e) {
                IllegalAccessError illegalAccessError = new IllegalAccessError();
                illegalAccessError.initCause(e);
                throw illegalAccessError;
            } catch (NoSuchFieldException e2) {
                NoSuchFieldError noSuchFieldError = new NoSuchFieldError();
                noSuchFieldError.initCause(e2);
                throw noSuchFieldError;
            }
        }

        @ih4
        /* JADX INFO: renamed from: h */
        public static void m23303h(Location location) {
            try {
                uf9.m23292a().setByte(location, (byte) (uf9.m23292a().getByte(location) & (~uf9.m23294c())));
            } catch (IllegalAccessException e) {
                IllegalAccessError illegalAccessError = new IllegalAccessError();
                illegalAccessError.initCause(e);
                throw illegalAccessError;
            } catch (NoSuchFieldException e2) {
                NoSuchFieldError noSuchFieldError = new NoSuchFieldError();
                noSuchFieldError.initCause(e2);
                throw noSuchFieldError;
            }
        }

        @ih4
        /* JADX INFO: renamed from: i */
        public static void m23304i(Location location) {
            try {
                uf9.m23292a().setByte(location, (byte) (uf9.m23292a().getByte(location) & (~uf9.m23295d())));
            } catch (IllegalAccessException | NoSuchFieldException e) {
                IllegalAccessError illegalAccessError = new IllegalAccessError();
                illegalAccessError.initCause(e);
                throw illegalAccessError;
            }
        }

        @ih4
        /* JADX INFO: renamed from: j */
        public static void m23305j(Location location, float f) {
            location.setBearingAccuracyDegrees(f);
        }

        @ih4
        /* JADX INFO: renamed from: k */
        public static void m23306k(Location location, float f) {
            location.setSpeedAccuracyMetersPerSecond(f);
        }

        @ih4
        /* JADX INFO: renamed from: l */
        public static void m23307l(Location location, float f) {
            location.setVerticalAccuracyMeters(f);
        }
    }

    /* JADX INFO: renamed from: uf9$b */
    @c5e(28)
    public static class C13529b {
        private C13529b() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static void m23308a(Location location) {
            if (location.hasBearingAccuracy()) {
                String provider = location.getProvider();
                long time = location.getTime();
                long elapsedRealtimeNanos = location.getElapsedRealtimeNanos();
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                boolean zHasAltitude = location.hasAltitude();
                double altitude = location.getAltitude();
                boolean zHasSpeed = location.hasSpeed();
                float speed = location.getSpeed();
                boolean zHasBearing = location.hasBearing();
                float bearing = location.getBearing();
                boolean zHasAccuracy = location.hasAccuracy();
                float accuracy = location.getAccuracy();
                boolean zHasVerticalAccuracy = location.hasVerticalAccuracy();
                float verticalAccuracyMeters = location.getVerticalAccuracyMeters();
                boolean zHasSpeedAccuracy = location.hasSpeedAccuracy();
                float speedAccuracyMetersPerSecond = location.getSpeedAccuracyMetersPerSecond();
                Bundle extras = location.getExtras();
                location.reset();
                location.setProvider(provider);
                location.setTime(time);
                location.setElapsedRealtimeNanos(elapsedRealtimeNanos);
                location.setLatitude(latitude);
                location.setLongitude(longitude);
                if (zHasAltitude) {
                    location.setAltitude(altitude);
                }
                if (zHasSpeed) {
                    location.setSpeed(speed);
                }
                if (zHasBearing) {
                    location.setBearing(bearing);
                }
                if (zHasAccuracy) {
                    location.setAccuracy(accuracy);
                }
                if (zHasVerticalAccuracy) {
                    location.setVerticalAccuracyMeters(verticalAccuracyMeters);
                }
                if (zHasSpeedAccuracy) {
                    location.setBearingAccuracyDegrees(speedAccuracyMetersPerSecond);
                }
                if (extras != null) {
                    location.setExtras(extras);
                }
            }
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static void m23309b(Location location) {
            if (location.hasSpeedAccuracy()) {
                String provider = location.getProvider();
                long time = location.getTime();
                long elapsedRealtimeNanos = location.getElapsedRealtimeNanos();
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                boolean zHasAltitude = location.hasAltitude();
                double altitude = location.getAltitude();
                boolean zHasSpeed = location.hasSpeed();
                float speed = location.getSpeed();
                boolean zHasBearing = location.hasBearing();
                float bearing = location.getBearing();
                boolean zHasAccuracy = location.hasAccuracy();
                float accuracy = location.getAccuracy();
                boolean zHasVerticalAccuracy = location.hasVerticalAccuracy();
                float verticalAccuracyMeters = location.getVerticalAccuracyMeters();
                boolean zHasBearingAccuracy = location.hasBearingAccuracy();
                float bearingAccuracyDegrees = location.getBearingAccuracyDegrees();
                Bundle extras = location.getExtras();
                location.reset();
                location.setProvider(provider);
                location.setTime(time);
                location.setElapsedRealtimeNanos(elapsedRealtimeNanos);
                location.setLatitude(latitude);
                location.setLongitude(longitude);
                if (zHasAltitude) {
                    location.setAltitude(altitude);
                }
                if (zHasSpeed) {
                    location.setSpeed(speed);
                }
                if (zHasBearing) {
                    location.setBearing(bearing);
                }
                if (zHasAccuracy) {
                    location.setAccuracy(accuracy);
                }
                if (zHasVerticalAccuracy) {
                    location.setVerticalAccuracyMeters(verticalAccuracyMeters);
                }
                if (zHasBearingAccuracy) {
                    location.setBearingAccuracyDegrees(bearingAccuracyDegrees);
                }
                if (extras != null) {
                    location.setExtras(extras);
                }
            }
        }

        @ih4
        /* JADX INFO: renamed from: c */
        public static void m23310c(Location location) {
            if (location.hasVerticalAccuracy()) {
                String provider = location.getProvider();
                long time = location.getTime();
                long elapsedRealtimeNanos = location.getElapsedRealtimeNanos();
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                boolean zHasAltitude = location.hasAltitude();
                double altitude = location.getAltitude();
                boolean zHasSpeed = location.hasSpeed();
                float speed = location.getSpeed();
                boolean zHasBearing = location.hasBearing();
                float bearing = location.getBearing();
                boolean zHasAccuracy = location.hasAccuracy();
                float accuracy = location.getAccuracy();
                boolean zHasSpeedAccuracy = location.hasSpeedAccuracy();
                float speedAccuracyMetersPerSecond = location.getSpeedAccuracyMetersPerSecond();
                boolean zHasBearingAccuracy = location.hasBearingAccuracy();
                float bearingAccuracyDegrees = location.getBearingAccuracyDegrees();
                Bundle extras = location.getExtras();
                location.reset();
                location.setProvider(provider);
                location.setTime(time);
                location.setElapsedRealtimeNanos(elapsedRealtimeNanos);
                location.setLatitude(latitude);
                location.setLongitude(longitude);
                if (zHasAltitude) {
                    location.setAltitude(altitude);
                }
                if (zHasSpeed) {
                    location.setSpeed(speed);
                }
                if (zHasBearing) {
                    location.setBearing(bearing);
                }
                if (zHasAccuracy) {
                    location.setAccuracy(accuracy);
                }
                if (zHasSpeedAccuracy) {
                    location.setSpeedAccuracyMetersPerSecond(speedAccuracyMetersPerSecond);
                }
                if (zHasBearingAccuracy) {
                    location.setBearingAccuracyDegrees(bearingAccuracyDegrees);
                }
                if (extras != null) {
                    location.setExtras(extras);
                }
            }
        }
    }

    /* JADX INFO: renamed from: uf9$c */
    @c5e(29)
    public static class C13530c {
        private C13530c() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static void m23311a(Location location) {
            if (location.hasBearingAccuracy()) {
                double elapsedRealtimeUncertaintyNanos = location.getElapsedRealtimeUncertaintyNanos();
                C13529b.m23308a(location);
                location.setElapsedRealtimeUncertaintyNanos(elapsedRealtimeUncertaintyNanos);
            }
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static void m23312b(Location location) {
            if (location.hasSpeedAccuracy()) {
                double elapsedRealtimeUncertaintyNanos = location.getElapsedRealtimeUncertaintyNanos();
                C13529b.m23309b(location);
                location.setElapsedRealtimeUncertaintyNanos(elapsedRealtimeUncertaintyNanos);
            }
        }

        @ih4
        /* JADX INFO: renamed from: c */
        public static void m23313c(Location location) {
            if (location.hasVerticalAccuracy()) {
                double elapsedRealtimeUncertaintyNanos = location.getElapsedRealtimeUncertaintyNanos();
                C13529b.m23310c(location);
                location.setElapsedRealtimeUncertaintyNanos(elapsedRealtimeUncertaintyNanos);
            }
        }
    }

    /* JADX INFO: renamed from: uf9$d */
    @c5e(33)
    public static class C13531d {
        private C13531d() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static void m23314a(Location location) {
            location.removeBearingAccuracy();
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static void m23315b(Location location) {
            location.removeSpeedAccuracy();
        }

        @ih4
        /* JADX INFO: renamed from: c */
        public static void m23316c(Location location) {
            location.removeVerticalAccuracy();
        }
    }

    /* JADX INFO: renamed from: uf9$e */
    @c5e(34)
    public static class C13532e {
        private C13532e() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static float m23317a(Location location) {
            return location.getMslAltitudeAccuracyMeters();
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static double m23318b(Location location) {
            return location.getMslAltitudeMeters();
        }

        @ih4
        /* JADX INFO: renamed from: c */
        public static boolean m23319c(Location location) {
            return location.hasMslAltitude();
        }

        @ih4
        /* JADX INFO: renamed from: d */
        public static boolean m23320d(Location location) {
            return location.hasMslAltitudeAccuracy();
        }

        @ih4
        /* JADX INFO: renamed from: e */
        public static void m23321e(Location location) {
            location.removeMslAltitude();
        }

        @ih4
        /* JADX INFO: renamed from: f */
        public static void m23322f(Location location) {
            location.removeMslAltitudeAccuracy();
        }

        @ih4
        /* JADX INFO: renamed from: g */
        public static void m23323g(Location location, float f) {
            location.setMslAltitudeAccuracyMeters(f);
        }

        @ih4
        /* JADX INFO: renamed from: h */
        public static void m23324h(Location location, double d) {
            location.setMslAltitudeMeters(d);
        }
    }

    private uf9() {
    }

    @igg({"BlockedPrivateApi"})
    /* JADX INFO: renamed from: a */
    public static Field m23292a() throws NoSuchFieldException {
        if (f87893h == null) {
            Field declaredField = Location.class.getDeclaredField("mFieldsMask");
            f87893h = declaredField;
            declaredField.setAccessible(true);
        }
        return f87893h;
    }

    @igg({"SoonBlockedPrivateApi"})
    /* JADX INFO: renamed from: b */
    public static int m23293b() throws IllegalAccessException, NoSuchFieldException {
        if (f87895j == null) {
            Field declaredField = Location.class.getDeclaredField("HAS_BEARING_ACCURACY_MASK");
            declaredField.setAccessible(true);
            f87895j = Integer.valueOf(declaredField.getInt(null));
        }
        return f87895j.intValue();
    }

    @igg({"SoonBlockedPrivateApi"})
    /* JADX INFO: renamed from: c */
    public static int m23294c() throws IllegalAccessException, NoSuchFieldException {
        if (f87894i == null) {
            Field declaredField = Location.class.getDeclaredField("HAS_SPEED_ACCURACY_MASK");
            declaredField.setAccessible(true);
            f87894i = Integer.valueOf(declaredField.getInt(null));
        }
        return f87894i.intValue();
    }

    private static boolean containsExtra(@efb Location location, String str) {
        Bundle extras = location.getExtras();
        return extras != null && extras.containsKey(str);
    }

    @igg({"SoonBlockedPrivateApi"})
    /* JADX INFO: renamed from: d */
    public static int m23295d() throws IllegalAccessException, NoSuchFieldException {
        if (f87896k == null) {
            Field declaredField = Location.class.getDeclaredField("HAS_VERTICAL_ACCURACY_MASK");
            declaredField.setAccessible(true);
            f87896k = Integer.valueOf(declaredField.getInt(null));
        }
        return f87896k.intValue();
    }

    public static float getBearingAccuracyDegrees(@efb Location location) {
        return C13528a.m23296a(location);
    }

    public static long getElapsedRealtimeMillis(@efb Location location) {
        return TimeUnit.NANOSECONDS.toMillis(location.getElapsedRealtimeNanos());
    }

    public static long getElapsedRealtimeNanos(@efb Location location) {
        return location.getElapsedRealtimeNanos();
    }

    @y46(from = 0.0d)
    public static float getMslAltitudeAccuracyMeters(@efb Location location) {
        return Build.VERSION.SDK_INT >= 34 ? C13532e.m23317a(location) : getOrCreateExtras(location).getFloat(f87891f);
    }

    public static double getMslAltitudeMeters(@efb Location location) {
        return Build.VERSION.SDK_INT >= 34 ? C13532e.m23318b(location) : getOrCreateExtras(location).getDouble(f87890e);
    }

    private static Bundle getOrCreateExtras(@efb Location location) {
        Bundle extras = location.getExtras();
        if (extras != null) {
            return extras;
        }
        location.setExtras(new Bundle());
        return location.getExtras();
    }

    private static Method getSetIsFromMockProviderMethod() throws NoSuchMethodException {
        if (f87892g == null) {
            Method declaredMethod = Location.class.getDeclaredMethod("setIsFromMockProvider", Boolean.TYPE);
            f87892g = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        return f87892g;
    }

    public static float getSpeedAccuracyMetersPerSecond(@efb Location location) {
        return C13528a.m23297b(location);
    }

    public static float getVerticalAccuracyMeters(@efb Location location) {
        return C13528a.m23298c(location);
    }

    public static boolean hasBearingAccuracy(@efb Location location) {
        return C13528a.m23299d(location);
    }

    public static boolean hasMslAltitude(@efb Location location) {
        return Build.VERSION.SDK_INT >= 34 ? C13532e.m23319c(location) : containsExtra(location, f87890e);
    }

    public static boolean hasMslAltitudeAccuracy(@efb Location location) {
        return Build.VERSION.SDK_INT >= 34 ? C13532e.m23320d(location) : containsExtra(location, f87891f);
    }

    public static boolean hasSpeedAccuracy(@efb Location location) {
        return C13528a.m23300e(location);
    }

    public static boolean hasVerticalAccuracy(@efb Location location) {
        return C13528a.m23301f(location);
    }

    public static boolean isMock(@efb Location location) {
        return location.isFromMockProvider();
    }

    public static void removeBearingAccuracy(@efb Location location) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            C13531d.m23314a(location);
            return;
        }
        if (i >= 29) {
            C13530c.m23311a(location);
        } else if (i >= 28) {
            C13529b.m23308a(location);
        } else {
            C13528a.m23302g(location);
        }
    }

    private static void removeExtra(@efb Location location, String str) {
        Bundle extras = location.getExtras();
        if (extras != null) {
            extras.remove(str);
            if (extras.isEmpty()) {
                location.setExtras(null);
            }
        }
    }

    public static void removeMslAltitude(@efb Location location) {
        if (Build.VERSION.SDK_INT >= 34) {
            C13532e.m23321e(location);
        } else {
            removeExtra(location, f87890e);
        }
    }

    public static void removeMslAltitudeAccuracy(@efb Location location) {
        if (Build.VERSION.SDK_INT >= 34) {
            C13532e.m23322f(location);
        } else {
            removeExtra(location, f87891f);
        }
    }

    public static void removeSpeedAccuracy(@efb Location location) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            C13531d.m23315b(location);
            return;
        }
        if (i >= 29) {
            C13530c.m23312b(location);
        } else if (i >= 28) {
            C13529b.m23309b(location);
        } else {
            C13528a.m23303h(location);
        }
    }

    public static void removeVerticalAccuracy(@efb Location location) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            C13531d.m23316c(location);
            return;
        }
        if (i >= 29) {
            C13530c.m23313c(location);
        } else if (i >= 28) {
            C13529b.m23310c(location);
        } else {
            C13528a.m23304i(location);
        }
    }

    public static void setBearingAccuracyDegrees(@efb Location location, float f) {
        C13528a.m23305j(location, f);
    }

    @igg({"BanUncheckedReflection"})
    public static void setMock(@efb Location location, boolean z) {
        try {
            getSetIsFromMockProviderMethod().invoke(location, Boolean.valueOf(z));
        } catch (IllegalAccessException e) {
            IllegalAccessError illegalAccessError = new IllegalAccessError();
            illegalAccessError.initCause(e);
            throw illegalAccessError;
        } catch (NoSuchMethodException e2) {
            NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
            noSuchMethodError.initCause(e2);
            throw noSuchMethodError;
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static void setMslAltitudeAccuracyMeters(@efb Location location, @y46(from = 0.0d) float f) {
        if (Build.VERSION.SDK_INT >= 34) {
            C13532e.m23323g(location, f);
        } else {
            getOrCreateExtras(location).putFloat(f87891f, f);
        }
    }

    public static void setMslAltitudeMeters(@efb Location location, double d) {
        if (Build.VERSION.SDK_INT >= 34) {
            C13532e.m23324h(location, d);
        } else {
            getOrCreateExtras(location).putDouble(f87890e, d);
        }
    }

    public static void setSpeedAccuracyMetersPerSecond(@efb Location location, float f) {
        C13528a.m23306k(location, f);
    }

    public static void setVerticalAccuracyMeters(@efb Location location, float f) {
        C13528a.m23307l(location, f);
    }
}
