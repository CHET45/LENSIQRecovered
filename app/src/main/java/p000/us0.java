package p000;

import android.text.TextUtils;
import android.util.Log;
import p000.h75;

/* JADX INFO: loaded from: classes6.dex */
public abstract class us0<T> implements oxb<hr0<T>> {

    /* JADX INFO: renamed from: a */
    public final String f88889a;

    /* JADX INFO: renamed from: b */
    public final String f88890b;

    /* JADX INFO: renamed from: c */
    public final boolean f88891c;

    /* JADX INFO: renamed from: d */
    public final boolean f88892d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f88893e;

    public us0(String str, boolean z, boolean z2) {
        this.f88889a = "BaseObserver";
        this.f88893e = false;
        this.f88890b = str;
        this.f88891c = z;
        this.f88892d = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$saveResultData$0(hr0 hr0Var) throws Throwable {
        try {
            String json = kbb.get().toJson(hr0Var);
            Log.i("BaseObserver", "saveResultData:json:" + json);
            pq0.putToCache(this.f88890b, json);
            Log.i("BaseObserver", "saveResultData ok! key:" + this.f88890b);
        } catch (Exception e) {
            Log.e("BaseObserver", "saveResultData Exception:key:" + this.f88890b, e);
        }
    }

    private void saveResultData(final hr0<T> hr0Var) {
        kbb.get().postToThread(new Runnable() { // from class: ts0
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f85698a.lambda$saveResultData$0(hr0Var);
            }
        });
    }

    @Override // p000.oxb
    public void onComplete() {
        Log.i("BaseObserver", "onComplete");
        onCompleted();
    }

    public void onCompleted() {
    }

    public void onDisposable(mf4 mf4Var) {
    }

    @Override // p000.oxb
    public void onError(Throwable th) {
        Log.e("BaseObserver", "onError:", th);
        onFail(h75.handleException(th));
    }

    public void onFail(h75.C6732a c6732a) {
        Log.i("BaseObserver", "onFail result code:" + c6732a.getMessage());
    }

    @Override // p000.oxb
    public void onSubscribe(mf4 mf4Var) {
        Log.i("BaseObserver", "onSubscribe");
        onDisposable(mf4Var);
        if (this.f88891c) {
            TextUtils.isEmpty(this.f88890b);
        }
    }

    public void onSuccess(hr0<T> hr0Var, boolean z) {
    }

    @Override // p000.oxb
    public void onNext(hr0<T> hr0Var) {
        Log.i("BaseObserver", "onNext result code:" + hr0Var.getMsg());
        if (hr0Var.isSuccess()) {
            onSuccess(hr0Var, false);
        } else {
            onFail(new h75.C6732a(hr0Var.getMsg(), hr0Var.getCode()));
        }
        this.f88893e = true;
        if (this.f88892d && !TextUtils.isEmpty(this.f88890b) && hr0Var.isSuccess()) {
            saveResultData(hr0Var);
        }
    }

    public us0() {
        this("", false, false);
    }
}
