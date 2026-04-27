package p000;

import java.util.Objects;
import java.util.concurrent.Flow;

/* JADX INFO: loaded from: classes8.dex */
public final class g66 {

    /* JADX INFO: renamed from: g66$a */
    public static final class FlowPublisherC6142a<T> implements Flow.Publisher<T> {

        /* JADX INFO: renamed from: a */
        public final zjd<? extends T> f38882a;

        public FlowPublisherC6142a(zjd<? extends T> zjdVar) {
            this.f38882a = zjdVar;
        }

        @Override // java.util.concurrent.Flow.Publisher
        public void subscribe(Flow.Subscriber<? super T> subscriber) {
            this.f38882a.subscribe(subscriber == null ? null : new C6148g(subscriber));
        }
    }

    /* JADX INFO: renamed from: g66$b */
    public static final class FlowProcessorC6143b<T, U> implements Flow.Processor<T, U> {

        /* JADX INFO: renamed from: a */
        public final ndd<? super T, ? extends U> f38883a;

        public FlowProcessorC6143b(ndd<? super T, ? extends U> nddVar) {
            this.f38883a = nddVar;
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onComplete() {
            this.f38883a.onComplete();
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onError(Throwable th) {
            this.f38883a.onError(th);
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onNext(T t) {
            this.f38883a.onNext(t);
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onSubscribe(Flow.Subscription subscription) {
            this.f38883a.onSubscribe(subscription == null ? null : new C6149h(subscription));
        }

        @Override // java.util.concurrent.Flow.Publisher
        public void subscribe(Flow.Subscriber<? super U> subscriber) {
            this.f38883a.subscribe(subscriber == null ? null : new C6148g(subscriber));
        }
    }

    /* JADX INFO: renamed from: g66$c */
    public static final class FlowSubscriberC6144c<T> implements Flow.Subscriber<T> {

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f38884a;

        public FlowSubscriberC6144c(ycg<? super T> ycgVar) {
            this.f38884a = ycgVar;
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onComplete() {
            this.f38884a.onComplete();
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onError(Throwable th) {
            this.f38884a.onError(th);
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onNext(T t) {
            this.f38884a.onNext(t);
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onSubscribe(Flow.Subscription subscription) {
            this.f38884a.onSubscribe(subscription == null ? null : new C6149h(subscription));
        }
    }

    /* JADX INFO: renamed from: g66$d */
    public static final class FlowSubscriptionC6145d implements Flow.Subscription {

        /* JADX INFO: renamed from: a */
        public final fdg f38885a;

        public FlowSubscriptionC6145d(fdg fdgVar) {
            this.f38885a = fdgVar;
        }

        @Override // java.util.concurrent.Flow.Subscription
        public void cancel() {
            this.f38885a.cancel();
        }

        @Override // java.util.concurrent.Flow.Subscription
        public void request(long j) {
            this.f38885a.request(j);
        }
    }

    /* JADX INFO: renamed from: g66$e */
    public static final class C6146e<T> implements zjd<T> {

        /* JADX INFO: renamed from: a */
        public final Flow.Publisher<? extends T> f38886a;

        public C6146e(Flow.Publisher<? extends T> publisher) {
            this.f38886a = publisher;
        }

        @Override // p000.zjd
        public void subscribe(ycg<? super T> ycgVar) {
            this.f38886a.subscribe(ycgVar == null ? null : new FlowSubscriberC6144c(ycgVar));
        }
    }

    /* JADX INFO: renamed from: g66$f */
    public static final class C6147f<T, U> implements ndd<T, U> {

        /* JADX INFO: renamed from: a */
        public final Flow.Processor<? super T, ? extends U> f38887a;

        public C6147f(Flow.Processor<? super T, ? extends U> processor) {
            this.f38887a = processor;
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f38887a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f38887a.onError(th);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f38887a.onNext(t);
        }

        @Override // p000.ycg
        public void onSubscribe(fdg fdgVar) {
            this.f38887a.onSubscribe(fdgVar == null ? null : new FlowSubscriptionC6145d(fdgVar));
        }

        @Override // p000.zjd
        public void subscribe(ycg<? super U> ycgVar) {
            this.f38887a.subscribe(ycgVar == null ? null : new FlowSubscriberC6144c(ycgVar));
        }
    }

    /* JADX INFO: renamed from: g66$g */
    public static final class C6148g<T> implements ycg<T> {

        /* JADX INFO: renamed from: a */
        public final Flow.Subscriber<? super T> f38888a;

        public C6148g(Flow.Subscriber<? super T> subscriber) {
            this.f38888a = subscriber;
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f38888a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f38888a.onError(th);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f38888a.onNext(t);
        }

        @Override // p000.ycg
        public void onSubscribe(fdg fdgVar) {
            this.f38888a.onSubscribe(fdgVar == null ? null : new FlowSubscriptionC6145d(fdgVar));
        }
    }

    /* JADX INFO: renamed from: g66$h */
    public static final class C6149h implements fdg {

        /* JADX INFO: renamed from: a */
        public final Flow.Subscription f38889a;

        public C6149h(Flow.Subscription subscription) {
            this.f38889a = subscription;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f38889a.cancel();
        }

        @Override // p000.fdg
        public void request(long j) {
            this.f38889a.request(j);
        }
    }

    private g66() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> Flow.Processor<T, U> toFlowProcessor(ndd<? super T, ? extends U> nddVar) {
        Objects.requireNonNull(nddVar, "reactiveStreamsProcessor");
        return nddVar instanceof C6147f ? ((C6147f) nddVar).f38887a : e66.m9715a(nddVar) ? f66.m10669a(nddVar) : new FlowProcessorC6143b(nddVar);
    }

    public static <T> Flow.Publisher<T> toFlowPublisher(zjd<? extends T> zjdVar) {
        Objects.requireNonNull(zjdVar, "reactiveStreamsPublisher");
        return zjdVar instanceof C6146e ? ((C6146e) zjdVar).f38886a : a66.m166a(zjdVar) ? b66.m2962a(zjdVar) : new FlowPublisherC6142a(zjdVar);
    }

    public static <T> Flow.Subscriber<T> toFlowSubscriber(ycg<T> ycgVar) {
        Objects.requireNonNull(ycgVar, "reactiveStreamsSubscriber");
        return ycgVar instanceof C6148g ? ((C6148g) ycgVar).f38888a : c66.m3822a(ycgVar) ? d66.m8934a(ycgVar) : new FlowSubscriberC6144c(ycgVar);
    }

    public static <T, U> ndd<T, U> toProcessor(Flow.Processor<? super T, ? extends U> processor) {
        Objects.requireNonNull(processor, "flowProcessor");
        return processor instanceof FlowProcessorC6143b ? ((FlowProcessorC6143b) processor).f38883a : processor instanceof ndd ? (ndd) processor : new C6147f(processor);
    }

    public static <T> zjd<T> toPublisher(Flow.Publisher<? extends T> publisher) {
        Objects.requireNonNull(publisher, "flowPublisher");
        return publisher instanceof FlowPublisherC6142a ? ((FlowPublisherC6142a) publisher).f38882a : publisher instanceof zjd ? (zjd) publisher : new C6146e(publisher);
    }

    public static <T> ycg<T> toSubscriber(Flow.Subscriber<T> subscriber) {
        Objects.requireNonNull(subscriber, "flowSubscriber");
        return subscriber instanceof FlowSubscriberC6144c ? ((FlowSubscriberC6144c) subscriber).f38884a : subscriber instanceof ycg ? (ycg) subscriber : new C6148g(subscriber);
    }
}
