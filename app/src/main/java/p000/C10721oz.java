package p000;

import android.text.Editable;
import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

/* JADX INFO: renamed from: oz */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nHtml.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Html.android.kt\nandroidx/compose/ui/text/AnnotationContentHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,292:1\n1#2:293\n3792#3:294\n4307#3,2:295\n33#4,6:297\n*S KotlinDebug\n*F\n+ 1 Html.android.kt\nandroidx/compose/ui/text/AnnotationContentHandler\n*L\n265#1:294\n265#1:295,2\n266#1:297,6\n*E\n"})
public final class C10721oz implements ContentHandler {

    /* JADX INFO: renamed from: a */
    @yfb
    public final ContentHandler f69238a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final Editable f69239b;

    public C10721oz(@yfb ContentHandler contentHandler, @yfb Editable editable) {
        this.f69238a = contentHandler;
        this.f69239b = editable;
    }

    private final void handleAnnotationEnd() {
        Editable editable = this.f69239b;
        Object[] spans = editable.getSpans(0, editable.length(), C11765qz.class);
        ArrayList arrayList = new ArrayList();
        for (Object obj : spans) {
            if (this.f69239b.getSpanFlags((C11765qz) obj) == 17) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C11765qz c11765qz = (C11765qz) arrayList.get(i);
            int spanStart = this.f69239b.getSpanStart(c11765qz);
            int length = this.f69239b.length();
            this.f69239b.removeSpan(c11765qz);
            if (spanStart != length) {
                this.f69239b.setSpan(c11765qz, spanStart, length, 33);
            }
        }
    }

    private final void handleAnnotationStart(Attributes attributes) {
        int length = attributes.getLength();
        for (int i = 0; i < length; i++) {
            String localName = attributes.getLocalName(i);
            if (localName == null) {
                localName = "";
            }
            String value = attributes.getValue(i);
            String str = value != null ? value : "";
            if (localName.length() > 0 && str.length() > 0) {
                int length2 = this.f69239b.length();
                this.f69239b.setSpan(new C11765qz(localName, str), length2, length2, 17);
            }
        }
    }

    @Override // org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i, int i2) throws SAXException {
        this.f69238a.characters(cArr, i, i2);
    }

    @Override // org.xml.sax.ContentHandler
    public void endDocument() throws SAXException {
        this.f69238a.endDocument();
    }

    @Override // org.xml.sax.ContentHandler
    public void endElement(@gib String str, @gib String str2, @gib String str3) throws SAXException {
        if (md8.areEqual(str2, sm7.f82233c)) {
            handleAnnotationEnd();
        } else {
            this.f69238a.endElement(str, str2, str3);
        }
    }

    @Override // org.xml.sax.ContentHandler
    public void endPrefixMapping(String str) throws SAXException {
        this.f69238a.endPrefixMapping(str);
    }

    @Override // org.xml.sax.ContentHandler
    public void ignorableWhitespace(char[] cArr, int i, int i2) throws SAXException {
        this.f69238a.ignorableWhitespace(cArr, i, i2);
    }

    @Override // org.xml.sax.ContentHandler
    public void processingInstruction(String str, String str2) throws SAXException {
        this.f69238a.processingInstruction(str, str2);
    }

    @Override // org.xml.sax.ContentHandler
    public void setDocumentLocator(Locator locator) {
        this.f69238a.setDocumentLocator(locator);
    }

    @Override // org.xml.sax.ContentHandler
    public void skippedEntity(String str) throws SAXException {
        this.f69238a.skippedEntity(str);
    }

    @Override // org.xml.sax.ContentHandler
    public void startDocument() throws SAXException {
        this.f69238a.startDocument();
    }

    @Override // org.xml.sax.ContentHandler
    public void startElement(@gib String str, @gib String str2, @gib String str3, @gib Attributes attributes) throws SAXException {
        if (!md8.areEqual(str2, sm7.f82233c)) {
            this.f69238a.startElement(str, str2, str3, attributes);
        } else if (attributes != null) {
            handleAnnotationStart(attributes);
        }
    }

    @Override // org.xml.sax.ContentHandler
    public void startPrefixMapping(String str, String str2) throws SAXException {
        this.f69238a.startPrefixMapping(str, str2);
    }
}
