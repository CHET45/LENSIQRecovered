package p000;

import org.slf4j.IMarkerFactory;
import org.slf4j.impl.StaticMarkerBinder;

/* JADX INFO: loaded from: classes8.dex */
public class gu9 {

    /* JADX INFO: renamed from: a */
    public static IMarkerFactory f41199a;

    static {
        try {
            f41199a = bwCompatibleGetMarkerFactoryFromBinder();
        } catch (Exception e) {
            z0i.report("Unexpected failure while binding MarkerFactory", e);
        } catch (NoClassDefFoundError unused) {
            f41199a = new wv0();
        }
    }

    private gu9() {
    }

    private static IMarkerFactory bwCompatibleGetMarkerFactoryFromBinder() throws NoClassDefFoundError {
        try {
            return StaticMarkerBinder.getSingleton().getMarkerFactory();
        } catch (NoSuchMethodError unused) {
            return StaticMarkerBinder.SINGLETON.getMarkerFactory();
        }
    }

    public static du9 getDetachedMarker(String str) {
        return f41199a.getDetachedMarker(str);
    }

    public static IMarkerFactory getIMarkerFactory() {
        return f41199a;
    }

    public static du9 getMarker(String str) {
        return f41199a.getMarker(str);
    }
}
