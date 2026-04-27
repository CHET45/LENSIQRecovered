package p000;

import android.graphics.Typeface;
import android.os.Handler;
import p000.np6;
import p000.wo6;

/* JADX INFO: loaded from: classes.dex */
public class mo1 {

    /* JADX INFO: renamed from: a */
    @efb
    public final np6.C9966d f61596a;

    /* JADX INFO: renamed from: b */
    @efb
    public final Handler f61597b;

    /* JADX INFO: renamed from: mo1$a */
    public class RunnableC9429a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ np6.C9966d f61598a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Typeface f61599b;

        public RunnableC9429a(np6.C9966d c9966d, Typeface typeface) {
            this.f61598a = c9966d;
            this.f61599b = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f61598a.onTypefaceRetrieved(this.f61599b);
        }
    }

    /* JADX INFO: renamed from: mo1$b */
    public class RunnableC9430b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ np6.C9966d f61601a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f61602b;

        public RunnableC9430b(np6.C9966d c9966d, int i) {
            this.f61601a = c9966d;
            this.f61602b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f61601a.onTypefaceRequestFailed(this.f61602b);
        }
    }

    public mo1(@efb np6.C9966d c9966d, @efb Handler handler) {
        this.f61596a = c9966d;
        this.f61597b = handler;
    }

    private void onTypefaceRequestFailed(int i) {
        this.f61597b.post(new RunnableC9430b(this.f61596a, i));
    }

    private void onTypefaceRetrieved(@efb Typeface typeface) {
        this.f61597b.post(new RunnableC9429a(this.f61596a, typeface));
    }

    /* JADX INFO: renamed from: a */
    public void m17481a(@efb wo6.C14724e c14724e) {
        if (c14724e.m24681a()) {
            onTypefaceRetrieved(c14724e.f94931a);
        } else {
            onTypefaceRequestFailed(c14724e.f94932b);
        }
    }

    public mo1(@efb np6.C9966d c9966d) {
        this.f61596a = c9966d;
        this.f61597b = ro1.m21446a();
    }
}
