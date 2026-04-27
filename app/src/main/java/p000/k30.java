package p000;

/* JADX INFO: loaded from: classes4.dex */
public class k30 implements zp7 {
    @Override // p000.zp7
    public boolean getBoolean(String key, boolean defaultValue) {
        return vfe.getInstance().getBoolean(key, defaultValue);
    }

    @Override // p000.zp7
    public String getString(String key, String defaultValue) {
        return vfe.getInstance().getString(key, defaultValue);
    }

    @Override // p000.zp7
    public void putBoolean(String key, boolean value) {
        vfe.getInstance().putBoolean(key, value);
    }

    @Override // p000.zp7
    public void putString(String key, String value) {
        vfe.getInstance().putString(key, value);
    }
}
