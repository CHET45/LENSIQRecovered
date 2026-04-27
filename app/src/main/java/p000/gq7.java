package p000;

/* JADX INFO: loaded from: classes6.dex */
public interface gq7 {
    void changeCommunicationWay(int i, int i2, lp7<Integer> lp7Var);

    void enterUpdateMode(lp7<Integer> lp7Var);

    void exitUpdateMode(lp7<Integer> lp7Var);

    void getDeviceInfo(lp7<cng> lp7Var);

    void getMD5(lp7<String> lp7Var);

    void inquiryDeviceCanOTA(byte[] bArr, lp7<Integer> lp7Var);

    void queryUpdateResult(lp7<Integer> lp7Var);

    void readUpgradeFileFlag(lp7<at5> lp7Var);

    void rebootDevice(lp7<Boolean> lp7Var);

    void stopADVInfo(lp7<Boolean> lp7Var);
}
