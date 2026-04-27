package p000;

import com.tencent.mmkv.MMKV;

/* JADX INFO: loaded from: classes6.dex */
public final class u8b {

    /* JADX INFO: renamed from: a */
    public final String f87067a;

    public u8b(String str) {
        this.f87067a = str;
    }

    public boolean backupOneToDirectory(String str, String str2) {
        return MMKV.backupOneToDirectory(str, str2, this.f87067a);
    }

    public boolean checkExist(String str) {
        return MMKV.checkExist(str, this.f87067a);
    }

    public String getRootDir() {
        return this.f87067a;
    }

    public boolean isFileValid(String str) {
        return MMKV.isFileValid(str, this.f87067a);
    }

    @efb
    public MMKV mmkvWithID(String str) throws RuntimeException {
        return MMKV.m7342a(MMKV.getMMKVWithID(str, 1, null, this.f87067a, 0L), str, 1);
    }

    public boolean removeStorage(String str) {
        return MMKV.removeStorage(str, this.f87067a);
    }

    public boolean restoreOneMMKVFromDirectory(String str, String str2) {
        return MMKV.restoreOneMMKVFromDirectory(str, str2, this.f87067a);
    }

    @efb
    public MMKV mmkvWithID(String str, int i) throws RuntimeException {
        return MMKV.m7342a(MMKV.getMMKVWithID(str, i, null, this.f87067a, 0L), str, i);
    }

    @efb
    public MMKV mmkvWithID(String str, int i, long j) throws RuntimeException {
        return MMKV.m7342a(MMKV.getMMKVWithID(str, i, null, this.f87067a, j), str, i);
    }

    @efb
    public MMKV mmkvWithID(String str, int i, @hib String str2) throws RuntimeException {
        return MMKV.m7342a(MMKV.getMMKVWithID(str, i, str2, this.f87067a, 0L), str, i);
    }

    @efb
    public MMKV mmkvWithID(String str, int i, @hib String str2, long j) throws RuntimeException {
        return MMKV.m7342a(MMKV.getMMKVWithID(str, i, str2, this.f87067a, j), str, i);
    }
}
