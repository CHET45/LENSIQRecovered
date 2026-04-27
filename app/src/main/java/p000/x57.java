package p000;

import android.adservices.topics.EncryptedTopic;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import java.util.ArrayList;
import java.util.Iterator;
import p000.e5e;
import p000.p7e;
import p000.yg5;

/* JADX INFO: loaded from: classes3.dex */
@igg({"ClassVerificationFailure"})
@p7e({p7e.EnumC10826a.f69934a})
public final class x57 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final x57 f96820a = new x57();

    private x57() {
    }

    @e5e.InterfaceC5127a({@e5e(extension = 1000000, version = 4), @e5e(extension = 31, version = 9)})
    @yfb
    public final m57 convertResponse$ads_adservices_release(@yfb GetTopicsResponse getTopicsResponse) {
        md8.checkNotNullParameter(getTopicsResponse, "response");
        ArrayList arrayList = new ArrayList();
        Iterator it = getTopicsResponse.getTopics().iterator();
        while (it.hasNext()) {
            Topic topicM18357a = o57.m18357a(it.next());
            arrayList.add(new t4h(topicM18357a.getTaxonomyVersion(), topicM18357a.getModelVersion(), topicM18357a.getTopicId()));
        }
        return new m57(arrayList);
    }

    @e5e.InterfaceC5127a({@e5e(extension = 1000000, version = 11), @e5e(extension = 31, version = 11)})
    @yfb
    @yg5.InterfaceC15649b
    public final m57 convertResponseWithEncryptedTopics$ads_adservices_release(@yfb GetTopicsResponse getTopicsResponse) {
        md8.checkNotNullParameter(getTopicsResponse, "response");
        ArrayList arrayList = new ArrayList();
        Iterator it = getTopicsResponse.getTopics().iterator();
        while (it.hasNext()) {
            Topic topicM18357a = o57.m18357a(it.next());
            arrayList.add(new t4h(topicM18357a.getTaxonomyVersion(), topicM18357a.getModelVersion(), topicM18357a.getTopicId()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = getTopicsResponse.getEncryptedTopics().iterator();
        while (it2.hasNext()) {
            EncryptedTopic encryptedTopicM22369a = t57.m22369a(it2.next());
            byte[] encryptedTopic = encryptedTopicM22369a.getEncryptedTopic();
            md8.checkNotNullExpressionValue(encryptedTopic, "encryptedTopic.encryptedTopic");
            String keyIdentifier = encryptedTopicM22369a.getKeyIdentifier();
            md8.checkNotNullExpressionValue(keyIdentifier, "encryptedTopic.keyIdentifier");
            byte[] encapsulatedKey = encryptedTopicM22369a.getEncapsulatedKey();
            md8.checkNotNullExpressionValue(encapsulatedKey, "encryptedTopic.encapsulatedKey");
            arrayList2.add(new w15(encryptedTopic, keyIdentifier, encapsulatedKey));
        }
        return new m57(arrayList, arrayList2);
    }
}
