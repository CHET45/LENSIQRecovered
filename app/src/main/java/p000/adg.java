package p000;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes5.dex */
@vx4
public class adg {

    /* JADX INFO: renamed from: a */
    public final r55 f1169a;

    /* JADX INFO: renamed from: b */
    public final Object f1170b;

    /* JADX INFO: renamed from: c */
    public final Object f1171c;

    /* JADX INFO: renamed from: d */
    public final Method f1172d;

    public adg(r55 eventBus, Object event, Object subscriber, Method subscriberMethod) {
        this.f1169a = (r55) v7d.checkNotNull(eventBus);
        this.f1170b = v7d.checkNotNull(event);
        this.f1171c = v7d.checkNotNull(subscriber);
        this.f1172d = (Method) v7d.checkNotNull(subscriberMethod);
    }

    public Object getEvent() {
        return this.f1170b;
    }

    public r55 getEventBus() {
        return this.f1169a;
    }

    public Object getSubscriber() {
        return this.f1171c;
    }

    public Method getSubscriberMethod() {
        return this.f1172d;
    }
}
