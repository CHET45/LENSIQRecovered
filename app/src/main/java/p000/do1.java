package p000;

import okhttp3.Call;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes7.dex */
public abstract class do1<T> {

    /* JADX INFO: renamed from: a */
    public static do1 f30242a = new C4887a();

    /* JADX INFO: renamed from: do1$a */
    public static class C4887a extends do1 {
        @Override // p000.do1
        public void onError(Call call, Exception exc, int i) {
        }

        @Override // p000.do1
        public void onResponse(Object obj, int i) {
        }

        @Override // p000.do1
        public Object parseNetworkResponse(Response response, int i) throws Exception {
            return null;
        }
    }

    public void inProgress(float f, long j, int i) {
    }

    public void onAfter(int i) {
    }

    public void onBefore(Request request, int i) {
    }

    public abstract void onError(Call call, Exception exc, int i);

    public abstract void onResponse(T t, int i);

    public abstract T parseNetworkResponse(Response response, int i) throws Exception;

    public boolean validateReponse(Response response, int i) {
        return response.isSuccessful();
    }
}
