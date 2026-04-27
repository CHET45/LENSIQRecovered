package p000;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public final class fn0 implements OnCompleteListener<Void> {

    /* JADX INFO: renamed from: a */
    public final CountDownLatch f37142a = new CountDownLatch(1);

    public boolean await(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f37142a.await(j, timeUnit);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(@efb Task<Void> task) {
        this.f37142a.countDown();
    }

    public void onSuccess() {
        this.f37142a.countDown();
    }
}
