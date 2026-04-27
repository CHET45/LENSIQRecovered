package p000;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.slf4j.spi.MDCAdapter;

/* JADX INFO: loaded from: classes8.dex */
public class uv0 implements MDCAdapter {

    /* JADX INFO: renamed from: a */
    public InheritableThreadLocal<Map<String, String>> f89191a = new C13725a();

    /* JADX INFO: renamed from: uv0$a */
    public class C13725a extends InheritableThreadLocal<Map<String, String>> {
        public C13725a() {
        }

        @Override // java.lang.InheritableThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map<String, String> childValue(Map<String, String> map) {
            if (map == null) {
                return null;
            }
            return new HashMap(map);
        }
    }

    @Override // org.slf4j.spi.MDCAdapter
    public void clear() {
        Map<String, String> map = this.f89191a.get();
        if (map != null) {
            map.clear();
            this.f89191a.remove();
        }
    }

    @Override // org.slf4j.spi.MDCAdapter
    public String get(String str) {
        Map<String, String> map = this.f89191a.get();
        if (map == null || str == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // org.slf4j.spi.MDCAdapter
    public Map<String, String> getCopyOfContextMap() {
        Map<String, String> map = this.f89191a.get();
        if (map != null) {
            return new HashMap(map);
        }
        return null;
    }

    public Set<String> getKeys() {
        Map<String, String> map = this.f89191a.get();
        if (map != null) {
            return map.keySet();
        }
        return null;
    }

    @Override // org.slf4j.spi.MDCAdapter
    public void put(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("key cannot be null");
        }
        Map<String, String> map = this.f89191a.get();
        if (map == null) {
            map = new HashMap<>();
            this.f89191a.set(map);
        }
        map.put(str, str2);
    }

    @Override // org.slf4j.spi.MDCAdapter
    public void remove(String str) {
        Map<String, String> map = this.f89191a.get();
        if (map != null) {
            map.remove(str);
        }
    }

    @Override // org.slf4j.spi.MDCAdapter
    public void setContextMap(Map<String, String> map) {
        this.f89191a.set(new HashMap(map));
    }
}
