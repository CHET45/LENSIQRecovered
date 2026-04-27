package p000;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.slf4j.IMarkerFactory;

/* JADX INFO: loaded from: classes8.dex */
public class wv0 implements IMarkerFactory {

    /* JADX INFO: renamed from: a */
    public final ConcurrentMap<String, du9> f95552a = new ConcurrentHashMap();

    @Override // org.slf4j.IMarkerFactory
    public boolean detachMarker(String str) {
        return (str == null || this.f95552a.remove(str) == null) ? false : true;
    }

    @Override // org.slf4j.IMarkerFactory
    public boolean exists(String str) {
        if (str == null) {
            return false;
        }
        return this.f95552a.containsKey(str);
    }

    @Override // org.slf4j.IMarkerFactory
    public du9 getDetachedMarker(String str) {
        return new vv0(str);
    }

    @Override // org.slf4j.IMarkerFactory
    public du9 getMarker(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Marker name cannot be null");
        }
        du9 du9Var = this.f95552a.get(str);
        if (du9Var != null) {
            return du9Var;
        }
        vv0 vv0Var = new vv0(str);
        du9 du9VarPutIfAbsent = this.f95552a.putIfAbsent(str, vv0Var);
        return du9VarPutIfAbsent != null ? du9VarPutIfAbsent : vv0Var;
    }
}
