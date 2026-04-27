package p000;

/* JADX INFO: loaded from: classes5.dex */
public interface xs5 {
    void closeLogFile();

    void deleteLogFile();

    @hib
    byte[] getLogAsBytes();

    @hib
    String getLogAsString();

    void writeToLog(long j, String str);
}
