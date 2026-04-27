package p000;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import okhttp3.Dns;

/* JADX INFO: loaded from: classes6.dex */
public class kg7 implements Dns {

    /* JADX INFO: renamed from: b */
    public static final int f54012b = 300;

    /* JADX INFO: renamed from: a */
    public Dns f54013a = Dns.SYSTEM;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$lookup$0(List list, String str, CountDownLatch countDownLatch) {
        try {
            list.addAll(this.f54013a.lookup(str));
        } catch (UnknownHostException unused) {
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$lookup$1(List list, String str, CountDownLatch countDownLatch) {
        try {
            list.addAll(this.f54013a.lookup(str));
        } catch (UnknownHostException unused) {
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }

    @Override // okhttp3.Dns
    public List<InetAddress> lookup(final String str) throws UnknownHostException {
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        final CountDownLatch countDownLatch = new CountDownLatch(2);
        new Thread(new Runnable() { // from class: ig7
            @Override // java.lang.Runnable
            public final void run() {
                this.f46781a.lambda$lookup$0(arrayList, str, countDownLatch);
            }
        }).start();
        new Thread(new Runnable() { // from class: jg7
            @Override // java.lang.Runnable
            public final void run() {
                this.f50477a.lambda$lookup$1(arrayList2, str, countDownLatch);
            }
        }).start();
        try {
            countDownLatch.await(300L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        if (!arrayList2.isEmpty()) {
            return arrayList2;
        }
        if (arrayList.isEmpty()) {
            throw new UnknownHostException(str);
        }
        return arrayList;
    }
}
