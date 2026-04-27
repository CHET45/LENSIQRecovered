package p000;

/* JADX INFO: loaded from: classes6.dex */
public interface mq9 {
    long getNativeLogHandler();

    void mmkvLog(nq9 nq9Var, String str, int i, String str2, String str3);

    pq9 onMMKVCRCCheckFail(String str);

    pq9 onMMKVFileLengthError(String str);

    boolean wantLogRedirecting();
}
